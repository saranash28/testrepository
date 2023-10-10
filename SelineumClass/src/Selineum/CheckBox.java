package Selineum;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("https://www.leafground.com/window.xhtml");
		String oldWindow = driver.getWindowHandle();
		WebElement window = driver.findElement(By.xpath("//*[@id=\'j_idt88:new\']/span"));
		window.click();
		Set<String>newWindow = driver.getWindowHandles();
		for (String newwindows : newWindow) {
			driver.switchTo().window(newwindows);
		}
		String a=driver.getTitle();
		if(driver.getTitle().equalsIgnoreCase(a)) {
			System.out.println("The New window name is "+a+" Which we wanted");
		}
		driver.close();
		Thread.sleep(3000);
		driver.quit();
	}

}
