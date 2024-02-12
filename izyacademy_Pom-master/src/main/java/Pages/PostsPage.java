package Pages;

import org.openqa.selenium.By;

public class PostsPage {



    By BTNCOLLAPSE = By.xpath("//button[@class='accordion-button collapsed']");

    By BTNNEWCATEORY = By.xpath("//a[@href='http://izyacademy.com:8000/createcategory']");

    public By getBTNCOLLAPSE() {
        return BTNCOLLAPSE;
    }

    public void setBTNCOLLAPSE(By BTNCOLLAPSE) {
        this.BTNCOLLAPSE = BTNCOLLAPSE;
    }

    public By getBTNNEWCATEORY() {
        return BTNNEWCATEORY;
    }

    public void setBTNNEWCATEORY(By BTNnEWCATEORY) {
        this.BTNNEWCATEORY = BTNnEWCATEORY;
    }


}
