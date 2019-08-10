package org.cts.testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Neww {
	static WebDriver driver;
	static Actions acc;
@BeforeClass
public static void launchBrowser() {
	// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\babu\\eclipse-workspace\\Day\\driver\\chromedriver.exe");
 driver =new ChromeDriver();
driver.get(" https://www.facebook.com/");
}



@Before
public void startTime() {
	// TODO Auto-generated method stub
Date d1=new Date();
System.out.println(d1);


}


@Test
public void logic() {
	// TODO Auto-generated method stub
String title = driver.getTitle();
System.out.println(title);

}
@Test
public void logic1() throws InterruptedException  {
	WebElement src = driver.findElement(By.xpath("//input[@id='pass'] "));
	WebElement desc= driver.findElement(By.xpath(" //a[text()='Account security']"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("arguments[0].scrollIntoView(true)", desc);
Thread.sleep(4000);
	js.executeScript("arguments[0].scrollIntoView(false)",src);
	 
	
	}
@After
public void endTime() {
	// TODO Auto-generated method stub
Date d2=new Date();
System.out.println(d2);
}
 //@AfterClass
 //public static void quit() {
	// driver.quit();
 //}



}


