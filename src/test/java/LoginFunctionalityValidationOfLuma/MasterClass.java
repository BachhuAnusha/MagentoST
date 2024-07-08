package LoginFunctionalityValidationOfLuma;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import LoginFunctionality_POM.LoginFunctionality_Luma;
import LoginFunctionality_POM.LogoutFunctionality_Luma;
@Test
public class MasterClass {

	public  void Luma_login_logout_functionality()	{
		WebDriver driver=new ChromeDriver();
	
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


LoginFunctionality_Luma Lin = new LoginFunctionality_Luma(driver);
         Lin.url();
         Lin.enterusername("anushabachhu@gmail.com");
         Lin.enterpassword("Chanvika123");
         Lin.clickonsignup();
	  
	LogoutFunctionality_Luma Lout = new  LogoutFunctionality_Luma(driver);
	Lout.profiledata();
	Lout.signout();

	}

}
