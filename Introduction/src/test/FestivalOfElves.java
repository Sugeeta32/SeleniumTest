package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FestivalOfElves {

	public static void main(String[] args) {
		
		// invoke the firefox driver i.e gecko driver
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");

		// create driver object for firefox
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		driver.get("https://festivalofelves.herokuapp.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.name("loginEmail")).sendKeys("raj@example.com");

		driver.findElement(By.name("password")).sendKeys("1234");
		driver.findElement(By.cssSelector("button.btn")).click();
		driver.findElement(By.cssSelector("a[role*='button']")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector("a[href='/logout']")).click();
		driver.findElement(By.xpath("//a[@href='/register']")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("su@gmail.com");
//generating my own xpath
//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1234");

//generating xpath using parent child relationship
		driver.findElement(By.xpath("//form[@action='/registerUser']/div[2]/input")).sendKeys("1234");
		driver.findElement(By.cssSelector("button[type='submit']")).click();

	}

}
