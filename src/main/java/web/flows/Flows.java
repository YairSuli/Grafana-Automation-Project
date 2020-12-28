package web.flows;

import web.WebActions;
import web.pages.Pages;

public class Flows extends AbstractFlows {

    public final LoginFlows LOGIN_FLOWS = new LoginFlows(pages, webActions);

    public Flows(Pages pages, WebActions webActions) {
        super(pages, webActions);
    }
}
