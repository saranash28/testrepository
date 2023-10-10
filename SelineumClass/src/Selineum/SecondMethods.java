package Selineum;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver open=new ChromeDriver();
//		https://www.leafground.com/button.xhtml
		open.get("https://www.leafground.com/input.xhtml");
/*		WebElement textbox=open.findElement(By.id("j_idt88:name"));
		textbox.sendKeys("Saravana");
		Thread.sleep(1000);
		
		//Append Method
		WebElement append=open.findElement(By.id("j_idt88:j_idt91"));
		append.sendKeys(" Welcome You");
		Thread.sleep(1000);
		
		//is Disabled
		WebElement disable=open.findElement(By.id("j_idt88:j_idt93"));
		System.out.println(disable.isEnabled());
		Thread.sleep(1000);
		
//		To Clear
		WebElement clears=open.findElement(By.id("j_idt88:j_idt95"));
		clears.clear();
		Thread.sleep(1000);
		
//		To Retrive 
		WebElement retrive=open.findElement(By.id("j_idt88:j_idt97"));
		String a=retrive.getAttribute("value");
		System.out.println(a);
		Thread.sleep(1000);*/
		
//		nexttextbox 
		WebElement nexttext=open.findElement(By.id("j_idt88:j_idt99"));
		nexttext.sendKeys("saravan@gmail.com",Keys.TAB);
		Thread.sleep(1000);
		
		

		open.close();
		
	}

}
