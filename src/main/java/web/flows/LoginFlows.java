package web.flows;

import utilitiess.Config;
import web.WebActions;
import web.navigations.NavigationMenu;
import web.pages.Pages;

public class LoginFlows extends AbstractFlows {


    protected LoginFlows(Pages pages, WebActions webActions, NavigationMenu navigationMenu) {
        super(pages, webActions,navigationMenu);
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
