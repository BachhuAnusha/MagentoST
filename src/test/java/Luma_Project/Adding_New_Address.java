package Luma_Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Adding_New_Address {
	WebDriver driver;
	@BeforeSuite
	public void launch()
	{
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://magento.softwaretestingboard.com/");
		
	}
	@Test(priority = 1)
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
	@Test(priority=2)
	public void click_AddressBook() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[@class='action switch']")).click();
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Address Book")).click();

	}
	@Test(priority=3)
	public void Newaddress_btn() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[@title='Add New Address']")).click();
		Thread.sleep(3000);
	}
	@Test(priority=4)
	public void add_New_Address()
	{
        driver.findElement(By.id("telephone")).sendKeys("9988776655");
		driver.findElement(By.id("street_1")).sendKeys("abcdefrhugi");
		driver.findElement(By.id("street_2")).sendKeys("ahvdtd");
		driver.findElement(By.id("street_3")).sendKeys("bfkuraek");
		driver.findElement(By.name("city")).sendKeys("Los Angeles");
		WebElement province = driver.findElement(By.name("region_id"));
		Select Scprovince = new Select(province);
		Scprovince.selectByVisibleText("California");
		driver.findElement(By.name("postcode")).sendKeys("54321");
		WebElement country = driver.findElement(By.name("country_id"));
		Select Sccountry = new Select(country);
		Sccountry.selectByVisibleText("United States");
	}
	@Test(priority=5)
	public void save_Address()
	{
		driver.findElement(By.xpath("//button[@title='Save Address']")).click();
	}
	}
