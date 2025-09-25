package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		List<WebElement> checkboxes = driver.findElements(By.xpath("//*[@class=\"form-check-input\" and @type='checkbox']"));
		//for (int i=0;i<checkboxes.size();i++){
			//checkboxes.get(i).click();
		//7-3
		for(int i=4;i<checkboxes.size();i++) {
			checkboxes.get(i).click();
		}
		
			
		}
		

	}

