package web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import web.flows.Flows;
import web.navigations.NavigationMenu;
import web.pages.Pages;

import static utilitiess.Constants.IS_HEADLESS;
import static utilitiess.Constants.TIME_OUT;
import static utilitiess.Constants.URL;

public class Web {
    //todo: make driver as privet
    public WebDriver driver;

    //todo: make pages as privet
    public Pages pages;

    private WebDriverWait wait;

    private Verifications verifications;

    private Actions actions;
    public WebActions webActions;
    public Flows flows;
    public NavigationMenu navigationMenu;


    @BeforeClass
    public void startSection() {
        initDriver();
        initWait();
        initActions();
        initWebActions();
        initPages();
        initFlows();
        initVerifications();
        initNavigationMenu();
    }

    @AfterClass
    public void closeSection() {
        driver.quit();
    }

    private void initDriver() {
        driver = Browsers.getNewDriver(IS_HEADLESS);
        driver.manage().window().maximize();
        driver.navigate().to(URL);
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
        flows = new Flows(pages, webActions);
    }

    private void initVerifications() {
        verifications = new Verifications(wait);
    }

    public void initNavigationMenu() {
        navigationMenu = new NavigationMenu(pages, webActions);
    }
}