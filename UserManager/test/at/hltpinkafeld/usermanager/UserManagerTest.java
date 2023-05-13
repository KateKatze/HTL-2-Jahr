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
    void setPW() throws NoSuchUserException, DuplicateUserException {
        User user = new User("Max", "max@email.com", "oldpw");
        usertest.add(user);

        usertest.setPW("Max", "newpw");

        User updatedUser = usertest.get("Max");
        assertEquals("newpw", updatedUser.getPw());
    }

    @Test
    void login() throws DuplicateUserException {
        User user = new User("Max", "max@email.com", "password");
        usertest.add(user);

        // Act & Assert
        assertDoesNotThrow(() -> usertest.login("Max", "password"));
    }

    @Test
    void getUserList() throws DuplicateUserException {
        User user1 = new User("Max", "max@email.com", "password");
        User user2 = new User("Maria", "john@email.com", "password");
        usertest.add(user1);
        usertest.add(user2);

        List<User> userList = usertest.getUserList();

        assertEquals(2, userList.size());
        assertTrue(userList.contains(user1));
        assertTrue(userList.contains(user2));
    }
}