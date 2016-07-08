package pages.categories;

import com.unitedsofthouse.ucucumberpackage.typesfactory.types.DropDown;
import com.unitedsofthouse.ucucumberpackage.typesfactory.types.Link;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.context.annotation.Lazy;
import pages.base.BasePage;

import java.util.ArrayList;
import java.util.Set;

/**
 * Created by pchelintsev on 5/19/2016.
 */
public class FramesAndWindows extends BasePage {
    @Override
    protected WebElement elementForLoading() throws Exception {
        return null;
    }

    @Lazy
    @FindBy(xpath = ".//a[contains(text(),'New Browser Tab')]")
    public Link newBrowserTab;

    @Lazy
    @FindBy(xpath = ".//a[contains(text(),'Open New Seprate Window')]")
    public Link openNewSeprateWindow;

    @Lazy
    @FindBy(xpath = ".//a[contains(text(),'Open Frameset Window')]")
    public Link openFramesetWindow;






    public void switchToNewWindow() throws Exception {

        String firstHandle = driver.getWindowHandle();
        Thread.sleep(1000);
        Set handles = driver.getWindowHandles();
        Thread.sleep(1000);
        handles.remove(firstHandle);
        driver.switchTo().window(handles.toString().replace("[","").replace("]",""));
        driver.close();
        driver.switchTo().window(firstHandle);
    }


}
