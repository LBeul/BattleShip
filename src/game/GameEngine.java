package game;

import ui.Coordinates;

/**
 * GameEngine API
 * @author Louis Beul
 * @author Koço Dhami
 */
public interface GameEngine {

    /**
     * Get current state of the game board
     * @return board as 2D array matrix
     */
    public Symbol[][] getBoard();

    /**
     * Shoot given coordinates on the board
     * @param coordinates the matrix coordinates to shoot at
     * @throws ShotNotValidException in case the coordinates were already shot at
     */
    public boolean shoot(Coordinates coordinates) throws ShotNotValidException,CoordinatesNotOnBoardException;
    /**
     * deploy ships at random coordinates on the board
     */
    public void deployShips();
}