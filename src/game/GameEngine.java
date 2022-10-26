package game;

import utils.IntPair;

public interface GameEngine {

    /**
     * Get current state of the game board
     * @return board as 2D array matrix
     */
    public char[][] getBoard();

    /**
     * Shoot given coordinates on the board
     * @param coordinates the matrix coordinates to shoot at
     * @throws ShotNotValidException in case the coordinates were already shot at
     */
    public void shoot(IntPair coordinates) throws ShotNotValidException;
}


/*
    static final String PRINT = "print";
    static final String EXIT = "exit";
    static final String CONNECT = "connect";
    static final String HOST = "host";
    static final String SHOOT = "shoot";
 */