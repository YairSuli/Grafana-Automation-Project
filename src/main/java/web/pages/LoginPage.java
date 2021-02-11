package web.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPageObject {

    @FindBy(xpath = "/html/body/grafana-app/div/div/div/react-container/div/div/div[2]/div/form/div[1]/input")
    private WebElement txtUserName;

    @FindBy(xpath = "//*[@id='inputPassword']")
    private WebElement txtPassword;

    @FindBy(xpath = "//*[@id='login-view']/form/div[3]/button")
    private WebElement btnLogin;

    @FindBy(xpath = "//*[@id=\"change-password-view\"]/form/div[3]/a")
    private WebElement btnSkip;


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Step("get UsrName text field.")
    public WebElement txtUserName() {
        return txtUserName;
    }

    @Step("get Password text field.")
    public WebElement txtPassword() {
        return txtPassword;
    }

    @Step("get Login button.")
    public WebElement btnLogin() {
        return btnLogin;
    }

    @Step("get Skip button.")
    public WebElement btnSkip() {
        return btnSkip;
    }
}
