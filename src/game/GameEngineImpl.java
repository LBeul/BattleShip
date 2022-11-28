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
    public char[][] getBoard() {
        return new char[0][];
    }

    @Override
    public void shoot(Coordinates coordinates) throws ShotNotValidException,CoordinatesNotOnBoardException {
        //get coordinates and shoot
        //if shot hits, get another go
        //if shot misses, other player goes
        //if Exception gets thrown, give new coordinates
    }



}
