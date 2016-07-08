package pages.categories;

import com.unitedsofthouse.ucucumberpackage.typesfactory.types.DropDown;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.springframework.context.annotation.Lazy;
import pages.base.BasePage;

/**
 * Created by pchelintsev on 5/19/2016.
 */
public class Slider extends BasePage {
    @Override
    protected WebElement elementForLoading() throws Exception {
        return null;
    }

    public void moveSlider() throws InterruptedException {
        Thread.sleep(1000);
        (new Actions(driver)).dragAndDropBy(driver.findElement(By.xpath(".//*[@id='slider-range-max']/a")),50,0).perform();
        Thread.sleep(1000);
        (new Actions(driver)).dragAndDropBy(driver.findElement(By.xpath(".//*[@id='slider-range-max']/a")),100,0).perform();
        Thread.sleep(1000);
        (new Actions(driver)).dragAndDropBy(driver.findElement(By.xpath(".//*[@id='slider-range-max']/a")),150,0).perform();
        Thread.sleep(1000);
        (new Actions(driver)).dragAndDropBy(driver.findElement(By.xpath(".//*[@id='slider-range-max']/a")),-50,0).perform();
        Thread.sleep(1000);
        (new Actions(driver)).dragAndDropBy(driver.findElement(By.xpath(".//*[@id='slider-range-max']/a")),-100,0).perform();
        Thread.sleep(1000);
        (new Actions(driver)).dragAndDropBy(driver.findElement(By.xpath(".//*[@id='slider-range-max']/a")),-200,0).perform();
        Thread.sleep(1000);
        (new Actions(driver)).dragAndDropBy(driver.findElement(By.xpath(".//*[@id='slider-range-max']/a")),600,0).perform();

    }
}
