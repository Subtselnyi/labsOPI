/**
 * Created by subtselnyi on 26.04.16.
 */
public class Except extends Exception {
    public Except() {
        super();
    }

    public Except(String message) {
        super(message);
        System.out.println(message);

    }

    public Except(String message, Throwable cause) {
        super(message, cause);
    }

    public Except(Throwable cause) {
        super(cause);
    }

    protected Except(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
