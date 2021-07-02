import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }


    public void startProgram() {
    model.setPartOne(firstPartUtility());
    model.setPartTwo(secondPartUtility());

        System.out.println(model.getGreeting());
    }

    public String firstPartUtility(){
        Scanner first = new Scanner(System.in);
        view.printInfo(view.ASC_TO_WRITE);
        String part1 = first.nextLine();
        while (!part1.equals("Hello")){
            System.out.println(view.NOT_VALID_PART);
            part1 = first.nextLine();
        }
        return part1;
    }

    public String secondPartUtility(){
        Scanner second = new Scanner(System.in);
        view.printInfo(view.ASC_TO_WRITE_SECOND);
        String part2 = second.nextLine();
        while (!part2.equals("world!")){
            System.out.println(view.NOT_VALID_PART);
            part2 = second.nextLine();
        }
        return part2;
    }


}
