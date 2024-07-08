package LoginFunctionality_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginFunctionality_Luma {
	
	WebDriver driver;

public  LoginFunctionality_Luma(WebDriver idriver)
{
	driver = idriver;
	PageFactory.initElements(driver, this);
}
	@FindBy(id="email") WebElement mailid;
	@FindBy(id="pass") WebElement pwd;
	@FindBy(id="send2") WebElement signinbtn;
	public void url()
	{
		driver.get("https://magento.softwaretestingboard.com/");
		driver.findElement(By.xpath("//ul[@class='header links']/li[2]")).click();
	}
	public void enterusername(String s1) 
	{
	mailid.sendKeys(s1);
	}
	public void enterpassword(String s2)
	{
		pwd.sendKeys(s2);
	}
	public void clickonsignup()
	{
		signinbtn.click();
	}
}

