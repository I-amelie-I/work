package pages.base;

import com.unitedsofthouse.ucucumberpackage.typesfactory.factory.TypeFactory;
import com.unitedsofthouse.ucucumberpackage.typesfactory.types.Button;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by logovskoy on 12/3/2015.
 */
public abstract class BasePage extends PageInstance {
    protected int timeOut = 60;

    public BasePage() {
        TypeFactory.containerInitHTMLElements(this);
        PageFactory.initElements(driver, this);

    }
    /**
     * @Return Element is waiting for to define page is loaded.
     */
    protected abstract WebElement elementForLoading() throws Exception;

    /**
     * @Return Page class name.
     */
    public String toString(){
        return this.getClass().getSimpleName();
    }

    public Button getButton(String buttonName){
        return new Button(By.xpath(String.format(".//ul[@role='tablist']//a[contains(text(),'%1$s')]", buttonName)));
    }
}