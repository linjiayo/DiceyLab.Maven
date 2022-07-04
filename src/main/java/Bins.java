
public class Bins {
    int[] results;
    private int lowerBound;

    public Bins(int lower, int upper) throws IllegalArgumentException {
        if (lower < 1 || upper < lower) {
            throw new IllegalArgumentException("Lower bound must be positive and lower than upper bound");
        }
        lowerBound = lower;
        results = new int[upper];
    }

    public int[] getResults() {
        return results;
    }

    public int getLowerBound() {
        return lowerBound;
    }

    public int getBin(int binNum) throws IllegalArgumentException {
        if (binNum < 1) {
            throw new IllegalArgumentException("Bin number must be greater than 0");
        }
        return results[binNum - 1];
    }

    public void incrementBin(int binNum) {
        results[binNum - 1]++;
    }
}
