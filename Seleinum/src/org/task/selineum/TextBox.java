package org.task.selineum;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.google.common.io.Files;

public class TextBox {
	static WebDriver driver;

	public static void basic() {
		System.setProperty("webdriver.firefox.driver", "D:\\eclipse\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://demoqa.com/elements");
		driver.manage().window().maximize();
	}

	public static void textbox() throws InterruptedException, IOException {
		WebElement textboxes = driver.findElement(By.xpath("//*[@id='item-0']"));
		File text1 = textboxes.getScreenshotAs(OutputType.FILE);
		File to = new File("C:\\Users\\Saravana\\OneDrive\\Desktop\\Screenshot\\ss1.png");
		Files.copy(text1, to);
		textboxes.click();
		WebElement username = driver.findElement(By.xpath("//*[@id='userName']"));
		username.sendKeys("Saravana");
		File text2 = username.getScreenshotAs(OutputType.FILE);
		File to2 = new File("C:\\Users\\Saravana\\OneDrive\\Desktop\\Screenshot\\ss2.png");
		Files.copy(text2, to2);
		WebElement email = driver.findElement(By.xpath("//*[@id='userEmail']"));
		email.sendKeys("saravana@thiinfotech.com");
		File text3 = email.getScreenshotAs(OutputType.FILE);
		File to3 = new File("C:\\Users\\Saravana\\OneDrive\\Desktop\\Screenshot\\ss3.png");
		Files.copy(text3, to3);
		WebElement curadd = driver.findElement(By.xpath("//*[@id='currentAddress']"));
		curadd.sendKeys("Urappakkam, Chennai");
		File text4 = curadd.getScreenshotAs(OutputType.FILE);
		File to4 = new File("C:\\Users\\Saravana\\OneDrive\\Desktop\\Screenshot\\ss4.png");
		Files.copy(text4, to4);
		WebElement peradd = driver.findElement(By.xpath("//*[@id='permanentAddress']"));
		peradd.sendKeys("Urappakkam, Chennai");
		File text5 = peradd.getScreenshotAs(OutputType.FILE);
		File to5 = new File("C:\\Users\\Saravana\\OneDrive\\Desktop\\Screenshot\\ss5.png");
		Files.copy(text5, to5);
		WebElement submit = driver.findElement(By.xpath("//*[@id='submit']"));
		Thread.sleep(15000);
		submit.click();
		File text6 = submit.getScreenshotAs(OutputType.FILE);
		File to6 = new File("C:\\Users\\Saravana\\OneDrive\\Desktop\\Screenshot\\ss6.png");
		Files.copy(text6, to6);
		WebElement gettext = driver.findElement(By.xpath("//*[@class='border col-md-12 col-sm-12']"));
		String text = gettext.getText();
		System.out.println(text);
		File text7 = gettext.getScreenshotAs(OutputType.FILE);
		File to7 = new File("C:\\Users\\Saravana\\OneDrive\\Desktop\\Screenshot\\ss7.png");
		Files.copy(text7, to7);

	}

	public static void sshot() throws IOException {
		File from = ((FirefoxDriver) driver).getFullPageScreenshotAs(OutputType.FILE);
		File to = new File("C:\\Users\\Saravana\\OneDrive\\Desktop\\Screenshot\\ss.png");
		Files.copy(from, to);
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		basic();
		textbox();
		sshot();
		driver.close();

	}

}
