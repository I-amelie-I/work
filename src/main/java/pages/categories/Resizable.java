package pages.categories;

import com.unitedsofthouse.ucucumberpackage.typesfactory.types.Button;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.base.BasePage;

/**
 * Created by ivnytska on 17-May-16.
 */
public class Resizable extends BasePage {
    @Override
    protected WebElement elementForLoading() throws Exception {
        return null;
    }

    public void increaseElementDefault() {
        (new Actions(driver)).dragAndDropBy(driver.findElement(By.xpath(".//*[@id='resizable']/div[3]")), 500, 158).perform();
    }

    public void decreaseElementDefault() {
        (new Actions(driver)).dragAndDropBy(driver.findElement(By.xpath(".//*[@id='resizable']/div[3]")), -450, -160).perform();
    }

    public void increaseMiddleElementDefault() {
        (new Actions(driver)).dragAndDropBy(driver.findElement(By.xpath(".//*[@id='resizable']/div[3]")), 200, 200).perform();
    }

    public void increaseElementAnimate() {
        (new Actions(driver)).dragAndDropBy(driver.findElement(By.xpath(".//*[@id='resizableani']/div[3]")), 380, 100).perform();
    }

    public void decreaseElementAnimate() {
        (new Actions(driver)).dragAndDropBy(driver.findElement(By.xpath(".//*[@id='resizableani']/div[3]")), -250, -50).perform();
    }

    public void increaseMiddleElementAnimate() {
        (new Actions(driver)).dragAndDropBy(driver.findElement(By.xpath(".//*[@id='resizableani']/div[3]")), 320, 5).perform();
    }

    public void increaseElementConstrain() {
        (new Actions(driver)).dragAndDropBy(driver.findElement(By.xpath(".//*[@id='resizableconstrain']/div[3]")), 10, 150).perform();
    }

    public void decreaseElementConstrain() {
        (new Actions(driver)).dragAndDropBy(driver.findElement(By.xpath(".//*[@id='resizableconstrain']/div[3]")), 0, -75).perform();
    }

    public void increaseElementHelper() {
        (new Actions(driver)).dragAndDropBy(driver.findElement(By.xpath(".//*[@id='resizable_helper']/div[3]")), 400, 158).perform();
    }

    public void decreaseElementHelper() {
        (new Actions(driver)).dragAndDropBy(driver.findElement(By.xpath(".//*[@id='resizable_helper']/div[3]")), -450, -160).perform();
    }

    public void increaseMiddleElementHelper() {
        (new Actions(driver)).dragAndDropBy(driver.findElement(By.xpath(".//*[@id='resizable_helper']/div[3]")), 200, 180).perform();
    }

    public void increaseElementMaxMinSize() {
        (new Actions(driver)).dragAndDropBy(driver.findElement(By.xpath(".//*[@id='resizable_max_min']/div[3]")), 400, 158).perform();
    }

    public void decreaseElementMaxMinSize() {
        (new Actions(driver)).dragAndDropBy(driver.findElement(By.xpath(".//*[@id='resizable_max_min']/div[3]")), -450, -160).perform();
    }
}