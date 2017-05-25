package top.yunp.dv4j;

/**
 * Created by plter on 5/25/17.
 */
public class MethodNotFoundError extends Dv4jError {

    public MethodNotFoundError(String methodName) {
        super(String.format("Method %s not found", methodName));
    }
}
