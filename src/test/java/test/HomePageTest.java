package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;
import testbase.WebTestBase;

public class
HomePageTest extends WebTestBase
{
    HomePage home;
    GetWindowHandle getWindowHandle;
    MousePage mousePage;
    IFramePage iFramePage;
    CookiesPage cookiesPage;


    public HomePageTest(){
        super();
    }

    @BeforeMethod
    public void beforeMethod(){
        initialization();
        home = new HomePage();
        getWindowHandle = new GetWindowHandle(driver);
        mousePage=new MousePage();
        iFramePage = new IFramePage();
        cookiesPage = new CookiesPage();
    }

    @Test
    public void verifySearching() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        home.SearchProduct(prop.getProperty("product"));
        Thread.sleep(6000);
        getWindowHandle.getWin();
        Thread.sleep(6000);
        softAssert.assertAll();
    }
    @Test
    public void verifyMouseHover() throws InterruptedException {
        mousePage.mouseHovers();
    }
    @Test
    public void verifyIFrame() throws InterruptedException {
        iFramePage.iframe();

    }

    @Test
    public void verifyCookies(){
        cookiesPage.Cookies();
        cookiesPage.addCookies("YouTube","This is youTube");
    }

    @AfterMethod
    public void afterMethod(){
        driver.close();
    }
}
