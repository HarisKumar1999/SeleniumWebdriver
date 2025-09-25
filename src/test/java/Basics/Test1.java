package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.capgemini.com/");
		Thread.sleep(5);
		String title = driver.getTitle();
		if(title.equals("Capgemini - Get The Future You Want")) {
			System.out.println("Test is passed");
		}
		else {
			System.out.println("Test is failed");
		}
		driver.quit();
	}

}
