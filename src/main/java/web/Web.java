package web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import web.flows.Flows;
import web.navigations.NavigationMenu;
import web.pages.Pages;

import static utilitiess.Constants.IS_HEADLESS;
import static utilitiess.Constants.TIME_OUT;
import static utilitiess.Constants.URL;

@Listeners(utilitiess.Listeners.class)
public class Web {
    //todo: make driver as privet
    public WebDriver driver;

    //todo: make pages as privet
    public Pages pages;

    private WebDriverWait wait;

    public Verifications verifications;

    private Actions actions;
    public WebActions webActions;
    public Flows flows;
    public NavigationMenu navigationMenu;


    @BeforeClass
    public void startSection(ITestContext context) {
        initDriver(context);
        initWait();
        initActions();
        initWebActions();
        initPages();
        initNavigationMenu();
        initFlows();
        initVerifications();
        flows.LOGIN_FLOWS.Login();
    }

    @AfterClass
    public void closeSection() {
        driver.quit();
    }

    @BeforeMethod
    public void beforeMethod() {
        webActions.click(pages.LEFT_MENU_PAGE.btnHome());
    }

    private void initDriver(ITestContext context) {
        driver = Browsers.getNewDriver(IS_HEADLESS);
        driver.manage().window().maximize();
        driver.navigate().to(URL);
        context.setAttribute("WebDriver", driver);
    }

    private void initWait() {
        wait = new WebDriverWait(driver, TIME_OUT);
    }

    private void initActions() {
        actions = new Actions(driver);
    }

    private void initWebActions() {
        webActions = new WebActions(wait, actions);
    }

    private void initPages() {
        pages = new Pages(driver);
    }

    private void initFlows() {
        flows = new Flows(pages, webActions, navigationMenu);
    }

    private void initVerifications() {
        verifications = new Verifications(wait);
    }

    public void initNavigationMenu() {
        navigationMenu = new NavigationMenu(pages, webActions);
    }
}
