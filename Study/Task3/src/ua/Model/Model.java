package ua.Model;

public class Model {
    private String firstname;
    private String nickname;

    public Model() {
    }

    public Model(String firstname, String nickname) throws UsedNicknameException{
        this.firstname = firstname;
        this.nickname = nickname;
        if (DataBaseImitation.checkNickname(nickname)){
            throw new UsedNicknameException("Nickname had been used",nickname);
        }
    }

    public String getFirstname() {
        return firstname;
    }


    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void formReader() {
        System.out.println(firstname + " " + nickname);
    }
}
