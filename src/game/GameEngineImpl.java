package game;

import ui.Coordinates;

public class GameEngineImpl implements GameEngine {
    private Player host;
    private Player enemy;
    private Board board;
    private int turn;

    public GameEngineImpl(String hostPlayer, String enemy) {
        System.out.println("Not implemented, yet.");
    }

    @Override
    public Symbol[][] getBoard() {
        System.out.println("Not implemented, yet.");
        return new Symbol[10][10];
    }

    @Override
    public boolean shoot(Coordinates coordinates) throws ShotNotValidException, CoordinatesNotOnBoardException {
        System.out.println("Not implemented, yet.");
        return false;
    }

    @Override
    public void deployShips() {
        System.out.println("Not implemented, yet.");
    }

    @Override
    public boolean win() {
        System.out.println("Not implemented, yet.");
        return false;
    }


}
