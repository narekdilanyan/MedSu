package Pages.SeniorAminPages;

import TestData.TestDataInformation;
import org.openqa.selenium.By;

import java.time.Instant;

public class SeniorAdminMapPage extends TestDataInformation {


    //Links
    private By firstSectionLink = By.xpath("//span[contains(text(),'1. Scope of Work')]");

    // Section 2 links
    private By secondSectionLink = By.xpath("//span[contains(text(),'2. Current PDP')]");

    // Section 3 Links
    private By thirdSectionLink = By.xpath("//span[contains(text(),'3. Record of CPD')]");


    // Section 1 Fields
    private By titleField = By.xpath("//div[@class='repeat-container']//div[1]//div[2]//div[2]//div[1]//textarea[1]");
    private By categoryOfWorkField = By.xpath("//*[@id=\"section-1\"]/div/div/div/div[2]/div[3]/div[1]/div[2]/div[1]");
    private By categoryOfWorkItem = By.xpath("//div[contains(text(),'Managerial')]");
    private By frequencyField = By.xpath("//*[@id=\"section-1\"]/div/div/div/div[2]/div[3]/div[2]/div[2]/div[1]");
    private By frequencyFieldItem = By.xpath("//div[contains(text(),'Ad Hoc')]");
    private By detailOfWorkField = By.xpath("//div[@class='repeat-container']//div[1]//div[2]//div[4]//div[1]//div[1]//textarea[1]");
    private By lengthOfTimeInRoleField = By.xpath("//div[@class='repeat-container']//div[1]//div[2]//div[5]//div[1]//div[1]//textarea[1]");
    private By practiceSettingField = By.xpath("//div[@class='repeat-container']//div[1]//div[2]//div[6]//div[1]//div[2]//textarea[1]");
    private By qualificationField = By.xpath("//div[@class='repeat-container']//div[1]//div[2]//div[7]//div[1]//div[2]//textarea[1]");

    // Section 2 Fields
    private By titleField2 = By.xpath("//div[@class='repeat-container']//div[1]//div[2]//div[2]//div[1]//textarea[1]");
    private By scopeOfWorkField = By.xpath("//div[@class='select-selected']");
    private By scopeOfWorkItem = By.xpath("//div[@class='select-item']");
    private By developmentGoalField = By.xpath("//div[@class='full-width custom-form-control']//textarea[@class='form-control ng-pristine ng-untouched ng-valid ng-empty']");
    private By actionPlanField = By.xpath("//div[5]//div[2]//textarea[1]");
    private By outcomeMeasureField = By.xpath("//div[6]//div[2]//textarea[1]");
    private By estimatedTimeCommitmentField = By.xpath("//p[@class='input-group']//input[@class='form-control ng-pristine ng-untouched ng-valid ng-empty']");
    private By targetDataField = By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-valid ng-isolate-scope ng-empty ng-valid-datetime']");
    private By selectData = By.xpath("//button[@class='btn btn-default btn-sm']//span[@class='ng-binding'][contains(text(),'10')]");
    private By pleaseElaborateOnThisField = By.xpath("//div[10]//div[1]//div[2]//textarea[1]");
    private By reflectiveEvaluationField = By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid ng-empty']");

