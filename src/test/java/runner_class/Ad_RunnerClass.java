package runner_class;

import java.io.IOException;
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

public class Ad_RunnerClass extends Base_Class {
	public static WebDriver driver=getBrowser("chrome");
	//public static Sign_In_Page sn=new Sign_In_Page (driver) ;
	//public static Search_Hotel sh=new Search_Hotel(driver);
	public static Page_Obj_Manager pom=new Page_Obj_Manager(driver);
	public static void main(String[] args) throws Throwable {
		String url = File_Reader.getInstanceFRM().getInstanceCR().getUrl();
		getUrl(url);
		String name = File_Reader.getInstanceFRM().getInstanceCR().getName();
        inputValueElement(pom.get_Sign().getUsername(),name);
        String password = File_Reader.getInstanceFRM().getInstanceCR().getPassword();
        inputValueElement(pom.get_Sign().getPassword(),password);
       
        clickOnElement(pom.get_Sign().getLogin());
        String loc = File_Reader.getInstanceFRM().getInstanceCR().getLoc();
        dropDownbyvalue(pom.get_Search().getLoc(),loc);
        String hotel = File_Reader.getInstanceFRM().getInstanceCR().getHotel();
        dropDownbyvalue(pom.get_Search().getHotels(),hotel);
        String roomtype = File_Reader.getInstanceFRM().getInstanceCR().getRoomtype();
        dropDownbyvalue(pom.get_Search().getRoomtype(),roomtype);
        thread(300);
        String getnoofroom = File_Reader.getInstanceFRM().getInstanceCR().getnoofroom();
        dropDownByVisibleText(pom.get_Search().getNoofrooms(),getnoofroom);
        String checkout = File_Reader.getInstanceFRM().getInstanceCR().getCheckout();
        inputValueElement(pom.get_Search().getCheckout(),checkout);
        String adultroom = File_Reader.getInstanceFRM().getInstanceCR().getAdultroom();
        dropDownByVisibleText(pom.get_Search().getAdultroom(),adultroom);
        String childroom = File_Reader.getInstanceFRM().getInstanceCR().getChildroom();
        dropDownByVisibleText(pom.get_Search().getChildroom(),childroom);
        
        clickOnElement(pom.get_Search().getSubmit());
        clickOnElement(pom.get_Search().getRadio_btn());
        clickOnElement(pom.get_Search().getCon());
        String firstname = File_Reader.getInstanceFRM().getInstanceCR().getFirstname();
        inputValueElement(pom.get_Search().getFirst_name(),firstname);
        String lastname = File_Reader.getInstanceFRM().getInstanceCR().getLastname();
        inputValueElement(pom.get_Search().getLast_name(),lastname);
        String address = File_Reader.getInstanceFRM().getInstanceCR().getAddress();
        inputValueElement(pom.get_Search().getAddress(),address);
        String ccnum = File_Reader.getInstanceFRM().getInstanceCR().getCcnum();
        inputValueElement(pom.get_Search().getCc_num(),ccnum);
        String credittype = File_Reader.getInstanceFRM().getInstanceCR().getCredittype();
        dropDownByVisibleText(pom.get_Search().getCredittype(),credittype);
        
         Thread.sleep(3000);
         implicitlyWait(10,TimeUnit.SECONDS );
         String month = File_Reader.getInstanceFRM().getInstanceCR().getMonth();
         dropDownByVisibleText(pom.get_Search().getMonth(), month);
          String year = File_Reader.getInstanceFRM().getInstanceCR().getyear();
         dropDownByVisibleText(pom.get_Search().getYear(), year);
         String ccv = File_Reader.getInstanceFRM().getInstanceCR().getCcv();
         inputValueElement(pom.get_Search().getCcv(),ccv);
         clickOnElement(pom.get_Search().getBooknow_btn());
         implicitlyWait(20,TimeUnit.SECONDS );
         clickOnElement(pom.get_Search().getItinerary());
      
         
	}

}
