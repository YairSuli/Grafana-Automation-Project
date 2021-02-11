package web.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditUserPage extends AbstractPageObject {

    @FindBy(css = "body > grafana-app > div > div > div > div > form > div:nth-child(1) > input")
    private WebElement txtName;
    @FindBy(css = "body > grafana-app > div > div > div > div > form > div:nth-child(2) > input")
    private WebElement txtEmail;
    @FindBy(css = "body > grafana-app > div > div > div > div > form > div:nth-child(3) > input")
    private WebElement txtUserName;
    @FindBy(css = "[name='userForm'] .btn.btn-primary")
    private WebElement btnUpdateUser;

    @FindBy(css = "[name='passwordForm'] [type='password']")
    private WebElement txtPassword;
    @FindBy(css = "body > grafana-app > div > div > div > div > form.gf-form-group.ng-pristine.ng-invalid.ng-invalid-required.ng-valid-minlength > div.gf-form-button-row > button")
    private WebElement btnUpdatePassword;

    @FindBy(css = "body > grafana-app > div > div > div > div > div:nth-child(13) > div > button:nth-child(2)")
    private WebElement btnDeleteUser;
    @FindBy(css = ".confirm-modal-buttons .btn.btn-danger")
    private WebElement btnConfirmDelete;


    protected EditUserPage(WebDriver driver) {
        super(driver);
    }

    @Step("get Name text field.")
    public WebElement txtName() {
        return txtName;
    }

    @Step("get Email text field.")
    public WebElement txtEmail() {
        return txtEmail;
    }

    @Step("get UserName text field.")
    public WebElement txtUserName() {
        return txtUserName;
    }

    @Step("get Update User button.")
    public WebElement btnUpdateUser() {
        return btnUpdateUser;
    }

    @Step("get Password text field.")
    public WebElement txtPassword() {
        return txtPassword;
    }

    @Step("get Update Password button.")
    public WebElement btnUpdatePassword() {
        return btnUpdatePassword;
    }

    @Step("get Delete button.")
    public WebElement btnDeleteUser() {
        return btnDeleteUser;
    }

    @Step("get Confirm Delete button.")
    public WebElement btnConfirmDelete() {
        return btnConfirmDelete;
    }
}
