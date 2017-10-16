package com.org.pageObject;

import static com.org.ishir.util.YamlReader.setYamlFilePath;
import java.util.NoSuchElementException;
import java.util.function.Function;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import com.org.ishir.initiators.Initializer;

public class TegaAdmin extends BaseUI{

	Initializer test;
	
	public TegaAdmin(WebDriver driver) {
		super(driver);
	}
	String testFile = setYamlFilePath();
	
	@FindBy(xpath="//input[@id='inputUsername']")
	private WebElement Tega_Admin_username;
	@FindBy(xpath="//input[@id='inputPassword']")
	private WebElement Tega_Admin_password;
	@FindBy(xpath="//button[@id='btnSignIn']")
	private WebElement Tega_Admin_Signinbtn;
	@FindBy(xpath="//ul[@id='tabs']/li[2]")
	private WebElement Select_Enterprise;
	@FindBy(xpath="//table[@id='enterprises_table']/tbody/tr[1]/td[3]/button")
	private WebElement Select_btn;
	@FindBy(xpath="//a[@id='submenu_admin']/i[2]")
	private WebElement Admin_btn;
	@FindBy(xpath="//a[@href='/Pages/Administrative/SecurityManagement/UsersAccount.aspx']")
	private WebElement User_Acc;
	@FindBy(xpath="//a[@id='usersaccount__btn--create']")
	private WebElement Tega_Create;
	@FindBy(xpath="//select[@id='ddlPrivilegeLevel']//option[@value='TegaAdmin']")
	private WebElement Privelege_Enterprise;

	@FindBy(xpath="//input[@id='txtEmail']")
	private WebElement Enter_email;
	@FindBy(xpath="//input[@id='txtCellPhone']")
	private WebElement Enter_CellPhone;
	@FindBy(xpath="//select[@id='ddlCarrier']//option[@value='9']")
	private WebElement Network_select;
	@FindBy(xpath="//input[@id='txtName']")
	private WebElement Enter_name;
	@FindBy(xpath="//input[@id='txtUserLogin']")
	private WebElement Enter_username;
	@FindBy(xpath="//input[@id='txtUserPassword']")
	private WebElement Enter_password;
	@FindBy(xpath="//input[@id='txtVerifyPassword']")
	private WebElement Verify_password;
	@FindBy(xpath=".//*[@id='submitForm']")
	private WebElement Save_btn;
	@FindBy(xpath="//li[@class='hidden-xxs']//i[@class='fa fa-power-off']")
	private WebElement Logout_btn;
//Reset Password Locators		
	@FindBy(xpath="//input[@id='newPassword']")
	private WebElement Resert_newPswd;
	@FindBy(xpath="//input[@id='confirmNewPassword']")
	private WebElement Reset_Confirmpswd;
	@FindBy(xpath="//button[@id='btnChangePassoword']")
	private WebElement Change_Password;	
	
