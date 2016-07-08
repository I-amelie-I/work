package stepdefenition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import myproject.CucumberArpReport;
import myproject.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import pages.base.PageInstance;
import pages.categories.Resizable;
import pages.categories.Selectable;

/**
 * Created by ivnytska on 17-May-16.
 */
public class ResizableStepDefinitions extends PageInstance {
    @Autowired
    Resizable resizable;
//
//    @And("^I click on \"([^\"]*)\" button in resizable category$")
//    public void iClickOnButtonInResizableCategory(String buttonName) throws Throwable {
//        resizable.getButton(buttonName).click();
//    }

    @And("^I resize the window in 'Default functionality' section$")
    public void iResizeTheWindowInDefaultFunctionalitySection() throws Throwable {
        if (checkIfFurtherStepsAreNeeded()) {
            return;
        }
        try {
            resizable.increaseElementDefault();
            Thread.sleep(1000);
            resizable.decreaseElementDefault();
            Thread.sleep(1000);
            resizable.increaseMiddleElementDefault();
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e) {
            ReportService.ReportAction(e.getMessage(), false);
        } finally {
            CucumberArpReport.nextStep();
        }
    }

    @And("^I resize the window in 'Animate' section$")
    public void iResizeTheWindowInAnimateSection() throws Throwable {
        if (checkIfFurtherStepsAreNeeded()) {
            return;
        }
        try {
            resizable.increaseElementAnimate();
            Thread.sleep(1000);
            resizable.decreaseElementAnimate();
            Thread.sleep(1000);
            resizable.increaseMiddleElementAnimate();
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e) {
            ReportService.ReportAction(e.getMessage(), false);
        } finally {
            CucumberArpReport.nextStep();
        }
    }

    @And("^I resize the window in 'Constrain resize area' section$")
    public void iResizeTheWindowInConstrainResizeAreaSection() throws Throwable {
        if (checkIfFurtherStepsAreNeeded()) {
            return;
        }
        try {
            resizable.increaseElementConstrain();
            Thread.sleep(1000);
            resizable.decreaseElementConstrain();
            Thread.sleep(1000);
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e) {
            ReportService.ReportAction(e.getMessage(), false);
        } finally {
            CucumberArpReport.nextStep();
        }
    }

    @And("^I resize the window in 'Helper' section$")
    public void iResizeTheWindowInHelperSection() throws Throwable {
        if (checkIfFurtherStepsAreNeeded()) {
            return;
        }
        try {
            resizable.increaseElementHelper();
            Thread.sleep(1000);
            resizable.decreaseElementHelper();
            Thread.sleep(1000);
            resizable.increaseMiddleElementHelper();
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e) {
            ReportService.ReportAction(e.getMessage(), false);
        } finally {
            CucumberArpReport.nextStep();
        }
    }

    @And("^I resize the window in 'Max/Min size' section$")
    public void iResizeTheWindowInMaxMinSizeSection() throws Throwable {
        if (checkIfFurtherStepsAreNeeded()) {
            return;
        }
        try {
            resizable.increaseElementMaxMinSize();
            Thread.sleep(1000);
            resizable.decreaseElementMaxMinSize();
            Thread.sleep(1000);
            resizable.increaseElementMaxMinSize();
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e) {
            ReportService.ReportAction(e.getMessage(), false);
        } finally {
            CucumberArpReport.nextStep();
        }
    }
}
