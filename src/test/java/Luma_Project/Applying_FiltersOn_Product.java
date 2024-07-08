package Luma_Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Applying_FiltersOn_Product {

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
			//Applying filters and product selection(size,color and quantity).	
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

}
