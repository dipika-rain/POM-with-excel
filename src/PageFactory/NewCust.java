package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.TakesScreenshot;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import java.io.File;


public class NewCust {
	
	
	WebDriver driver;
	int Savecustid;
	
	
	@FindBy(linkText="New Customer")	    
	WebElement Newcust_lnk;
	
	@FindBy(name="name")	               
	WebElement customername;
	
	@FindBy(xpath="//input[@value='m']")    
	WebElement gender_male;
	
	@FindBy(xpath="//input[@value='f']")    
	WebElement gender_female;
	
	@FindBy(id="dob")                      
	WebElement dob;
	
	@FindBy(name="addr")                    
	WebElement address;
	
	@FindBy(name="city")                    
	WebElement city;
	
	@FindBy(name="state")                   
	WebElement state;
	
	@FindBy(name="pinno")                  
	WebElement pinno;
	
    @FindBy(name="emailid")                
    WebElement emailid;
	
	@FindBy(name="telephoneno")               
	WebElement mob_no;
	
	@FindBy(name="password")               
	WebElement password;
	
	@FindBy(name="sub")                     
	WebElement submit;
	
	@FindBy(name="res")                     
	WebElement reset;
	
	@FindBy(linkText="Customer Registered Successfully!!!")                     
	WebElement CustRegMsg;
	
	@FindBy(xpath="//*[@id=\"customer\"]/tbody/tr[4]/td[2]")                     
	WebElement custid;
	
	/*@FindBy(linkText="Add New Customer")                     
	WebElement NewCusttitle;*/
	
	
public NewCust(WebDriver driver){
		this.driver = driver;    // for interaction of driver of driverscript with driver of Guru99Login.java class
		//This initElements method will create  all WebElements
		PageFactory. initElements(driver, this);//Pagefactory is a class, (driver,this) to interact webdriver with elements
		//PageFactory. initElements(driver, new Guru99Login(driver) );
		}

    /*public String getNewCustTitle() 
    {
    	 return	NewCusttitle.getText();
    	}*/
   
	
	public void clickNewcust(){
		Newcust_lnk.click();
		
	}
	public void setcustomername(String strcustomername){
		customername.sendKeys(strcustomername);
		
	}
	
	public void setgender(String strgender){
		
		if(strgender=="M" )
		{
			gender_male.click();
		}
		
		else
		{
			gender_female.click();
		}
		
		
	}
	
	public void dob(String strdob){
	dob.sendKeys(strdob);
		
	}
	
	//Set password in password textbox
	public void setaddress(String straddress){
		address.sendKeys(straddress);
	}
	
	public void setcity(String strcity){
		city.sendKeys(strcity);
	}
	
	public void setstate(String strstate){
		state.sendKeys(strstate);
	}
	
	public void setpinno(String strpinno){
		pinno.sendKeys(strpinno);
	}
	
	public void setmob(String strmob){
		mob_no.sendKeys(strmob);
	}
	public void setemailid(String stremailid){
		emailid.sendKeys(stremailid);
	}
	public void setpassword(String strpassword){
		password.sendKeys(strpassword);
	}
	//Click on login button
	public void clickSubmit(){
			submit.click();
	}
	
	public String CustRegMsg(){
		
		 return	CustRegMsg.getText();
		
	 }
	public void clickReset(){
		    reset.click();
	 }
	
	public String getcustid() {
		
		if (CustRegMsg != null)
		{
			
			// System.out.println(custid.getText()); 
			 
			 return custid.getText();
		}
		return null;
		
		
		
	}
	
	
	
	
	
	public void NewCust1(String strcustomername1,String strgender,String strdob,String straddress,String strstate,String strcity,String strpinno,String stremailid,String strpassword,
			String strmob) {
		//Fill user name
		this.clickNewcust();
		this.setcustomername(strcustomername1);
		this.setgender(strgender);
		this.dob(strdob);
		
		this.setaddress(straddress); 
		this.setcity(strcity);
		this.setstate(strstate);
		this.setpinno(strpinno);
		this.setmob(strmob);
		this.setemailid(stremailid);
		this.setpassword(strpassword);
		this.clickSubmit();
	//String Savecustid=this.getcustid();
		//this.takeSnapShot(driver, "c://test.png") ;
		
		
		
	
		
		
		
		
		
				
	}
}

	

