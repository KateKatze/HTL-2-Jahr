package at.hltpinkafeld.usermanager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserManager {
    private Map<String, User> users = new HashMap<>();

    public void add(User user) throws DuplicateUserException {
        if(this.users.containsKey(user.getName()))
            throw new DuplicateUserException("User with the same credentials already exists");
        this.users.put(user.getName(), user);
    }

    public User get(String username){
        return this.users.get(username);
    }

    public void setEMail(String username, String email) throws NoSuchUserException{
        User user = users.get(username);
        if (user == null) {
            throw new NoSuchUserException("User hasn't been found");
        } else {
            user.setEmail(email);
        }
    }
    public void setPW(String username, String pw) throws NoSuchUserException, InvalidPasswordException {
        User user = users.get(username);
        if (user == null) {
            throw new NoSuchUserException("User hasn't been found");
        }
        if (pw.equals(user.getPw())) {
            throw new InvalidPasswordException("Password should differ from the old one");
        }
        user.setPw(pw);
    }

    public void login(String username, String pw) throws NoSuchUserException, InvalidPasswordException{
        User user = users.get(username);
        if(user == null){
            throw new NoSuchUserException("User with this username doesn't exist");
        }
        if(!pw.equals(user.getPw())){
            throw new InvalidPasswordException("Check your credentials");
        }
        else {
             System.out.println("Login successful");
        }
    }

    List<User> getUserList(){
            return new ArrayList<>(users.values());
    }
}
