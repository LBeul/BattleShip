import game.CoordinatesNotOnBoardException;
import game.GameEngineImpl;
import game.ShotNotValidException;
import game.Symbol;
import org.junit.jupiter.api.Test;
import org.testng.Assert;
import ui.Coordinates;

import static org.junit.jupiter.api.Assertions.fail;


public class BoardTests {

    // TODO: BoardTests implementieren

    @Test
    public void shipsDeployedTest() throws CoordinatesNotOnBoardException, ShotNotValidException {
        //tests getBoard()
        GameEngineImpl battleship = new GameEngineImpl("player1", "player2");
        char[][] board = battleship.getBoard();
        battleship.deployShips();
        Assert.assertEquals(board,battleship.getBoard());
        fail();
        //test passes weil deployShips() ist noch nicht implementiert, deswegen ist fail() addiert
    }

    @Test
    public void updateBoardTest() {
        //tests getBoard()
        GameEngineImpl battleship = new GameEngineImpl("player1", "player2");
        char[][] board = battleship.getBoard();
        battleship.deployShips();
        Assert.assertEquals(board,battleship.getBoard());
        fail();
        //test passes weil deployShips() ist noch nicht implementiert, deswegen ist fail() addiert
    }
    @Test
    public void shootingAtCoordinateTest() throws CoordinatesNotOnBoardException, ShotNotValidException {
        //shoot at edges
        GameEngineImpl battleship = new GameEngineImpl("player1", "player2");
        battleship.deployShips();
        Coordinates a = new Coordinates("a1");
        battleship.shoot(a);
        Assert.assertEquals(Symbol.KREUZ, battleship.getBoard(a));
    }

    @Test//(expected=CoordinatesNotOnBoardException.class)
    public void shootingAtInexistentCoordinateTest() throws ShotNotValidException, CoordinatesNotOnBoardException {
        //shoot outside the board
        GameEngineImpl battleship = new GameEngineImpl("player1", "player2");
        Coordinates a = new Coordinates("b15");
        battleship.shoot(a);
        Assert.assertEquals(Symbol.KREUZ, battleship.getBoard());
        //as the coordinate does not exist on board Exception should be thrown
        //problems with expected=... that's why its commented out
    }
    @Test
    public void shootAndMissTest() throws ShotNotValidException, CoordinatesNotOnBoardException {
        GameEngineImpl battleship = new GameEngineImpl("player1", "player2");
        Coordinates a = new Coordinates("b15");
        battleship.shoot(a);
        Assert.assertEquals(Symbol.KREIS, battleship.getBoard(a));
    }

    @Test
    public void shootAndHitTest() throws CoordinatesNotOnBoardException, ShotNotValidException {
        GameEngineImpl battleship = new GameEngineImpl("player1", "player2");
        battleship.deployShips();
        Coordinates a = new Coordinates("a7");
        battleship.shoot(a);
        Assert.assertEquals(Symbol.KREUZ, battleship.getBoard(a));
    }

    @Test//(expected=ShotNotValidException.class)
    public void shootWhereAlreadyShotTest() throws ShotNotValidException, CoordinatesNotOnBoardException {
        GameEngineImpl battleship = new GameEngineImpl("player1", "player2");
        battleship.deployShips();
        Coordinates a = new Coordinates("c4");
        battleship.shoot(a);
        battleship.shoot(a);
        Assert.assertEquals(Symbol.KREUZ, battleship.getBoard(a));
        //as the coordinate has already been shot once Exception should be thrown
        //problems with expected=... that's why its commented out

    }


}
