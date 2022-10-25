package board;

import java.io.IOException;
import java.io.OutputStream;

public interface BattleShipBoard {

    /**
     * Get current state of the game board
     * @return board as 2D array matrix
     */
    public char[][] getBoard();

    /**
     * Shoot given coordinates on the board
     * @param coords the coordinates to shoot at
     * @throws AlreadyShotException in case the coordinates were already shot at
     */
    public void shoot(String coords) throws AlreadyShotException;

    /**
     *
     * @return string representation of the board's state to a given stream
     */
    public String printBoard();
}
