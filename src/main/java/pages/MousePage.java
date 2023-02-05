package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import util.Utility;

public class MousePage extends WebTestBase
{
    @FindBy(xpath = "//i[@class='sd-icon sd-icon-user']")
    WebElement Btn;

    public MousePage(){
        PageFactory.initElements(driver, this);
    }

    public void mouseHovers() throws InterruptedException {
        Utility.hoverOnProduct(driver,Btn);
    }
}
