package Selineum;

import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeDepot {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
		driver.getWindowHandle();
		Thread.sleep(3000);
		try {
			WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"headerSearch\"]"));	
			searchBox.sendKeys("celling fan",Keys.ENTER);
		}
		catch(NoSuchElementException e) {
			WebElement searchBox2 = driver.findElement(By.xpath("//*[@id=\'typeahead-search-field-input\']"));	
			searchBox2.sendKeys("celling fan",Keys.ENTER);
		}
		Thread.sleep(3000);
		WebElement click1 = driver.findElement(By.xpath("//*[@id=\'browse-search-pods-1\']/div[1]/div/a/div/img[2]"));
	    click1.click();
	    Thread.sleep(3000);
	    WebElement click2 = driver.findElement(By.xpath("//*[@id=\'product-section-key-feat\']/div/div[1]"));
	    click2.click();
	    
	    Thread.sleep(3000);
	    WebElement click3 = driver.findElement(By.xpath("//*[@id=\'specifications\']/div[1]/div/div[2]/div[7]"));
	    click3.click();
	    Set<String> handles =driver.getWindowHandles();
	       for (String newwindow : handles) {
			driver.switchTo().window(newwindow);
			driver.quit();
		}
	}

}
