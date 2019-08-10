package org.cts.testing;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\babu\\eclipse-workspace\\Day\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.flipkart.com/");
		 WebElement search = driver.findElement(By.xpath("//input[@id='inputValEnter']"));
		 search.sendKeys("iphone x mobile");
		 WebElement click = driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
		 click.click();
		 WebElement item = driver.findElement(By.xpath("//p[text()='Apple iPhone 7 ( 32GB , 2 GB ) Gold']"));
		 item.click();
		 String par = driver.getWindowHandle();
		 Set<String> child = driver.getWindowHandles();
		 for(String X:child) {
		 if(!par.equals(X)) {
		 driver.switchTo().window(X);
		 WebElement cart = driver.findElement(By.xpath("//div[@id='add-cart-button-id']"));
		 cart.click();
		 WebElement price = driver.findElement(By.xpath(" (//span[text()='Rs. 41800'])[1]"));
		 String text = price.getText();
		 System.out.println(text);
	}

}
}}