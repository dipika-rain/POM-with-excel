package test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageFactory.DeleteCust;
//import PageFactory.EditCust;
import PageFactory.Guru99HomePage;
import PageFactory.Guru99Login;
import PageFactory.NewAccnt;
import PageFactory.NewCust;





public class Test99GuruLoginWithPageFactory {

	WebDriver driver;                   
	Guru99Login objLogin;
	Guru99HomePage objHomePage; //we do declare object here to easily identify which classes are used and not to declare it again and again
	NewCust objnewcust;
	NewAccnt objnewaccnt;
	//EditCust objeditcust;
	DeleteCust objdelcust;
	//Test99GuruLoginWithPageFactory custid;
	
	@BeforeTest
	public void setup(){
		//driver = new FirefoxDriver();
		System.out.println("*******************");
		System.out.println("launching Chrome browser");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaishali\\eclipse-workspace\\selenium\\POMExample1\\POMExample\\browsers\\chromedriver.exe");
		// driver = new WebDriver();  //webdriver is an interface so cannot instantiate
		driver = new ChromeDriver();     //interface
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/V4/");
	}

	/**
	 * This test go to http://demo.guru99.com/V4/
	 * Verify login page title as guru99 bank
	 * Login to application
	 * Verify the home page using Dashboard message
	 * @throws IOException  
	 */
	@Test(priority=0)
	public void test_Home_Page_Appear_Correct() throws IOException{
		//Create Login Page object
	objLogin = new Guru99Login(driver);
	//Verify login page title
	String loginPageTitle = objLogin.getLoginTitle(); 
	Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));
	//login to application
	//objLogin.loginToGuru99("mgr123", "mgr!23");
	ReadUtility.setExcelFileSheet("loginData");
	objLogin.loginToGuru99((ReadUtility.getCellData(1,1)), (ReadUtility.getCellData(1,2)));

	// go the next page
	
	/*try {
		CommonFunct.takeSnapShot(driver, "C:\\screenshot.png");
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
   
	objHomePage = new Guru99HomePage(driver);
	//Verify home page
	Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mgr123"));
	
	}
	
	@Test(priority=1)
	public void Create_customer(){
		//Create Login Page object
		objnewcust = new NewCust(driver);
		//String NewCustTitle = objnewcust.getNewCustTitle();
		//Assert.assertTrue(NewCustTitle.toLowerCase().contains("Add New Customer"));
		
		objnewcust.NewCust1("Dipika","f","04/10/1992","Reynold road","Maharashtra","Mumbai","400014","rain.dipika479@gmail.com","Dips@123","9819206293");
		try {
			ReadUtility.setCellData(objnewcust.getcustid(), 1, 3);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Cust id not found");
			
		}

		
		//CommonFunct cf=new CommonFunct();
		//cf.takeSnapShot(WebDriver driver, c://test.png);
	

	}
	@Test(priority=2)
	public void New_Accnt(){
		//Create New Account
		objnewaccnt = new NewAccnt(driver);
		//String NewAccntTitle = objnewaccnt.getNewAccntTitle();
		//Assert.assertTrue(NewAccntTitle.toLowerCase().contains("Add new account form"));
		//objnewaccnt.NewAccnt1(objnewcust.getcustid(),"Savings","50000");
		objnewaccnt.NewAccnt1((ReadUtility.getCellData(1,3)),"Savings","50000");
		
		
		//CommonFunct cf=new CommonFunct();
		//cf.takeSnapShot(WebDriver driver, c://test.png);
	

	}
}
	
	
	/*@Test(priority=3)
	public void Delete_Accnt(){
		//Create New Account
		objdelcust = new DeleteCust(driver);
		String DelCustTitle = objdelcust.getDelCustTitle();
		Assert.assertTrue(DelCustTitle.toLowerCase().contains("Delete Customer Form"));
		objdelcust.Deletecust1("89887");
		
		
		//CommonFunct cf=new CommonFunct();
		//cf.takeSnapShot(WebDriver driver, c://test.png);
	

	
	
	*/

