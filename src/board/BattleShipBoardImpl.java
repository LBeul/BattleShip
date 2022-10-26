package board;

public class BattleShipBoardImpl implements BattleShipBoard {
    @Override
    public char[][] getBoard() {
        return new char[2][2];
    }

    @Override
    public String shoot(String coords) throws AlreadyShotException {
        return "";
    }

    @Override
    public String printBoard() {
        return "";
    }
}
