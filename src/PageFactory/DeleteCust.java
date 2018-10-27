package PageFactory;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteCust {
	
	
WebDriver driver;
	
	
	@FindBy(xpath="//a[@href='DeleteCustomerInput.php']")	    
	WebElement Delcust_lnk;
	
	@FindBy(xpath="//input[@name='cusid']")	               
	WebElement customerid;
	
	@FindBy(name="AccSubmit")                    
	WebElement submit;
	
	@FindBy(xpath="/input[@value='Reset']")                     
	WebElement reset;
	
	@FindBy(linkText="Delete Customer Form")                     
	WebElement DelCustTitle;
	

	public DeleteCust(WebDriver driver){
		this.driver = driver;    // for interaction of driver of driverscript with driver of Guru99Login.java class
		//This initElements method will create  all WebElements
		PageFactory. initElements(driver, this);//Pagefactory is a class, (driver,this) to interact webdriver with elements
		//PageFactory. initElements(driver, new Guru99Login(driver) );
		}
	//Set user name in textbox
	
	public void clickDelcust(){
		Delcust_lnk.click();
		
	}
	
	 public String getDelCustTitle() 
	    {
	    	 return	DelCustTitle.getText();
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
	/*public String getPageTitle(){
	 return	AddNewcust.getText();
	}*/
	/**
	 * This POM method will be exposed in test case to login in the application
	 * @param strUserName
	 * @param strPasword
	 * @return
	 */
	public void Deletecust1(String customerid)
	{
		//Fill user name
		this.clickDelcust();
		this.getDelCustTitle();
		this.setcustomerID(customerid);
		this.clickSubmit();
		Alert alert = driver.switchTo().alert();		
		
        // Capturing alert message.    
        String alertMessage= driver.switchTo().alert().getText();		
        		
        // Displaying alert message		
        System.out.println(alertMessage);	
       
        		
        // Accepting alert		
        alert.accept();		
		//this.clickReset();
		
	
		
		
		
				
	}
}

	




