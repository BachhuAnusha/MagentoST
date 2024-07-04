package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginMagentoUsingAnnotations {
WebDriver driver;
	
	@BeforeTest
	public void launch()
	{
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://magento.softwaretestingboard.com/customer/account/login");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	@DataProvider(name="login to the site")
	public Object[][]logindata()
	{
	Object[][] data = new Object[2][2];
	data[0][0] ="anushabachhu@gmail.com";
	data[0][1] ="123";
	data[1][0] = "anushabachhu@gmail.com";
	data[1][1] = "Chanvika123";
	
	
	return data;
	}
	@Test(dataProvider = "login to the site")
	public void passdata(String email,String password) throws InterruptedException
	{
	
		WebElement emailid = driver.findElement(By.id("email"));
		WebElement pwd = driver.findElement(By.id("pass"));
		emailid.sendKeys(email);
		pwd.sendKeys(password);
		driver.findElement(By.id("send2")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		emailid.clear();
		pwd.clear();
	}
	
	@AfterTest
	public void close() {
	driver.close();
	}
	
}
