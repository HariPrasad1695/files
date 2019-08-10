package org.cts.testing;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium {
	static WebDriver driver;
	static Actions acc;
	
@BeforeClass
	public static void launchBrowser() {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\babu\\eclipse-workspace\\Day\\driver\\chromedriver.exe ");
	 driver=new ChromeDriver();
	driver.get("https://www.snapdeal.com/ ");
	
	}

	
	@Test
	public void logic() {
		WebElement d = driver.findElement(By.xpath(" //input[@id='inputValEnter']" ));
d.sendKeys(" iphone x");
	}
	@Test
	public void logic1() {
	WebElement s = driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey'] "));
		s.click();}
	
		@Test
		public void logic3() throws InterruptedException {
		
		  java.util.List<org.openqa.selenium.WebElement> li = driver.findElements(By.xpath(" //p[@class='product-title']"));
		
		int x=li.size();
		System.out.println(x);
		Thread.sleep(2000);
		for(int i=0;i<=li.size();i++) {
			
		WebElement j = li.get(i);
		String text = j.getText();
		System.out.println(text);
		}
		}
		@AfterClass
	
	public static void endProject() {
		// TODO Auto-generated method stub
driver.quit();
	}}
	



