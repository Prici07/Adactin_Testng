package com.spd;

import org.openqa.selenium.WebDriver;
import com.pom.Search_Hotel;
import com.pom.Sign_In_Page;

public class Page_Obj_Manager {
	

public WebDriver driver;
	
	  private Sign_In_Page sn;  //null
	  private Search_Hotel sh; //null
	  

	public Page_Obj_Manager(WebDriver driver2) {
		this.driver=driver2;
	}

	public Sign_In_Page get_Sign() {
		if(sn==null) {
			sn=new Sign_In_Page(driver);
		

	}
		return sn ;
	}
	
	public Search_Hotel get_Search() {
		if(sh==null) {
			sh=new Search_Hotel(driver);
			
}
		return sh;
}}