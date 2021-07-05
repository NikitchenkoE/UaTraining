package ua.Controller;

import ua.Model.Model;
import ua.View.View;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller {
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void startApp() {
        Scanner scan = new Scanner(System.in);
        InputerToController inputer = new InputerToController(scan, view);
        inputer.inputToUtility();
    }


}



