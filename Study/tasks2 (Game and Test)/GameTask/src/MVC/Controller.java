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
        model.setBarriers(Constants.MIN_BARRIER,Constants.MAX_BATTIER);

        view.massageReader(view.GREETING);

        model.randomizer();
        try {
            while (model.getAnswerNumber()!=0) {
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
        if (guessNumber >= Constants.MIN_BARRIER & guessNumber <= Constants.MAX_BATTIER) {
            model.adder(guessNumber);
        } else {
            model.setAnswerNumber(3);
        }
    }


}
