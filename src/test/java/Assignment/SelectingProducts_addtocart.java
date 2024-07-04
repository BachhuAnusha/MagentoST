package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectingProducts_addtocart {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver 	 driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://magento.softwaretestingboard.com/");
			driver.findElement(By.xpath("//ul[@class='header links']/li[2]")).click();
			driver.findElement(By.id("email")).sendKeys("anushabachhu@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("Chanvika123");
			driver.findElement(By.id("send2")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("search")).sendKeys("tops for men");
			driver.findElement(By.id("search")).sendKeys(Keys.RETURN);
			driver.findElement(By.xpath("//img[@alt='Jupiter All-Weather Trainer ']")).click();
			driver.findElement(By.xpath("//div[@index='2']")).click();
			driver.findElement(By.xpath("//div[@option-id='53']")).click();
			driver.findElement(By.id("qty")).clear();
			driver.findElement(By.id("qty")).sendKeys("2");
			driver.findElement(By.xpath("//button[@title='Add to Cart']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[@class='action showcart']/span[2]")).click();
			driver.findElement(By.xpath("//a[@class='action viewcart']/span")).click();
			

}
}