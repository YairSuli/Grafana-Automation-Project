package web.navigations;

import web.WebActions;
import web.pages.Pages;

public abstract class AbstractNavigation {
    protected final Pages pages;
    protected final WebActions webActions;

    protected AbstractNavigation(Pages pages, WebActions webActions) {
        this.pages = pages;
        this.webActions = webActions;
    }
}
