package test;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class ClearTrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
//Through this line you are creating an object by the name options of ChromeOptions Class.
		Map<String, Object> prefs = new HashMap<String, Object>();
//Here you have created a new Map object by the name prefs where the Key and Value fields accepts String and Object type of data and casted it to HashMap.

		prefs.put("profile.default_content_setting_values.notifications", 1);
//prefs.put("credentials_enable_service", false);

//prefs.put("profile.password_manager_enabled", false);

//prefs.put("profile.default_content_setting_values.notifications", 2);

//In these three lines you have configured the pref-names within the prefs object.

		// 1-Allow, 2-Block, 0-default

		options.setExperimentalOption("prefs", prefs);

		// Finally in this line you are using the setExperimentalOption method to set
		// these experimental options (ChromeDriver options not yet exposed through the
		// ChromeOptions API) within the options object.
		// Now you can use this options object of ChromeOptions Class to initialize the
		// WebDriver and Web Client as follows :

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.cleartrip.com");
		driver.findElement(By.id("OneWay")).click();
//		driver.findElement(By.id("FromTag")).click();
//		WebElement source = driver.findElement(By.xpath("//input[@id='FromTag']"));
		// Thread.sleep(1000);
		// source.sendKeys("New");
		// Thread.sleep(1000);
		// source.sendKeys(Keys.ARROW_DOWN);
		// Thread.sleep(1000);
		// source.sendKeys(Keys.ENTER);

//		Thread.sleep(1000);
//		WebElement dest = driver.findElement(By.xpath("//input[@id='ToTag']"));
//		Thread.sleep(1000);
//		dest.click();
		// Thread.sleep(2000L);
//		dest.sendKeys("KOLK");
//		Thread.sleep(2000);
//		dest.sendKeys(Keys.ARROW_DOWN);
//		dest.sendKeys(Keys.ENTER);
//		Thread.sleep(1000);
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.cssSelector(".ui-datepicker-days-cell-over.undefined.selected")).click();
		Select ad = new Select(driver.findElement(By.id("Adults")));
		ad.selectByValue("3");
		Select ch = new Select(driver.findElement(By.id("Childrens")));
		ch.selectByValue("1");
		driver.findElement(By.id("MoreOptionsDiv")).click();
		// Thread.sleep(1000);
		// WebElement airline =driver.findElement(By.id("AirlineAutoComplete"));
		driver.findElement(By.name("airline")).sendKeys("Indigo");
//		airline.sendKeys("Indigo");
//		airline.sendKeys(Keys.ARROW_DOWN);
		// airline.sendKeys(Keys.ENTER);
		driver.findElement(By.id("SearchBtn")).click();
		// System.out.println(driver.switchTo().alert().getText());
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());

	}

}
