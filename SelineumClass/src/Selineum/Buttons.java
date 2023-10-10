package Selineum;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\\\eclipse\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver open = new ChromeDriver();
		open.get("https://www.leafground.com/button.xhtml");
		WebElement m = open.findElement(By.id("j_idt88:j_idt90"));
		m.click();
		Thread.sleep(2000);
		if (open.getTitle().equalsIgnoreCase("Dashboard"))
			System.out.println("Confirmed");
		open.navigate().back();
		Thread.sleep(2000);
		WebElement m1 = open.findElement(By.id("j_idt88:j_idt92"));
		System.out.println(m1.isEnabled());

		WebElement m2 = open.findElement(By.id("j_idt88:j_idt94"));
		Point xyvalue = m2.getLocation();
		int i = xyvalue.getX();
		int j = xyvalue.getY();
		System.out.println("The X Position is: " + i);
		System.out.println("The Y Position is: " + j);

		WebElement m3 = open.findElement(By.id("j_idt88:j_idt96"));
		System.out.println(m3.getCssValue("background"));

		WebElement m4 = open.findElement(By.xpath("//*[@id='j_idt88:j_idt98']"));
		int h = m4.getSize().getHeight();
		int w = m4.getSize().getWidth();
		System.out.println("Height of Box is: " + h);
		System.out.println("Width of Box is: " + w);
		open.close();

	}

}
