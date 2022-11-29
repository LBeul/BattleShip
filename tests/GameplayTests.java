import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class GameplayTests {
    // TODO: GameplayTests implementieren

    /**tests if player who hits the ship, doesn't get another shot
     * shoot(coordinates where there is no ship)
     * check whose turn it is
     */
    @Test
    public void changesTurnsIfShotMissed() {
        fail();
    }

    /**tests if player who hits the ship, gets another shot
     * shoot(coordinates where ship is)
     * check whose turn it is
     */
    @Test
    public void providesExtraTurnIfShotHit() {
        fail();
    }

    /**tests if point is added when ship player destroys ship
     * shoot(coordinates where ship is) and repeat shooting until the whole ship is shot
     * getScore
     */
    @Test
    public void addsPointIfShipDestroyed() {
        fail();
    }

    @Test
    public void getsScore() {
        fail();
    }

    @Test
    public void endsGameAfterWin() {
        fail();
    }
}
