import java.math.BigDecimal;
import java.math.RoundingMode;

public class Simulation {
    private Dice dice;
    private Bins bins;
    private int numOfRuns;

    public Simulation(int numOfDice, int numOfRuns) {
        dice = new Dice(numOfDice);
        bins = new Bins(numOfDice, numOfDice * 6);
        this.numOfRuns = numOfRuns;
    }

    public int getNumOfRuns() {
        return numOfRuns;
    }

    public void runSimulation() {
        for (int i = 0; i < numOfRuns; i++) {
            bins.incrementBin(dice.tossAndSum());
        }
    }

    public void printResults() {
        StringBuilder res = new StringBuilder();
        int numOfRuns = getNumOfRuns();
        String header = String.format("***\n Simulation of %d tossed %d times\n***\n\n", dice.getDiceAmt(), numOfRuns);
        res.append(header);

        // generate results line for each sum
        for (int i = bins.getLowerBound() - 1; i < bins.getResults().length; i++) {
            int sumNum = bins.getBin(i + 1);
            StringBuilder lineStr = new StringBuilder();
            String freq = BigDecimal.valueOf((double) sumNum / (double) numOfRuns).setScale(2, RoundingMode.HALF_UP)
                    .toString();

            int roundedPercent = (int) Math.round((double) sumNum / (double) numOfRuns);
            String stars = new String(new char[roundedPercent]).replace("\0", "*");
            String line = String.format("%1s : %4d: ");

            lineStr.append(line);
            lineStr.append(freq + " ");
            lineStr.append(stars + "%n");

            res.append(lineStr);
        }

        System.out.println(res);

    }

    public static void main(String[] args) {

    }


}
