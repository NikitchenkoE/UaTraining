package ua.View;

import java.util.Locale;
import java.util.ResourceBundle;

import static ua.View.ViewConstants.INPUT_MESSAGE;
import static ua.View.ViewConstants.MISTAKE;

public class View {

    static String MESSAGE_BUNDLE = "message";
    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(MESSAGE_BUNDLE,
                    new Locale("ua", "UA"));
    //new Locale("en","EN"));


    public void messageReader(String message) {
        System.out.println(message);
    }

    public String concatinateString(String... message) {
        StringBuilder concatenator = new StringBuilder();
        for (String str : message) {
            concatenator = concatenator.append(str);
        }
        return new String(concatenator);
    }

    public void printInput(String message) {
        messageReader(concatinateString(
                bundle.getString(INPUT_MESSAGE),
                bundle.getString(message)));
    }

    public void printInputMistake(String message) {
        messageReader(concatinateString(
                bundle.getString(MISTAKE),
                bundle.getString(INPUT_MESSAGE),
                bundle.getString(message)));
    }


}
