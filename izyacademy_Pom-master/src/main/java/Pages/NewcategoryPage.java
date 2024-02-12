package Pages;

import org.openqa.selenium.By;

public class NewcategoryPage {




    By LBLNAMECATEGORY = By.xpath("//input[@name='CategorieName']");
    By LBLDESCRIPTION = By.xpath("//input[@name='descriptionCategory']");
    By BTNCREARCATEGORIA = By.xpath("//button[@type='submit']");

    public By getLBLNAMECATEGORY() {
        return LBLNAMECATEGORY;
    }

    public void setLBLNAMECATEGORY(By LBLNAMECATEGORY) {
        this.LBLNAMECATEGORY = LBLNAMECATEGORY;
    }

    public By getLBLDESCRIPTION() {
        return LBLDESCRIPTION;
    }

    public void setLBLDESCRIPTION(By LBLDESCRIPTION) {
        this.LBLDESCRIPTION = LBLDESCRIPTION;
    }

    public By getBTNCREARCATEGORIA() {
        return BTNCREARCATEGORIA;
    }

    public void setBTNCREARCATEGORIA(By BTNCREARCATEGORIA) {
        this.BTNCREARCATEGORIA = BTNCREARCATEGORIA;
    }
}
