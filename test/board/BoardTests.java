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

    @ParameterizedTest
    @ValueSource(strings = {"a1", "B3", "c5", "f7"})
    public void marksShotCoordinateAsShot(String coords) throws AlreadyShotException {
        BattleShipBoard board = new BattleShipBoardImpl() {};
        assertEquals("Shot at " + coords, board.shoot(coords));
        assertEquals(board.getBoard()[0][0], 'x');
    }
}
