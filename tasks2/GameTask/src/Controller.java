import java.util.InputMismatchException;
import java.util.Scanner;

public class Controller {

 private final Model model;
 private final View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void startGame(){
        System.out.println("Try to guess the number between [ " +model.getMinBorder() + " and " + model.getMaxBorder()+ " ]");

        model.randomizer();
        try {
            while (model.getRand() != model.getArg()) {
                Scanner sc = new Scanner(System.in);
                int v = sc.nextInt();
                model.access(v);

            }
        }catch (InputMismatchException exception){
            view.massageReader(view.BROKEN_APP);
            startGame();
        }

    }


}
