package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewAccnt {
	
WebDriver driver;
	
	
	@FindBy(xpath="//a[contains(text(),'New Account')]")	    
	WebElement Newaccnt_lnk;
	
	@FindBy(name="cusid")	               
	WebElement customerid;
	
	@FindBy(xpath="//select[@name='selaccount']")	               
	WebElement accnttype;
	
	@FindBy(xpath="//input[@name='inideposit']")	               
	WebElement inideposit;
	
	@FindBy(name="button2")                     
	WebElement submit;
	
	@FindBy(name="res")                     
	WebElement reset;
	
	@FindBy(xpath="//p[@class='heading3']")                     
	WebElement AccntCreateMsg;
	
	/*@FindBy(linkText="")                     
	WebElement NewAccnttitle;*/
	
	/*@FindBy(xpath="Edit Customer Form")                     
	WebElement accountid;
	*/
	
public NewAccnt(WebDriver driver){
		this.driver = driver;    // for interaction of driver of driverscript with driver of Guru99Login.java class
		//This initElements method will create  all WebElements
		PageFactory. initElements(driver, this);//Pagefactory is a class, (driver,this) to interact webdriver with elements
		//PageFactory. initElements(driver, new Guru99Login(driver) );
		}

   /* public String getNewAccntTitle() 
    {
    	 return	NewAccnttitle.getText();
    	}*/
   
	
	public void clickNewaccnt(){
		Newaccnt_lnk.click();
		
	}
	public void setinideposit(String strinideposit){
		inideposit.sendKeys(strinideposit);
		
	}
	
	
	public void selAccnttype(String strtype)
		
		{
			Select select=new Select(accnttype);
			select.selectByVisibleText(strtype);
		}
	
	public void setcustomerid(String strcustid){
		customerid.sendKeys(strcustid);
		
	}
		
		//Click on login button
	public void clickSubmit(){
			submit.click();
	}
	
	public String AccntCreateMsg(){
		
		 return	AccntCreateMsg.getText();
		
	 }
	
	
	public void clickReset(){
		    reset.click();
	 }
	
	/*public String getcustid() {
		
		if (AccntCreateMsg != null)
		{
			
			System.out.println(accountid.getText()); 
		}
		return null;
		}*/
	
	
	
	
	
	
	public void NewAccnt1(String strcustid,String accnttype,String strinideposit ) {
		//Fill user name
		this.clickNewaccnt();
		//this.getNewAccntTitle();
		this.setcustomerid(strcustid);
		this.selAccnttype(accnttype);
		this.setinideposit(strinideposit);
		this.clickSubmit();
	}
}
		
		//this.takeSnapShot(driver, "c://test.png") ;
		
		
		
	
		
		
		
		
		


