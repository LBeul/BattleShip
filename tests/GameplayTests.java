import org.junit.jupiter.api.Test;

public class GameplayTests {
    // TODO: GameplayTests implementieren

    @Test
    public void changeTurnsWhenMissedShot() {
        /**tests if player who hits the ship, doesn't get another shot
         * shoot(coordinates where there is no ship)
         * check who's turn it is
         */
    }

    @Test
    public void extraTurnWhenHitShot() {
        /**tests if player who hits the ship, gets another shot
         * shoot(coordinates where ship is)
         * check who's turn it is
         */
    }

    @Test
    public void addPointWhenShipDown() {
        /**tests if point is added when ship player destroys ship
         * shoot(coordinates where ship is) and repeat shooting until the whole ship is shot
         * getScore
        */
    }

    @Test
    public void getScoreTest() {
        /**tests if point is added when ship player destroys ship
         * shoot(coordinates where ship is) and repeat shooting until the whole ship is shot
         * getScore
         */
    }

    @Test
    public void endGameTest() {
        //test if game ends when player wins
    }
}
