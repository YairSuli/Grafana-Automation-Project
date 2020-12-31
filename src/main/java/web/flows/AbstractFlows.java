package web.flows;

import web.WebActions;
import web.navigations.NavigationMenu;
import web.pages.Pages;

public abstract class AbstractFlows {

    protected final Pages pages;
    protected final WebActions webActions;
    protected final NavigationMenu navigationMenu;

    protected AbstractFlows(Pages pages, WebActions webActions, NavigationMenu navigationMenu) {
        this.pages = pages;
        this.webActions = webActions;
        this.navigationMenu = navigationMenu;
    }
}
