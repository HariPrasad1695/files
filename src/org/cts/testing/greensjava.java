package org.cts.testing;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class greensjava {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\babu\\eclipse-workspace\\Day\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/ ");

WebElement day = driver.findElement(By.id("month"));
Select a=new Select(day);
boolean options = a.isMultiple();
System.out.println(options);
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

List<WebElement> opt2 = a.getOptions();
for(int i=0;i<opt2.size();i++) {
	WebElement text = opt2.get(i);
	String text2 = text.getText();
	System.out.println(text2);
}

	a.selectByVisibleText( "May");

		
	}
	
	

}
