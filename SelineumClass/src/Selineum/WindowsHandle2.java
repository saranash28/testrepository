package Selineum;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandle2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("https://www.leafground.com/window.xhtml");
		String oldWindow = driver.getWindowHandle();
		WebElement window = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt91\']/span"));
		window.click();
		Set<String>newWindow = driver.getWindowHandles();
		int numofwindow = driver.getWindowHandles().size();
		System.out.println(numofwindow);
		driver.close();
		driver.quit();
	}

}
