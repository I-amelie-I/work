package pages.categories;

import javafx.scene.layout.Background;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.base.BasePage;

/**
 * Created by pchelintsev on 5/18/2016.
 */
public class Sortable extends BasePage {
    @Override
    protected WebElement elementForLoading() throws Exception {
        return null;
    }

    public void reorderInDefaultFunctionality() throws InterruptedException {
        Thread.sleep(1000);
        WebElement element = driver.findElement(By.xpath(".//*[@id='sortable']/li[1]"));
        (new Actions(driver)).dragAndDropBy(element,0,100).perform();
        Thread.sleep(1000);

        element = driver.findElement(By.xpath(".//*[@id='sortable']/li[2]"));
        (new Actions(driver)).dragAndDropBy(element,0,100).perform();
        Thread.sleep(1000);

        element = driver.findElement(By.xpath(".//*[@id='sortable']/li[6]"));
        (new Actions(driver)).dragAndDropBy(element,0,-100).perform();
        Thread.sleep(1000);

        element = driver.findElement(By.xpath(".//*[@id='sortable']/li[5]"));
        (new Actions(driver)).dragAndDropBy(element,0,-100).perform();
        Thread.sleep(1000);

        element = driver.findElement(By.xpath(".//*[@id='sortable']/li[2]"));
        (new Actions(driver)).dragAndDropBy(element,0,100).perform();
        Thread.sleep(1000);

        element = driver.findElement(By.xpath(".//*[@id='sortable']/li[3]"));
        (new Actions(driver)).dragAndDropBy(element,0,100).perform();
        Thread.sleep(1000);

        element = driver.findElement(By.xpath(".//*[@id='sortable']/li[4]"));
        (new Actions(driver)).dragAndDropBy(element,0,-100).perform();
        Thread.sleep(1000);

    }

    public void reorderInConnectLists() throws InterruptedException {

        Thread.sleep(1000);
        WebElement element;// = driver.findElement(By.xpath(".//*[@id='sortable1']/li[1]"));
        WebElement to; //= driver.findElement(By.xpath(".//*[@id='sortable2']/li[1]"));

        for(int i =1; i<5;i++){
            element = driver.findElement(By.xpath(String.format(".//*[@id='sortable1']/li[%1$s]",i)));
            to = driver.findElement(By.xpath(String.format(".//*[@id='sortable2']/li[%1$s]",i+1)));
            (new Actions(driver)).dragAndDrop(element,to).perform();
            Thread.sleep(1000);

            element = driver.findElement(By.xpath(String.format(".//*[@id='sortable2']/li[%1$s]",i)));
            to = driver.findElement(By.xpath(String.format(".//*[@id='sortable1']/li[%1$s]",i)));
            (new Actions(driver)).dragAndDrop(element,to).perform();
            Thread.sleep(1000);
        }
    }

    public void reorderInDisplayGrid() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(".//*[@id='sortable_grid']/li[2]"));
        (new Actions(driver)).dragAndDropBy(element,0,100).perform();
        Thread.sleep(1000);

         element = driver.findElement(By.xpath(".//*[@id='sortable_grid']/li[12]"));
        (new Actions(driver)).dragAndDropBy(element,0,-100).perform();
        Thread.sleep(1000);

         element = driver.findElement(By.xpath(".//*[@id='sortable_grid']/li[7]"));
        (new Actions(driver)).dragAndDropBy(element,110,100).perform();
        Thread.sleep(1000);

         element = driver.findElement(By.xpath(".//*[@id='sortable_grid']/li[3]"));
        (new Actions(driver)).dragAndDropBy(element,0,200).perform();
        Thread.sleep(1000);

         element = driver.findElement(By.xpath(".//*[@id='sortable_grid']/li[2]"));
        (new Actions(driver)).dragAndDropBy(element,-110,100).perform();
        Thread.sleep(1000);

         element = driver.findElement(By.xpath(".//*[@id='sortable_grid']/li[2]"));
        (new Actions(driver)).dragAndDropBy(element,0,100).perform();
        Thread.sleep(1000);
    }

    public void reorderInPortlets() throws InterruptedException {

        Thread.sleep(1000);

        WebElement  element = driver.findElement(By.xpath(".//div[contains(text(),'Feeds')]"));
        WebElement   to = driver.findElement(By.xpath(".//div[contains(text(),'Shopping')]"));
        (new Actions(driver)).dragAndDrop(element,to).perform();
        Thread.sleep(1000);

        element = driver.findElement(By.xpath(".//div[contains(text(),'Links')]"));
        to = driver.findElement(By.xpath(".//div[contains(text(),'News')]"));
        (new Actions(driver)).dragAndDrop(element,to).perform();
        Thread.sleep(1000);

        element = driver.findElement(By.xpath(".//div[contains(text(),'News')]"));
        to = driver.findElement(By.xpath(".//div[contains(text(),'Images')]"));
        (new Actions(driver)).dragAndDrop(element,to).perform();
        Thread.sleep(1000);

        element = driver.findElement(By.xpath(".//div[contains(text(),'Images')]"));
        to = driver.findElement(By.xpath(".//div[contains(text(),'Shopping')]"));
        (new Actions(driver)).dragAndDrop(element,to).perform();
        Thread.sleep(1000);

        element = driver.findElement(By.xpath(".//div[contains(text(),'Feeds')]"));
        to = driver.findElement(By.xpath(".//div[contains(text(),'News')]"));
        (new Actions(driver)).dragAndDrop(element,to).perform();
        Thread.sleep(1000);

    }

 }
