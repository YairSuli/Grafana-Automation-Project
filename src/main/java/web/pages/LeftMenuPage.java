package web.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LeftMenuPage extends AbstractPageObject {

    @FindBy(css = "body > grafana-app > sidemenu > a")
    private WebElement btnHome;

    @FindBy(how = How.XPATH, using = "//div[@class='sidemenu-item dropdown'][6]")
    private WebElement btnServerAdmin;

    @FindBy(how = How.CSS, using = "img[src='/avatar/46d229b033af06a191ff2267bca9ae56']")
    private WebElement imgAvatar;


    public LeftMenuPage(WebDriver driver) {
        super(driver);
    }

    @Step("get Home button.")
    public WebElement btnHome() {
        return btnHome;
    }

    @Step("get Server admin button.")
    public WebElement btnServerAdmin() {
        return btnServerAdmin;
    }

}
