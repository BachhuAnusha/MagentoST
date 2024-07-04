package Assignment;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automation_Project {
    

	public static void main(String[] args) throws InterruptedException {
    	 WebDriver 	 driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://magento.softwaretestingboard.com/");
		/*driver.findElement(By.xpath("//ul[@class='header links']/li[3]/a[1]")).click();
		driver.findElement(By.id("firstname")).sendKeys("anusha");
		driver.findElement(By.id("lastname")).sendKeys("bachhu");
		driver.findElement(By.id("email_address")).sendKeys("anushabachhu@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Chanvika123");
		driver.findElement(By.id("password-confirmation")).sendKeys("Chanvika123");
		driver.findElement(By.xpath("//button[@title='Create an Account']")).click();
		Thread.sleep(5000);
		driver.close();*/
		
		//login functionality
		driver.findElement(By.xpath("//ul[@class='header links']/li[2]")).click();
		driver.findElement(By.id("email")).sendKeys("anushabachhu@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Chanvika123");
		driver.findElement(By.id("send2")).click();
		Thread.sleep(2000);
		//search functionality.
		
	driver.findElement(By.id("search")).sendKeys("tops");
	driver.findElement(By.id("search")).sendKeys(Keys.RETURN);
	Thread.sleep(2000);
	//Product selection criteria
	driver.findElement(By.xpath("//a[@class='product-item-link'][1]")).click();
	//selection of size
	driver.findElement(By.xpath("//div[@index='0']")).click();
	//selection of color
	driver.findElement(By.xpath("//div[@option-id='57']")).click();
	//enter the required quantity
	driver.findElement(By.id("qty")).clear();
	driver.findElement(By.id("qty")).sendKeys("3");
	Thread.sleep(2000);
	//add to cart
	driver.findElement(By.xpath("//button[@title='Add to Cart']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[@class='action showcart']/span[2]")).click();
	driver.findElement(By.xpath("//a[@class='action viewcart']/span")).click();
	String ActualTitle=driver.getTitle();
	String exptitle="Shopping Cart";
	if(ActualTitle.equals(exptitle))
	{
		System.out.println("Page verified and correct");
	}
		else
		{
			System.out.println("Test case fail");
		}
	
	//Moved to the wishlist
	//driver.findElement(By.linkText("Move to Wishlist")).click();
	
	
	
	//To delete the products from the cart
	//driver.findElement(By.xpath("//a[@class='action action-delete']")).click();
	
	//To edit the quantity.
	driver.findElement(By.xpath("//a[@class='action action-edit']")).click();
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
	Thread.sleep(5000);
	driver.findElement(By.xpath("//div[@index='1']")).click();
	driver.findElement(By.xpath("//div[@option-id='56']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("qty")).clear();
	driver.findElement(By.id("qty")).sendKeys("1");
	driver.findElement(By.xpath("//button[@title='Update Cart']")).click();
	
	// proceed to the checkout
		driver.findElement(By.xpath("//button[@data-role='proceed-to-checkout']")).click();
		
		//Verifying whether  page changed to Checkout or not
		String ActualTitle2=driver.getTitle();
		String exptitle2="Checkout";
		if(ActualTitle2.equals(exptitle2))
		{
			System.out.println("Page verified and changed to checkout page");
		}
			else
			{
				System.out.println("Test case fail");
			} 
		driver.findElement(By.name("firstname")).sendKeys("anusha");
		
		driver.findElement(By.name("lastname")).sendKeys("Kallakuri");
		driver.findElement(By.name("street[0]")).sendKeys("abcdefrhugi");
		driver.findElement(By.name("street[1]")).sendKeys("Near Busstand ");
		driver.findElement(By.name("street[2]")).sendKeys("Kukatpally");
		driver.findElement(By.name("city")).sendKeys("Hyd");
		
		
		
		WebElement province = driver.findElement(By.name("region_id"));
		Select Scprovince = new Select(province);
		Scprovince.selectByVisibleText("New York");
		
	
		driver.findElement(By.name("postcode")).sendKeys("12345");
		
		
		driver.findElement(By.name("telephone")).sendKeys("9876543210");
		driver.findElement(By.xpath("//input[@value='tablerate_bestway']")).click();
		driver.findElement(By.xpath("//button[@data-role='opc-continue']")).click();
		/*driver.findElement(By.xpath("//button[@class='action action-edit-address']")).click();
		driver.findElement(By.xpath("//button[@data-bind='click: back']")).click();
		driver.findElement(By.name("lastname")).clear();
		driver.findElement(By.name("lastname")).sendKeys("Kallakuri");
		driver.findElement(By.name("street[0]")).clear();
		driver.findElement(By.name("street[0]")).sendKeys("abcd");
		
		driver.findElement(By.name("street[1]")).clear();
		driver.findElement(By.name("street[1]")).sendKeys("aaabc");
		
		driver.findElement(By.name("street[2]")).clear();
		driver.findElement(By.name("street[2]")).sendKeys("abcdefghi");
		
		driver.findElement(By.name("city")).clear();
		driver.findElement(By.name("city")).sendKeys("HYD");
		
		
		WebElement country =driver.findElement(By.name("country_id"));
		Select sccountry = new Select (country);
		sccountry.selectByVisibleText("India");
		Scprovince.selectByVisibleText("Telangana");
		driver.findElement(By.name("postcode")).clear();
		driver.findElement(By.name("postcode")).sendKeys("54321");
		Alert a = driver.switchTo().alert();
		Thread.sleep(2000);
		a.accept();
		driver.findElement(By.xpath("//input[@checked='true']")).click();
		driver.findElement(By.xpath("//button[@data-role='opc-continue']")).click();*/

	}


}
