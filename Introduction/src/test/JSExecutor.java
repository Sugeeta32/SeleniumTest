package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		driver.findElement(By.id("headerSearch")).sendKeys("Ref");
		driver.findElement(By.id("headerSearch")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("headerSearch")).sendKeys(Keys.DOWN);
		//driver.findElement(By.id("headerSearch")).sendKeys(Keys.DOWN);
		//driver.findElement(By.id("headerSearch")).sendKeys(Keys.DOWN);
		//driver.findElement(By.id("headerSearch")).sendKeys(Keys.DOWN);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String text= "return document.getElementById(\"headerSearch\").value;";
	String abc=(String) js.executeScript(text);
	System.out.println(abc);
	}

}
