package Luma_Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Verifying_Place_Order_case extends Basic{
	WebDriver driver;
	@BeforeSuite
	public void Launch_Login()
	{
		driver=new ChromeDriver();
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
	public void Add_toCart() throws InterruptedException
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
	
		
        driver.findElement(By.id("product-addtocart-button")).click();
         Thread.sleep(3000);
	}
	@Test(priority=2) 
	public void Proceed_To_Checkout() throws InterruptedException
	{
		//proceed to checkout
		driver.findElement(By.cssSelector("a.action.showcart")).click();
	    driver.findElement(By.xpath("//button[@title='Proceed to Checkout']")).click();
	    //verifying page directs to checkout or not
	    String actualtitle = driver.getTitle();
	    String exptitle="Checkout";
		if(actualtitle.equals(exptitle))
		{
			System.out.println("Page verified and changed to checkout page");
		}
			else
			{
				System.out.println("Test case fail");
			} 
		Thread.sleep(3000);
	}
		@Test(priority=3)
		public void Select_shipmentaddress()

		{
			//selecting shipping address
		
		driver.findElement(By.cssSelector("button.action.action-select-shipping-item")).click();
	}
		@Test(priority=4)
		public void Shipping_method()
		{
			driver.findElement(By.name("ko_unique_2")).click();
        driver.findElement(By.xpath("//button[@data-role='opc-continue']")).click();
		}
		@Test(priority=5)
		public void placing_order()
		{
	        driver.findElement(By.name("billing-address-same-as-shipping")).click();
            driver.findElement(By.xpath("//button[@title='Place Order']")).click();
            WebElement ordernumber =driver.findElement(By.xpath("//a[@class='order-number']"));
            if(ordernumber.isDisplayed())
            {
            	System.out.println("Order Confirmed and your order number is "+ "ordernumber");
            }
            	else
            	{
            	System.out.println("TestCase Fail");	
            	}
            }
		@Test(priority=6)
		public void To_see_orders()
		{
			driver.findElement(By.xpath("//button[@class='action switch']")).click();
			driver.findElement(By.linkText("My Account")).click();
			driver.findElement(By.linkText("My Orders")).click();

		}
		}

