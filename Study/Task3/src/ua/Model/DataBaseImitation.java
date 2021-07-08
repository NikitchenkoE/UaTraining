package ua.Model;

public enum DataBaseImitation {
    USER_ONE("Evgen", "Stivitivi"),
    USER_TWO("Rahim", "Jiridiri25");

    private final String firstname;
    private final String nickname;

    DataBaseImitation(String firstname, String nickname) {
        this.firstname = firstname;
        this.nickname = nickname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getNickname() {
        return nickname;
    }
}
