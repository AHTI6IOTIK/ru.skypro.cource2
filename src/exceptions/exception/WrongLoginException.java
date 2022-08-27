package exceptions.exception;

public class WrongLoginException extends RuntimeException {
    public WrongLoginException(String message) {
        super(message);
    }
}
