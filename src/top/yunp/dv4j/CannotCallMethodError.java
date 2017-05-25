package top.yunp.dv4j;

/**
 * Created by plter on 5/25/17.
 */
public class CannotCallMethodError extends Dv4jError {

    public CannotCallMethodError(String methodName) {
        super(String.format("Can not call method %s", methodName));
    }
}
