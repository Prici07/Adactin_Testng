package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config_Reader {
public static Properties p;
	
	public Config_Reader() throws IOException {
		
		File f = new File("C:\\Users\\Daisy Rani\\eclipse-workspace\\Adactin_Maven\\src\\main\\java\\config.properties");
		
		FileInputStream fs= new FileInputStream(f);
		
		p=new Properties();
		 
		p.load(fs);
		
	}
	public String getUrl() {
		String url = p.getProperty("url");
		return url;

	}
	
	public String getName() {
		String name = p.getProperty("name");
		return name;	

	}
	public String getPassword() {
		String password = p.getProperty("password");
		return password;

	}
	
	public String getLoc() {
		String loc = p.getProperty("loc");
		return loc;

	}
	
	public String getHotel() {
		String hotel = p.getProperty("hotel");
		return hotel;
	}
	public String getRoomtype() {
		String Roomtype = p.getProperty("Roomtype");
		return Roomtype;

	}
	public String getnoofroom() {
		String noofroom = p.getProperty("noofroom");
		return noofroom;

	}
	public String getCheckout() {
		String checkout = p.getProperty("checkout");
		return checkout;

	}
	public String getAdultroom() {
		String adultroom = p.getProperty("adultroom");
		return adultroom;
	}
	public String getChildroom() {
		String childroom = p.getProperty("childroom");
		return childroom;
	}
	public String getFirstname() {
		String first_name = p.getProperty("first_name");
		return first_name;
	}
	public String getLastname() {
		String Last_name= p.getProperty("Last_name");
		return Last_name;
	
	}
	public String getAddress() {
		String Address= p.getProperty("Address");
		return Address;
	}
	public String getCcnum() {
		String Cc_num= p.getProperty("Cc_num");
		return Cc_num;
	}
	public String getCredittype() {
		String Credittype= p.getProperty("Credittype");
		return Credittype;
	}
	public String getMonth() {
		String month= p.getProperty("month");
		return month; 
   }
	public String getyear() {
		String year= p.getProperty("year");
		return year;
	}
	public String getCcv() {
		String Ccv= p.getProperty("Ccv");
		return Ccv;
	
	}}
