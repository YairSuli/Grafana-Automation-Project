package web.navigations;

import io.qameta.allure.Step;
import web.WebActions;
import web.navigations.menu.ServerAdmin;
import web.pages.LeftMenuPage;
import web.pages.Pages;

public class NavigationMenu extends AbstractNavigationMenu {

    private final LeftMenuPage leftMenuPage = pages.LEFT_MENU_PAGE;
    private final ServerAdmin serverAdmin = new ServerAdmin(pages, webActions);


    public NavigationMenu(Pages pages, WebActions webActions) {
        super(pages, webActions);
    }

    @Step("Navigate to ServerAdmin.")
    public ServerAdmin ServerAdmin() {
        home();
        webActions.mouseHoverElement(leftMenuPage.btnServerAdmin());
        return serverAdmin;
    }

    @Step("Navigate to Home.")
    public void home() {
        webActions.click(leftMenuPage.btnHome());
    }

}
