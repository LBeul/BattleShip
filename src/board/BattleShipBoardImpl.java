package board;

public class BattleShipBoardImpl implements BattleShipBoard {
    @Override
    public char[][] getBoard() {
        return new char[2][2];
    }

    @Override
    public void shoot(String coords) throws AlreadyShotException {

    }

    @Override
    public String printBoard() {
        return "";
    }
}
