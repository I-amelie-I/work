package stepdefenition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import myproject.CucumberArpReport;
import myproject.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import pages.base.PageInstance;
import pages.categories.Menu;

/**
 * Created by ivnytska on 19-May-16.
 */
public class MenuStepDefinitions extends PageInstance {
    @Autowired
    Menu menu;

    @And("^I click on each menu section one by one$")
    public void iClickOnEachMenuSectionOneByOne() throws Throwable {
        if (checkIfFurtherStepsAreNeeded()) {
            return;
        }
        try {
            menu.clickOnMenuSectionsSimple();
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e) {
            ReportService.ReportAction(e.getMessage(), false);
        } finally {
            CucumberArpReport.nextStep();
        }
    }

    @And("^I click on each menu section and sub-section one by one$")
    public void iClickOnEachMenuSectionAndSubSectionOneByOne() throws Throwable {
        if (checkIfFurtherStepsAreNeeded()) {
            return;
        }
        try {
            menu.clickOnMenuSectionsSubMenu();
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e) {
            ReportService.ReportAction(e.getMessage(), false);
        } finally {
            CucumberArpReport.nextStep();
        }
    }
}