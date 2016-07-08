package pages.categories;

import com.unitedsofthouse.ucucumberpackage.typesfactory.types.TextInput;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.context.annotation.Lazy;
import pages.base.BasePage;

/**
 * Created by ivnytska on 18-May-16.
 */
public class Autocomplete extends BasePage {
    @Override
    protected WebElement elementForLoading() throws Exception {
        return null;
    }

    @Lazy
    @FindBy(xpath = ".//*[@id='tagss']")
    public TextInput queryStringDefault;

    @Lazy
    @FindBy(xpath = ".//*[@id='tagsss']")
    public TextInput queryStringMultipleValues;

    @Lazy
    @FindBy(xpath = ".//*[@id='searcha']")
    public TextInput queryStringCategories;

    public void enterTextDefault(String text) throws Exception {
        queryStringDefault.clear();
        queryStringDefault.sendKeys(text);
    }

    public void selectText(String text) throws InterruptedException {
//        driver.findElement(By.xpath(String.format(".//li/a[contains(text(), '%1$s')]", text))).click();
        driver.findElement(By.linkText(text)).click();
    }

    public void checkTextTrueDefault(String text) throws Exception {
        Assert.assertEquals(queryStringDefault.getText(), text);
    }

    public void enterTextMultipleValues(String text) throws Exception {
        queryStringMultipleValues.sendKeys(text);
    }

    public void checkTextTrueMultipleValues(String text) throws Exception {
        Assert.assertEquals(queryStringMultipleValues.getText().substring(0, queryStringMultipleValues.getText().length() - 2), text);
    }

    public void enterTextCategories(String text) throws Exception {
        queryStringCategories.clear();
        queryStringCategories.sendKeys(text);
    }

    public void checkTextTrueCategories(String text) throws Exception {
        Assert.assertEquals(queryStringCategories.getText(), text);
    }
}