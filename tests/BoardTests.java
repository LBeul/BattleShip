import game.CoordinatesNotOnBoardException;
import game.GameEngineImpl;
import game.ShotNotValidException;
import game.Symbol;
import org.junit.jupiter.api.Test;
import org.testng.Assert;
import ui.Coordinates;


public class BoardTests {

    // TODO: BoardTests implementieren

    @Test
    public void shipsDeployedTest() {
        //tests getBoard()
    }

    @Test
    public void updateBoardTest() {
        //tests getBoard()
    }
    @Test
    public void shootingAtCoordinateTest() throws CoordinatesNotOnBoardException, ShotNotValidException {
        //shoot at edges
        GameEngineImpl battleship = new GameEngineImpl("player1", "player2");
        Coordinates a = new Coordinates("b5");
        battleship.shoot(a);
        Assert.assertEquals(Symbol.KREUZ, battleship.getBoard());
        //battleship.getBoard() at those coordinates, need to be implemented
    }

    @Test//(expected=CoordinatesNotOnBoardException.class)
    public void shootingAtInexistentCoordinateTest() throws ShotNotValidException, CoordinatesNotOnBoardException {
        //shoot outside the board
    }
    @Test
    public void shootAndMissTest() {
    }

    @Test
    public void shootAndHitTest() {
    }

    @Test//(expected=ShotNotValidException.class)
    public void shootWhereAlreadyShotTest() throws ShotNotValidException{
    }


}
