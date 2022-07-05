import java.util.Random;

public class Dice {
    private int diceAmount;

    public Dice(int diceAmount) {
        this.diceAmount = diceAmount;
    }
    public int getDiceAmt() {
        return diceAmount;
    }

    public int tossAndSum() {
        int runningSum = 0;
        Random rand = new Random();
        for (int i = 0; i < getDiceAmt(); i++) {
            runningSum += rand.nextInt(6) + 1;
        }
        return runningSum;
    }
}
