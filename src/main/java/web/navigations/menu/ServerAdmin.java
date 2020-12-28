package web.navigations.menu;

import web.WebActions;
import web.navigations.AbstractNavigation;
import web.pages.Pages;

public class ServerAdmin extends AbstractNavigation {


    public ServerAdmin(Pages pages, WebActions webActions) {
        super(pages, webActions);
    }

    public void Users() {
        webActions.click(pages.SERVER_ADMIN_PAGE.btnUsers());
    }
}
