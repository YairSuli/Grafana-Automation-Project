package web.flows;

import web.WebActions;
import web.pages.Pages;

public abstract class AbstractFlows {

    protected final Pages pages;
    protected final WebActions webActions;

    protected AbstractFlows(Pages pages, WebActions webActions) {
        this.pages = pages;
        this.webActions = webActions;
    }
}
