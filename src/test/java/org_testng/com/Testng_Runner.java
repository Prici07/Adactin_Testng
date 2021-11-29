package org_testng.com;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.baseclass.com.Base_Class;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Ignore;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.helper.File_Reader;
import com.spd.Page_Obj_Manager;

public class Testng_Runner extends Base_Class {
	public static WebDriver driver = getBrowser("chrome");
	public static Page_Obj_Manager pom = new Page_Obj_Manager(driver);

	// public static void main(String[] args) throws Throwable {

	@BeforeSuite
	private void broswer_Launch() throws Throwable {
		String url = File_Reader.getInstanceFRM().getInstanceCR().getUrl();
		getUrl(url);
		System.out.println("url");
	}

	  @Test
	  @Parameters("name")
	  private void login_1(@Optional("pricilla")String name) throws Throwable {
	  //String name = File_Reader.getInstanceFRM().getInstanceCR().getName();
	  inputValueElement(pom.get_Sign().getUsername(),name);
	  System.out.println("username");}
		
		@Test(priority=1)
		@Parameters("password")
		private void login_Password() throws Throwable {
		String password = File_Reader.getInstanceFRM().getInstanceCR().getPassword();
		inputValueElement(pom.get_Sign().getPassword(), password);
		System.out.println("password");}
		
	   @Test(priority=2)
        private void login_Clickbtn() {
		clickOnElement(pom.get_Sign().getLogin());
		System.out.println("login_btn");}
	
    @Test(priority=3)
	private void search_Hotel() throws IOException, Throwable {
		String loc = File_Reader.getInstanceFRM().getInstanceCR().getLoc();
		dropDownbyvalue(pom.get_Search().getLoc(), loc);
		System.out.println("loc");

		String hotel = File_Reader.getInstanceFRM().getInstanceCR().getHotel();
		dropDownbyvalue(pom.get_Search().getHotels(), hotel);
		System.out.println("hotel");

		String roomtype = File_Reader.getInstanceFRM().getInstanceCR().getRoomtype();
		dropDownbyvalue(pom.get_Search().getRoomtype(), roomtype);
		System.out.println("roomtype");

		thread(300);
		String getnoofroom = File_Reader.getInstanceFRM().getInstanceCR().getnoofroom();
		dropDownByVisibleText(pom.get_Search().getNoofrooms(), getnoofroom);
		System.out.println("noofroom");}
    
		@Ignore
		@Test
		private void checkout_Date() throws Throwable {
		String checkout = File_Reader.getInstanceFRM().getInstanceCR().getCheckout();
		inputValueElement(pom.get_Search().getCheckout(), checkout);
		System.out.println("checkout");}
		
		@Test(priority=4)
		private void ad() throws Throwable {
		String adultroom = File_Reader.getInstanceFRM().getInstanceCR().getAdultroom();
		dropDownByVisibleText(pom.get_Search().getAdultroom(), adultroom);
		System.out.println("adultroom");

		String childroom = File_Reader.getInstanceFRM().getInstanceCR().getChildroom();
		dropDownByVisibleText(pom.get_Search().getChildroom(), childroom);
		System.out.println("childroom");

		clickOnElement(pom.get_Search().getSubmit());
		System.out.println("Submit");
	}
    @Test(priority=5)
	private void search_Hotel_1() {
		clickOnElement(pom.get_Search().getRadio_btn());
		clickOnElement(pom.get_Search().getCon());
	}
    @Test(priority=6)
	private void book_Hotel() throws Throwable {
		String firstname = File_Reader.getInstanceFRM().getInstanceCR().getFirstname();
		inputValueElement(pom.get_Search().getFirst_name(), firstname);
		String lastname = File_Reader.getInstanceFRM().getInstanceCR().getLastname();
		inputValueElement(pom.get_Search().getLast_name(), lastname);
		String address = File_Reader.getInstanceFRM().getInstanceCR().getAddress();
		inputValueElement(pom.get_Search().getAddress(), address);
		String ccnum = File_Reader.getInstanceFRM().getInstanceCR().getCcnum();
		inputValueElement(pom.get_Search().getCc_num(), ccnum);
		String credittype = File_Reader.getInstanceFRM().getInstanceCR().getCredittype();
		dropDownByVisibleText(pom.get_Search().getCredittype(), credittype);

		Thread.sleep(3000);
		implicitlyWait(10, TimeUnit.SECONDS);
		String month = File_Reader.getInstanceFRM().getInstanceCR().getMonth();
		dropDownByVisibleText(pom.get_Search().getMonth(), month);
		String year = File_Reader.getInstanceFRM().getInstanceCR().getyear();
		dropDownByVisibleText(pom.get_Search().getYear(), year);
		String ccv = File_Reader.getInstanceFRM().getInstanceCR().getCcv();
		inputValueElement(pom.get_Search().getCcv(), ccv);
		clickOnElement(pom.get_Search().getBooknow_btn());
		implicitlyWait(20, TimeUnit.SECONDS);}
    
		@AfterSuite
		private void no_Check() {
		clickOnElement(pom.get_Search().getItinerary());

	}

}
