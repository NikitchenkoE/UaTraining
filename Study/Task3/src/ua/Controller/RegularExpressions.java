package ua.Controller;

public interface RegularExpressions {

    String REGULAR_EXPRESSION_FIRST_NAME = "[A-Z][a-z]{1,20}";
    String REGULAR_EXPRESSION_FIRST_NAME_UA = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$";
    String REGULAR_EXPRESSION_NICKNAME ="^[a-zA-Z0-9_.]{8,30}$";
}
