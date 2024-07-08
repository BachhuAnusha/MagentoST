package Luma_Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Edit_Addressin_AddressBook {
	WebDriver driver;
	@BeforeSuite
	public void Launch_and_login()
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
	@Test(priority=1)
	public void Address_Book() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[@class='action switch']")).click();
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Address Book")).click();
		Thread.sleep(3000);
	}
	@Test(priority=2)
	public void edit_address()
	{
		driver.findElement(By.xpath("//td[@class='col actions']/a[1]")).click();
		String Actualtitle = driver.getTitle();
		String Exptitle = "Edit Address";
		if(Actualtitle.equals(Exptitle))
		{
			System.out.println("Page veified & Testcase pass");
		}
		else
		{
			System.out.println("Testcase Fail");
		}
	}
}
