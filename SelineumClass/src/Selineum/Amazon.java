package Selineum;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("iPhone 14");
		searchBox.submit();
		Thread.sleep(2000);
		driver.getWindowHandle();
		WebElement firstProduct = driver.findElement(By.xpath(
				"//*[@id=\'search\']/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
		firstProduct.click();

		Set<String> handles = driver.getWindowHandles();
		for (String newwindow : handles) {
			driver.switchTo().window(newwindow);
		}
		Thread.sleep(5000);
		WebElement pricetag = driver.findElement(
				By.xpath("//*[@id=\"tp_price_block_total_price_ww\"]/span[2]/span[2]"));
		//String a=pricetag.getAttribute("value");
		String a = pricetag.getText();
		System.out.println("Price of IPhone 14 is " + a);
		driver.quit();
	}
}
