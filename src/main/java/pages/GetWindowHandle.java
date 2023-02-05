package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import util.Utility;

public class GetWindowHandle extends WebTestBase
{
    @FindBy(xpath = "(//img[@class='wooble'])[7]")
    WebElement GetWindow;

    public GetWindowHandle(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void getWin() throws InterruptedException {
        GetWindow.click();
        Utility.getWindowHandle(driver);
    }
}
