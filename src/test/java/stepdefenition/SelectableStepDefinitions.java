package stepdefenition;

import com.sun.deploy.util.Waiter;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import gherkin.lexer.Th;
import myproject.CucumberArpReport;
import myproject.ReportService;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.springframework.beans.factory.annotation.Autowired;
import pages.base.PageInstance;
import pages.categories.Selectable;

/**
 * Created by ivnytska on 17-May-16.
 */
public class SelectableStepDefinitions extends PageInstance {
    @Autowired
    Selectable selectable;

    @And("^I select all Items one by one in 'Default functionality' section$")
    public void iSelectAllItemsOneByOneInDefaultFunctionalitySection() throws Throwable {
        if (checkIfFurtherStepsAreNeeded()) {
            return;
        }
        try {
            selectable.selectItemDefaultView();
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e) {
            ReportService.ReportAction(e.getMessage(), false);
        } finally {
            CucumberArpReport.nextStep();
        }
    }

    @And("^I select all Items in in 'Default functionality' section$")
    public void iSelectAllItemsInInDefaultFunctionalitySection() throws Throwable {
        if (checkIfFurtherStepsAreNeeded()) {
            return;
        }
        try {
            selectable.selectAllItemsDefaultView();
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e) {
            ReportService.ReportAction(e.getMessage(), false);
        } finally {
            CucumberArpReport.nextStep();
        }
    }

    @And("^I select all Items one by one in 'Display as grid' section$")
    public void iSelectAllItemsOneByOneInDisplayAsGridSection() throws Throwable {
        if (checkIfFurtherStepsAreNeeded()) {
            return;
        }
        try {
            selectable.selectItemGridView();
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e) {
            ReportService.ReportAction(e.getMessage(), false);
        } finally {
            CucumberArpReport.nextStep();
        }
    }

    @And("^I select all Items in 'Display as grid' section$")
    public void iSelectAllItemsInDisplayAsGridSection() throws Throwable {
        if (checkIfFurtherStepsAreNeeded()) {
            return;
        }
        try {
            selectable.selectAllItemsGridView();
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e) {
            ReportService.ReportAction(e.getMessage(), false);
        } finally {
            CucumberArpReport.nextStep();
        }
    }

    @And("^I select all Items one by one in 'Serialize' section$")
    public void iSelectAllItemsOneByOneInSerializeSection() throws Throwable {
        if (checkIfFurtherStepsAreNeeded()) {
            return;
        }
        try {
            selectable.selectItemSerializeView();
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e) {
            ReportService.ReportAction(e.getMessage(), false);
        } finally {
            CucumberArpReport.nextStep();
        }
    }

    @And("^I select all Items in 'Serialize' section$")
    public void iSelectAllItemsInSerializeSection() throws Throwable {
        if (checkIfFurtherStepsAreNeeded()) {
            return;
        }
        try {
            selectable.selectAllItemsSerializeView();
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e) {
            ReportService.ReportAction(e.getMessage(), false);
        } finally {
            CucumberArpReport.nextStep();
        }
    }
}