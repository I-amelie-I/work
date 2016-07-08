package stepdefenition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.springframework.beans.factory.annotation.Autowired;
import pages.base.PageInstance;
import pages.categories.Droppable;
import pages.categories.FramesAndWindows;

/**
 * Created by pchelintsev on 5/19/2016.
 */
public class FramesAndWindowsStepDefinitions extends PageInstance{

    @Autowired
    private
    FramesAndWindows framesAndWindows;


    @And("^I open new tab$")
    public void iOpenNewTab() throws Throwable {
       framesAndWindows.newBrowserTab.click();
        framesAndWindows.switchToNewWindow();
    }

    @And("^I open new window$")
    public void iOpenNewWindow() throws Throwable {
        framesAndWindows.openNewSeprateWindow.click();
        framesAndWindows.switchToNewWindow();
    }

    @And("^I open new frame$")
    public void iOpenNewFrame() throws Throwable {
        framesAndWindows.openFramesetWindow.click();
        framesAndWindows.switchToNewWindow();
    }
}
