package Selineum;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.switchTo().frame(0);
		WebElement b1 = driver.findElement(By.id("Click"));
		b1.click();
		
		String t1=b1.getText();
		System.out.println(t1);
		driver.switchTo().defaultContent();
		List<WebElement> num= driver.findElements(By.tagName("iframe"));
		int size=num.size();
		System.out.println(size);
		driver.switchTo().defaultContent();
		WebElement m=driver.findElement(By.xpath("//*[@id=\"j_idt88\"]/div/div[2]/div/iframe"));
		driver.switchTo().frame(m);
		WebElement n=driver.findElement(By.xpath("//*[@id=\"frame2\"]"));
		driver.switchTo().frame(n);
		WebElement b2 = driver.findElement(By.id("Click"));
		b2.click();
		
		
	}

}