    // Section 3 fields
    private By cpdActivityTitleField = By.xpath("//textarea[@name='sec3_activity_title']");
    private By cpdHourField = By.xpath("//*[@id=\"section-3\"]/div/div/div/div[2]/div[2]/div[2]/div[2]/input");
    private By cpdTypeField = By.xpath("//div[@id='check-cpd-type']//div[@class='select-selected'][contains(text(),'- None -')]");
    private By cpdTypeItem = By.xpath("//div[contains(text(),'Academic')]");
    private By cpdActivityDateField = By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-valid ng-isolate-scope ng-empty ng-valid-datetime']");
    private By selectCpdActivityDate = By.xpath("//td[@id='datepicker-95-8874-16']//button[@class='btn btn-default btn-sm']");
    private By cpdProgressField = By.xpath("//div[@class='select-selected select-arrow-active']");
    private By selectCpdProgressItem = By.xpath("//div[contains(text(),'In Progress')]");
    private By scopeOfWorkField3 = By.xpath("//div[@class='custom-form-control custom-select scope-of-work-select ng-isolate-scope']//div[@class='select-selected select-arrow-active']");
    private By selectScopeOfWorkField3 = By.xpath("//div[@class='select-selected select-arrow-active'][contains(text(),'Cross Role')]");
    private By descriptionField = By.xpath("//textarea[@class='form-control ng-valid ng-empty ng-valid-parse ng-touched ng-pristine']");
    private By reflectiveEvaluation = By.xpath("//div[@class='form-field col-sm-12']//textarea[@class='form-control ng-pristine ng-untouched ng-valid ng-empty']");
    private By gmpDomainsCheckBox = By.xpath("//div[@class='row col-md-12 col-xs-12']//div[1]//div[2]//label[1]");


    //Buttons
    private By sectionMenuButton = By.xpath("//div[@class='selected-menu flex']");
    private By addNewItemButton = By.xpath("//div[@class='add-item-button ng-scope']");
    private By removeItemButton = By.xpath("//div[@class='delete_item']");
    private By deleteConfirmButton = By.xpath("//button[@class='ng-btn ng-btn-green success']");

    // Section 3 Buttons
    private By radioButtonYes = By.xpath("//div[@class='row mb-20']//div[1]//div[1]//label[1]");
    private By checkBoxOne = By.xpath("//div[@class='row col-md-12 col-xs-12']//div[1]//div[2]//label[1]");


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
    private Instant wait;

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

