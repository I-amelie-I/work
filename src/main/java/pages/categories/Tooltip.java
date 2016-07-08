package pages.categories;

import com.unitedsofthouse.ucucumberpackage.typesfactory.types.Button;
import com.unitedsofthouse.ucucumberpackage.typesfactory.types.TextInput;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.springframework.context.annotation.Lazy;
import pages.base.BasePage;

import java.util.List;

/**
 * Created by pchelintsev on 5/19/2016.
 */
public class Tooltip extends BasePage {
    @Override
    protected WebElement elementForLoading() throws Exception {
        return null;
    }

    public void navigateToAgeTextInput(){
        (new Actions(driver)).moveToElement(driver.findElement(By.xpath(".//*[@id='age']"))).perform();
    }

    public void navigateToShow() throws InterruptedException {
        (new Actions(driver)).moveToElement(driver.findElement(By.xpath(".//*[@id='show-option']"))).perform();
        Thread.sleep(1000);
    }

    public void navigateToHide() throws InterruptedException {
        (new Actions(driver)).moveToElement(driver.findElement(By.xpath(".//*[@id='hide-option']"))).perform();
        Thread.sleep(1000);

    }

    public void navigateToOpenEvent() throws InterruptedException {
        (new Actions(driver)).moveToElement(driver.findElement(By.xpath(".//*[@id='open-event']"))).perform();
        Thread.sleep(1000);

    }
}
