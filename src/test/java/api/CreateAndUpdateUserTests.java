package api;

import api.objects.User;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

public class CreateAndUpdateUserTests extends Api {
    private final User user = new User();

    @BeforeMethod
    public void before() {
        user.setName("yair Suliman");
        user.setLogin("YairSuli");
        user.setEmail("YairSuli@api.com");
        user.setPassword("123456");

        user.setId(flows.usersFlow.createNewUser(user));
    }

    @AfterMethod
    public void after() {
        flows.usersFlow.deleteUser(user.getId());
    }

    @Test
    public void createUser() {
        User actualUser = flows.usersFlow.getUserById(user.getId());

        assertEquals(actualUser.getName(), user.getName());
        assertEquals(actualUser.getLogin(), user.getLogin());
        assertEquals(actualUser.getEmail(), user.getEmail());
    }

    @Test
    public void updateUser() {
        user.setName(user.getName() + "updated");
        user.setLogin(user.getLogin() + "updated");
        user.setEmail(user.getEmail() + "updated");

        flows.usersFlow.updateUser(user, user.getId());
        User actualUser = flows.usersFlow.getUserById(user.getId());

        assertEquals(actualUser.getName(), user.getName());
        assertEquals(actualUser.getLogin(), user.getLogin());
        assertEquals(actualUser.getEmail(), user.getEmail());
    }

    @Test
    public void deleteUser() {
        flows.usersFlow.deleteUser(user.getId());
        assertFalse(flows.usersFlow.isUserExist(user.getId()), "User " + user.getId() + " was not deleted");
    }
}
