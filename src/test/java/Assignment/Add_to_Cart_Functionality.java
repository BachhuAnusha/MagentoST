package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Add_to_Cart_Functionality {
	

	public  static void main(String args[]) throws InterruptedException
	{
		//launch the browser
		 WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://magento.softwaretestingboard.com/");
	

       //Login Functionality
Thread.sleep(3000);
	driver.findElement(By.xpath("//ul[@class='header links']/li[2]")).click();
	driver.findElement(By.id("email")).sendKeys("anushabachhu@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("Chanvika123");
	driver.findElement(By.id("send2")).click();


  //search Functionality
	driver.findElement(By.id("search")).sendKeys("tops");
	driver.findElement(By.id("search")).sendKeys(Keys.RETURN);


  //Selecton Criteria
	driver.findElement(By.xpath("//a[@class='product-item-link']")).click();


//Page verification
	String ActualTitle1=driver.getTitle();
	String exptitle1="Leah Yoga Top";
	if(ActualTitle1.equals(exptitle1))
	{
		System.out.println("Page verified and correct");
	}
		else
		{
			System.out.println("Test case fail");
		}

 //selecting the size,color and Quantity of product.
	driver.findElement(By.id("option-label-size-143-item-167")).click();
	driver.findElement(By.xpath("//div[@aria-label='Orange']")).click();
	driver.findElement(By.id("qty")).clear();
	driver.findElement(By.id("qty")).sendKeys("3");
//Add to Cart functionality.


	driver.findElement(By.xpath("//button[@title='Add to Cart']")).click();
	
	//Verifying whether the selected product added to cart or not.
	driver.findElement(By.xpath("//a[@class='action showcart']/span[2]")).click();
	driver.findElement(By.xpath("//a[@class='action viewcart']/span")).click();

	
}


	
}

