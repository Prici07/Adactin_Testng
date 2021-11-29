package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	public WebDriver driver;
	
	@FindBy(xpath="//select[@name=\"location\"]")
	private WebElement loc;
	
	@FindBy(xpath="//select[@name='hotels']")
	private WebElement hotels;
	
	@FindBy(xpath=("//select[@name=\"room_type\"]"))
	private WebElement roomtype;
	
	@FindBy(xpath=("//select[@name=\"room_nos\"]"))
	private WebElement noofrooms;
	
	@FindBy(xpath=("//input[@name=\"datepick_out\"]"))
	private WebElement checkout;
	
	@FindBy(id="adult_room")
	private WebElement adultroom;
	
	@FindBy(id="child_room")
	private WebElement childroom;
	
	@FindBy(xpath=("//input[@type=\"submit\"]"))
	private WebElement submit;
	
	@FindBy(id="radiobutton_0")
	private WebElement radio_btn;
	
	@FindBy(id="continue")
	private WebElement con;
	
	@FindBy(xpath=("//input[@name=\"first_name\"]"))
	private WebElement first_name ;
	
	@FindBy(xpath=("//input[@name=\"last_name\"]"))
	private WebElement last_name ;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement cc_num;
	
	@FindBy(xpath=("//select[@name=\"cc_type\"]"))
	private WebElement credittype;
	
	@FindBy(id="cc_exp_month")
	private WebElement month;
	
	@FindBy(id="cc_exp_year")
	private WebElement year;
	
	@FindBy(xpath=("//input[@name=\"cc_cvv\"]"))
	private WebElement ccv ;
	
	@FindBy(xpath=("//input[@type=\"button\"][1]"))
	private WebElement booknow_btn ;
	
	@FindBy(xpath=("//*[@id=\"my_itinerary\"]"))
	private WebElement itinerary ;
	
	public Search_Hotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLoc() {
		return loc;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getNoofrooms() {
		return noofrooms;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getRadio_btn() {
		return radio_btn;
	}

	public WebElement getCon() {
		return con;
	}

	public WebElement getFirst_name() {
		return first_name;
	}

	public WebElement getLast_name() {
		return last_name;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCc_num() {
		return cc_num;
	}

	public WebElement getCredittype() {
		return credittype;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCcv() {
		return ccv;
	}

	public WebElement getBooknow_btn() {
		return booknow_btn;
	}

	public WebElement getItinerary() {
		return itinerary;
	}

	
	
	
    
   
    
    
    
    
    
    
   
    
    
  
  
    
    
	
	
    
   
	
   
    
   
    
  
   
   
  
    
    
   
    

}
