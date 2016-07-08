package stepdefenition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import myproject.CucumberArpReport;
import myproject.ReportService;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import pages.base.PageInstance;
import pages.categories.Autocomplete;

/**
 * Created by ivnytska on 18-May-16.
 */
public class AutocompleteStepDefinitions extends PageInstance {
    @Autowired
    Autocomplete autocomplete;

    @And("^I enter \"([^\"]*)\" into query string in 'Default functionality' section$")
    public void iEnterIntoQueryStringInDefaultFunctionalitySection(String text) throws Throwable {
        if (checkIfFurtherStepsAreNeeded()) {
            return;
        }
        try {
            autocomplete.enterTextDefault(text);
            Thread.sleep(1000);
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e) {
            ReportService.ReportAction(e.getMessage(), false);
        } finally {
            CucumberArpReport.nextStep();
        }

    }

    @When("^I select \"([^\"]*)\" from dropdown list")
    public void iSelectFromDropdownList(String text) throws Throwable {
        if (checkIfFurtherStepsAreNeeded()) {
            return;
        }
        try {
            autocomplete.selectText(text);
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e) {
            ReportService.ReportAction(e.getMessage(), false);
        } finally {
            CucumberArpReport.nextStep();
        }
    }

    @Then("^\"([^\"]*)\" is displayed in query string in 'Default functionality' section$")
    public void isDisplayedInQueryStringInDefaultFunctionalitySection(String text) throws Throwable {
        if (checkIfFurtherStepsAreNeeded()) {
            return;
        }
        try {
            autocomplete.checkTextTrueDefault(text);
            Thread.sleep(1000);
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e) {
            ReportService.ReportAction(e.getMessage(), false);
        } finally {
            CucumberArpReport.nextStep();
        }
    }

    @And("^I enter \"([^\"]*)\" into query string in 'Multiple Values' section$")
    public void iEnterIntoQueryStringInMultipleValuesSection(String text) throws Throwable {
        if (checkIfFurtherStepsAreNeeded()) {
            return;
        }
        try {
            autocomplete.enterTextMultipleValues(text);
            Thread.sleep(1000);
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e) {
            ReportService.ReportAction(e.getMessage(), false);
        } finally {
            CucumberArpReport.nextStep();
        }
    }

    @Then("^\"([^\"]*)\" is displayed in query string in 'Multiple Values' section$")
    public void isDisplayedInQueryStringInMultipleValuesSection(String text) throws Throwable {
        if (checkIfFurtherStepsAreNeeded()) {
            return;
        }
        try {
            autocomplete.checkTextTrueMultipleValues(text);
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e) {
            ReportService.ReportAction(e.getMessage(), false);
        } finally {
            CucumberArpReport.nextStep();
        }
    }

    @And("^I enter \"([^\"]*)\" into query string in 'Categories' section$")
    public void iEnterIntoQueryStringInCategoriesSection(String text) throws Throwable {
        if (checkIfFurtherStepsAreNeeded()) {
            return;
        }
        try {
            autocomplete.enterTextCategories(text);
            Thread.sleep(1000);
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e) {
            ReportService.ReportAction(e.getMessage(), false);
        } finally {
            CucumberArpReport.nextStep();
        }
    }

    @Then("^\"([^\"]*)\" is displayed in query string in 'Categories' section$")
    public void isDisplayedInQueryStringInCategoriesSection(String text) throws Throwable {
        if (checkIfFurtherStepsAreNeeded()) {
            return;
        }
        try {
            autocomplete.checkTextTrueCategories(text);
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e) {
            ReportService.ReportAction(e.getMessage(), false);
        } finally {
            CucumberArpReport.nextStep();
        }
    }
}