package web.pages;

import org.openqa.selenium.WebDriver;
import web.pages.menu.ServerAdminPage;

public class Pages extends AbstractPages {

    public final LoginPage LOGIN_PAGE = new LoginPage(driver);
    public final LeftMenuPage LEFT_MENU_PAGE = new LeftMenuPage(driver);
    public final ServerAdminPage SERVER_ADMIN_PAGE = new ServerAdminPage(driver);


    public Pages(WebDriver driver) {
        super(driver);
    }
}
