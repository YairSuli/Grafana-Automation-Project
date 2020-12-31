package web;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAndUpdateUserTests extends Web {
    private String name = "yair-suliman";
    private String email = "yairsuli@gmail.com";
    private String userName = "yairsuliman";
    private String password = "123456";

    @BeforeMethod()
    public void beforeMethod() {
        flows.USERS_FLOWS.createNewUser(name, email, userName, password);
    }

    @AfterMethod
    public void afterMethod() {
        flows.USERS_FLOWS.deleteUser(userName);
    }

    @Test
    public void createNewUser() {
        navigationMenu.ServerAdmin().Users();
        verifications.existInList(flows.USERS_FLOWS.getUsersNames(), userName);
    }

    @Test
    public void editUser() {
        final String ORIGINAL_USER_NAME = userName;
        name = name + "updated";
        email = email + "updated";
        userName = userName + "updated";
        password = password + "updated";

        flows.USERS_FLOWS.editUser(ORIGINAL_USER_NAME, name, email, userName);
        verifications.existInList(flows.USERS_FLOWS.getUsersNames(), userName);
    }
}
