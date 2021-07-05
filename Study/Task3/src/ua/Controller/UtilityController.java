package ua.Controller;

import ua.View.View;

import java.util.Scanner;

public class UtilityController {
    Scanner scanner;
    View view;

    public UtilityController(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }

    public String checkAndOutputInfo(String message, String regex){
        String res;
        view.printInput(message);
        while (!(scanner.hasNext()&&(res = scanner.next()).matches(regex))){
            view.printInputMistake(message);
        }
        return res;
    }
}
