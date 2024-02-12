package steps;

import Driver.GoogleChromeDriver;
import Pages.IzyHomePage;
import net.thucydides.core.annotations.Step;
import utils.DataDrivenExcel;
import utils.Excel;

import java.util.HashMap;
import java.util.Map;

public class goPostStep {


    IzyHomePage IzyHomePage = new IzyHomePage();




       @Step
    public void ClickMenu(){

           GoogleChromeDriver.driver.findElement(IzyHomePage.getBTNMENU()).click();

    }

    @Step
    public void ClickPosts() {
        GoogleChromeDriver.driver.findElement(IzyHomePage.getBTNPOST()).click();

    }



}
