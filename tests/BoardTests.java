import game.CoordinatesNotOnBoardException;
import game.ShotNotValidException;
import org.junit.jupiter.api.Test;
import org.testng.Assert;


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
    public void shootingAtCoordinateTest() {
        //shoot at edges
    }

    @Test//(expected=ShotNotValidException.class)
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
