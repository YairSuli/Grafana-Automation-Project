package web.flows;

import web.WebActions;
import web.navigations.NavigationMenu;
import web.pages.Pages;

public class Flows extends AbstractFlows {

    public final LoginFlows LOGIN_FLOWS = new LoginFlows(pages, webActions, navigationMenu);
    public final UsersFlows USERS_FLOWS = new UsersFlows(pages, webActions, navigationMenu);

    public Flows(Pages pages, WebActions webActions, NavigationMenu navigationMenu) {
        super(pages, webActions, navigationMenu);
    }
}
