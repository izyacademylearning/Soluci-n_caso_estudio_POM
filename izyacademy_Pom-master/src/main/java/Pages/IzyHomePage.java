package Pages;

import org.openqa.selenium.By;

public class IzyHomePage {



    By BTNMENU = By.xpath("//div[@id='toogle_menu']");
    By BTNPOST = By.xpath("//a[@href='http://izyacademy.com:8000/post']");
    public By getBTNMENU() {
        return BTNMENU;
    }

    public void setBTNMENU(By BTNMENU) {
        this.BTNMENU = BTNMENU;
    }

    public By getBTNPOST() {
        return BTNPOST;
    }

    public void setBTNPOST(By BTNPOST) {
        this.BTNPOST = BTNPOST;
    }

}
