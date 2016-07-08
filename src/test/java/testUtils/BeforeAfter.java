package testUtils;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import helpers.SystemHelper;
import myproject.CucumberArpReport;
import myproject.ReportService;
import pages.base.PageInstance;

import static com.unitedsofthouse.ucucumberpackage.typesfactory.factory.TypeFactory.setArpReportClient;
import static helpers.SystemHelper.MAINWINDOWHANDLER;
import static helpers.SystemHelper.PROJECTKEY;
import static helpers.SystemHelper.Reset_Values;

//import pages.LoginPage;

/**
 * Created by logovskoy on 12/3/2015.
 */
public class BeforeAfter extends PageInstance {

    public static Scenario lastScenario;


    //@Autowired
    //@Lazy
    //public HomePage homePage;

    //@Autowired
    //PopUp popup;


    @Before
    public void setUp(Scenario scenario) {
        Reset_Values();
        try {
            MAINWINDOWHANDLER = driver.getWindowHandle();
            setArpReportClient(new CucumberArpReport());
            if (!scenario.getId().startsWith(arpClient.getTestSuiteName().toLowerCase())) {
                ReportService.closeAndSendToAnotherURL("http://10.10.80.162:90/Services/Deployment.asmx?WSDL");
                CucumberArpReport.open(PROJECTKEY, scenario.getId());
            }
            arpClient.addTestToTestSuite(scenario);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @After
    public void tearDown(Scenario scenario) throws Exception {
        try {
            arpClient.decideTestStatus();
            arpClient.FinishTest();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.navigate().to(SystemHelper.URL);
        }
    }
}