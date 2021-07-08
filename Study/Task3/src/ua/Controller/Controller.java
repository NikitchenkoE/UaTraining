package ua.Controller;

import ua.Model.DataBaseImitation;
import ua.Model.Model;
import ua.Model.UsedNicknameException;
import ua.View.View;

import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static ua.View.ViewConstants.USED_NICKNAME;

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
        Model model = setModel(inputer);
        model.formReader();
    }

    private Model setModel(InputerToController inputer) {
//        while (DataBaseImitation.checkNickname(inputer.getNickname())==true){
//            System.out.println("Nickname '" + inputer.getNickname()+ "' already exist");
//            inputer.inputNickname();
//        }
//        Model model = new Model(inputer.getFirstname(),inputer.getNickname());
//        return model;
        Model model = null;
        while (true) {
            try {
                model = new Model(inputer.getFirstname(), inputer.getNickname());
                break;
            } catch (UsedNicknameException exception) {
                System.out.println("Nickname '" + inputer.getNickname() + "' already exist");
                inputer.inputNickname();
            }
        }
        return model;
    }

}



