package stepdefenition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import myproject.CucumberArpReport;
import myproject.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import pages.base.PageInstance;
import pages.categories.Sortable;
import pages.categories.Tabs;

/**
 * Created by pchelintsev on 5/19/2016.
 */
public class TabsStepDefinitions extends PageInstance {
    @Autowired
    private
    Tabs tabs;

    @And("^Select tabs$")
    public void selectTabs() throws Throwable {
        if (checkIfFurtherStepsAreNeeded()) {
            return;
        }
        try {
            tabs.selectTabs();
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e) {
            ReportService.ReportAction(e.getMessage(), false);
        } finally {
            CucumberArpReport.nextStep();
        }
    }

}
