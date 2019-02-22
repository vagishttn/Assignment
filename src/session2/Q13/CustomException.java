package session2.Q13;

public class CustomException extends Exception {

    CustomException(String message) {
        super(message);
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}
