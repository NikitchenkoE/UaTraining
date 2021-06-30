package MVC;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Controller {

    private final Model model;
    private final View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void startGame() {
        System.out.println("Try to guess the number between [ " + model.getMinBorder() + " and " + model.getMaxBorder() + " ]");

        model.randomizer();
        try {
            while (model.getRand() != model.getArg()) {
                Scanner sc = new Scanner(System.in);
                int v = sc.nextInt();
                filter(v);

                view.printer(model.getAnswerNumber(), model.getMinBorder(), model.getMaxBorder(), model.getList());
            }
        } catch (InputMismatchException exception) {
            view.massageReader(view.BROKEN_APP);
            startGame();
        }

    }

    //setter and validity test
    private void filter(int guessNumber) {
        if (guessNumber >= model.getMin() & guessNumber <= model.getMax()) {
            model.setArg(guessNumber);
            model.adder(model.getArg());
        } else {
            model.setAnswerNumber(3);
        }
    }


}
