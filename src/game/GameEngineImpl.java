package game;

import ui.Coordinates;

public class GameEngineImpl implements GameEngine{
    private Player host;
    private Player player2;
    private Board board;
    private int turn;

    public GameEngineImpl(String h, String p2) {
        host = new Player(h);
        player2 = new Player(p2);
        board = new Board();
        turn = 1;
    }

    @Override
    public Symbol[][] getBoard() {
        return new Symbol[10][10];
    }

    public Symbol[][] getBoard(Coordinates coordinates) {
        return new Symbol[10][10];
    }

    @Override
    public void shoot(Coordinates coordinates) throws ShotNotValidException,CoordinatesNotOnBoardException {
        /**get coordinates and shoot
        if shot hits, get another go
        if shot misses, other player goes
        if Exception gets thrown, give new coordinates
        if (coordinates == shipsCoordinates) {
            board(coordinates) = Symbol.KREUZ;
            shoot again;
        }
         */
    }

    public void deployShips() {
        // TODO: Deploy ships at random coordinates
        // deploy ships randomly on the board
        // save the coordinates shipsCoordinates
        // TODO: Update board & give feedback
    }

}
