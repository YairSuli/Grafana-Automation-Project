package web.flows;

import io.qameta.allure.Step;
import utilitiess.Config;
import web.WebActions;
import web.navigations.NavigationMenu;
import web.pages.Pages;

public class LoginFlows extends AbstractFlows {


    protected LoginFlows(Pages pages, WebActions webActions, NavigationMenu navigationMenu) {
        super(pages, webActions,navigationMenu);
    }

    @Step("login to Grafana.")
    public void Login(String user, String password) {
        webActions.updateText(pages.LOGIN_PAGE.txtUserName(), user);
        webActions.updateText(pages.LOGIN_PAGE.txtPassword(), password);
        webActions.click(pages.LOGIN_PAGE.btnLogin());
        webActions.click(pages.LOGIN_PAGE.btnSkip());
    }

    public void Login() {
        Login(Config.get("UserName"), Config.get("Password"));
    }

}
