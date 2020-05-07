package test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[@href='/windows']")).click();
		driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
        System.out.println(driver.getTitle());
        
        Set <String> windowid = driver.getWindowHandles();
        Iterator<String> iterator= windowid.iterator();
        String parentid = iterator.next();
        String childid = iterator.next();
        driver.switchTo().window(childid);
        //System.out.println(driver.getTitle());
        System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText());
        driver.switchTo().window(parentid);
        System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'Opening a new window')]")).getText());
        
      
        
	}

}
