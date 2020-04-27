package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//visit the site
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22782/nz-vs-ind-2nd-test-india-tour-of-new-zealand-2020");
		//define the scope
		WebElement tableScope= driver.findElement(By.cssSelector("div [class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		
		//as we have to capture the third column by defining div:nth-child(3) for the class cb-col cb-col-100 cb-scrd-itms which is the class for each row in the above scope 
	List<WebElement> count= tableScope.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")); 
	//int count = tableScope.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
	
	for(int i=0;i<count.size()-2; i++)
	//for(int i=0;i<count-2; i++)
	{
		System.out.println(tableScope.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText()
	);
	
	}
	}

}
