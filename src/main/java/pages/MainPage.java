package pages;

import com.unitedsofthouse.ucucumberpackage.typesfactory.types.Button;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.context.annotation.Lazy;
import pages.base.BasePage;

/**
 * Created by pchelintsev on 5/17/2016.
 */
public class MainPage extends BasePage{

    @Override
    protected WebElement elementForLoading() throws Exception {
        return null;
    }

    @Lazy
    @FindBy(xpath = ".//h1[contains(text(),'Home')]")
    public Button titleHome;

    public  Button getCategory(String buttonName){
       Button button = new Button(By.xpath(String.format(".//div[@id='secondary']//a[contains(text(), '%1$s')]", buttonName)));
        return button;
    }
}
