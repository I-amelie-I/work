package pages.base;


import myproject.CucumberArpReport;
import myproject.ReportClasses.Step;
import org.openqa.selenium.WebDriver;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by logovskoy on 12/3/2015.
 */

@ContextConfiguration("classpath:cucumber-context.xml")
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public abstract class PageInstance{
    public static WebDriver driver;
    public static CucumberArpReport arpClient;
    public static PageInstance currentPageObject;

    public static boolean checkIfFurtherStepsAreNeeded() {
        try {
            List<Step> passedSteps = arpClient.getReport().CurrentTestCase.Steps.stream().filter(p -> p.Actions != null && p.Actions.size() > 0).collect(Collectors.toList());
            if (passedSteps.stream().anyMatch(p -> !p.Status.equals("pass"))) {
                try {
                    arpClient.ReportAction("Step is blocked by further step fails", false);
                    arpClient.nextStep();
                    return true;
                } catch (Throwable e) {
                }
            }
            return false;
        } catch (Throwable ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
