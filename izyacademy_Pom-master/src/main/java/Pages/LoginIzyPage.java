package Pages;

import org.openqa.selenium.By;

public class LoginIzyPage {

    By INPUTEMAIL = By.xpath("//input[@id='exampleInputEmail1']");
    By INPUTPASSWORD = By.xpath("//input[@id='exampleInputPassword1']");
    By BTNLOGIN = By.xpath("//button[@id='effect-button']");

    public By getINPUTEMAIL() {
        return INPUTEMAIL;
    }

    public void setINPUTEMAIL(By TXTEMAIL) {
        this.INPUTEMAIL = TXTEMAIL;
    }

    public By getTINPUTPASSWORD() {
        return INPUTPASSWORD;
    }

    public void setINPUTPASSWORD(By TXTPASSWORD) {
        this.INPUTPASSWORD = TXTPASSWORD;
    }

    public By getBTNLOGIN() {
        return BTNLOGIN;
    }

    public void setBTNLOGIN(By BTNLOGIN) {
        this.BTNLOGIN = BTNLOGIN;
    }
}
