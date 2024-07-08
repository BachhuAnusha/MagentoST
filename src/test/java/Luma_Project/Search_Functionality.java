package Luma_Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search_Functionality {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver 	 driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://magento.softwaretestingboard.com/");
			//login functionality
			driver.findElement(By.xpath("//ul[@class='header links']/li[2]")).click();
			driver.findElement(By.id("email")).sendKeys("anushabachhu@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("Chanvika123");
			driver.findElement(By.id("send2")).click();
			Thread.sleep(2000);
			//Search functionality
			
			driver.findElement(By.id("search")).sendKeys("tops");
			driver.findElement(By.id("search")).sendKeys(Keys.RETURN);

	}

}
