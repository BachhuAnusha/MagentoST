package Assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Apache_POI {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://demo.guru99.com/V4/");
		
		String Filepath = "C:\\Users\\user\\Documents\\demoguru99.xlsx";
		FileInputStream fis = new FileInputStream(Filepath);
			

		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Data");
		int rows =sheet.getLastRowNum();
		System.out.println("No: of rows = "+rows);
	
	    XSSFRow row = sheet.getRow(1);
		XSSFCell usernm =row.getCell(0);
		XSSFCell pwd = row.getCell(1);
		System.out.println("Username -" +usernm+"     "+"password- "+pwd);

	
		driver.findElement(By.name("uid")).sendKeys(usernm.toString());	
		driver.findElement(By.name("password")).sendKeys(pwd.toString());
		driver.findElement(By.name("btnLogin")).click();
	    Thread.sleep(2000);
	    Alert a = driver.switchTo().alert();
	    a.accept();
	
	    fis.close();
	
driver.close();
	}

}	
	


