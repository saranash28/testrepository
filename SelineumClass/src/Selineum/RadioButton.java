package Selineum;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import com.google.common.io.Files;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();

		WebDriver driver=new ChromeDriver(co);
		
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		WebElement radio = driver.findElement(By.xpath("//*[@id='j_idt87:console1']/tbody/tr/td[2]/div"));
		radio.click();
		WebElement radio1 = driver.findElement(By.xpath("//*[@id=\'j_idt87:city2\']/div/div[2]/div/div[2]/span"));
		radio1.click();
		Thread.sleep(3000);
		if(!radio1.isSelected()) {
			radio1.click();
			
		}
		
		
	}

}
