package MVC;

import java.util.ArrayList;
import java.util.Random;

public class Model {

    Random random = new Random();



    private int rand;
    private int answerNumber;
    //Announcement of the limits of the required number
    private int minBorder;
    private int maxBorder;

    //List of previous numbers
    ArrayList<Integer> list = new ArrayList<>();

    //random function
    public void randomizer() {
        rand = (int)Math.ceil(Math.random()*
                (minBorder-maxBorder-1)+minBorder);
    }

    public void setAnswerNumber(int answerNumber) {
        this.answerNumber = answerNumber;
    }

    public void setRand(int rand) {
        this.rand = rand;
    }

    public void setList(ArrayList<Integer> list) {
        this.list = list;
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

    public int getRand() {
        return rand;
    }

    public ArrayList<Integer> getList() {
        return list;
    }

    public void setBarriers(int minBarrier, int maxBarrier) {
        minBorder = minBarrier;
        maxBorder= maxBarrier;
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


