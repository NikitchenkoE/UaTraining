package ua.Model;

public class Model {
    private String lastName;
    private String nickname;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void formReader() {
        System.out.println(getLastName() + " " + getNickname());
    }
}
