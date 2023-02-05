package pages;

import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import util.Utility;

public class CookiesPage extends WebTestBase {
    public CookiesPage(){
        PageFactory.initElements(driver,this);
    }
    public void Cookies(){
        Utility.fethchingCookies(driver);
    }
    public void addCookies(String key,String value){
        Utility.addCookies(driver,key,value);
    }
}
