package stepdefenition;

import cucumber.api.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.springframework.beans.factory.annotation.Autowired;
import pages.base.PageInstance;
import pages.categories.Accordion;
import pages.categories.Draggable;
import com.unitedsofthouse.ucucumberpackage.typesfactory.types.*;

/**
 * Created by kozlov on 5/18/2016.
 */
public class AccordionStepDefinition extends PageInstance {

    @Autowired
    private
    Accordion accordion;

    @When("^I select \"([^\"]*)\" tab$")
    public void iSelectTab(String tabName) throws Throwable {
        Thread.sleep(1000);
        for (WebElement area : accordion.availableAreas) {
            if(area.getText().equals(tabName)){
                area.click();
                break;
            }
        }
    }

    @And("^I select \"([^\"]*)\" section$")
    public void iSelectSection(String sectionName) throws Throwable {
        Thread.sleep(1000);
        for (WebElement section : accordion.availableHeaders) {
            if(section.getText().equals(sectionName)){
                section.click();
                break;
            }
        }
    }

    /*@Then("^I check that current section is \"([^\"]*)\"$")
    public void iCheckSection(String sectionName) throws Throwable {
        Thread.sleep(1000);
        Assert.assertEquals(sectionName, accordion.currentHeader.getText());
    }

    @And("^I check that current section text is \"([^\"]*)\"$")
    public void iCheckSectionText(String sectionContent) throws Throwable {
        Thread.sleep(1000);
        Assert.assertEquals(sectionContent.replace("\\n","\n"), accordion.currentContent.getText());
    }

    @And("^I check that icons are visible")
    public void iCheckSectionIconsVisible() throws Throwable {
        Thread.sleep(1000);
        Assert.assertTrue("Icon elements not found.", accordion.icons!=null && accordion.icons.size()>0);
        for (WebElement e: accordion.icons) {
            Assert.assertTrue("Icon is not visible.", e.isDisplayed());
        }
    }

    @And("^I check that icons are not visible")
    public void iCheckSectionIconsNotVisible() throws Throwable {
        Thread.sleep(1000);
        Assert.assertTrue("Icon elements exist.", accordion.icons!=null && accordion.icons.size()==0);
    }*/

    @And("^I click on 'Toggle icons' button")
    public void iToggleButtons() throws Throwable {
        Thread.sleep(1000);
        accordion.toggleIcons.click();
    }
}
