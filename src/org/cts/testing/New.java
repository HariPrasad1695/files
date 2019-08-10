package org.cts.testing;

import java.util.Date;

import javax.xml.stream.events.EndDocument;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class New {
	static WebDriver driver;
@BeforeClass
public void launchBrowser() {
	System.setProperty("webdriver.chrome.driver"," C:\\Users\\babu\\eclipse-workspace\\Day\\driver\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.get(" ");

}
@Before
public void startTime() {
Date d=new Date();
System.out.println(d);

}
@Test
public void logic() {
		String title =driver.getTitle();
		System.out.println(title);
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
}
@Test
public void logic2() {
WebElement src = driver.findElement(By.id(""));
WebElement desc = driver.findElement(By.xpath(" "));
Actions acc=new Actions(driver);
acc.dragAndDrop(src, desc).perform();


}
@After
public void end() {
	// TODO Auto-generated method stub
	Date d1=new Date();
	System.out.println(d1);

}
@AfterClass
public void Quit() {
	// TODO Auto-generated method stub
driver.quit();
}

}
