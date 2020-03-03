package Tests;

import Pages.LogInPage;
import Pages.SeniorAminPages.SeniorAdminProfilePage;
import TestData.TestDataInformation;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LogInTest extends TestDataInformation {
    @Before
    public void setUP() {
        beforeMethod();
        driver.get("https://profile1.medsu.net/login");
    }


    @Test
    public void logInWithValidValues() throws InterruptedException {
        LogInPage log = new LogInPage();
        Assert.assertEquals("Login", log.logInPageHeader());
        log.logIn(senioradminusername, userpassword);
        getWaitTime();
        SeniorAdminProfilePage login = new SeniorAdminProfilePage();
        Assert.assertEquals("Profile", login.userProfileHeader());
        getWaitTime();
        Assert.assertEquals("senior.admin@medsu.net", senioradminusername);
        getWaitTime();
        login.LogOut();


    }

    @After
    public void tearDown() throws InterruptedException {
        getWaitTime();
        driver.quit();
    }
}
