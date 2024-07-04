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

public class TestNG {
	WebDriver driver;
	
	@BeforeTest
	public void launch()
	{
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/login.html");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@DataProvider(name="login to the site")
	public Object[][]logindata()
	{
	Object[][] data = new Object[2][2];
	data[0][0] ="anushabachhu@gmail.com";
	data[0][1] ="12345";
	data[1][0] = "anusha@gmail.com";
	data[1][1] = "123";

	return data;
	}
	@Test(dataProvider = "login to the site")
	public void passdata(String mail,String password) throws InterruptedException
	{
	WebElement mailid =driver.findElement(By.id("email"));
	WebElement pwd = driver.findElement(By.id("passwd"));
	mailid.sendKeys(mail);
	pwd.sendKeys(password);
	driver.findElement(By.id("SubmitLogin")).click();
	Thread.sleep(1000);
	driver.navigate().back();
	mailid.clear();
	pwd.clear();
	}
	@AfterTest
	public void close() {
	driver.close();
}}
