package stepdefenition;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import gherkin.formatter.model.DocString;
import myproject.CucumberArpReport;
import myproject.ReportService;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Autowired;
import pages.MainPage;
import pages.base.PageInstance;
import pages.categories.Registration;

/**
 * Created by pchelintsev on 5/17/2016.
 */
public class MainPageStepDefinitions extends PageInstance {
    @Autowired
    private
    MainPage mainPage;

    @Given("^I'm on main page$")
    public void iMOnMainPage() throws Throwable {
        if (checkIfFurtherStepsAreNeeded()) {
            return;
        }
        try {
            Thread.sleep(3000);
            ReportService.ReportAction("I`m on a main page", mainPage.titleHome.isDisplayed());
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e) {
            ReportService.ReportAction("I`m on a main page", mainPage.titleHome.isDisplayed());
            ReportService.ReportAction(e.getMessage(), false);
        } finally {
            CucumberArpReport.nextStep();
        }
    }

    @And("^I select \"([^\"]*)\" category$")
    public void iSelectCategory(String categoryName, DataTable yy) throws Throwable {
        if (checkIfFurtherStepsAreNeeded()) {
            return;
        }
        try {
            mainPage.getCategory(categoryName).click();
            ReportService.ReportAction("Question was selected", true);
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e) {
            ReportService.ReportAction(e.getMessage(), false);
        } finally {
            CucumberArpReport.nextStep();
        }
    }

    @And("^I click on \"([^\"]*)\" button$")
    public void iClickOnButton(String buttonName, Object o) throws Throwable {
        if (checkIfFurtherStepsAreNeeded()) {
            return;
        }
        try {
            Thread.sleep(1000);
            mainPage.getButton(buttonName).click();
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e) {
            ReportService.ReportAction(e.getMessage(), false);
        } finally {
            CucumberArpReport.nextStep();
        }
    }


    @And("^I click on \"([^\"]*)\" button bb$")
    public void iClickOnButtonBb(String buttonName) throws Throwable {
        if (checkIfFurtherStepsAreNeeded()) {
            return;
        }
        try {
            Thread.sleep(1000);
            mainPage.getButton(buttonName).click();
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e) {
            ReportService.ReportAction(e.getMessage(), false);
        } finally {
            CucumberArpReport.nextStep();
        }
    }

    @And("^I click on \"([^\"]*)\" button (\\d+) bb$")
    public void iClickOnButtonBb(String buttonName, int num) throws Throwable {
        if (checkIfFurtherStepsAreNeeded()) {
            return;
        }
        try {
            Thread.sleep(1000);
            mainPage.getButton(buttonName).click();
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e) {
            ReportService.ReportAction(e.getMessage(), false);
        } finally {
            CucumberArpReport.nextStep();
        }
    }

    @And("^jhkhkh $")
    public void jhkhkhName(String name) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
