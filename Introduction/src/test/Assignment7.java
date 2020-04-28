package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement table = driver.findElement(By.id("product"));
		//List<WebElement> rowCount=table.findElements(By.tagName("tr"));	
		
		int rowCount=table.findElements(By.tagName("tr")).size();
		System.out.println(rowCount);
		
		int rowCol=table.findElements(By.tagName("th")).size();
		System.out.println(rowCol);
		
		List<WebElement>thirdRow = table.findElements(By.xpath("//tr[3]//td"));
		for (int i=0; i<thirdRow.size(); i++) {
			System.out.println(thirdRow.get(i).getText());
			

		}
		
	}

}
