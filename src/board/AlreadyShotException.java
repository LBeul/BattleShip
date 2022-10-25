package board;

public class AlreadyShotException extends Exception {
    public AlreadyShotException() {
        super();
    }
    public AlreadyShotException(String message) {
        super(message);
    }
    public AlreadyShotException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
}
