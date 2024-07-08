package LoginFunctionality_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutFunctionality_Luma {
	WebDriver driver;
	
public LogoutFunctionality_Luma(WebDriver idriver)
{
  driver = idriver;
  PageFactory.initElements(driver, this);

}
@FindBy(xpath="//button[@class='action switch']") WebElement profile;
@FindBy(xpath="//ul[@class='header links']/child::li[3]/child::a[1]") WebElement logout;

public void profiledata()
{
	profile.click();
}
public void signout()
{
	logout.click();
}
}
