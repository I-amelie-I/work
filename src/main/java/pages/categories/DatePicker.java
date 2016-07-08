package pages.categories;

import com.unitedsofthouse.ucucumberpackage.typesfactory.types.Button;
import com.unitedsofthouse.ucucumberpackage.typesfactory.types.DropDown;
import com.unitedsofthouse.ucucumberpackage.typesfactory.types.RadioButton;
import com.unitedsofthouse.ucucumberpackage.typesfactory.types.TextInput;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.context.annotation.Lazy;
import pages.base.BasePage;

import java.util.Base64;

/**
 * Created by pchelintsev on 5/19/2016.
 */
public class DatePicker extends BasePage{
    @Override
    protected WebElement elementForLoading() throws Exception {
        return null;
    }

    @Lazy
    @FindBy(xpath = ".//*[@id='datepicker1']")
    public TextInput datePickerDefaultFunctionality;

    @Lazy
    @FindBy(xpath = ".//*[@id='datepicker3']")
    public TextInput datePickerDisplayMonthYear;

    @Lazy
    @FindBy(xpath = ".//a[@data-handler='prev']")
    public Button prevButton;

    @Lazy
    @FindBy(xpath = ".//a[@data-handler='next']")
    public Button nextButton;

    @Lazy
    @FindBy(xpath = ".//*[@id='datepicker2']")
    public TextInput datePickerAnimations;

    @Lazy
    @FindBy(xpath = ".//*[@id='datepicker4']")
    public TextInput datePickerFormatDate;

    @Lazy
    @FindBy(xpath = ".//*[@id='anim']")
    public DropDown animationDropDown;


    @Lazy
    @FindBy(xpath = " .//*[@id='format']")
    public DropDown formatDropDown;

    @Lazy
    @FindBy(xpath = ".//select[@data-handler='selectMonth']")
    public DropDown selectMonthDropDown;

    @Lazy
    @FindBy(xpath = ".//select[@data-handler='selectYear']")
    public DropDown selectYearDropDown;

    public void selectDate(String day){
        driver.findElement(By.xpath(String.format(".//a[text()='%1$s']", day))).click();
    }

    public void showAnimations() throws Exception {
      for(int i = 1; i <animationDropDown.options().size();i++){

          datePickerAnimations.click();
          Thread.sleep(1000);
          animationDropDown.selectByIndex(i);
          Thread.sleep(1000);
      }
    }

  public void setDateForDefaultFunctionality() throws Exception {
      Thread.sleep(1000);
      datePickerDefaultFunctionality.click();
      Thread.sleep(1000);
      selectDate("10");
      Thread.sleep(1000);
      datePickerDefaultFunctionality.click();
      nextButton.click();
      Thread.sleep(1000);
      selectDate("15");
      Thread.sleep(1000);
      datePickerDefaultFunctionality.click();
      prevButton.click();
      Thread.sleep(1000);
      prevButton.click();
      Thread.sleep(1000);
      selectDate("3");
  }

    public void setDateForDisplayMonthYear() throws Exception {
        Thread.sleep(1000);
        datePickerDisplayMonthYear.click();
        Thread.sleep(1000);
        selectDate("10");
        Thread.sleep(1000);
        datePickerDisplayMonthYear.click();
        nextButton.click();
        Thread.sleep(1000);
        selectDate("15");
        Thread.sleep(1000);
        datePickerDisplayMonthYear.click();
        prevButton.click();
        Thread.sleep(1000);
        prevButton.click();
        Thread.sleep(1000);
        selectDate("3");
        datePickerDisplayMonthYear.click();
        Thread.sleep(1000);
        selectMonthDropDown.selectByIndex(5);
        datePickerDisplayMonthYear.click();
        Thread.sleep(1000);
        selectYearDropDown.selectByVisibleText("2008");
        Thread.sleep(1000);
    }

    public void showFormats() throws Exception {

        datePickerFormatDate.click();
        Thread.sleep(1000);
        selectDate("10");
        for(int i = 1; i <formatDropDown.options().size();i++){

            formatDropDown.selectByIndex(i);
            Thread.sleep(1000);
        }
    }



}

