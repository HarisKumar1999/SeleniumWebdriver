package Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.com/");
		Thread.sleep(5);
//driver.findElement(By.linkText("BUY NOW")).click();
		//driver.findElement(By.partialLinkText("BU")).click();
		//driver.findElement(By.cssSelector("div#date-box")).click();
		//driver.findElement(By.cssSelector("input.rdc-db")).click();
		driver.findElement(By.cssSelector("input[class='rdc-db']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(null)));
		
				
		
}

}
