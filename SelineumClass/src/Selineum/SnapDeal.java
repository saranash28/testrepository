package Selineum;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		//driver.get("https://www.snapdeal.com/product/nbox-black-artificial-leather-plain/6917529674821812302#bcrumbSearch:iPhone%207");
		driver.getWindowHandle();
		 WebElement searchBox = driver.findElement(By.id("inputValEnter"));
	        searchBox.sendKeys("iPhone 7");
	       driver.findElement(By.
	    		   xpath("//*[@id=\'sdHeader\']/div[4]/div[2]/div/div[2]/button/span")).click();	      
	      
	       Thread.sleep(5000);
	       WebElement clicking = driver.findElement(By.xpath("//*[@id=\'658088554127\']/div[3]/div[1]/a"));
	       //WebElement clicking = driver.findElement(By.xpath("//*[@id=\'6917529674821812302\']/div[3]/div[1]/a"));
	       clicking.click();
	       
	       
	       Set<String> handles =driver.getWindowHandles();
	       for (String newwindow : handles) {
			driver.switchTo().window(newwindow);
		}
	       WebElement addToCartButton = driver.findElement(By.xpath("//*[@id=\'add-cart-button-id\']"));
	       addToCartButton.click();
	       
         
	       
	       WebElement price = driver.findElement(By.xpath("//*[@id=\'cartProductContainer\']/div/div[2]/div[2]/div/div[1]/div[2]/span"));
	       String a=price.getText();
	       System.out.println(a);
	       driver.quit();

	}

}
