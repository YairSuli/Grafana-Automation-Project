package web.pages;

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

    public WebElement txtName() {
        return txtName;
    }

    public WebElement txtEmail() {
        return txtEmail;
    }

    public WebElement txtUserName() {
        return txtUserName;
    }

    public WebElement btnUpdateUser() {
        return btnUpdateUser;
    }

    public WebElement txtPassword() {
        return txtPassword;
    }

    public WebElement btnUpdatePassword() {
        return btnUpdatePassword;
    }

    public WebElement btnDeleteUser() {
        return btnDeleteUser;
    }

    public WebElement btnConfirmDelete() {
        return btnConfirmDelete;
    }
}