    public SeniorAdminMapPage CrudForSection1() throws InterruptedException {
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


    public void uploadFiles() throws InterruptedException {
        driver.findElement(By.cssSelector("#section-1 > div > div > div:nth-child(1) > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/1.bmp");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-1 > div > div > div:nth-child(1) > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/2.doc");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-1 > div > div > div:nth-child(1) > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/3.docx");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-1 > div > div > div:nth-child(1) > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/4.gif");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-1 > div > div > div:nth-child(1) > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/5.heic");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-1 > div > div > div:nth-child(1) > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/6.jpg");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-1 > div > div > div:nth-child(1) > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/7.key");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-1 > div > div > div:nth-child(1) > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/8.mov");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-1 > div > div > div:nth-child(1) > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/9.mp3");
        getWaitTime();
        driver.findElement(By.cssSelector("#section-1 > div > div > div:nth-child(1) > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/10.mp4");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-1 > div > div > div:nth-child(1) > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/11.numbers");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-1 > div > div > div:nth-child(1) > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/12.pages");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-1 > div > div > div:nth-child(1) > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/13.pdf");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-1 > div > div > div:nth-child(1) > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/14.png");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-1 > div > div > div:nth-child(1) > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/15.ppt");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-1 > div > div > div:nth-child(1) > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/16.pptx");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-1 > div > div > div:nth-child(1) > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/17.txt");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-1 > div > div > div:nth-child(1) > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/18.xls");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-1 > div > div > div:nth-child(1) > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/19.xlsx");
        getWaitTime2();
    }

    ////// Section 2  //////////////////////////////////////////////////////////////////////////////////////////////

    public void clickOnSecondSectionLink() {
        driver.findElement(secondSectionLink).click();
    }

    public SeniorAdminMapPage OpenSection2() throws InterruptedException {
        this.clickOnSectionMenuButton();
        getWaitTime();
        this.clickOnSecondSectionLink();
        return this;
    }

    public void typeInTitleField2(String text) {
        driver.findElement(titleField2).clear();
        driver.findElement(titleField2).sendKeys(text);
    }

    public void selectScopeOfWorkField() throws InterruptedException {
        driver.findElement(scopeOfWorkField).click();
        getWaitTime();
        getWaitTime();
        driver.findElement(scopeOfWorkItem).click();
    }

    public void typeInDevelopmentGoalField(String text) throws InterruptedException {
        driver.findElement(developmentGoalField).clear();
        driver.findElement(developmentGoalField).sendKeys(text);
    }

    public void typeInActionPlan(String text) throws InterruptedException {
        driver.findElement(actionPlanField).clear();
        driver.findElement(actionPlanField).sendKeys(text);
    }

    public void typeInOutcomeMeasureField(String text) throws InterruptedException {
        driver.findElement(outcomeMeasureField).clear();
        driver.findElement(outcomeMeasureField).sendKeys(text);
    }

    public void typeInEstimatedTimeCommitment(String text) throws InterruptedException {
        driver.findElement(estimatedTimeCommitmentField).clear();
        driver.findElement(estimatedTimeCommitmentField).sendKeys(text);
    }

    public void selectData() throws InterruptedException {
        driver.findElement(targetDataField).click();
        driver.findElement(selectData).click();
    }

    public void clickOnRadioButtonYes() throws InterruptedException {
        driver.findElement(radioButtonYes).click();
    }

    public void typeInPleaseElOnThisField(String text) throws InterruptedException {
        driver.findElement(pleaseElaborateOnThisField).clear();
        driver.findElement(pleaseElaborateOnThisField).sendKeys(text);
    }

    public void typeInReflectiveEvaluationField(String text) throws InterruptedException {
        driver.findElement(reflectiveEvaluationField).clear();
        driver.findElement(reflectiveEvaluationField).sendKeys(text);
    }

    public void clickOnRadioButton() throws InterruptedException {
        driver.findElement(radioButtonYes).click();

    }

    public void clickOnRadioButton2() throws InterruptedException {
        driver.findElement(checkBoxOne).click();

    }

    public String getScopeOfWorkText() throws InterruptedException {
        String te = driver.findElement(scopeOfWorkField).getText();
        return te;
    }

    public void uploadFiles2() throws InterruptedException {
        driver.findElement(By.cssSelector("#section-2 > div > div > div > div.section-container > div:nth-child(15) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/1.bmp");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-2 > div > div > div > div.section-container > div:nth-child(15) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/2.doc");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-2 > div > div > div > div.section-container > div:nth-child(15) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/3.docx");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-2 > div > div > div > div.section-container > div:nth-child(15) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/4.gif");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-2 > div > div > div > div.section-container > div:nth-child(15) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/5.heic");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-2 > div > div > div > div.section-container > div:nth-child(15) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/6.jpg");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-2 > div > div > div > div.section-container > div:nth-child(15) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/7.key");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-2 > div > div > div > div.section-container > div:nth-child(15) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/8.mov");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-2 > div > div > div > div.section-container > div:nth-child(15) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/9.mp3");
        getWaitTime();
        driver.findElement(By.cssSelector("#section-2 > div > div > div > div.section-container > div:nth-child(15) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/10.mp4");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-2 > div > div > div > div.section-container > div:nth-child(15) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/11.numbers");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-2 > div > div > div > div.section-container > div:nth-child(15) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/12.pages");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-2 > div > div > div > div.section-container > div:nth-child(15) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/13.pdf");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-2 > div > div > div > div.section-container > div:nth-child(15) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/14.png");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-2 > div > div > div > div.section-container > div:nth-child(15) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/15.ppt");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-2 > div > div > div > div.section-container > div:nth-child(15) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/16.pptx");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-2 > div > div > div > div.section-container > div:nth-child(15) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/17.txt");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-2 > div > div > div > div.section-container > div:nth-child(15) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/18.xls");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-2 > div > div > div > div.section-container > div:nth-child(15) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/19.xlsx");
        getWaitTime2();
    }


    public SeniorAdminMapPage CrudForSection2() throws InterruptedException {
        this.clickOnTheAddNewItemButton();
        getWaitTime();
        this.typeInTitleField2("Test1");
        getWaitTime();
        this.selectScopeOfWorkField();
        getWaitTime();
        this.typeInDevelopmentGoalField("Test2");
        getWaitTime();
        this.typeInActionPlan("Test3");
        getWaitTime();
        this.typeInOutcomeMeasureField("Test4");
        getWaitTime();
        this.typeInEstimatedTimeCommitment("Test5");
        getWaitTime();
        this.selectData();
        getWaitTime();
        this.clickOnRadioButtonYes();
        getWaitTime();
        this.typeInPleaseElOnThisField("Test6");
        getWaitTime();
        this.typeInReflectiveEvaluationField("Test7");
        getWaitTime();
        this.clickOnRadioButton();
        getWaitTime();
        this.clickOnRadioButton2();
        getWaitTime();
        return this;
    }

    // Section 3 ///////////////////////////////////////////////////

    public void typeInCPDActivityTitleField(String text) throws InterruptedException {
        driver.findElement(cpdActivityTitleField).clear();
        driver.findElement(cpdActivityTitleField).sendKeys(text);
    }

    public void typeInCPDHourField(String text) throws InterruptedException {
        driver.findElement(cpdHourField).clear();
        driver.findElement(cpdHourField).sendKeys(text);
    }

    public void selectInCPDTypeField() throws InterruptedException {
        driver.findElement(cpdTypeField).click();
        driver.findElement(cpdTypeItem).click();
        getWaitTime();
    }

    public void selectActivityDate() throws InterruptedException {
        driver.findElement(cpdActivityDateField).click();
        getWaitTime();
        driver.findElement(selectCpdActivityDate).click();
        getWaitTime();
    }

    public void selectCPDProgressField() throws InterruptedException {
        driver.findElement(cpdProgressField).click();
        driver.findElement(selectCpdProgressItem).click();
    }

    public void selectScopeOfWork() throws InterruptedException {
        driver.findElement(scopeOfWorkField3).click();
        driver.findElement(selectScopeOfWorkField3).click();
    }

    public void typeInDescriptionField(String text) throws InterruptedException {
        driver.findElement(descriptionField).clear();
        driver.findElement(descriptionField).sendKeys(text);
    }

    public void typeInReflectiveEvaluationField3(String text) throws InterruptedException {
        driver.findElement(descriptionField).clear();
        driver.findElement(descriptionField).sendKeys(text);
    }

    public void clickOnGMPDomainsCheckBox() throws InterruptedException {
        driver.findElement(gmpDomainsCheckBox).click();
    }

    public void clickOnThirdSectionLink() {
        driver.findElement(thirdSectionLink).click();
    }

    public SeniorAdminMapPage OpenSection3() throws InterruptedException {
        this.clickOnSectionMenuButton();
        getWaitTime();
        this.clickOnThirdSectionLink();
        return this;
    }

    public void uploadFiles3() throws InterruptedException {
        driver.findElement(By.cssSelector("#section-3 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/1.bmp");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-3 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/2.doc");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-3 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/3.docx");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-3 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/4.gif");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-3 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/5.heic");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-3 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/6.jpg");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-3 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/7.key");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-3 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/8.mov");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-3 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/9.mp3");
        getWaitTime();
        driver.findElement(By.cssSelector("#section-3 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/10.mp4");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-3 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/11.numbers");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-3 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/12.pages");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-3 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/13.pdf");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-3 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/14.png");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-3 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/15.ppt");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-3 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/16.pptx");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-3 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/17.txt");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-3 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/18.xls");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-3 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/19.xlsx");
        getWaitTime2();
    }

    public SeniorAdminMapPage CrudForSection3() throws InterruptedException {
        this.clickOnTheAddNewItemButton();
        getWaitTime();
        this.typeInCPDActivityTitleField("Test1");
        getWaitTime();
        this.typeInCPDHourField("Test2");
        getWaitTime();
        this.selectInCPDTypeField();
        getWaitTime();
        this.selectActivityDate();
        getWaitTime();
        this.selectCPDProgressField();
        getWaitTime();
        this.selectScopeOfWork();
        getWaitTime();
        this.typeInDescriptionField("Test3");
        getWaitTime();
        this.typeInReflectiveEvaluationField3("Test4");
        getWaitTime();
        this.clickOnGMPDomainsCheckBox();
        getWaitTime();
        return this;
    }
}

