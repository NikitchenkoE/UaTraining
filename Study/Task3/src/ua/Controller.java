package ua;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller {
    Model model = new Model();
    View view = new View();

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void startApp() {
        view.messageReader(view.REGISTRATION_GREETING);
        adderInformationLastName();
        adderInformationNickname();
        model.formReader();
    }

    private void adderInformationLastName() {
        view.messageReader(view.LAST_NAME_REQUEST);
        Pattern patternLastName = Pattern.compile(RegularExpressions.REGULAR_EXPRESSION_LAST_NAME);
        Matcher matcherLastName = patternLastName.matcher(new Scanner(System.in).nextLine());
        while (matcherLastName.find()) {
            model.setLastName(matcherLastName.group());
        }
        if (model.getLastName() == null) {
            view.messageReader(view.MISTAKE);
            adderInformationLastName();
        }
    }

    private void adderInformationNickname() {
        view.messageReader(view.NICKNAME_REQUEST);
        Pattern patternNickname = Pattern.compile(RegularExpressions.REGULAR_EXPRESSION_NICKNAME);
        Matcher matcherNickname = patternNickname.matcher(new Scanner(System.in).nextLine());
        while (matcherNickname.find()) {
            model.setNickname(matcherNickname.group());
        }
        if (model.getNickname() == null) {
            view.messageReader(view.MISTAKE);
            adderInformationNickname();
        }
    }
}



