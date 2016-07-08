package pages.categories;

import com.unitedsofthouse.ucucumberpackage.typesfactory.types.Button;
import com.unitedsofthouse.ucucumberpackage.typesfactory.types.Label;
import com.unitedsofthouse.ucucumberpackage.typesfactory.types.RadioButton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.springframework.context.annotation.Lazy;
import pages.base.BasePage;

/**
 * Created by pchelintsev on 5/17/2016.
 */
public class Draggable extends BasePage {
    @Override
    protected WebElement elementForLoading() throws Exception {
        return null;
    }

//    public  Button getButton(String buttonName){
//        return new Button(By.xpath(String.format(".//a[contains(text(),'%1$s')]", buttonName)));
//    }

    public void dragDragMeAroundElement(){

        (new Actions(driver)).dragAndDropBy(driver.findElement(By.xpath(".//*[@id='draggable']")),100,20).perform();
    }

    public void dragVerticalyElement(){
        (new Actions(driver)).dragAndDropBy(driver.findElement(By.xpath(".//div[@id='draggabl']")),0,150).perform();
    }

    public void dragHorizontallyElement(){
        (new Actions(driver)).dragAndDropBy(driver.findElement(By.xpath(".//div[@id='draggabl2']")),300,0).perform();
    }

    public void dragMouseInCentr(){
        (new Actions(driver)).dragAndDropBy(driver.findElement(By.xpath(".//*[@id='drag']/p")),100,20).perform();
    }

    public void dragMouseInLeftCorner(){
        (new Actions(driver)).dragAndDropBy(driver.findElement(By.xpath(".//*[@id='drag2']/p")),150,40).perform();
    }

    public void dragMouseInBottom(){
        (new Actions(driver)).dragAndDropBy(driver.findElement(By.xpath(".//*[@id='drag3']/p")),200,60).perform();
    }

    public void dragTriger() throws InterruptedException {
        (new Actions(driver)).dragAndDropBy(driver.findElement(By.xpath(".//*[@id='dragevent']")),100,100).perform();
        Thread.sleep(1000);
        (new Actions(driver)).dragAndDropBy(driver.findElement(By.xpath(".//*[@id='dragevent']")),50,50).perform();
        Thread.sleep(1000);
        (new Actions(driver)).dragAndDropBy(driver.findElement(By.xpath(".//*[@id='dragevent']")),-50,-50).perform();
        Thread.sleep(1000);
        (new Actions(driver)).dragAndDropBy(driver.findElement(By.xpath(".//*[@id='dragevent']")),-150,-150).perform();
        Thread.sleep(1000);

    }

    public void dragAndSort() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(".//ul[@id='sortablebox']/li[contains(text(),'Item 1')]"));
        WebElement to = driver.findElement(By.xpath(".//ul[@id='sortablebox']/li[contains(text(),'Item 3')]"));
        (new Actions(driver)).dragAndDrop(element,to).perform();
        Thread.sleep(1000);

         element = driver.findElement(By.xpath(".//ul[@id='sortablebox']/li[contains(text(),'Item 4')]"));
         to = driver.findElement(By.xpath(".//ul[@id='sortablebox']/li[contains(text(),'Item 2')]"));
        (new Actions(driver)).dragAndDrop(element,to).perform();
        Thread.sleep(1000);

         element = driver.findElement(By.xpath(".//ul[@id='sortablebox']/li[contains(text(),'Item 5')]"));
         to = driver.findElement(By.xpath(".//ul[@id='sortablebox']/li[contains(text(),'Item 3')]"));
        (new Actions(driver)).dragAndDrop(element,to).perform();
        Thread.sleep(1000);

         element = driver.findElement(By.xpath(".//ul[@id='sortablebox']/li[contains(text(),'Item 2')]"));
         to = driver.findElement(By.xpath(".//ul[@id='sortablebox']/li[contains(text(),'Item 1')]"));
        (new Actions(driver)).dragAndDrop(element,to).perform();
        Thread.sleep(1000);

    }

}
