package Luma_Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Add_To_Cart {
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
	public void login()
      {
		driver.findElement(By.xpath("//ul[@class='header links']/li[2]")).click();
		WebElement email=driver.findElement(By.id("email"));
		WebElement pwd =driver.findElement(By.id("pass"));
		WebElement loginbtn = driver.findElement(By.id("send2"));
		email.sendKeys("anushabachhu@gmail.com");
		pwd.sendKeys("Chanvika123");
		loginbtn.click();
	}
	@Test
	public void ProductSelection()
	{
		driver.findElement(By.xpath("//ul[@id='ui-id-2']/child::li[2]")).click();
		driver.findElement(By.linkText("Pants")).click();
		driver.findElement(By.xpath("//div[@data-role='title']")).click();
		driver.findElement(By.xpath("//ol[@class='items']/child::li[6]")).click();
		driver.findElement(By.xpath("//img[@alt='Sahara Leggings']")).click();
		driver.findElement(By.xpath("//div[@aria-label='28']")).click();
		driver.findElement(By.xpath("//div[@option-id='50']")).click();
		driver.findElement(By.id("qty")).clear();
		driver.findElement(By.id("qty")).sendKeys("2");

	}
	@Test
	public void Product_AddtoCart()
	{
      driver.findElement(By.id("product-addtocart-button")).click();
     
	}
	

}
