package top.yunp.dv4j;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by plter on 5/25/17.
 */

/**
 * Method params in this object can has default value,and this function does not support method overloads
 *
 * @author plter
 * @version 1.0
 */
public class DefaultValueObject {


    private Map<String, Method> cachedMethods = new HashMap<>();
    private Method[] methods;

    public DefaultValueObject() {
        methods = getClass().getMethods();
    }

    public Object call(String methodName, String... args) {
        Method m = cachedMethods.get(methodName);
        if (m == null) {
            for (Method method :
                    methods) {
                if (method.getName().equals(methodName)) {
                    cachedMethods.put(methodName, method);
                    m = method;
                    break;
                }
            }
        }

        if (m != null) {
            Annotation[][] parameterAnnotations = m.getParameterAnnotations();
            Object[] params = new Object[m.getParameterCount()];

            for (int i = 0; i < args.length; i++) {
                params[i] = args[i];

            }
            for (int i = args.length; i < params.length; i++) {
                params[i] = ((DefaultValue) parameterAnnotations[i][0]).defaultValue();
            }

            try {
                return m.invoke(this, params);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new CannotCallMethodError(methodName);
            }
        } else {
            throw new MethodNotFoundError(methodName);
        }
    }
}
