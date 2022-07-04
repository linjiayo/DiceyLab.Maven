import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinsTest {
    Bins bins;
    @BeforeEach
    public void init() {
        bins = new Bins(2, 12);
    }

    @Test
    public void testNegativeConstructorBounds() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            bins = new Bins(-3, 12);
        });

        assertNotNull(exception);
    }

    @Test
    public void testConstructorUpperLowerThanLowerBound(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            bins = new Bins(3, 1);
        });

        assertNotNull(exception);
    }

    @Test
    void testGetResults() {
        int[] results = bins.getResults();
        Integer expectedSize = 12;

        Integer actualSize = results.length;

        assertEquals(expectedSize, actualSize);
    }

    @Test
    void testGetLowerBound() {
        Integer expected = 2;

        Integer actual = bins.getLowerBound();

        assertEquals(expected, actual);
    }
    @Test
    void testGetBin() {
        Integer expected = 0;

        Integer actual = bins.getBin(6);

        assertEquals(expected, actual);
    }

    @Test
    void testIncrementBin() {
        Integer expected = 5;
        for (int i = 0; i < 5; i++) {
            bins.incrementBin(12);
        }

        Integer actual = bins.getBin(12);

        assertEquals(expected, actual);
    }

}