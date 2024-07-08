package Luma_Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Update_Cart {
	WebDriver driver;
	@BeforeSuite
	public void Launch_And_Login()
	{
		 driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("https://magento.softwaretestingboard.com/");
			driver.findElement(By.xpath("//ul[@class='header links']/li[2]")).click();
			WebElement email=driver.findElement(By.id("email"));
			WebElement pwd =driver.findElement(By.id("pass"));
			WebElement loginbtn = driver.findElement(By.id("send2"));
			email.sendKeys("anushabachhu@gmail.com");
			pwd.sendKeys("Chanvika123");
			loginbtn.click();
	}
	@Test
	public void Item_selection() throws InterruptedException 
	{
		driver.findElement(By.id("search")).sendKeys("tops");
		driver.findElement(By.id("search")).sendKeys(Keys.RETURN);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='product-item-link'][1]")).click();
		driver.findElement(By.xpath("//div[@index='0']")).click();
		driver.findElement(By.xpath("//div[@option-id='57']")).click();
		
		driver.findElement(By.id("qty")).clear();
		driver.findElement(By.id("qty")).sendKeys("1");
		Thread.sleep(3000);
	    driver.findElement(By.id("product-addtocart-button")).click();
Thread.sleep(3000);
	}
	@Test
	public void UpdateCart() throws InterruptedException
	{
		driver.findElement(By.cssSelector("a.action.showcart")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@class='action viewcart']")).click();
        driver.findElement(By.cssSelector("a.action.action-edit")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("qty")).clear();
		driver.findElement(By.id("qty")).sendKeys("2");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='action primary tocart']")).click();
	}
}
