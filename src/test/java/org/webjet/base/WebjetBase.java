package org.webjet.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebjetBase 
{
public static WebDriver driver;
public static void browserLaunch(String key, String value) {
	// TODO Auto-generated method stub
	System.setProperty(key, value);
	driver = new ChromeDriver();
}
public static void loadUrl(String url) {
	// TODO Auto-generated method stub
	driver.get(url);
}
public static void maximize() {
	// TODO Auto-generated method stub
	driver.manage().window().maximize();
}

public static void waitTime() {
	// TODO Auto-generated method stub
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
}
public static void departure(WebElement element, String d) {
	// TODO Auto-generated method stub
	element.sendKeys(d);
}
public static void flights() throws InterruptedException {
	// TODO Auto-generated method stub
WebElement flight = driver.findElement(By.xpath("//span[@class='wj-icon wj-flight']"));
Actions a = new Actions(driver);
a.moveToElement(flight).perform();
Thread.sleep(2000);
WebElement country = driver.findElement(By.xpath("(//a[text()='Melbourne'])[2]"));
country.click();
}
public static void click(WebElement element) {
	// TODO Auto-generated method stub
	element.click();
}
}
