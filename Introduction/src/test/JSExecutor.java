package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		driver.findElement(By.id("headerSearch")).sendKeys("Ref");
		Thread.sleep(2000);
		
		driver.findElement(By.id("headerSearch")).sendKeys(Keys.DOWN);
		 //System.out.println("print1 "+driver.findElement(By.id("headerSearch")).getText());
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String text= "return document.getElementById(\"headerSearch\").value;";
		String abc=(String) js.executeScript(text);
		//System.out.println("print abc= " + abc);
		while(!abc.equals("refrigerator small")) {
			//System.out.println("inside while loop text= " + text);
			driver.findElement(By.id("headerSearch")).sendKeys(Keys.DOWN);
			abc=(String) js.executeScript(text);
			System.out.println("inside while loop " + abc);
		}
	}

}
