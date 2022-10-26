package game;

public class ShotNotValidException extends Exception {
    public ShotNotValidException() {
        super();
    }
    public ShotNotValidException(String message) {
        super(message);
    }
    public ShotNotValidException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
}
