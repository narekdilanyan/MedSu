package Pages.SeniorAminPages;

import TestData.TestDataInformation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SeniorAdminMapPage extends TestDataInformation {


    //Links
    private By firstSectionLink = By.xpath("//span[contains(text(),'1. Scope of Work')]");

    //Fields
    private By titleField = By.xpath("//div[@class='repeat-container']//div[1]//div[2]//div[2]//div[1]//textarea[1]");
    private By categoryOfWorkField = By.xpath("//*[@id=\"section-1\"]/div/div/div/div[2]/div[3]/div[1]/div[2]/div[1]");
    private By categoryOfWorkItem = By.xpath("//div[contains(text(),'Managerial')]");
    private By frequencyField = By.xpath("//*[@id=\"section-1\"]/div/div/div/div[2]/div[3]/div[2]/div[2]/div[1]");
    private By frequencyFieldItem = By.xpath("//div[contains(text(),'Ad Hoc')]");
    private By detailOfWorkField = By.xpath("//div[@class='repeat-container']//div[1]//div[2]//div[4]//div[1]//div[1]//textarea[1]");
    private By lengthOfTimeInRoleField = By.xpath("//div[@class='repeat-container']//div[1]//div[2]//div[5]//div[1]//div[1]//textarea[1]");
    private By practiceSettingField = By.xpath("//div[@class='repeat-container']//div[1]//div[2]//div[6]//div[1]//div[2]//textarea[1]");
    private By qualificationField = By.xpath("//div[@class='repeat-container']//div[1]//div[2]//div[7]//div[1]//div[2]//textarea[1]");


    //Buttons
    private By sectionMenuButton = By.xpath("//div[@class='selected-menu flex']");
    private By addNewItemButton = By.xpath("//div[@class='add-item-button ng-scope']");
    private By removeItemButton = By.xpath("//div[@class='delete_item']");
    private By deleteConfirmButton = By.xpath("//button[@class='ng-btn ng-btn-green success']");

    // Items
    private By item1 = By.xpath("//a[contains(text(),'1.bmp')]");
    private By item2 = By.xpath("//a[contains(text(),'2.doc')]");
    private By item3 = By.xpath("//a[contains(text(),'3.docx')]");
    private By item4 = By.xpath("//a[contains(text(),'4.gif')]");
    private By item5 = By.xpath("//a[contains(text(),'5.heic')]");
    private By item6 = By.xpath("//a[contains(text(),'6.jpg')]");
    private By item7 = By.xpath("//a[contains(text(),'7.key')]");
    private By item8 = By.xpath("//a[contains(text(),'8.mov')]");
    private By item9 = By.xpath("//a[contains(text(),'9.mp3')]");
    private By item10 = By.xpath("//a[contains(text(),'10.mp4')]");
    private By item11 = By.xpath("//a[contains(text(),'11.numbers')]");
    private By item12 = By.xpath("//a[contains(text(),'12.pages')]");
    private By item13 = By.xpath("//a[contains(text(),'13.pdf')]");
    private By item14 = By.xpath("//a[contains(text(),'14.png')]");
    private By item15 = By.xpath("//a[contains(text(),'15.ppt')]");
    private By item16 = By.xpath("//a[contains(text(),'16.pptx')]");
    private By item17 = By.xpath("//a[contains(text(),'17.txt')]");
    private By item18 = By.xpath("//a[contains(text(),'18.xls')]");
    private By item19 = By.xpath("//a[contains(text(),'19.xlsx')]");

    // Void Methods
    public void clickOnTheFirstSectionLink() {
        driver.findElement(firstSectionLink).click();
    }

    public void clickOnSectionMenuButton() {
        driver.findElement(sectionMenuButton).click();
    }

    public void clickOnTheAddNewItemButton() {
        driver.findElement(addNewItemButton).click();
    }

    public void clickOnTheRemoveItemButton() {
        driver.findElement(removeItemButton).click();
    }

    public void clickOnTheConfirmDeleteButton() {
        driver.findElement(deleteConfirmButton).click();
    }


    public void typeInTitleField(String text) {
        driver.findElement(titleField).clear();
        driver.findElement(titleField).sendKeys(text);
    }

    public String getTitleText() {
        String q = driver.findElement(titleField).getText();
        return q;
    }

    public String getDetailOfWorkText() {
        String r = driver.findElement(detailOfWorkField).getText();
        return r;
    }

    public String getLengthOfTimeText() {
        String y = driver.findElement(lengthOfTimeInRoleField).getText();
        return y;
    }

    public String getPracticeSettingText() {
        String u = driver.findElement(practiceSettingField).getText();
        return u;
    }

    public String getQualificationText() {
        String i = driver.findElement(qualificationField).getText();
        return i;
    }
///////
    public String getCategoryOfWorkText() {
        String o = driver.findElement(categoryOfWorkField).getText();
        return o;
    }

    public String getFrequencyText() {
        String p = driver.findElement(frequencyField).getText();
        return p;
    }

    public String getItem1Text() {
        String l = driver.findElement(item1).getText();
        return l;
    }

    public String getItem2Text() {
        String k = driver.findElement(item2).getText();
        return k;
    }

    public String getItem3Text() {
        String jk = driver.findElement(item3).getText();
        return jk;
    }

    public String getItem4Text() {
        String mm = driver.findElement(item4).getText();
        return mm;
    }

    public String getItem5Text() {
        String bb = driver.findElement(item5).getText();
        return bb;
    }

    public String getItem6Text() {
        String ff = driver.findElement(item6).getText();
        return ff;
    }

    public String getItem7Text() {
        String cc = driver.findElement(item7).getText();
        return cc;
    }

    public String getItem8Text() {
        String xx = driver.findElement(item8).getText();
        return xx;
    }

    public String getItem9Text() {
        String zz = driver.findElement(item9).getText();
        return zz;
    }

    public String getItem10Text() {
        String aa = driver.findElement(item10).getText();
        return aa;
    }

    public String getItem11Text() {
        String qq = driver.findElement(item11).getText();
        return qq;
    }

    public String getItem12Text() {
        String ww = driver.findElement(item12).getText();
        return ww;
    }

    public String getItem13Text() {
        String ee = driver.findElement(item13).getText();
        return ee;
    }

    public String getItem14Text() {
        String rr = driver.findElement(item14).getText();
        return rr;
    }

    public String getItem15Text() {
        String tt = driver.findElement(item15).getText();
        return tt;
    }

    public String getItem16Text() {
        String yy = driver.findElement(item16).getText();
        return yy;
    }

    public String getItem17Text() {
        String uu = driver.findElement(item17).getText();
        return uu;
    }

    public String getItem18Text() {
        String ii = driver.findElement(item18).getText();
        return ii;
    }

    public String getItem19Text() {
        String oo = driver.findElement(item19).getText();
        return oo;
    }




    public void selectItemInCategoryOfWorkField() throws InterruptedException {
        driver.findElement(categoryOfWorkField).click();
        getWaitTime();
        getWaitTime();
        driver.findElement(categoryOfWorkItem).click();
    }

    public void selectItemInFrequencyField() throws InterruptedException {
        driver.findElement(frequencyField).click();
        getWaitTime();
        getWaitTime();
        driver.findElement(frequencyFieldItem).click();
    }

    public void typeInDetailOfWorkField(String text) {
        driver.findElement(detailOfWorkField).clear();
        driver.findElement(detailOfWorkField).sendKeys(text);
    }

    public void typeInLengthOfTimeInRoleField(String text) {
        driver.findElement(lengthOfTimeInRoleField).clear();
        driver.findElement(lengthOfTimeInRoleField).sendKeys(text);
    }

    public void typeInPracticeSettingField(String text) {
        driver.findElement(practiceSettingField).clear();
        driver.findElement(practiceSettingField).sendKeys(text);
    }

    public void typeInQualificationField(String text) {
        driver.findElement(qualificationField).clear();
        driver.findElement(qualificationField).sendKeys(text);
    }

    public SeniorAdminMapPage OpenSection1() throws InterruptedException {
        this.clickOnSectionMenuButton();
        getWaitTime();
        this.clickOnTheFirstSectionLink();
        return this;
    }

    public SeniorAdminMapPage deleteItem() throws InterruptedException {
        this.clickOnTheRemoveItemButton();
        getWaitTime();
        this.clickOnTheConfirmDeleteButton();
        getWaitTime();
        return this;
    }

    public SeniorAdminMapPage CrudForSection() throws InterruptedException {
        this.clickOnTheAddNewItemButton();
        getWaitTime();
        this.clickOnTheFirstSectionLink();
        getWaitTime();
        this.typeInTitleField("Test1");
        getWaitTime();
        this.typeInDetailOfWorkField("Test2");
        getWaitTime();
        this.typeInLengthOfTimeInRoleField("Test3");
        getWaitTime();
        this.typeInPracticeSettingField("Test4");
        getWaitTime();
        this.typeInQualificationField("Test5");
        getWaitTime();
        return this;

    }
    public SeniorAdminMapPage selectMethod() throws InterruptedException {
        this.selectItemInCategoryOfWorkField();
        getWaitTime();
        this.selectItemInFrequencyField();
        return this;
    }


    public void uploadFile() throws InterruptedException {
        driver.findElement(By.cssSelector("#section-1 > div > div > div:nth-child(1) > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/1.bmp");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-1 > div > div > div:nth-child(1) > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/2.doc");
        getWaitTime2();
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-1 > div > div > div:nth-child(1) > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/3.docx");
        getWaitTime2();


        driver.findElement(By.cssSelector("#section-1 > div > div > div:nth-child(1) > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/4.gif");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-1 > div > div > div:nth-child(1) > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/5.heic");
        getWaitTime2();
        getWaitTime2();
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-1 > div > div > div:nth-child(1) > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/6.jpg");
        getWaitTime2();
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-1 > div > div > div:nth-child(1) > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/7.key");
        getWaitTime2();
        getWaitTime();
        driver.findElement(By.cssSelector("#section-1 > div > div > div:nth-child(1) > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/8.mov");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-1 > div > div > div:nth-child(1) > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/9.mp3");
        getWaitTime();
        driver.findElement(By.cssSelector("#section-1 > div > div > div:nth-child(1) > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/10.mp4");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-1 > div > div > div:nth-child(1) > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/11.numbers");
        getWaitTime2();
        getWaitTime();
        driver.findElement(By.cssSelector("#section-1 > div > div > div:nth-child(1) > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/12.pages");
        getWaitTime2();
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-1 > div > div > div:nth-child(1) > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/13.pdf");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-1 > div > div > div:nth-child(1) > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/14.png");
        getWaitTime2();
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-1 > div > div > div:nth-child(1) > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/15.ppt");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-1 > div > div > div:nth-child(1) > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/16.pptx");
        getWaitTime2();
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-1 > div > div > div:nth-child(1) > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/17.txt");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-1 > div > div > div:nth-child(1) > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/18.xls");
        getWaitTime2();
        getWaitTime();
        driver.findElement(By.cssSelector("#section-1 > div > div > div:nth-child(1) > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/19.xlsx");
        getWaitTime2();
        getWaitTime2();
    }

}

