package Tests;

import Pages.LogInPage;
import Pages.SeniorAminPages.SeniorAdminMapPage;
import Pages.SeniorAminPages.SeniorAdminProfilePage;
import TestData.TestDataInformation;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CrudTest extends TestDataInformation {


    @Before
    public void setUP() {
        beforeMethod();
        driver.get("https://profile1.medsu.net/login");
    }

    // Section 1

    @Test
    public void crudTestInForSection1() throws InterruptedException {
        LogInPage log = new LogInPage();
        Assert.assertEquals("Login", log.logInPageHeader());
        log.logIn(senioradminusername, userpassword);
        getWaitTime();
        SeniorAdminProfilePage login = new SeniorAdminProfilePage();
        Assert.assertEquals("Profile", login.userProfileHeader());
        getWaitTime();
        Assert.assertEquals("senior.admin@medsu.net", senioradminusername);
        getWaitTime();
        login.OpenMap();
        getWaitTime();
        driver.get("https://dev:dev@map1.medsu.net/my-map");
        getWaitTime();
        SeniorAdminMapPage s = new SeniorAdminMapPage();
        s.OpenSection1();
        getWaitTime();
        s.CrudForSection1();
        getWaitTime();
        s.uploadFiles();
        getWaitTime();
        s.selectMethod();
        getWaitTime();
        driver.navigate().refresh();
        getWaitTime();
        // Assert.assertEquals("Test1", s.getTitleText());
//        Assert.assertEquals("Test2", s.getDetailOfWorkText());
//        Assert.assertEquals("Test3", s.getLengthOfTimeText());
//        Assert.assertEquals("Test4", s.getPracticeSettingText());
//        Assert.assertEquals("Test5", s.getQualificationText());
        Assert.assertEquals("Managerial", s.getCategoryOfWorkText());
        Assert.assertEquals("Ad Hoc", s.getFrequencyText());
        Assert.assertEquals("1.bmp", s.getItem1Text());
        Assert.assertEquals("2.doc", s.getItem2Text());
        Assert.assertEquals("3.docx", s.getItem3Text());
        Assert.assertEquals("4.gif", s.getItem4Text());
        Assert.assertEquals("5.heic", s.getItem5Text());
        Assert.assertEquals("6.jpg", s.getItem6Text());
        Assert.assertEquals("7.key", s.getItem7Text());
        Assert.assertEquals("8.mov", s.getItem8Text());
        Assert.assertEquals("9.mp3", s.getItem9Text());
        Assert.assertEquals("10.mp4", s.getItem10Text());
        Assert.assertEquals("11.numbers", s.getItem11Text());
        Assert.assertEquals("12.pages", s.getItem12Text());
        Assert.assertEquals("13.pdf", s.getItem13Text());
        Assert.assertEquals("14.png", s.getItem14Text());
        Assert.assertEquals("15.ppt", s.getItem15Text());
        Assert.assertEquals("16.pptx", s.getItem16Text());
        Assert.assertEquals("17.txt", s.getItem17Text());
        Assert.assertEquals("18.xls", s.getItem18Text());
        Assert.assertEquals("19.xlsx", s.getItem19Text());
        getWaitTime();
        s.deleteItem();


    }

    // Section 2

    @Test
    public void crudTestForSection2() throws InterruptedException {
        LogInPage log = new LogInPage();
        Assert.assertEquals("Login", log.logInPageHeader());
        log.logIn(senioradminusername, userpassword);
        getWaitTime();
        SeniorAdminProfilePage login = new SeniorAdminProfilePage();
        Assert.assertEquals("Profile", login.userProfileHeader());
        getWaitTime();
        Assert.assertEquals("senior.admin@medsu.net", senioradminusername);
        getWaitTime();
        login.OpenMap();
        getWaitTime();
        driver.get("https://dev:dev@map1.medsu.net/my-map");
        getWaitTime();
        SeniorAdminMapPage s = new SeniorAdminMapPage();
        s.OpenSection2();
        getWaitTime();
        s.CrudForSection2();
        getWaitTime();
        s.uploadFiles2();
        getWaitTime();
        driver.navigate().refresh();
        s.OpenSection2();
        getWaitTime();
        Assert.assertEquals("Cross Role", s.getScopeOfWorkText());
        Assert.assertEquals("1.bmp", s.getItem1Text());
        Assert.assertEquals("2.doc", s.getItem2Text());
        Assert.assertEquals("3.docx", s.getItem3Text());
        Assert.assertEquals("4.gif", s.getItem4Text());
        Assert.assertEquals("5.heic", s.getItem5Text());
        Assert.assertEquals("6.jpg", s.getItem6Text());
        Assert.assertEquals("7.key", s.getItem7Text());
        Assert.assertEquals("8.mov", s.getItem8Text());
        Assert.assertEquals("9.mp3", s.getItem9Text());
        Assert.assertEquals("10.mp4", s.getItem10Text());
        Assert.assertEquals("11.numbers", s.getItem11Text());
        Assert.assertEquals("12.pages", s.getItem12Text());
        Assert.assertEquals("13.pdf", s.getItem13Text());
        Assert.assertEquals("14.png", s.getItem14Text());
        Assert.assertEquals("15.ppt", s.getItem15Text());
        Assert.assertEquals("16.pptx", s.getItem16Text());
        Assert.assertEquals("17.txt", s.getItem17Text());
        Assert.assertEquals("18.xls", s.getItem18Text());
        Assert.assertEquals("19.xlsx", s.getItem19Text());
        getWaitTime();
        s.deleteItem();

    }

    // Section 3

    @Test
    public void crudTestForSection3() throws InterruptedException {
        LogInPage log = new LogInPage();
        Assert.assertEquals("Login", log.logInPageHeader());
        log.logIn(senioradminusername, userpassword);
        getWaitTime();
        SeniorAdminProfilePage login = new SeniorAdminProfilePage();
        Assert.assertEquals("Profile", login.userProfileHeader());
        getWaitTime();
        Assert.assertEquals("senior.admin@medsu.net", senioradminusername);
        getWaitTime();
        login.OpenMap();
        getWaitTime();
        driver.get("https://dev:dev@map1.medsu.net/my-map");
        getWaitTime();
        SeniorAdminMapPage s = new SeniorAdminMapPage();
        s.OpenSection3();
        getWaitTime();
        s.CrudForSection3();
        getWaitTime();
        s.uploadFiles3();
        getWaitTime();
        driver.navigate().refresh();
        s.OpenSection3();
        getWaitTime();
        Assert.assertEquals("Cross Role", s.getScopeOfWorkText());
        Assert.assertEquals("1.bmp", s.getItem1Text());
        Assert.assertEquals("2.doc", s.getItem2Text());
        Assert.assertEquals("3.docx", s.getItem3Text());
        Assert.assertEquals("4.gif", s.getItem4Text());
        Assert.assertEquals("5.heic", s.getItem5Text());
        Assert.assertEquals("6.jpg", s.getItem6Text());
        Assert.assertEquals("7.key", s.getItem7Text());
        Assert.assertEquals("8.mov", s.getItem8Text());
        Assert.assertEquals("9.mp3", s.getItem9Text());
        Assert.assertEquals("10.mp4", s.getItem10Text());
        Assert.assertEquals("11.numbers", s.getItem11Text());
        Assert.assertEquals("12.pages", s.getItem12Text());
        Assert.assertEquals("13.pdf", s.getItem13Text());
        Assert.assertEquals("14.png", s.getItem14Text());
        Assert.assertEquals("15.ppt", s.getItem15Text());
        Assert.assertEquals("16.pptx", s.getItem16Text());
        Assert.assertEquals("17.txt", s.getItem17Text());
        Assert.assertEquals("18.xls", s.getItem18Text());
        Assert.assertEquals("19.xlsx", s.getItem19Text());
        getWaitTime();
        s.deleteItem();

    }
    @After
    public void tearDown() throws InterruptedException {
        getWaitTime();
        driver.quit();
    }
}
