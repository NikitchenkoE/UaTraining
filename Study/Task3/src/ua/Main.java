package ua;

import ua.Controller.Controller;
import ua.Model.Model;
import ua.View.View;

public class Main {
    public static void main(String[] args) {

        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        controller.startApp();
    }
}
