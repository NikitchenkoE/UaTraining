import java.util.ArrayList;

public class View {
    public final String BROKEN_APP = "Only numeric values are allowed";
    public final String CORRECT_ANSWER = "Congratulations, you are right. You have had ";
    public final String PRIVIOUSLY_TRYED = "Previously you write this number. All list of your attempts: ";
    public final String SMALLER = "Try a larger number in between ";
    public final String BIGGER = "Try a smaller number in between ";
    public final String BAD_INPUT = "Nope. You should to chose number between ";

    public void massageReader(String message) {
        System.out.print(message);
    }

    public void printer(int answerNumber, int minBorder, int maxBorder, ArrayList<Integer> list) {
        if (answerNumber == 0) {
            massageReader(CORRECT_ANSWER);
            System.out.print(list.size() + " attempts");
            System.out.print("\n" + "All list of your attempts: ");
            readList(list);
        } else if (answerNumber == 2) {
            massageReader(PRIVIOUSLY_TRYED);
            System.out.println();
            readList(list);
        } else if (answerNumber == -1) {
            massageReader(SMALLER);
            System.out.print("[" + minBorder + " and " + maxBorder + "]");
            System.out.print("\n" + "All list of your attempts: ");
            readList(list);
        } else if (answerNumber == 3) {
            massageReader(BAD_INPUT);
            System.out.print("[" + minBorder + " and " + maxBorder + "]");
        } else {
            massageReader(BIGGER);
            System.out.print("[" + minBorder + " and " + maxBorder + "]");
            System.out.print("\n" + "All list of your attempts: ");
            readList(list);
        }

    }

    private void readList(ArrayList<Integer> list) {
        for (Object o : list) {
            System.out.print(o + "; ");
        }
    }
}
