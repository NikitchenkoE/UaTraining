package ua.View;

import java.util.Locale;
import java.util.ResourceBundle;

public class View {
    public final String REGISTRATION_GREETING = "Welcome, write your information please";
    public final String LAST_NAME_REQUEST = "Please, enter your Last Name in capital letters.";
    public final String NICKNAME_REQUEST = "Please, enter your Nickname. You can use A-Z letters, " +
            "0-9 numbers, _ symbol or a dot. Your Nickname cant be longest than 30 characters";
    public final String MISTAKE = "You were wrong. ";

    static String MESSAGE_BUNDLE = "message";
    public static final ResourceBundle bundle =
        ResourceBundle.getBundle(MESSAGE_BUNDLE,
                new Locale("ua","UA"));
                //new Locale("en","EN"));



    public void messageReader(String message) {
        System.out.println(message);
    }
}
