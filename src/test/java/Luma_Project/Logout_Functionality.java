package Luma_Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Logout_Functionality {
	WebDriver driver;
	@BeforeSuite
	public void launch()
	{
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://magento.softwaretestingboard.com/");
		
	}
	@Test
	public void login() throws InterruptedException
      {
		driver.findElement(By.xpath("//ul[@class='header links']/li[2]")).click();
		WebElement email=driver.findElement(By.id("email"));
		WebElement pwd =driver.findElement(By.id("pass"));
		WebElement loginbtn = driver.findElement(By.id("send2"));
		email.sendKeys("anushabachhu@gmail.com");
		pwd.sendKeys("Chanvika123");
		loginbtn.click();
		Thread.sleep(3000);
}
	@Test
	public void logout() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[@class='action switch']")).click();
		Thread.sleep(2000);
        driver.findElement(By.linkText("Sign Out")).click();
       
	}
	}
