package web.flows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import web.WebActions;
import web.navigations.NavigationMenu;
import web.pages.Pages;

import java.util.LinkedList;
import java.util.List;

public class UsersFlows extends AbstractFlows {

    protected UsersFlows(Pages pages, WebActions webActions, NavigationMenu navigationMenu) {
        super(pages, webActions, navigationMenu);
    }

    public void createNewUser(String name, String email, String userName, String password) {
        navigationMenu.ServerAdmin().Users();
        webActions.click(pages.USERS_PAGE.btnNewUser());
        webActions.updateText(pages.NEW_USER_PAGE.txtName(), name);
        webActions.updateText(pages.NEW_USER_PAGE.txtEmail(), email);
        webActions.updateText(pages.NEW_USER_PAGE.txtUserName(), userName);
        webActions.updateText(pages.NEW_USER_PAGE.txtPassword(), password);
        webActions.click(pages.NEW_USER_PAGE.btnCreate());
    }

    public void editUser(String originalUserName, String name, String email, String userName) {
        navigationMenu.ServerAdmin().Users();
        webActions.click(getUserByUserName(originalUserName));
        webActions.updateText(pages.EDIT_USER_PAGE.txtName(), name);
        webActions.updateText(pages.EDIT_USER_PAGE.txtEmail(), email);
        webActions.updateText(pages.EDIT_USER_PAGE.txtUserName(), userName);
        webActions.click(pages.EDIT_USER_PAGE.btnUpdateUser());
    }

    public void deleteUser(String userName) {
        navigationMenu.ServerAdmin().Users();
        if (getUserByUserName(userName) == null)
            return;
        webActions.click(getUserByUserName(userName));
        webActions.click(pages.EDIT_USER_PAGE.btnDeleteUser());
        webActions.click(pages.EDIT_USER_PAGE.btnConfirmDelete());
    }

    public List<String> getUsersNames() {
        List<String> userNames = new LinkedList<>();
        webActions.getNotEmptyList(pages.USERS_PAGE.tbUsers());
        for (WebElement userElement : pages.USERS_PAGE.tbUsers()) {
            userNames.add(userElement.findElement(By.cssSelector("td:nth-child(2)")).getText());
        }
        return userNames;
    }

    public WebElement getUserByUserName(String userName) {
        webActions.getNotEmptyList(pages.USERS_PAGE.tbUsers());
        for (WebElement userElement : pages.USERS_PAGE.tbUsers()) {
            if (userElement.findElement(By.cssSelector("td:nth-child(2)")).getText().equals(userName))
                return userElement;
        }
        return null;
    }
}
