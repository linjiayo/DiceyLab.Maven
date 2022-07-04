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
    }

}