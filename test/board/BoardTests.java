package board;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class BoardTests {

    @Test
    public void throwsExceptionIfCoordinatesAreNullish() {
        BattleShipBoard board = new BattleShipBoardImpl() {};
        Executable shootAtNull = () -> board.shoot("");
        assertThrows(AlreadyShotException.class, shootAtNull);
    }

    @Test
    public void marksShotCoordinateAsShot() throws AlreadyShotException {
        BattleShipBoard board = new BattleShipBoardImpl() {};
        board.shoot("A1");
        assertEquals(board.getBoard()[0][0], 'x');
    }
}
