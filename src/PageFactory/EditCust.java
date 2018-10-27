package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/*
public class EditCust {
	
	
WebDriver driver;
	
	
	@FindBy(xpath="/a[contains(text(),'Edit Customer')]")	    
	WebElement Editcust_lnk;
	
	@FindBy(name="cusid")	               
	WebElement customerid;
	
	@FindBy(name="AccSubmit")                    
	WebElement submit;
	
	@FindBy(xpath="/input[@value='Reset']")                     
	WebElement reset;
	
	@FindBy(linkText="Edit Customer Form")                     
	WebElement EditCustTitle;
	

	

	
	
	public EditCust(WebDriver driver){
		this.driver = driver;    // for interaction of driver of driverscript with driver of Guru99Login.java class
		//This initElements method will create  all WebElements
		PageFactory. initElements(driver, this);//Pagefactory is a class, (driver,this) to interact webdriver with elements
		//PageFactory. initElements(driver, new Guru99Login(driver) );
		}
	//Set user name in textbox
	
	public void clickEditcust(){
		Editcust_lnk.click();
		
	}
	
	 public String getEditCustTitle() 
	    {
	    	 return	EditCustTitle.getText();
	    }
	public void setcustomerID(String customerid)
	{
		this.customerid.sendKeys(customerid);
		}
	
	public void clickSubmit(){
			submit.click();
	}
	
	public void clickReset(){
		    reset.click();
}
	
	//Get the title of Login Page
	public String getPageTitle(){
	 return	AddNewcust.getText();
	}
	*//**
	 * This POM method will be exposed in test case to login in the application
	 * @param strUserName
	 * @param strPasword
	 * @return
	 *//*
	public void EditCust1(String customerid)
	{
		//Fill user name
		this.clickEditcust();
		this.getEditCustTitle();
		this.setcustomerID(customerid);
		this.clickSubmit();
		//this.clickReset();
		
	
		
		
		
				
	}
}
*/
	




