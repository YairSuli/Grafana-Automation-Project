package web.navigations;

import web.WebActions;
import web.pages.Pages;

public abstract class AbstractNavigationMenu {
    protected final Pages pages;
    protected final WebActions webActions;

    protected AbstractNavigationMenu(Pages pages, WebActions webActions) {
        this.pages = pages;
        this.webActions = webActions;
    }
}
