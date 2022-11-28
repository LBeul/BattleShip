package game;

public class CoordinatesNotOnBoardException extends Exception {
    public CoordinatesNotOnBoardException() { super(); }
    public CoordinatesNotOnBoardException(String message) { super(message); }
    public CoordinatesNotOnBoardException(String message, Throwable t) { super(message, t); }
}
