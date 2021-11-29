package org.baseclass.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Base_Class {

public static WebDriver driver;
	
	public static WebDriver getBrowser(String type) {

   if (type.equalsIgnoreCase("chrome")) {
	System.setProperty("webdriver.chrome.driver",
		System.getProperty("user.dir")+"//newdriver//chromedriver.exe");
	 driver=new ChromeDriver();
	
} else if(type.equalsIgnoreCase("firefox")){
	System.setProperty("webdriver.gecko.driver",
			System.getProperty("user.dir")+"//newdriver//gecko.exe");
	driver=new FirefoxDriver();
}
   driver.manage().window().maximize();
   
   return driver;
	}
	
	public static void clickOnElement(WebElement element) {
		try {
		element.click();
		}catch(Exception e) {
			   e.printStackTrace();
	
	}}
	
	public static void inputValueElement(WebElement element,String value) {
		try {
		element.sendKeys(value);
		}catch(Exception e) {
			   e.printStackTrace();

	}}
	public static void getUrl(String url) {
		try {
		driver.get(url);
	}catch(Exception e) {
		   e.printStackTrace();

	}}
	
	 public static void dropDown(String type,WebElement ele, String value) {
		
		 Select s=new Select(ele);
		if (type.equalsIgnoreCase("ByValue")) {
			s.selectByValue(value);
		
		} else if (type.equalsIgnoreCase("ByVisibleText")){
			s.selectByVisibleText(value);
			
		}else if(type.equalsIgnoreCase("ByIndex")) {
			int data = Integer.parseInt(value);
			s.selectByIndex(data);
		
		}}
	 
	 public static void thread(int millis) throws InterruptedException {
		   try {
		Thread.sleep(millis);
		   } catch(Exception e) {
		   e.printStackTrace();
	   }}
	 public static void explicitWait(WebElement ele,int a) {
		   WebDriverWait wait=new WebDriverWait(driver,a);
		   wait.until(ExpectedConditions.elementToBeClickable(ele));
	    	
	 }
	 public static void implicitlyWait(long time,TimeUnit unit ) {
		 driver.manage().timeouts().implicitlyWait(time,TimeUnit.SECONDS);
	 }

	 public static void dropDownbyvalue(WebElement ele,String value) {
		 Select s=new Select(ele);
		 s.selectByValue(value);

	}
	 public static void dropDownByVisibleText(WebElement ele, String value) {
		 Select s=new Select(ele);
		 s.selectByVisibleText(value);
	 
}  }