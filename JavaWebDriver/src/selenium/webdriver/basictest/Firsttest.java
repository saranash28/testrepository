package selenium.webdriver.basictest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firsttest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.name("email")).sendKeys("saravanaashokan");
		WebElement username=driver.findElement(By.name("email"));
		username.sendKeys("saravanaashokan");
		driver.findElement(By.name("pass")).sendKeys("kndkkajdf");
		driver.findElement(By.name("login")).click();
		driver.close();
	}

}