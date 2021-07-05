package ua.Controller;

import ua.View.View;

import java.util.Scanner;

import static ua.View.ViewConstants.FIRST_NAME_REQUEST;
import static ua.View.ViewConstants.NICKNAME_REQUEST;

public class InputerToController {
    private Scanner scanner;
    private View view;


    String firstname;
    String nickname;
    public InputerToController(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }



    public void inputToUtility(){
        UtilityController utilityController = new UtilityController(scanner,view);
        String str = (String.valueOf(View.bundle.getLocale()).equals("ua"))
                ? RegularExpressions.REGULAR_EXPRESSION_FIRST_NAME_UA : RegularExpressions.REGULAR_EXPRESSION_FIRST_NAME;
        this.firstname = utilityController.checkAndOutputInfo(FIRST_NAME_REQUEST,str);
        this.nickname = utilityController.checkAndOutputInfo(NICKNAME_REQUEST,RegularExpressions.REGULAR_EXPRESSION_NICKNAME);
    }
}
