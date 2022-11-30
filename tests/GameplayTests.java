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

    /**tests if score is added/is correct when ship player destroys ships
     * shoot(coordinates where ship is) and repeat shooting until the whole ship is shot
     * shoot(coordinates where another ship is) and repeat shooting until the whole ship is shot
     * getScore
     */
    @Test
    public void getsScore() {
        fail();
    }

    /**tests if game ends correctly after win
     * shoot(coordinates where ship is) and repeat shooting until the whole ship is shot
     * shoot(coordinates where another ship is) and repeat shooting until the whole ship is shot
     * getScore
     */
    @Test
    public void endsGameAfterWin() {
        fail();
    }
}
