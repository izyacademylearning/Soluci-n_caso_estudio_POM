package Pages;

import org.openqa.selenium.By;

public class HomePage {

    By BTNSIGNIN = By.xpath("//a[@href='#/login']");
    By LBLNAME = By.xpath("//div[@class='nav-link dropdown-toggle cursor-pointer']");

    public By getLBLNAME() {
        return LBLNAME;
    }

    public void setLBLNAME(By LBLNAME) {
        this.LBLNAME = LBLNAME;
    }

    public By getBTNSIGNIN() {
        return BTNSIGNIN;
    }

    public void setBTNSIGNIN(By BTNSIGNIN) {
        this.BTNSIGNIN = BTNSIGNIN;
    }
}
