package web;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class WebActions {
    private final WebDriverWait wait;
    private final Actions action;

    public WebActions(WebDriverWait wait, Actions action) {
        this.wait = wait;
        this.action = action;
    }

    @Step("Click on Element")
    public void click(WebElement elem) {
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        elem.click();
    }

    @Step("Send Text to Text-Field")
    public void updateText(WebElement elem, String value) {
        wait.until(ExpectedConditions.visibilityOf(elem));
        elem.clear();
        elem.sendKeys(value);
    }

    @Step("Update DropDown Filed")
    public void updateDropDown(WebElement elem, String value) {
        wait.until(ExpectedConditions.visibilityOf(elem));
        Select myValue = new Select(elem);
        myValue.selectByVisibleText(value);
    }

    public List<WebElement> numberOfElementsToBeMoreThan(final List<WebElement> elementList, final int number) {
        ExpectedCondition<Boolean> condition = new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                return elementList.size() > number;
            }

            @Override
            public String toString() {
                return "list is empty";
            }
        };
        wait.until(condition);
        return elementList;
    }

    @Step("Get not empty list.")
    public List<WebElement> getNotEmptyList(List<WebElement> elementList) {
        return numberOfElementsToBeMoreThan(elementList, 0);
    }

    @Step("Mouse Hover to Element")
    public void mouseHoverElement(WebElement elem) {
        action.moveToElement(elem).build().perform();
    }
}
