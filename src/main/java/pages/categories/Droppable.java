package pages.categories;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.base.BasePage;

/**
 * Created by pchelintsev on 5/18/2016.
 */
public class Droppable extends BasePage {
    @Override
    protected WebElement elementForLoading() throws Exception {
        return null;
    }

    public void dragDragMeToMyTargetElement() throws InterruptedException {
        Thread.sleep(1000);
        WebElement element = driver.findElement(By.xpath(".//*[@id='draggableview']"));
        WebElement to = driver.findElement(By.xpath(".//*[@id='droppableview']"));
        (new Actions(driver)).dragAndDrop(element, to).perform();
        Thread.sleep(1000);
    }

    public void dragNonvalidElementInActionSection() throws InterruptedException {
        Thread.sleep(1000);

        WebElement element = driver.findElement(By.xpath(".//*[@id='draggable-nonvalid']"));
        WebElement to = driver.findElement(By.xpath(".//*[@id='droppableaccept']"));
        (new Actions(driver)).dragAndDrop(element, to).perform();
        Thread.sleep(1000);

        (new Actions(driver)).dragAndDropBy(driver.findElement(By.xpath(".//*[@id='draggable-nonvalid']")),150,120).perform();
        Thread.sleep(1000);

    }

    public void dragValidElementInActionSection() throws InterruptedException {
        Thread.sleep(1000);

        WebElement element = driver.findElement(By.xpath(".//*[@id='draggableaccept']"));
        WebElement to = driver.findElement(By.xpath(".//*[@id='droppableaccept']"));
        (new Actions(driver)).dragAndDrop(element, to).perform();
        Thread.sleep(1000);


    }

    public void dragInPreventPropagationSection() throws InterruptedException {

        WebElement element = driver.findElement(By.xpath(".//*[@id='draggableprop']"));
        WebElement to = driver.findElement(By.xpath(".//*[@id='droppable-inner']"));
        (new Actions(driver)).dragAndDrop(element, to).perform();
        Thread.sleep(1000);
         element = driver.findElement(By.xpath(".//*[@id='draggableprop']"));
         to = driver.findElement(By.xpath(".//*[@id='droppable2-inner']"));
        (new Actions(driver)).dragAndDrop(element, to).perform();
        Thread.sleep(1000);

        element = driver.findElement(By.xpath(".//*[@id='draggableprop']"));
         to = driver.findElement(By.xpath(".//*[@id='droppableprop2']"));
        (new Actions(driver)).dragAndDrop(element, to).perform();
        Thread.sleep(1000);

        (new Actions(driver)).dragAndDropBy(element,0,-10).perform();
        Thread.sleep(1000);
    }

    public void dragInRevert() throws InterruptedException {

        WebElement element = driver.findElement(By.xpath(".//*[@id='draggablerevert']"));
        WebElement to = driver.findElement(By.xpath(".//*[@id='droppablerevert']"));
        (new Actions(driver)).dragAndDrop(element, to).perform();
        Thread.sleep(1000);
         element = driver.findElement(By.xpath(".//*[@id='draggablerevert2']"));
         to = driver.findElement(By.xpath(".//*[@id='droppablerevert']"));
        (new Actions(driver)).dragAndDrop(element, to).perform();
        Thread.sleep(1000);
        (new Actions(driver)).dragAndDropBy(element,150,0).perform();
        Thread.sleep(1000);
    }

    public void dragInShopping() throws InterruptedException {

        JavascriptExecutor jse = (JavascriptExecutor)driver;

        Thread.sleep(1000);
        WebElement element = driver.findElement(By.xpath(".//li[contains(text(),'Lolcat Shirt')]"));
        WebElement to = driver.findElement(By.xpath(".//*[@id='cart']/div"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",to);
        (new Actions(driver)).dragAndDrop(element, to).perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath(".//a[contains(text(),'Bags')]")).click();
        Thread.sleep(1000);
        element = driver.findElement(By.xpath(".//li[contains(text(),'Alligator')]"));
        (new Actions(driver)).dragAndDrop(element, to).perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath(".//a[contains(text(),'Gadgets')]")).click();
        Thread.sleep(1000);
        element = driver.findElement(By.xpath(".//li[contains(text(),'iPhone')]"));
        (new Actions(driver)).dragAndDrop(element, to).perform();
        Thread.sleep(1000);




    }
}
