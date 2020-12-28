package web;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

import static org.testng.Assert.assertEquals;

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

    @Step("Verify Text with Text")
    public void text(String actualText, String expectedText) {
        Assert.assertEquals(actualText, expectedText);
    }


}
