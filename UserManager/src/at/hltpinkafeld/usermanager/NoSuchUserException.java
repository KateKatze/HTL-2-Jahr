package at.hltpinkafeld.usermanager;

public class NoSuchUserException extends Exception{
    public NoSuchUserException(String errorMessage){
        super(errorMessage);
    }
}
