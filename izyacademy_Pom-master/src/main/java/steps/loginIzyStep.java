package steps;

import Driver.GoogleChromeDriver;
import Pages.LoginIzyPage;
import net.thucydides.core.annotations.Step;
import utils.DataDrivenExcel;
import utils.Excel;

import java.util.HashMap;
import java.util.Map;

public class loginIzyStep {


    LoginIzyPage loginIzyPage = new LoginIzyPage();

    DataDrivenExcel dataDrivenExcel = new DataDrivenExcel();

    Map<String, String> data = new HashMap<>();


       @Step
    public void EnterEmail(int row){

        Excel excel = new Excel(Excel.rutaExcelDev,"Login",true,row);
        data = dataDrivenExcel.leerExcel(excel);
        GoogleChromeDriver.driver.findElement(loginIzyPage.getINPUTEMAIL()).sendKeys(data.get("email"));

    }

    @Step
    public void EnterPassword(int row) {

        Excel excel = new Excel(Excel.rutaExcelDev, "Login", true, row);
        data = dataDrivenExcel.leerExcel(excel);
        GoogleChromeDriver.driver.findElement(loginIzyPage.getTINPUTPASSWORD()).sendKeys(data.get("password"));
    }

    @Step
    public void ClickLogin(){

            GoogleChromeDriver.driver.findElement(loginIzyPage.getBTNLOGIN()).click();
    }
 //   @Step
    //public void CompareName(String user){


    //    String textObtained = GoogleChromeDriver.driver.findElement(HomePage.getLBLNAME()).getText();
     //   Assert.assertEquals(textObtained, user);
 //   }
}
