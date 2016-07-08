package stepdefenition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import myproject.CucumberArpReport;
import myproject.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import pages.base.PageInstance;
import pages.categories.Slider;
import pages.categories.Sortable;

/**
 * Created by pchelintsev on 5/19/2016.
 */
public class SliderStepDefinitions extends PageInstance {

    @Autowired
    private
    Slider slider;


    @And("^Drag slider$")
    public void dragSlider() throws Throwable {
        if (checkIfFurtherStepsAreNeeded()) {
            return;
        }
        try {
            slider.moveSlider();
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e) {
            ReportService.ReportAction(e.getMessage(), false);
        } finally {
            CucumberArpReport.nextStep();
        }
    }
}
