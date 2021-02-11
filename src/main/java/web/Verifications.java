package web;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

public class Verifications {
    private final WebDriverWait wait;

    public Verifications(WebDriverWait wait) {
        this.wait = wait;
    }

    @Step("Verify Test in Element")
    public void textInElement(WebElement elem, String expectedValue) {
        assertEquals(elem.getText(), expectedValue);

    }

    @Step("Verify the Number of Elements Equals to")
    public void numberOfElements(List<WebElement> elems, int expecteddValue) {
        wait.until(ExpectedConditions.visibilityOf(elems.get(elems.size() - 1)));
        assertEquals(elems.size(), expecteddValue);
    }

    // TODO: visualElement
    @Step("Verify Element Visually")
    public void visualElement(WebElement imageElement, String expectedImageName) {
//        BufferedImage expectedImage = null;
//        try {
//            expectedImage = ImageIO.read(new File(getData("ImageRepo") + expectedImageName + ".png"));
//        } catch (Exception e) {
//            System.out.println("Error reading image file: " + e);
//        }
//        Screenshot imageScreenshot = new AShot().coordsProvider(new WebDriverCoordsProvider()).takeScreenshot(driver, imageElement);
//        BufferedImage actualImage = imageScreenshot.getImage();
//        diff = imgDiff.makeDiff(actualImage, expectedImage);
//        Assert.assertFalse(diff.hasDiff(), "Images are not the same");
    }

    @Step("Verify Element id displayed.")
    public void elementDisplayed(WebElement elem) {
        assertTrue(elem.isDisplayed());
    }

    @Step("Verify Element exist (not null).")
    public void elementExist(WebElement elem) {
        assertNotNull(elem, "Element is not exist in the dom.");
    }

    @Step("Verify Object exist in list.")
    public void existInList(List list, Object expected) {
        Object actual = null;
        for (Object o : list) {
            if (o.equals(expected))
                actual = o;
        }
        assertEquals(actual, expected, expected + " not fund in the list. ");
    }

    @Step("Verify Object not exist in list.")
    public void notExistInList(List list, Object expected) {
        Object actual = null;
        for (Object o : list) {
            if (o.equals(expected))
                actual = o;
        }
        assertEquals(actual, null, expected + " fund in the list. ");
    }

    @Step("Verify Text with Text")
    public void text(String actualText, String expectedText) {
        assertEquals(actualText, expectedText);
    }


}
