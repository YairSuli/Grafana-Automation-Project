package web.flows;

import utilitiess.Config;
import web.WebActions;
import web.pages.Pages;

public class LoginFlows {

    private final Pages pages;
    private final WebActions webActions;

    public LoginFlows(Pages pages, WebActions webActions) {
        this.pages = pages;
        this.webActions = webActions;
    }


    public void Login(String user, String password) {
        webActions.updateText(pages.LOGIN_PAGE.userName(), user);
        webActions.updateText(pages.LOGIN_PAGE.password(), password);
        webActions.click(pages.LOGIN_PAGE.btnLogin());
        webActions.click(pages.LOGIN_PAGE.btnSkip());
    }

    public void Login() {
        Login(Config.get("UserName"), Config.get("Password"));
    }

}
