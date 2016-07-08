package stepdefenition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import myproject.CucumberArpReport;
import myproject.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import pages.base.PageInstance;
import pages.categories.Draggable;
import pages.categories.Sortable;

/**
 * Created by pchelintsev on 5/18/2016.
 */
public class SortableStepDefinitions extends PageInstance {
    @Autowired
    private
    Sortable sortable;

    @And("^I reorder elements in a list$")
    public void iReorderElementsInAList() throws Throwable {
        if (checkIfFurtherStepsAreNeeded()) {
            return;
        }
        try {
            sortable.reorderInDefaultFunctionality();
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e) {
            ReportService.ReportAction(e.getMessage(), false);
        } finally {
            CucumberArpReport.nextStep();
        }
    }

    @And("^I reorder elements in 'Connect Lists' section$")
    public void iReorderElementsInConnectListsSection() throws Throwable {
        if (checkIfFurtherStepsAreNeeded()) {
            return;
        }
        try {
            sortable.reorderInConnectLists();
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e) {
            ReportService.ReportAction(e.getMessage(), false);
        } finally {
            CucumberArpReport.nextStep();
        }
    }

    @And("^I reorder elements in 'Display as grid' section$")
    public void iReorderElementsInDisplayAsGridSection() throws Throwable {
        if (checkIfFurtherStepsAreNeeded()) {
            return;
        }
        try {
            sortable.reorderInDisplayGrid();
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e) {
            ReportService.ReportAction(e.getMessage(), false);
        } finally {
            CucumberArpReport.nextStep();
        }
    }

    @And("^I reorder elements in 'Portlets' section$")
    public void iReorderElementsInPortletsSection() throws Throwable {
        if (checkIfFurtherStepsAreNeeded()) {
            return;
        }
        try {
            sortable.reorderInPortlets();
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e) {
            ReportService.ReportAction(e.getMessage(), false);
        } finally {
            CucumberArpReport.nextStep();
        }
    }
}
