package test;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerSection= driver.findElement(By.id("gf-BIG"));
		System.out.println(footerSection.findElements(By.tagName("a")).size());
		WebElement footerCol=footerSection.findElement(By.xpath("//table/tbody/tr/td/ul[1]"));
		List<WebElement> colItems=footerCol.findElements(By.tagName("a"));
		System.out.println(colItems.size());
		for(int i =1; i<colItems.size();i++) {
			
			String clickOnLink=Keys.chord(Keys.CONTROL,Keys.ENTER);
			colItems.get(i).sendKeys(clickOnLink);
			//get the title of each page using getWindowHandles
			
			
			
		}
		Set<String>tabs = driver.getWindowHandles();
		Iterator<String>tabIterator = tabs.iterator();
		while(tabIterator.hasNext()) {
			driver.switchTo().window(tabIterator.next());
			System.out.println(driver.getTitle());
		}
		
	}

}
