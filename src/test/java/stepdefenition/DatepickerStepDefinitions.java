package stepdefenition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import myproject.CucumberArpReport;
import myproject.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import pages.base.PageInstance;
import pages.categories.DatePicker;
import pages.categories.Draggable;

/**
 * Created by pchelintsev on 5/19/2016.
 */
public class DatepickerStepDefinitions extends PageInstance {

    @Autowired
    private
    DatePicker datepicker;


    @And("^I set date on 'Default functionality' page$")
    public void iSetDateOnDefaultFunctionalityPage() throws Throwable {
        if (checkIfFurtherStepsAreNeeded()) {
            return;
        }
        try {
            datepicker.setDateForDefaultFunctionality();
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e) {
            ReportService.ReportAction(e.getMessage(), false);
        } finally {
            CucumberArpReport.nextStep();
        }
    }

    @And("^I show all animations for datepicker$")
    public void iShowAllAnimationsForDatepicker() throws Throwable {
        if (checkIfFurtherStepsAreNeeded()) {
            return;
        }
        try {
            datepicker.showAnimations();
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e) {
            ReportService.ReportAction(e.getMessage(), false);
        } finally {
            CucumberArpReport.nextStep();
        }
    }

    @And("^I set date on 'Display moth & year' button$")
    public void iSetDateOnDisplayMothYearButton() throws Throwable {
        if (checkIfFurtherStepsAreNeeded()) {
            return;
        }
        try {
            datepicker.setDateForDisplayMonthYear();
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e) {
            ReportService.ReportAction(e.getMessage(), false);
        } finally {
            CucumberArpReport.nextStep();
        }
    }

    @And("^I show all format options$")
    public void iShowAllFormatOptions() throws Throwable {
        if (checkIfFurtherStepsAreNeeded()) {
            return;
        }
        try {
            datepicker.showFormats();
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e) {
            ReportService.ReportAction(e.getMessage(), false);
        } finally {
            CucumberArpReport.nextStep();
        }
    }
}
