package Luma_Project;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Create_New_Account extends Basic {
	public static void main(String args[]) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		PageFactory.initElements(driver, Basic.class);
		Basic.Createaccountlink.click();
		Basic.Firstname.sendKeys("anusha");
		Basic.Lastname.sendKeys("kallakuri");
		Basic.email.sendKeys("anusha.k5467@gmail.com");
		Basic.password.sendKeys("Ch@nvika190318");
		Basic.confirmpassword.sendKeys("Ch@nvika190318");
		Basic.submit.click();
		try {
		if(msg.isDisplayed())
		{
			System.out.println("User registered successfully");
		}
		else
		{
			System.out.println("Registration failed");
		}
		}
		catch(Exception e) {
			String message = Basic.validationmessage.getText();
			System.out.println(message);
		}
		
	}
}

