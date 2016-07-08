package pages.categories;

import com.unitedsofthouse.ucucumberpackage.typesfactory.types.Button;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.springframework.context.annotation.Lazy;
import pages.base.BasePage;

import java.util.List;

/**
 * Created by ivnytska on 17-May-16.
 */
public class Selectable extends BasePage {
    Actions actions = new Actions(driver);

    @Override
    protected WebElement elementForLoading() throws Exception {
        return null;
    }

    @Lazy
    @FindBy(xpath = ".//ol[@id='selectable']/li")
    public List<Button> itemListDefaultView;

    @Lazy
    @FindBy(xpath = ".//ol[@id='selectable_grid']/li")
    public List<Button> itemListGridView;

    @Lazy
    @FindBy(xpath = ".//ol[@id='selectable-serialize']/li")
    public List<Button> itemListSerializeView;

    @Lazy
    @FindBy(xpath = ".//*[@id='selectable']/li[contains(@class,'ui-selected')]")
    public List<Button> selectedItemsListDefaultView;

    @Lazy
    @FindBy(xpath = ".//*[@id='selectable_grid']/li[contains(@class,'ui-selected')]")
    public List<Button> selectedItemsListGridView;

    @Lazy
    @FindBy(xpath = ".//*[@id='selectable-serialize']/li[contains(@class,'ui-selected')]")
    public List<Button> selectedItemsListSerializeView;

    public void selectItemDefaultView() throws Exception {
        while (selectedItemsListDefaultView.size() != 0) {
            for (Button item : selectedItemsListDefaultView) {
                actions.keyDown(Keys.CONTROL).perform();
                item.click();
                actions.keyUp(Keys.CONTROL).perform();
            }
        }
        for (Button item : itemListDefaultView) {
            item.click();
            Assert.assertTrue(item.getText().equals(selectedItemsListDefaultView.get(0).getText()));
        }
    }

    public void selectAllItemsDefaultView() throws Exception {
        while (selectedItemsListDefaultView.size() != 0) {
            for (Button item : selectedItemsListDefaultView) {
                actions.keyDown(Keys.CONTROL).perform();
                item.click();
                actions.keyUp(Keys.CONTROL).perform();
            }
        }
        actions.keyDown(Keys.CONTROL).perform();
        int count = 0;
        for (Button item : itemListDefaultView) {
            item.click();
            count++;
        }
        Assert.assertTrue(count == selectedItemsListDefaultView.size());
        actions.keyUp(Keys.CONTROL).perform();
    }

    public void selectItemGridView() throws Exception {
        while (selectedItemsListGridView.size() != 0) {
            for (Button item : selectedItemsListGridView) {
                actions.keyDown(Keys.CONTROL).perform();
                item.click();
                actions.keyUp(Keys.CONTROL).perform();
            }
        }
        for (Button item : itemListGridView) {
            item.click();
            Assert.assertTrue(item.getText().equals(selectedItemsListGridView.get(0).getText()));
        }
    }

    public void selectAllItemsGridView() throws Exception {
        while (selectedItemsListGridView.size() != 0) {
            for (Button item : selectedItemsListGridView) {
                actions.keyDown(Keys.CONTROL).perform();
                item.click();
                actions.keyUp(Keys.CONTROL).perform();
            }
        }
        actions.keyDown(Keys.CONTROL).perform();
        int count = 0;
        for (Button item : itemListGridView) {
            item.click();
            count++;
        }
        Assert.assertTrue(count == selectedItemsListGridView.size());
        actions.keyUp(Keys.CONTROL).perform();
    }

    public void selectItemSerializeView() throws Exception {
        while (selectedItemsListSerializeView.size() != 0) {
            for (Button item : selectedItemsListSerializeView) {
                actions.keyDown(Keys.CONTROL).perform();
                item.click();
                actions.keyUp(Keys.CONTROL).perform();
            }
        }
        for (Button item : itemListSerializeView) {
            item.click();
            Assert.assertTrue(item.getText().equals(selectedItemsListSerializeView.get(0).getText()));
        }
    }

    public void selectAllItemsSerializeView() throws Exception {
        while (selectedItemsListSerializeView.size() != 0) {
            for (Button item : selectedItemsListSerializeView) {
                actions.keyDown(Keys.CONTROL).perform();
                item.click();
                actions.keyUp(Keys.CONTROL).perform();
            }
        }
        actions.keyDown(Keys.CONTROL).perform();
        int count = 0;
        for (Button item : itemListSerializeView) {
            item.click();
            count++;
        }
        Assert.assertTrue(count == selectedItemsListSerializeView.size());
        actions.keyUp(Keys.CONTROL).perform();
    }

    public void selectView(String name) {
        driver.findElement(By.xpath(".//*[contains(@class,\"ui-tabs-nav\")]/li/a[contains(text(),\"" + name + "\")]")).click();
    }
}