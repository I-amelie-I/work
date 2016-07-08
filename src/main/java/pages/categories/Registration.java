package pages.categories;

import com.unitedsofthouse.ucucumberpackage.typesfactory.types.*;
import cucumber.api.java.en.But;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.context.annotation.Lazy;
import pages.base.BasePage;



import java.util.List;

/**
 * Created by pchelintsev on 5/17/2016.
 */
public class Registration extends BasePage {



    @Lazy
    @FindBy(xpath = ".//h1[contains(text(),'Registration')]")
    public WebElement titleRegistration;

    @Lazy
    @FindBy(xpath = ".//p[contains(text(), 'Thank you for your registration')]")
    public Label successMessage;

    @Lazy
    @FindBy(xpath = ".//input[@name='first_name']")
    public TextInput firstNameTextInput;


    @Lazy
    @FindBy(xpath = "  .//input[@type='submit']")
    public Button submitButton;

    @Lazy
    @FindBy(xpath = ".//label[contains(text(),'Confirm')]/following-sibling::input")
    public TextInput confirmPasswordTextInput;

    @Lazy
    @FindBy(xpath = ".//input[@name='password']")
    public TextInput passwordTextInput;

    @Lazy
    @FindBy(xpath = ".//input[@name='last_name']")
    public TextInput lastNameTextInput;

    @Lazy
    @FindBy(xpath = ".//input[@name='e_mail']")
    public TextInput emailTextInput;

    @Lazy
    @FindBy(xpath = ".//input[@name='phone_9']")
    public TextInput phoneNumberTextInput;

    @Lazy
    @FindBy(xpath = ".//input[@name='username']")
    public TextInput usernameTextInput;

    @Lazy
    @FindBy(xpath = ".//label[contains(text(),'Country')]//following-sibling::select")
    public DropDown countryDropDown;

    @Lazy
    @FindBy(xpath = ".//select[option[contains(text(), 'Month')]]")
    public DropDown monthDropDown;

    @Lazy
    @FindBy(xpath = ".//select[option[contains(text(), 'Day')]]")
    public DropDown dayDropDown;

    @Lazy
    @FindBy(xpath = ".//select[option[contains(text(), 'Year')]]")
    public DropDown yearDropDown;



    public RadioButton getMaritalRadiobutton(String radioButtonName){
        return new RadioButton(By.xpath(String.format(".//input[contains(@value, '%1$s')]", radioButtonName)));
    }

    public CheckBox getHobbyCheckBox(String checboxName) {
        return new CheckBox(By.xpath(String.format(".//input[contains(@value, '%1$s')]", checboxName)));
    }

    @Override
    protected WebElement elementForLoading() throws Exception {
        return null;
    }
}
