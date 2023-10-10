package org.practice.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksAdvanced {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/link.xhtml");
		
		WebElement homepage=driver.findElement(By.linkText("Go to Dashboard"));
		homepage.click();
		Thread.sleep(3000);
		driver.navigate().back();
		WebElement a=driver.findElement(By.partialLinkText("Find the"));
		String b = a.getAttribute("href");
		System.out.println(b);
		
		WebElement broken = driver.findElement(By.linkText("Broken?"));
		broken.click();
		String title = driver.getTitle() ;
		if (title.contains("404")) {
			System.out.println("Link is broken");
		}
		
		
	}

}
