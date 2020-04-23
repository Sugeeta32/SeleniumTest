package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		Thread.sleep(2000);
		driver.findElement(By.id("fromCity")).click();

		WebElement source = driver.findElement(By.xpath("//input[@placeholder='From']"));
		Thread.sleep(1000);
		source.sendKeys("DEL");
		Thread.sleep(1000);
		source.sendKeys(Keys.ARROW_DOWN);
		source.sendKeys(Keys.ENTER);
		
		//driver.findElement(By.id("toCity")).click();
		
		Thread.sleep(1000);
		WebElement dest = driver.findElement(By.xpath("//input[@placeholder='To']"));
//		Thread.sleep(1000);
//		dest.click();
		Thread.sleep(2000L);
		dest.sendKeys("KOLK");
		Thread.sleep(1000);
		dest.sendKeys(Keys.ARROW_DOWN);
		dest.sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//div[contains(@class,'fsw_inputBox dates inactiveWidget')]")).click();
		Thread.sleep(2000L);
		driver.findElement(By.cssSelector(".DayPicker-Day.DayPicker-Day--today")).click();
		if(driver.findElement(By.cssSelector("div.fsw_inputBox.dates.reDates.inactiveWidget")).getAttribute("class").contains("")) 
		{
			System.out.println("its disabled");
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		driver.findElement(By.xpath("//div[contains(@class,'fsw_inputBox flightTravllers inactiveWidget')]")).click();
		driver.findElement(By.xpath("//div[@class='appendBottom20'] //li[@data-cy='adults-4']")).click();
		driver.findElement(By.xpath("//div[@class='appendBottom20'] //li[@data-cy='children-2']")).click();
		driver.findElement(By.xpath("//div[@class='appendBottom20'] //li[@data-cy='infants-1']")).click();
		driver.findElement(By.xpath("//div[@class='appendBottom20'] //li[@data-cy='travelClass-1']")).click();
		driver.findElement(By.cssSelector(".primaryBtn.btnApply.pushRight")).click();
		driver.findElement(By.cssSelector(".widgetSearchBtn")).click();
	}

}
