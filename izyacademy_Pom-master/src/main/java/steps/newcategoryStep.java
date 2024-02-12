package steps;

import Driver.GoogleChromeDriver;
import Pages.PostsPage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static Driver.GoogleChromeDriver.driver;

public class newcategoryStep {


    PostsPage PostsPage = new PostsPage();




       @Step
    public void ClickCollapse(){

           WebElement element =  driver.findElement(PostsPage.getBTNCOLLAPSE());

           ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

    @Step
    public void Clickcategory() {
        driver.findElement(PostsPage.getBTNNEWCATEORY()).click();

    }



}
