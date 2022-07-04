import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DiceTest {

    @Test
    void testGetDiceAmt() {
        Dice dice = new Dice(2);
        Integer expected = 2;

        Integer actual = dice.getDiceAmt();

        assertEquals(expected, actual);
    }

    @Test
    void testTossAndSum() {
        Dice dice = new Dice(5);
        Integer expectedLowerBound = 5;
        Integer expectedUpperBound = 30;

        // run multiple rolls
        for (int i = 0; i < 50; i++) {
            int actual = dice.tossAndSum();
            assertTrue(actual <= expectedUpperBound);
            assertTrue(actual >= expectedLowerBound);
        }
    }
}