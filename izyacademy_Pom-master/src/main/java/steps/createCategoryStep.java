package steps;

import Driver.GoogleChromeDriver;

import net.thucydides.core.annotations.Step;

import utils.Excel;
import Pages.NewcategoryPage;


public class createCategoryStep {


    NewcategoryPage NewcategoryPage = new NewcategoryPage();




       @Step
    public void EnterCategoryName(){


        GoogleChromeDriver.driver.findElement(NewcategoryPage.getLBLNAMECATEGORY()).sendKeys("Test01");

    }

    @Step
    public void EnterDescription() {


        GoogleChromeDriver.driver.findElement(NewcategoryPage.getLBLDESCRIPTION()).sendKeys("asdfghqewrtvys");
    }

    @Step
    public void ClickBotoncrearcategoria(){

            GoogleChromeDriver.driver.findElement(NewcategoryPage.getBTNCREARCATEGORIA()).click();
    }

}
