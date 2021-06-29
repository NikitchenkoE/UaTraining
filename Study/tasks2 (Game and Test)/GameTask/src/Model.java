import java.util.ArrayList;
import java.util.Random;

public class Model {


    private int arg;
    private final int min = 0;
    private final int max = 100;
    Random random = new Random();

    private int rand;

    //random function
    public void randomizer() {
        int diff = max - min;
        rand = random.nextInt(diff);
        rand += min;
    }

    private int answerNumber;

    public int getAnswerNumber() {
        return answerNumber;
    }

    public ArrayList<Integer> getList() {
        return list;
    }

    //Announcement of the limits of the required number
    private int minBorder = min;
    private int maxBorder = max;

    public int getMinBorder() {
        return minBorder;
    }

    public int getMaxBorder() {
        return maxBorder;
    }

    public int getRand() {
        return rand;
    }

    //List of previous numbers
    ArrayList<Integer> list = new ArrayList<>();

    public int getArg() {
        return arg;
    }

    //Link to model
    public void access(int arg) {
        setArg(arg);
    }


    //setter and validity test
    private void setArg(int guessNumber) {
        if (guessNumber >= min & guessNumber <= max) {
            this.arg = guessNumber;
            adder(arg);
        } else {
            System.out.println("Try a number from " + minBorder + " to " + maxBorder);
        }
    }


    //Add and control information in Array list. Core of game
    private void adder(int b) {
        if (b == rand) {
            list.add(b);
            answerNumber = 0;
        } else if (list.contains(b)) {
            list.add(b);
            answerNumber = 2;
        } else if (b < rand) {
            list.add(b);
            if (b > minBorder) {
                minBorder = b;
            }
            answerNumber = -1;
        } else {
            list.add(b);
            if (b < maxBorder) {
                maxBorder = b;
            }
            answerNumber = 1;
        }
    }


}


