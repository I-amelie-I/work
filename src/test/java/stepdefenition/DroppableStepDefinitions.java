package stepdefenition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import myproject.CucumberArpReport;
import myproject.ReportService;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import pages.MainPage;
import pages.base.PageInstance;
import pages.categories.Droppable;

/**
 * Created by pchelintsev on 5/18/2016.
 */
public class DroppableStepDefinitions extends PageInstance {
    @Autowired
    private
    Droppable droppable;


    @And("^I drag 'Drag me to my target' element$")
    public void iDragDragMeToMyTargetElement() throws Throwable {
        if (checkIfFurtherStepsAreNeeded()) {
            return;
        }
        try {
            droppable.dragDragMeToMyTargetElement();
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e) {
            ReportService.ReportAction(e.getMessage(), false);
        } finally {
            CucumberArpReport.nextStep();
        }
    }

    @And("^I drag elements in 'Accept' section$")
    public void iDragElementsInAcceptSection() throws Throwable {
        if (checkIfFurtherStepsAreNeeded()) {
            return;
        }
        try {
            droppable.dragNonvalidElementInActionSection();
            Thread.sleep(1000);
            droppable.dragValidElementInActionSection();
            Thread.sleep(1000);
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e) {
            ReportService.ReportAction(e.getMessage(), false);
        } finally {
            CucumberArpReport.nextStep();
        }
    }

    @And("^I drag elements in 'Prevent propagation' button$")
    public void iDragElementsInPreventPropagationButton() throws Throwable {
        if (checkIfFurtherStepsAreNeeded()) {
            return;
        }
        try {
            droppable.dragInPreventPropagationSection();
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e) {
            ReportService.ReportAction(e.getMessage(), false);
        } finally {
            CucumberArpReport.nextStep();
        }
    }

    @And("^I drag elements in 'Revert draggable Position' section$")
    public void iDragElementsInRevertDraggablePositionSection() throws Throwable {
        if (checkIfFurtherStepsAreNeeded()) {
            return;
        }
        try {
            droppable.dragInRevert();
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e) {
            ReportService.ReportAction(e.getMessage(), false);
        } finally {
            CucumberArpReport.nextStep();
        }
    }


    @And("^I drag elements in 'Shopping cart demo' section$")
    public void iDragElementsInShoppingCartDemoSection() throws Throwable {
        if (checkIfFurtherStepsAreNeeded()) {
            return;
        }
        try {
            droppable.dragInShopping();
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e) {
            ReportService.ReportAction(e.getMessage(), false);
        } finally {
            CucumberArpReport.nextStep();
        }
    }
}

