package org.practice.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/drag.xhtml");
		Thread.sleep(3000);

		Actions a = new Actions(driver);

		WebElement drag = driver.findElement(By.xpath("//*[@id='form:conpnl']"));
		a.dragAndDropBy(drag, 300, 0).build().perform();

		WebElement dragDrop = driver.findElement(By.xpath("//*[@id=\'form:drag_content\']"));
		WebElement dragDropto = driver.findElement(By.xpath("//*[@id=\'form:drop_content\']"));
		a.dragAndDrop(dragDrop, dragDropto).build().perform();
		
		WebElement slide = driver.findElement(By.xpath("//*[@id=\"form:j_idt125\"]/span[1]"));
		a.dragAndDropBy(slide, 300, 0).build().perform();

		driver.navigate().to("https://www.leafground.com/menu.xhtml");
		WebElement menu = driver.findElement(By.xpath("//*[@id=\'j_idt87:j_idt89\']/ul/li[1]/a/span[3]"));
		a.click(menu).perform();
		a.contextClick().perform();

	}

}
