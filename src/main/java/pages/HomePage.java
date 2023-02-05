package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import util.Utility;

public class HomePage extends WebTestBase
{
    @FindBy(id="pushDenied")
    WebElement element;

    @FindBy(xpath = "//input[@id='inputValEnter']")
    WebElement elementsearch;

   public HomePage(){
       PageFactory.initElements(driver,this);
   }

   public void SearchProduct(String product) throws InterruptedException {
       element.click();
       elementsearch.sendKeys(product);
       elementsearch.sendKeys(Keys.ENTER);
       Thread.sleep(4000);
       Utility.backElement(driver);

   }
}
