package ua.Model;

public class UsedNicknameException extends Exception{
    private String nickname;

    public String getNickname() {
        return nickname;
    }

    public UsedNicknameException (String message, String nickname){
        super(message);
        this.nickname = nickname;
    }
}
