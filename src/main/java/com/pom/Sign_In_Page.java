package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_In_Page {
	
	public WebDriver driver; 
	
	@FindBy(xpath="//input[@name=\"username\"]")
	private WebElement username;
	
	@FindBy(xpath="//input[@name=\"password\"]")
	private WebElement password;
	
	@FindBy(xpath="//input[@value=\"Login\"]")
	private WebElement login;


	public Sign_In_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);
		
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	
	

}
