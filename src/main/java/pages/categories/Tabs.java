package pages.categories;

import com.unitedsofthouse.ucucumberpackage.typesfactory.types.DropDown;
import com.unitedsofthouse.ucucumberpackage.typesfactory.types.Label;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.context.annotation.Lazy;
import pages.base.BasePage;

import java.util.Base64;

/**
 * Created by pchelintsev on 5/19/2016.
 */
public class Tabs extends BasePage {
    @Override
    protected WebElement elementForLoading() throws Exception {
        return null;
    }



    @Lazy
    @FindBy(xpath = ".//*[@id='ui-id-1']")
    public Label tab1;

    @Lazy
    @FindBy(xpath = ".//*[@id='ui-id-2']")
    public Label tab2;

    @Lazy
    @FindBy(xpath = ".//*[@id='ui-id-3']")
    public Label tab3;

    public void selectTabs() throws Exception {
       Thread.sleep(1000);
        tab1.click();
        Thread.sleep(1000);
        tab2.click();
        Thread.sleep(1000);
        tab3.click();
        Thread.sleep(1000);
        tab1.click();
        Thread.sleep(1000);
        tab3.click();
        Thread.sleep(1000);
        tab2.click();


    }

}
