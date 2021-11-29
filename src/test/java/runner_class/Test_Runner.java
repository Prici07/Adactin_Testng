package runner_class;

import java.util.concurrent.TimeUnit;

import org.baseclass.com.Base_Class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.helper.File_Reader;
import com.pom.Search_Hotel;
import com.pom.Sign_In_Page;
import com.spd.Page_Obj_Manager;

public class Test_Runner extends Base_Class {
	
	public static WebDriver driver=getBrowser("chrome");
	public static Page_Obj_Manager pm= new Page_Obj_Manager(driver);
	public static void main(String[] args) throws Throwable  {
	String url = File_Reader.getInstanceFRM().getInstanceCR().getUrl();
	   getUrl(url);
	   
	  String Name = File_Reader.getInstanceFRM().getInstanceCR().getName();
	  inputValueElement(pm.get_Sign().getUsername(), Name) ;
	 String password = File_Reader.getInstanceFRM().getInstanceCR().getPassword();
      inputValueElement(pm.get_Sign().getPassword() ,password) ;
      clickOnElement(pm.get_Sign().getLogin());
      
      String Loc = File_Reader.getInstanceFRM().getInstanceCR().getLoc();
      dropDown("ByValue",pm.get_Search().getLoc(), Loc);
      thread(300);
      String hotel = File_Reader.getInstanceFRM().getInstanceCR().getHotel();
      //dropDown("ByVisibleText",pm.get_Search().getHotels(),hotel);
      dropDownbyvalue(pm.get_Search().getHotels(),hotel); 
      
      String roomtype = File_Reader.getInstanceFRM().getInstanceCR().getRoomtype();
      dropDown("ByValue",pm.get_Search().getRoomtype(),roomtype);  
      thread(300);
      String noofroom = File_Reader.getInstanceFRM().getInstanceCR().getnoofroom();
      dropDown("ByValue",pm.get_Search().getNoofrooms(), noofroom );
     String checkout = File_Reader.getInstanceFRM().getInstanceCR().getCheckout();
      inputValueElement(pm.get_Search().getCheckout(), checkout) ; 
      String adultroom = File_Reader.getInstanceFRM().getInstanceCR().getAdultroom();
      dropDown("ByVisibleText",pm.get_Search().getAdultroom(), adultroom);
      String childroom = File_Reader.getInstanceFRM().getInstanceCR().getChildroom();
      dropDown("ByIndex",pm.get_Search().getChildroom(), childroom);
      
      clickOnElement(pm.get_Search().getSubmit());
      clickOnElement(pm.get_Search().getRadio_btn());
      clickOnElement(pm.get_Search().getCon());
      String first_name = File_Reader.getInstanceFRM().getInstanceCR().getFirstname();
      inputValueElement(pm.get_Search().getFirst_name(), first_name) ;
      String last_name = File_Reader.getInstanceFRM().getInstanceCR().getLastname();
      inputValueElement(pm.get_Search().getLast_name(), last_name) ;
      String address = File_Reader.getInstanceFRM().getInstanceCR().getAddress();
      inputValueElement(pm.get_Search().getAddress(), address) ;
      String cc_num = File_Reader.getInstanceFRM().getInstanceCR().getCcnum();
      inputValueElement(pm.get_Search().getCc_num(), cc_num) ;
      String credittype = File_Reader.getInstanceFRM().getInstanceCR().getCredittype();
      dropDown("ByVisibleText",pm.get_Search().getCredittype(),credittype);
      String month = File_Reader.getInstanceFRM().getInstanceCR().getMonth();
      dropDown("ByIndex",pm.get_Search().getMonth(), month);
      String year = File_Reader.getInstanceFRM().getInstanceCR().getyear();
      dropDown("ByVisibleText",pm.get_Search().getYear(), year);
      String ccv = File_Reader.getInstanceFRM().getInstanceCR().getCcv();
      inputValueElement(pm.get_Search().getCcv(), ccv) ;
      clickOnElement(pm.get_Search().getBooknow_btn());
      Thread.sleep(3000); 
      implicitlyWait(10,TimeUnit.SECONDS);
      clickOnElement(pm.get_Search().getItinerary());
        
	}}
        
        //booking congirmation
        //WebElement logout = driver.findElement(By.xpath("//input[@name=\"logout\"]"));
        //wait.until(ExpectedConditions.elementToBeClickable(logout));
        
      
        
        


