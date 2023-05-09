package at.hltpinkafeld.usermanager;

public class InvalidPasswordException extends Exception{
    public InvalidPasswordException(String errorMessage){
            super(errorMessage);
    }
}
