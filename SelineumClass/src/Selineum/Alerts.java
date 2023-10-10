package Selineum;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("https://www.leafground.com/alert.xhtml");
		WebElement alertbox = driver.findElement(By.xpath("//*[@id='j_idt88:j_idt91']/span[2]"));
		alertbox.click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
		//Thread.sleep(3000);
		
		WebElement alertbox1 = driver.findElement(By.xpath("//*[@id='j_idt88:j_idt93']/span[2]"));
		alertbox1.click();
		Alert alert1 = driver.switchTo().alert();
		Thread.sleep(3000);
		alert1.dismiss();
		Thread.sleep(3000);
		
		
		WebElement alertbox3 = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt95\']/span[2]"));
		alertbox3.click();
		WebElement dismiss = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt98\"]"));
		dismiss.click();
		
		Thread.sleep(3000);
		WebElement alertbox4 = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt100\"]/span[2]"));
		alertbox4.click();
		WebElement closes = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt101\"]/div[1]/a/span"));
		closes.click();
		Thread.sleep(3000);
		
		WebElement alertbox2 = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt104\']/span[2]"));
		alertbox2.click();
		Alert alert2 = driver.switchTo().alert();
		Thread.sleep(3000);
		alert2.sendKeys("Hello my World");
		alert2.accept();
		Thread.sleep(3000);
		driver.close();
	}

}
