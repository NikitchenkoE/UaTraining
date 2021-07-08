package ua.Controller;

import ua.Model.Model;
import ua.View.View;

import java.util.Scanner;

import static ua.Controller.RegularExpressions.REGULAR_EXPRESSION_NICKNAME;
import static ua.View.ViewConstants.FIRST_NAME_REQUEST;
import static ua.View.ViewConstants.NICKNAME_REQUEST;

public class InputerToController {
    private Scanner scanner;
    private View view;
    private Model model =new Model();

    private String firstname;
    private String nickname;

    public String getFirstname() {
        return firstname;
    }

    public String getNickname() {
        return nickname;
    }



    public InputerToController(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }


    public void inputToUtility() {
        UtilityController utilityController = new UtilityController(scanner, view);
        String str = (String.valueOf(View.bundle.getLocale()).equals("ua"))
                ? RegularExpressions.REGULAR_EXPRESSION_FIRST_NAME_UA : RegularExpressions.REGULAR_EXPRESSION_FIRST_NAME;
        this.firstname = utilityController.checkAndOutputInfo(FIRST_NAME_REQUEST, str);
        this.nickname = utilityController.checkAndOutputInfo(NICKNAME_REQUEST, REGULAR_EXPRESSION_NICKNAME);
    }

    public void inputNickname(){
        UtilityController utilityController = new UtilityController(scanner,view);
        this.nickname = utilityController.checkAndOutputInfo(NICKNAME_REQUEST,REGULAR_EXPRESSION_NICKNAME);
    }
}