	public void CreateTegaAdmin() throws Exception{
//Login into the application		
	Tega_Admin_username.sendKeys("sakumar");
	Tega_Admin_password.sendKeys("Ishir123");
	Tega_Admin_Signinbtn.click();
	Thread.sleep(1000);
//Navigate to Client Enterprise Listing page
	Select_Enterprise.click();
	Select_btn.click();
	Thread.sleep(3000);
	System.out.println("Successfully Directed to Dashboard");
//Assert.assertEquals(getYamlValue("DashboardValidation"),driver.findElement(By.xpath("//ol[@class='breadcrumb']/li[2]")).getText());
//System.out.println("Navigated to Dashboard");

//Navigate to Dashboard and Click on Admin Tab
	Admin_btn.click();
	User_Acc.click();
	System.out.println("Successfully Directed to Security Management Page");	
	Tega_Create.click();
//Navigate to Add User Page
	Privelege_Enterprise.click();
	Thread.sleep(1000);
	Alert alert1 = driver.switchTo().alert();
	alert1.accept();
	Enter_email.sendKeys("lkhetan@ishir.com");
	Enter_CellPhone.sendKeys("9999999999");
	Network_select.click();
	Enter_name.sendKeys("Lavish Khetan");
	Enter_username.sendKeys("Tega_TA_May19");
	Enter_password.sendKeys("test");
	Verify_password.sendKeys("test");
	Save_btn.click();
	Alert alert = driver.switchTo().alert();
	alert.accept();
	Thread.sleep(1000);
	Logout_btn.click();	
	}
//Re-Login and Reseting the Password
	public void ResetPassword_TA() throws Exception{		
	Tega_Admin_username.sendKeys("Tega_TA_May19");
	Tega_Admin_password.sendKeys("test");
	Tega_Admin_Signinbtn.click();
	Thread.sleep(1000);
	Resert_newPswd.sendKeys("Ishir@123");
	Reset_Confirmpswd.sendKeys("Ishir@123");
	Change_Password.click();
	Thread.sleep(1000);
	Alert alert = driver.switchTo().alert();
	alert.accept();
	}	
	public void Enterpriselogin_TA() throws Exception{
	Tega_Admin_username.sendKeys("sakumar");
	Tega_Admin_password.sendKeys("Ishir123");
	Tega_Admin_Signinbtn.click();
	Thread.sleep(9000);
	Select_Enterprise.click();
	Select_btn.click();
	Thread.sleep(10000);
	}
	@FindBy(xpath="//a[@href='/Reports/Events.aspx']/span")
	private WebElement LeftPanel_Campaign;
	@FindBy(xpath="//a[@href='/pages/events/lifecyclecampaigns.aspx']")
	private WebElement CreateCampaign_btn;
	@FindBy(xpath="//div[@id='step1']/div/div/form/div/div[1]/div/div/input")
	private WebElement Campaign_Name;
	@FindBy(xpath="(//ul[@class='chosen-choices']/li[1])[1]")
	private WebElement Click_MediaType;
	@FindBy(xpath="(//div[@class='chosen-drop']/ul/li[2])[1]")
	private WebElement Choose_MediaType;
	
//	@FindBy(xpath="//button[@id='steps_next']")
//	private WebElement Next_btn;
	
	@FindBy(xpath="(//div[@class='pull-left']/div[1]/div/span[2])[1]")
	private WebElement CurrentCustomer_ON;
//	Click ON Next button from here 
//	@FindBy(xpath="//a[@href='#collapseThree']")
	@FindBy(xpath="(//h4[@class='panel-title'])[3]")
	private WebElement Collapse_Expand;
	@FindBy(xpath="//div[@id='collapseOne']//option[@value='object:1430']")
	private WebElement ChooseTemplate;
	@FindBy(xpath="//input[@id='replyToEmail_ProsEmail']")
	private WebElement ReplytoEmail;
	@FindBy(xpath="//input[@id='subject_CurrEmail']")
	private WebElement SubLine_Email;
	@FindBy(xpath="(//input[@value='21:11'])[1]")
	private WebElement StartTime;
	@FindBy(xpath="//option[@class='ng-binding ng-scope' and @value='1']")
	private WebElement FinishEvent;
	@FindBy(xpath="//button[@id='btnfinish']")
	private WebElement Click_Finish;

	public void CreateCampaign_TA()throws Exception {
		
		LeftPanel_Campaign.click();
		CreateCampaign_btn.click();
		Thread.sleep(10000);
		Campaign_Name.sendKeys("Test");
		Thread.sleep(1000);
		Click_MediaType.click();
		Thread.sleep(5000);
		Actions action = new Actions(driver);
	    action.moveToElement(Choose_MediaType).click().perform();
		Thread.sleep(10000);
		WebElement element= driver.findElement(By.xpath("//button[@id='steps_next']"));	
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
//		Next_btn.click();
			System.out.println("Moved from Media to Data page");
			CurrentCustomer_ON.click();
		Thread.sleep(20000);
		executor.executeScript("arguments[0].click();", element);
//		Next_btn.click();
			System.out.println("Moved from Data Page to Filters page");
		Thread.sleep(9000);
		executor.executeScript("arguments[0].click();", element);
//		Next_btn.click();
			System.out.println("Moved from Filters Page to Create page");
		Thread.sleep(9000);
		Collapse_Expand.click();
		Thread.sleep(5000);
		Select dropdown = new Select(driver.findElement(By.xpath("//div[@id='collapseOne']//option[@value='object:1453']")));
		dropdown.selectByVisibleText("Test Template");	
//		ChooseTemplate.click();
		ReplytoEmail.sendKeys("lkhetan@ishir.com");
		Thread.sleep(1000);
//		Next_btn.click();
		executor.executeScript("arguments[0].click();", element);
		FinishEvent.click();
		Click_Finish.click();		
		}	

	
	}	
