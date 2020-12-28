package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPageObject {

    @FindBy(xpath = "/html/body/grafana-app/div/div/div/react-container/div/div/div[2]/div/form/div[1]/input")
    private WebElement userName;

    @FindBy(xpath = "//*[@id='inputPassword']")
    private WebElement password;

    @FindBy(xpath = "//*[@id='login-view']/form/div[3]/button")
    private WebElement btnLogin;

    @FindBy(xpath = "//*[@id=\"change-password-view\"]/form/div[3]/a")
    private WebElement btnSkip;


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement userName() {
        return userName;
    }

    public WebElement password() {
        return password;
    }

    public WebElement btnLogin() {
        return btnLogin;
    }

    public WebElement btnSkip() {
        return btnSkip;
    }
}
