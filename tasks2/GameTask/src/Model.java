import java.util.ArrayList;
import java.util.Random;

public class Model {


    private int arg;
    private final int min = 1;
    private final int max = 100;
    Random random = new Random();

    private int rand;
    //random function
    public void randomizer() {
        int diff = max - min;
        rand = random.nextInt(diff + 1);
        rand += min;
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
            System.out.println("Try a number from " + minBorder +" to " + maxBorder);
        }
    }


    //Add and control information in Array list. Core of game
    private void adder(int b) {
        if (b == rand) {
            list.add(b);
            System.out.println("Congratulations, you are right. You have had " + list.size()  + " attempts");
            System.out.print("\n" + "All list of your attempts: ");
            readList(list);
        } else if (list.contains(b)) {
            list.add(b);
            System.out.println("Previously you write this number. All list of your attempts: ");
            readList(list);
        } else if (b < rand) {
            list.add(b);
            if (b>minBorder) {
                minBorder = b;
            }
            System.out.print("No, try a larger number in between [ " + minBorder + " and " + maxBorder +" ]");
            System.out.print("\n" + "All list of your try: ");
            readList(list);
        } else {
            list.add(b);
            if(b<maxBorder) {
                maxBorder=b;
            }
            System.out.print("No, try a smaller number in between [ " + minBorder + " and " + maxBorder+" ]");
            System.out.print("\n" + "All list of your try: ");
            readList(list);
        }
    }

    //output list of attempts
    private void readList(ArrayList<Integer> list) {
        for (Object o : list) {
            System.out.print(o + "; ");
        }
    }
}

