package stepdefenition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import myproject.CucumberArpReport;
import myproject.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import pages.base.PageInstance;
import pages.categories.Tabs;
import pages.categories.Tooltip;

/**
 * Created by pchelintsev on 5/19/2016.
 */
public class TooltipStepDefinitions extends PageInstance {
    @Autowired
    private
    Tooltip tooltip;

    @And("^I navigate to 'Your age' textinput$")
    public void iNavigateToYourAgeTextinput() throws Throwable {
        if (checkIfFurtherStepsAreNeeded()) {
            return;
        }
        try {
            tooltip.navigateToAgeTextInput();
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e) {
            ReportService.ReportAction(e.getMessage(), false);
        } finally {
            CucumberArpReport.nextStep();
        }
    }

    @And("^I show all custom animation$")
    public void iShowAllCustomAnimation() throws Throwable {
        if (checkIfFurtherStepsAreNeeded()) {
            return;
        }
        try {

            tooltip.navigateToShow();
            tooltip.navigateToHide();
            tooltip.navigateToOpenEvent();
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e) {
            ReportService.ReportAction(e.getMessage(), false);
        } finally {
            CucumberArpReport.nextStep();
        }
    }
}
