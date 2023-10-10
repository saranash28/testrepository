package testNGdemo;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Test1 {
	WebDriver driver;
	/*String [][] data= {
			{"admin","admin"},
			{"admin1","admin123"},
			{"Admin","admin"},
			{"Admin","admin123"},
	};*/
	String data [][]=null;
	int rowcount;
	int colcount;
	@DataProvider(name="loginData")
	public String[][] loginProvider() throws IOException, BiffException{
		data = getexcel();
		return data;
	}
	public String[][] getexcel() throws BiffException, IOException{
		
		FileInputStream excel = new FileInputStream("D:\\test.xls");
		Workbook book = Workbook.getWorkbook(excel);
		Sheet sheet = book.getSheet(0);
		rowcount = sheet.getRows();
		colcount = sheet.getColumns();
		String testdata [][] =new String[rowcount-1][colcount];
		for(int i=1;i<rowcount;i++) {
			for(int j=0;j<colcount;j++) {
				testdata[i-1][j]=sheet.getCell(j,i).getContents();
			}
		}
		return testdata;
	}
	@BeforeTest
	public void beforetest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(3000);
	}
	@Test(dataProvider="loginData")
	public void loginProviderCases(String uname, String pwd) throws InterruptedException{
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		WebElement username =driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
		username.sendKeys(uname);
		Thread.sleep(1000);
		WebElement psword =driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
		psword.sendKeys(pwd);
		Thread.sleep(1000);
		WebElement loginbtn=driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		loginbtn.click();
		Thread.sleep(1000);
	}
	@AfterTest
	public void aftertest() {
		driver.quit();
	}
	
}
