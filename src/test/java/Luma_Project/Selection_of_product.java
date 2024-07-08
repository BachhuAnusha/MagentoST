package Luma_Project;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selection_of_product {

	
		public static void main(String[] args) throws IOException, InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("https://magento.softwaretestingboard.com/");
			
			
			
			
	        String Filepath = "C:\\Users\\user\\Documents\\magento.xlsx";
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
				driver.findElement(By.id("send2")).click();
	}
			//search the product.
			driver.findElement(By.id("search")).sendKeys("tops");
			driver.findElement(By.id("search")).sendKeys(Keys.RETURN);
			//selection of required product.
			driver.findElement(By.xpath("//a[@class='product-item-link'][1]")).click();
			//selection of size
			driver.findElement(By.xpath("//div[@index='0']")).click();
			//selection of color
			driver.findElement(By.xpath("//div[@option-id='57']")).click();
			//enter the required quantity
			driver.findElement(By.id("qty")).clear();
			driver.findElement(By.id("qty")).sendKeys("1");
			
}
}