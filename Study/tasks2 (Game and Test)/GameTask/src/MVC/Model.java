package MVC;

import java.util.ArrayList;
import java.util.Random;

public class Model {

    Random random = new Random();

    private int arg;
    private final int min = 0;
    private final int max = 100;
    private int rand;
    private int answerNumber;
    //Announcement of the limits of the required number
    private int minBorder = min;
    private int maxBorder = max;

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    //random function
    public void randomizer() {
        int diff = max - min;
        rand = random.nextInt(diff-1);
        rand += min+1;
    }

    public void setAnswerNumber(int answerNumber) {
        this.answerNumber = answerNumber;
    }

    public int getAnswerNumber() {
        return answerNumber;
    }

    public int getMinBorder() {
        return minBorder;
    }

    public int getMaxBorder() {
        return maxBorder;
    }

    public void setRand(int rand) {
        this.rand = rand;
    }

    public int getRand() {
        return rand;
    }

    //List of previous numbers
    ArrayList<Integer> list = new ArrayList<>();

    public ArrayList<Integer> getList() {
        return list;
    }

    public int getArg() {
        return arg;
    }

    public void setArg(int arg) {
        this.arg = arg;
    }

    //Add and control information in Array list. Core of game
    public void adder(int b) {
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


