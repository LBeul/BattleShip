import game.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import ui.Coordinates;

import java.util.List;


public class GameEngineTests {

    private GameEngine gameEngine;

    @BeforeEach
    public void setup() {
        gameEngine = new GameEngineImpl("player1", "player2");
    }


    @ParameterizedTest
    @MethodSource("nullishGameEngineParams")
    public void constructorThrowsExceptionIfAtLeastOneParamIsNull(String p1, String p2) {
        Executable invalidConstructorCall = () -> gameEngine = new GameEngineImpl(p1, p2);
        assertThrows(
                IllegalArgumentException.class,
                invalidConstructorCall,
                "Constructor calls with at least one nullish params should throw IllegalArgumentException."
        );
    }

    @Test
    public void shipsGetDeployedTest() {
        Symbol[][] board = gameEngine.getBoard();
        gameEngine.deployShips();
        assertEquals(board, gameEngine.getBoard());
    }

    @Test
    public void shootsAtValidCoordinateTest() throws CoordinatesNotOnBoardException, ShotNotValidException {
        gameEngine.deployShips();
        Coordinates a = new Coordinates("a1");
        gameEngine.shoot(a);
        assertEquals(Symbol.KREUZ, gameEngine.getBoard()[0][0]);
    }

    @Test
    public void shootsValidAndMissesShipTest() throws ShotNotValidException, CoordinatesNotOnBoardException {
        Coordinates a = new Coordinates("b5");
        gameEngine.shoot(a);
        assertEquals(Symbol.KREIS, gameEngine.getBoard()[0][0]);
    }

    @Test
    public void shootsValidAndHitsShipTest() throws CoordinatesNotOnBoardException, ShotNotValidException {
        gameEngine.deployShips();
        Coordinates a = new Coordinates("a7");
        gameEngine.shoot(a);
        assertEquals(Symbol.KREUZ, gameEngine.getBoard()[0][0]);
    }

    @Test
    public void shootsOutOfBoardTest() {
        gameEngine.deployShips();
        Executable outOfBoardShot = () -> gameEngine.shoot(new Coordinates("x30"));
        assertThrows(
                CoordinatesNotOnBoardException.class,
                outOfBoardShot,
                "Shots to coordinates outside of the board should throw a CoordinatesNotOnBoardException"
        );
    }

    @Test
    public void shootsWhereAlreadyShotTest() throws ShotNotValidException, CoordinatesNotOnBoardException {
        gameEngine.deployShips();
        Coordinates c4 = new Coordinates("c4");
        gameEngine.shoot(c4);
        Executable repeatedShot = () -> gameEngine.shoot(c4);
        assertThrows(
                ShotNotValidException.class,
                repeatedShot,
                "Repeated shot to same location should throw ShotNotValidException"
        );

    }

    public static List<Arguments> nullishGameEngineParams() {
        return List.of(
                Arguments.of("Player1", null),
                Arguments.of(null, "Player2"),
                Arguments.of(null, null)
        );
    }


}
