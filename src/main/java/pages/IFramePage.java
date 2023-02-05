package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import util.Utility;

import java.util.List;

public class IFramePage extends WebTestBase {

    @FindBy(tagName = "iframe")
    List<WebElement>iframe;

    public IFramePage(){
        PageFactory.initElements(driver,this);
    }
    public void iframe() throws InterruptedException {
        Utility.iFrameHandle(iframe);
    }

}
