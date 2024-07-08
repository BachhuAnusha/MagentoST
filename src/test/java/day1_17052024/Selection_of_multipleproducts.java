package day1_17052024;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Selection_of_multipleproducts {
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
		WebElement email =driver.findElement(By.id("email"));
		WebElement pwd = driver.findElement(By.id("pass"));
		WebElement  signup = driver.findElement(By.id("send2"));
		email.sendKeys("anushabachhu@gmail.com");
		pwd.sendKeys("Chanvika123");
		signup.click();
	}
		
		
        /*String Filepath = "C:\\Users\\user\\Documents\\magento.xlsx";
        FileInputStream fis= new FileInputStream(Filepath);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("data1");
		int rows =sheet.getLastRowNum();
		System.out.println("No: of rows = "+rows);
		
		for(int r=1;r<=rows;r++)
		{
			XSSFRow  row = sheet.getRow(r);
			XSSFCell usernm = row.getCell(0); 
			XSSFCell pass=row.getCell(1);
			System.out.println("Username -" +usernm+"     "+"password- "+pass);
			driver.findElement(By.xpath("//ul[@class='header links']/li[2]")).click();
			driver.findElement(By.id("email")).sendKeys(usernm.toString());
			driver.findElement(By.id("pass")).sendKeys(pass.toString());
			driver.findElement(By.id("send2")).click();*/
	@Test
public void FirstProductSelection()
{
		//Selection of first product
		driver.findElement(By.xpath("//img[@alt='Olivia 1/4 Zip Light Jacket']")).click();
		driver.findElement(By.xpath("//div[@class='categories-menu']/ul[1]/li[2]/a")).click();
		driver.findElement(By.id("option-label-size-143-item-166")).click();
		driver.findElement(By.id("option-label-color-93-item-49")).click();
}
	@Test
public void AddToCart()
{
	driver.findElement(By.className("action tocart primary")).click();
		//driver.findElement(By.xpath("//div[@class='actions-primary']/form/button[@type='submit']")).click();
}
		/*driver.findElement(By.id("ui-id-5")).click();
		driver.findElement(By.xpath("//div[@class='categories-menu']/child::ul[2]/li/a")).click();*/
		
	}
