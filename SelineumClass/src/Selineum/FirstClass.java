package Selineum;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver open=new ChromeDriver();
		open.get("https://www.leafground.com/link.xhtml");
		open.findElement(By.linkText("Go to Dashboard")).click();
		Thread.sleep(2000);
		open.close();
	}

}
