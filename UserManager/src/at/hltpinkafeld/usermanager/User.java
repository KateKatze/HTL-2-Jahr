package at.hltpinkafeld.usermanager;

public class User implements Comparable<User> {
    private String name;
    private String email;
    private String pw;

    public User(String name, String email, String pw) {
        this.name = name;
        this.email = email;
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    @Override
    public int compareTo(User o) {
        int retVal=this.name.compareTo(o.name);
        return retVal;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", pw='" + pw + '\'' +
                '}';
    }
}
