import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimulationTest {
    Simulation sim;
    @BeforeEach
    public void init() {
        sim = new Simulation(2, 1000);
    }

    @Test
    void testGetNumOfRuns() {
        Integer expected = 1000;

        Integer actual = sim.getNumOfRuns();

        assertEquals(expected, actual);
    }

    @Test
    void testRunSimulation() {
        sim.runSimulation();
        Bins bins = sim.getBins();
        int expectedSum = 1000;

        int actualSum = 0;
        for (int i = bins.getLowerBound() - 1; i < bins.getResults().length; i++) {
            actualSum += bins.getBin(i + 1);
        }

        assertEquals(expectedSum, actualSum);
    }

}