package org.practice.test;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Downloads {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/file.xhtml");
		
		WebElement download = driver.findElement(By.id("j_idt93:j_idt95"));
		download.click();
		Thread.sleep(3000);
		File fileloaction =new File("C:\\Users\\Saravana\\Downloads\\");
		File[] totalfiles=fileloaction.listFiles();
		for (File file : totalfiles) {
			if(file.getName().equals("TestLeaf Logo.png")) {
				System.out.println("file is Downloaded");
				break;
			}
			
				
		}
		driver.close();
	}

}
