package Luma_Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Product_adding_to_wishlist {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
				
				//Product selection by using search option
				driver.findElement(By.id("search")).sendKeys("tops");
				driver.findElement(By.id("search")).sendKeys(Keys.RETURN);
				driver.findElement(By.xpath("//a[@class='product-item-link'][1]")).click();
				driver.findElement(By.xpath("//div[@index='0']")).click();
				driver.findElement(By.xpath("//div[@option-id='57']")).click();
				driver.findElement(By.id("qty")).clear();
				driver.findElement(By.id("qty")).sendKeys("3");
				
		//Selected product added to wishlist
              driver.findElement(By.linkText("ADD TO WISH LIST")).click();
              //verifying whether page redirects to wishlist or not
              String ActualTitle=driver.getTitle();
          	String exptitle="My Wish List";
          	if(ActualTitle.equals(exptitle))
          	{
          		System.out.println("Page verified and correct");
          	}
          		else
          		{
          			System.out.println("Test case fail");
          		}
	}

}
