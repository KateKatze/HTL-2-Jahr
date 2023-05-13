package at.hltpinkafeld.usermanager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserManagerTest {
    private UserManager usertest;

    @BeforeEach
    void setUp() {
        usertest = new UserManager();
    }

    @Test
    void add() {
        User user = new User("Max", "max@email.com", "mmust");
        User user2 = new User("Max", "max1@email.com", "mmust");

        assertDoesNotThrow(() -> usertest.add(user), "User added");
        assertThrows(DuplicateUserException.class, () -> usertest.add(user2), "User already exists");
    }

    @Test
    void get() {
        User user = new User("Max", "max@email.com", "mmust");

        assertDoesNotThrow(() -> usertest.add(user), "User added");

        User checkuser = usertest.get("Max");
        assertEquals(user, checkuser, "This is the added user");
    }

    @Test
    void setEMail() throws NoSuchUserException, DuplicateUserException {
        User user = new User("Max", "oldemail@email.com", "mmust");
        usertest.add(user);

        usertest.setEMail("Max", "newemail@email.com");

        User checkUser = usertest.get("Max");
        assertEquals("newemail@email.com", checkUser.getEmail());
    }

    @Test
    void setPW() {
        User user = new User("Max", "max@email.com", "oldpw");
        assertDoesNotThrow(() -> usertest.add(user), "User added");
        assertThrows(DuplicateUserException.class, () -> usertest.add(user), "User already exists");

        assertDoesNotThrow(() -> usertest.get("Max").setPw("newpw"), "Password updated");

        User usercheck = usertest.get("Max");
        assertEquals("newpw", usercheck.getPw());

        assertThrows(NoSuchUserException.class, () -> usertest.setPW("Maria", "newpw"), "User doesnt exist");
    }

    @Test
    void login() throws DuplicateUserException {
        User user = new User("Max", "max@email.com", "pw");
        usertest.add(user);

        assertDoesNotThrow(() -> usertest.login("Max", "pw"));
    }

    @Test
    void getUserList() throws DuplicateUserException {
        User user = new User("Max", "max@email.com", "pw");
        User user1 = new User("Maria", "maria@email.com", "pw");
        usertest.add(user);
        usertest.add(user1);

        List<User> userList = usertest.getUserList();

        assertEquals(2, userList.size());
        assertTrue(userList.contains(user));
        assertTrue(userList.contains(user1));
    }
}