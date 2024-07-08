package Assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Fuctionality_MAGENTO {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://magento.softwaretestingboard.com/");
		
		
		
		
        String Filepath = "C:\\Users\\user\\Documents\\magento.xlsx";
        FileInputStream fis= new FileInputStream(Filepath);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("data");
		int rows =sheet.getLastRowNum();
		System.out.println("No: of rows = "+rows);
		
		for(int r=1;r<=rows;r++)
		{
			XSSFRow  row = sheet.getRow(r);
			XSSFCell usernm = row.getCell(0); 
			XSSFCell pass=row.getCell(1);
			try {
			System.out.println("Username -" +usernm+"     "+"password- "+pass);
			driver.findElement(By.xpath("//ul[@class='header links']/li[2]")).click();
			driver.findElement(By.id("email")).sendKeys(usernm.toString());
			driver.findElement(By.id("pass")).sendKeys(pass.toString());
			driver.findElement(By.id("send2")).click();
			driver.findElement(By.xpath("//button[@class='action switch']")).click();
			driver.findElement(By.xpath("//ul[@class='header links']/child::li[3]/child::a[1]")).click();
		System.out.println("Valid Credentials");
		
		}
		catch(Exception e) {
			System.out.println("Invalid credentials");
		}
		}
		fis.close();
	
		driver.close();
	}

}

		



