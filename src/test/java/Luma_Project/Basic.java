package Luma_Project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Basic {
	
	@FindBy(xpath ="//ul[@class='header links']/li[3]/a[1]")public static WebElement Createaccountlink;
	@FindBy(id="firstname") public static WebElement Firstname;
	@FindBy(id="lastname")public static WebElement Lastname;
	@FindBy(id="email_address")public static WebElement email;
	@FindBy(id="password")public static WebElement password;
	@FindBy(id="password-confirmation")public static WebElement confirmpassword;
	@FindBy(xpath="//button[@title='Create an Account']")public static WebElement submit;
	@FindBy(xpath="//div[@class='message-success success message']") public static WebElement msg;
	@FindBy(xpath="//div[@class='message-error error message']") public static WebElement validationmessage;
}
