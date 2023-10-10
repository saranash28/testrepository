package Selineum;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class SnapDeal2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		// driver.get("https://www.snapdeal.com/product/nbox-black-artificial-leather-plain/6917529674821812302#bcrumbSearch:iPhone%207");
		driver.getWindowHandle();
		WebElement searchBox = driver.findElement(By.id("inputValEnter"));
		searchBox.sendKeys("Hand Sanitizer");
		driver.findElement(By.xpath("//*[@id=\'sdHeader\']/div[4]/div[2]/div/div[2]/button/span")).click();

		Thread.sleep(5000);
		WebElement clicking = driver.findElement(By.xpath("//*[@id=\"680568014303\"]/div[2]/a"));

		clicking.click();

		Set<String> handles = driver.getWindowHandles();
		for (String newwindow : handles) {
			driver.switchTo().window(newwindow);
		}
		WebElement addToCartButton = driver.findElement(By.xpath("//*[@id=\'add-cart-button-id\']"));
		addToCartButton.click();

		WebElement price = driver
				.findElement(By.xpath("//*[@id=\'cartProductContainer\']/div/div[2]/div[2]/div/div[1]/div[2]/span"));
		String a = price.getText();
		System.out.println(a);

		TakesScreenshot ss = (TakesScreenshot) driver;
		File from = ss.getScreenshotAs(OutputType.FILE);
		File to = new File("C:\\Users\\Saravana\\OneDrive\\Desktop\\Screenshot\\s1.png");
		Files.copy(from, to);
		driver.close();
		Thread.sleep(3000);
		driver.quit();
	}

}
