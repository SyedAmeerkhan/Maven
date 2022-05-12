package org.test;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {

System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\syeda\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/");

WebElement textofFacebook = driver.findElement(By.xpath("//h2[contains(text(),'helps')]"));
String text = textofFacebook.getText();
System.out.println(text);


WebElement email = driver.findElement(By.id("email"));
email.sendKeys("syed");

String attribute = email.getAttribute("class");
System.out.println(attribute);
	}
	
}
