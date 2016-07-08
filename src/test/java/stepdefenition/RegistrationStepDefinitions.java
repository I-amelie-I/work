package stepdefenition;

import com.unitedsofthouse.ucucumberpackage.tools.Waiters;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.SystemHelper;import myproject.CucumberArpReport;
import myproject.ReportService;
import myproject.CucumberArpReport;

import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import pages.MainPage;
import pages.base.PageInstance;
import pages.categories.Registration;

/**
 * Created by pchelintsev on 5/17/2016.
 */
public class RegistrationStepDefinitions extends PageInstance {
    @Autowired
    private
    Registration registrationPage;

    @And("^I enter \"([^\"]*)\" firstname$")
    public void iEnterFirstname(String firstName) throws Throwable {
        if (checkIfFurtherStepsAreNeeded()) {
            return;
        }
        try {
            Thread.sleep(1000);
            registrationPage.firstNameTextInput.enterText(firstName);
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e) {
            ReportService.ReportAction(e.getMessage(), false);
        } finally {
            CucumberArpReport.nextStep();
        }
    }

    @And("^I enter \"([^\"]*)\" lastname$")
    public void iEnterLastname(String lastName) throws Throwable {
        if (checkIfFurtherStepsAreNeeded()) {
            return;
        }
        try {
            registrationPage.lastNameTextInput.enterText(lastName);
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e) {
            ReportService.ReportAction(e.getMessage(), false);
        } finally {
            CucumberArpReport.nextStep();
        }
    }

    @And("^I set \"([^\"]*)\" marital status$")
    public void iSetMaritalStatus(String maritalStatus) throws Throwable {
        if (checkIfFurtherStepsAreNeeded()) {
            return;
        }
        try {
            registrationPage.getMaritalRadiobutton(maritalStatus).click();
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e) {
            ReportService.ReportAction(e.getMessage(), false);
        } finally {
            CucumberArpReport.nextStep();
        }
    }

    @And("^I set \"([^\"]*)\" hobby$")
    public void iSetHobby(String hobby) throws Throwable {
        if (checkIfFurtherStepsAreNeeded()) {
            return;
        }
        try {
            registrationPage.getHobbyCheckBox(hobby).check();
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e) {
            ReportService.ReportAction(e.getMessage(), false);
        } finally {
            CucumberArpReport.nextStep();
        }
    }

    @And("^I select \"([^\"]*)\" in country dropdown$")
    public void iSelectInCountryDropdown(String country) throws Throwable {
        if (checkIfFurtherStepsAreNeeded()) {
            return;
        }
        try {
            registrationPage.countryDropDown.selectByVisibleText(country);
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e) {
            ReportService.ReportAction(e.getMessage(), false);
        } finally {
            CucumberArpReport.nextStep();
        }

    }

    @And("^I select \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" in date of birth dropdowns$")
    public void iSelectInDateOfBirthDropdowns(String month, String day, String year) throws Throwable {
        if (checkIfFurtherStepsAreNeeded()) {
            return;
        }
        try {
            registrationPage.monthDropDown.selectByVisibleText(month);
            registrationPage.dayDropDown.selectByVisibleText(day);
            registrationPage.yearDropDown.selectByVisibleText(year);
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e) {
            ReportService.ReportAction(e.getMessage(), false);
        } finally {
            CucumberArpReport.nextStep();
        }
    }


    @And("^I enter \"([^\"]*)\" phone number$")
    public void iEnterPhoneNumber(String number) throws Throwable {
        if (checkIfFurtherStepsAreNeeded()) {
            return;
        }
        try {
            registrationPage.phoneNumberTextInput.enterText(number);
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e) {
            ReportService.ReportAction(e.getMessage(), false);
        } finally {
            CucumberArpReport.nextStep();
        }
    }

    @And("^I enter \"([^\"]*)\" username$")
    public void iEnterUsername(String username) throws Throwable {
        if (checkIfFurtherStepsAreNeeded()) {
            return;
        }
        try {
            registrationPage.usernameTextInput.enterText(SystemHelper.GET_VALUE(username));
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e) {
            ReportService.ReportAction(e.getMessage(), false);
        } finally {
            CucumberArpReport.nextStep();
        }
    }

    @And("^I enter \"([^\"]*)\" e-mail$")
    public void iEnterEMail(String mail) throws Throwable {
        if (checkIfFurtherStepsAreNeeded()) {
            return;
        }
        try {
            registrationPage.emailTextInput.enterText(SystemHelper.GET_VALUE(mail));
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e) {
            ReportService.ReportAction(e.getMessage(), false);
        } finally {
            CucumberArpReport.nextStep();
        }
    }

    @And("^I enter \"([^\"]*)\" and confirm it$")
    public void iEnterAndConfirmIt(String password) throws Throwable {
        if (checkIfFurtherStepsAreNeeded()) {
            return;
        }
        try {
            registrationPage.passwordTextInput.enterText(password);
            registrationPage.confirmPasswordTextInput.enterText(password);
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e) {
            ReportService.ReportAction(e.getMessage(), false);
        } finally {
            CucumberArpReport.nextStep();
        }
    }

    @When("^I press submit button$")
    public void iPressSubmitButton() throws Throwable {
        if (checkIfFurtherStepsAreNeeded()) {
            return;
        }
        try {
            registrationPage.submitButton.click();
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e) {
            ReportService.ReportAction(e.getMessage(), false);
        } finally {
            CucumberArpReport.nextStep();
        }
    }

    @Then("^Message 'Thank you for registration' is displayed$")
    public void messageThankYouForRegistrationIsDisplayed() throws Throwable {
        if (checkIfFurtherStepsAreNeeded()) {
            return;
        }
        try {
            Thread.sleep(1000);
            Assert.assertTrue("Registration isn't success", registrationPage.successMessage.isDisplayed());
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e) {
            ReportService.ReportAction(e.getMessage(), false);
        } finally {
            CucumberArpReport.nextStep();
        }
    }

    @And("^I enter (\\d+) phone number$")
    public void iEnterPhoneNumber(int number) throws Throwable {
        if (checkIfFurtherStepsAreNeeded()) {
            return;
        }
        try {
            registrationPage.phoneNumberTextInput.enterText(Integer.toString(number));
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e) {
            ReportService.ReportAction(e.getMessage(), false);
        } finally {
            CucumberArpReport.nextStep();
        }
    }
}
