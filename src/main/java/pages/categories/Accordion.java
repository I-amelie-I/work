package pages.categories;

import com.unitedsofthouse.ucucumberpackage.typesfactory.types.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.context.annotation.Lazy;
import pages.base.BasePage;

import java.util.List;

/**
 * Created by kozlov on 5/17/2016.
 */
public class Accordion extends BasePage {
    @Override
    protected WebElement elementForLoading() throws Exception {
        return null;
    }
    @Lazy
    @FindBy(xpath = ".//div[@aria-expanded='true']/div/div/h3[1]")
    public Label titleRegistration;

    @Lazy
    @FindBy(xpath = ".//a[contains(@class, 'ui-tabs-anchor')]")
    public List<WebElement> availableAreas;

    @Lazy
    @FindBy(xpath = ".//li[@aria-selected='true']/a")
    public WebElement currentArea;

    @Lazy
    @FindBy(xpath = ".//div[@aria-expanded='true']//h3[contains(@class, 'ui-accordion-header-active')]")
    public WebElement currentHeader;

    @Lazy
    @FindBy(xpath = ".//div[@aria-expanded='true']//div[contains(@class, 'ui-accordion-content-active')]")
    public WebElement currentContent;

    @Lazy
    @FindBy(xpath = ".//div[@aria-expanded='true']//h3[contains(@class, 'ui-accordion-header')]")
    public List<WebElement> availableHeaders;

    @Lazy
    @FindBy(xpath = ".//div[@aria-expanded='true']/div/div/h3[1]")
    public WebElement availableHeader;

    @Lazy
    @FindBy(xpath = ".//div[@aria-expanded='true']/div/div/h3/span[contains(@class, 'ui-accordion-header-icon')]")
    public List<WebElement> icons;

    @Lazy
    @FindBy(xpath = ".//button[@id='toggle']")
    public WebElement toggleIcons;
}
