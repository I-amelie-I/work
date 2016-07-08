package stepdefenition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import myproject.CucumberArpReport;
import myproject.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import pages.base.PageInstance;
import pages.categories.Draggable;
import pages.categories.Registration;

/**
 * Created by pchelintsev on 5/17/2016.
 */
public class DraggableStepDefinitions extends PageInstance {

    @Autowired
    private
    Draggable draggable;


//    @And("^I click on \"([^\"]*)\" button$")
//    public void iClickOnButton(String buttonName) throws Throwable {
//        Thread.sleep(1000);
//        draggable.getButton(buttonName).click();
////    }

    @And("^I drag 'Drag me around' element$")
    public void iDragDragMeAroundElement() throws Throwable {
        if (checkIfFurtherStepsAreNeeded()) {
            return;
        }
        try {
            draggable.dragDragMeAroundElement();
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e) {
            ReportService.ReportAction(e.getMessage(), false);
        } finally {
            CucumberArpReport.nextStep();
        }

    }

    @And("^I drag elements in 'Constrain movement' section$")
    public void iDragElementsInThisSection() throws Throwable {
        if (checkIfFurtherStepsAreNeeded()) {
            return;
        }
        try {
            Thread.sleep(1000);
            draggable.dragHorizontallyElement();
            Thread.sleep(1000);
            draggable.dragVerticalyElement();
            Thread.sleep(1000);
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e) {
            ReportService.ReportAction(e.getMessage(), false);
        } finally {
            CucumberArpReport.nextStep();
        }
    }

    @And("^I drag elements in 'Cursor style' section$")
    public void iDragElementsInCursorStyleSection() throws Throwable {
        if (checkIfFurtherStepsAreNeeded()) {
            return;
        }
        try {
            Thread.sleep(1000);
            draggable.dragMouseInCentr();
            Thread.sleep(1000);
            draggable.dragMouseInLeftCorner();
            Thread.sleep(1000);
            draggable.dragMouseInBottom();
            Thread.sleep(1000);
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e) {
            ReportService.ReportAction(e.getMessage(), false);
        } finally {
            CucumberArpReport.nextStep();
        }
    }

    @And("^I drag elements in 'Events' section$")
    public void iDragElementsInEventsSection() throws Throwable {
        if (checkIfFurtherStepsAreNeeded()) {
            return;
        }
        try {
            Thread.sleep(1000);
            draggable.dragTriger();
            Thread.sleep(1000);
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e) {
            ReportService.ReportAction(e.getMessage(), false);
        } finally {
            CucumberArpReport.nextStep();
        }

    }

    @And("^I drag elements in Draggable and Sortable section$")
    public void iDragElementsInDraggableAndSortableSection() throws Throwable {
        if (checkIfFurtherStepsAreNeeded()) {
            return;
        }
        try {
            draggable.dragAndSort();
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e) {
            ReportService.ReportAction(e.getMessage(), false);
        } finally {
            CucumberArpReport.nextStep();
        }
    }
}
