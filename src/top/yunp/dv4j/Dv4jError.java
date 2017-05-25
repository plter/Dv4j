package top.yunp.dv4j;

/**
 * Created by plter on 5/25/17.
 */
public class Dv4jError extends RuntimeException {

    public Dv4jError() {
    }

    public Dv4jError(String message) {
        super(message);
    }

    public Dv4jError(String message, Throwable cause) {
        super(message, cause);
    }

    public Dv4jError(Throwable cause) {
        super(cause);
    }

    public Dv4jError(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
