package steps;

import Driver.GoogleChromeDriver;
import Pages.HomePage;
import Pages.LoginPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import utils.DataDrivenExcel;
import utils.Excel;

import java.util.HashMap;
import java.util.Map;

public class loginStep {

    HomePage HomePage = new HomePage();
    LoginPage LoginPage = new LoginPage();

    DataDrivenExcel dataDrivenExcel = new DataDrivenExcel();

    Map<String, String> data = new HashMap<>();


    @Step
    public void ClickSignIn(){
        GoogleChromeDriver.driver.findElement(HomePage.getBTNSIGNIN()).click();
    }
    @Step
    public void EnterEmail(int row){

        Excel excel = new Excel(Excel.rutaExcelDev,"Login",true,row);
        data = dataDrivenExcel.leerExcel(excel);
        GoogleChromeDriver.driver.findElement(LoginPage.getTXTEMAIL()).sendKeys(data.get("email"));

    }

    @Step
    public void EnterPassword(int row) {

        Excel excel = new Excel(Excel.rutaExcelDev, "Login", true, row);
        data = dataDrivenExcel.leerExcel(excel);
        GoogleChromeDriver.driver.findElement(LoginPage.getTXTPASSWORD()).sendKeys(data.get("password"));
    }

    @Step
    public void ClickLogin(){

            GoogleChromeDriver.driver.findElement(LoginPage.getBTNLOGIN()).click();
    }
    @Step
    public void CompareName(String user){


        String textObtained = GoogleChromeDriver.driver.findElement(HomePage.getLBLNAME()).getText();
        Assert.assertEquals(textObtained, user);
    }
}
