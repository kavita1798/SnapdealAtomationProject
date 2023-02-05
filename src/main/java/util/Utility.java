package util;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Set;

public class Utility {
    public static final long page_load_timeout = 60;
    public static final long IMPLICITLY_WAIT = 20;

    public static void getWindowHandle(WebDriver driver) throws InterruptedException {
        String parentWindowID = driver.getWindowHandle();
        Set<String> allWindow = driver.getWindowHandles();
        for (String s : allWindow){
            if(!parentWindowID.contentEquals(s)){
               driver.switchTo().window(s);
            }
        }
        Thread.sleep(6000);
    }

    public static void backElement(WebDriver driver) throws InterruptedException{
        driver.navigate().back();
        //Thread.sleep(4000);
    }

    public static void hoverOnProduct(WebDriver driver, WebElement element) throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(element)
                .build()
                .perform();
        Thread.sleep(4000);
    }
    public static void iFrameHandle(List<WebElement>elements) throws InterruptedException {
        System.out.println(elements.size());
        for (WebElement e: elements){
            System.out.println(e);
        }
        Thread.sleep(4000);
    }

    public static void fethchingCookies(WebDriver driver){
        Set<Cookie> cookies = driver.manage().getCookies();
        for (Cookie c : cookies){
            System.out.println(c);
        }
    }
    public static void addCookies(WebDriver driver,String key,String value){
        Cookie cok = new Cookie(key,value);
        driver.manage().addCookie(cok);

        System.out.println("---------AddCookies----------");
        Set<Cookie> cookies1 = driver.manage().getCookies();
        for (Cookie c : cookies1){
            System.out.println(c);
        }

        System.out.println("-----------DeleteCookies-----------");
        driver.manage().deleteCookie(cok);
        Set<Cookie> cookies2 = driver.manage().getCookies();
        for(Cookie c : cookies2){
            System.out.println(c);
        }
    }
}
