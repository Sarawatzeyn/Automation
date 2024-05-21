package com.facebookLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DirectLocators {
	WebDriver driver;
	@BeforeTest
	public void openFaceBook() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
	}
@Test
public void idLocatorTest() {
	driver.findElement(By.id("email")).sendKeys("chill");
}
@Test
public void nameLocatorTest() {
	driver.findElement(By.name("pass")).sendKeys("drill");
}
@Test
public void linkTextLocatorTest() {
	driver.findElement(By.linkText("Forgot password?")).click();
}
@Test
public void partialLinkTextLocatorTest() {
	driver.navigate().back();
	driver.findElement(By.partialLinkText("Forgot")).click();
}
}
