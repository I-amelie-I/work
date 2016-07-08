package pages.categories;

import com.unitedsofthouse.ucucumberpackage.typesfactory.types.Button;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.context.annotation.Lazy;
import pages.base.BasePage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by ivnytska on 19-May-16.
 */
public class Menu extends BasePage {
    @Override
    protected WebElement elementForLoading() throws Exception {
        return null;
    }

    @Lazy
    @FindBy(xpath = ".//div[@id = \"tabs-1\"]//li")
    public List<Button> menuSimple;

    @Lazy
    @FindBy(xpath = ".//div[@id = \"tabs-2\"]/div/div/ul/li/child::a")
    public List<Button> menuWithSubMenu;

    public void clickOnMenuSectionsSimple() throws Exception {
        for (Button item : menuSimple) {
            item.click();
        }
    }

    public void clickOnMenuSectionsSubMenu() throws Exception {
        for (Button item : menuWithSubMenu) {
            item.click();
            String text = item.getText();
            List<WebElement> elem = driver.findElements(By.xpath((String.format(".//div[@id = \"tabs-2\"]//a[text() = '%1$s']/parent::li/ul//a", text))));
            for (int i = 0; i <= elem.size()-1; i++) {
                elem.get(i).click();
            }
        }
    }
}