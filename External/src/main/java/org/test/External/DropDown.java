package org.test.External;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	public static WebElement driver;
public static void browsersetup(WebElement browsersetup) {
	WebDriverManager.chromedriver().setup();
	driver = (WebElement) new ChromeDriver();
}
	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\chromedriver_win32\\chromedriver.exe");
		
		browsersetup(driver);
		
		((WebDriver) driver).get("https://www.leafground.com/select.xhtml");
		/*driver.manage().window().maximize();
		
		  WebElement dropdown=driver.findElement
		  (By.xpath("//*[@id='j_idt87']/div/div[1]/div[1]/div/div/select")); 
		  Select m=new Select(dropdown); 
		  m.selectByIndex(2);
		 
		WebElement dropdown1 = driver.findElement(By.xpath("//*[@id=\'j_idt87:country\']/div[3]"));
		dropdown1.click();
		List<WebElement> a = driver.findElements(By.xpath("//*[@id=\'j_idt87:country_items\']/li"));
		int b=a.size();
		System.out.println(b);
		
		Actions c = new Actions(driver);
		c.click(a.get(3)).perform();
		
		WebElement dropdown2 = driver.findElement(By.xpath("//*[@id=\"j_idt87:city\"]/div[3]"));
		dropdown2.click();
		List<WebElement> e = driver.findElements(By.xpath("//*[@id='j_idt87:city_items']/li"));
		int d=e.size();
		System.out.println(d);
		
		Thread.sleep(3000);
		Actions l = new Actions(driver);
		l.click(e.get(1)).perform();*/
		
		Thread.sleep(3000);
		WebElement dropdown3 = driver.findElement(By.xpath("//*[@id=\'j_idt87:auto-complete_input\']"));
		dropdown3.sendKeys("s");
		Thread.sleep(3000);
		List<WebElement> text = driver.findElements(By.xpath("//*[@id=\"j_idt87:auto-complete_panel\"]/ul/li"));
		int textlist=text.size();
		System.out.println(textlist);
		for (WebElement listtext : text) {
			if(listtext.getText().startsWith("Selenium")) {
				listtext.click();
				break;
			}
			
		}
		
		
		Thread.sleep(3000);
		((WebDriver) driver).close();
	}

}

