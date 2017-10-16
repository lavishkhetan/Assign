package com.org.pageObject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.org.ishir.initiators.Initializer;

public class SegmentAdmin extends BaseUI {

	Initializer test;
	
	public SegmentAdmin(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='inputUsername']")
	private WebElement Segment_Admin_username;
	@FindBy(xpath="//input[@id='inputPassword']")
	private WebElement Segment_Admin_password;
	@FindBy(xpath="//button[@id='btnSignIn']")
	private WebElement Segment_Admin_Signinbtn;
	@FindBy(xpath="//ul[@id='tabs']/li[2]/a")
	private WebElement Select_Enterprise;
	@FindBy(xpath="//div[@id='enterprises']//tr[@class='odd'][1]//button[@class='btn btn-success']")
	private WebElement Select_btn;
	@FindBy(xpath="//a[@id='submenu_admin']/i[2]")
	private WebElement Admin_btn;
	@FindBy(xpath="//a[@href='/Pages/Administrative/SecurityManagement/UsersAccount.aspx']")
	private WebElement User_Acc;
	@FindBy(xpath="//a[@id='usersaccount__btn--create']")
	private WebElement Tega_Create;
// 	Add User Page
	@FindBy(xpath="//select[@id='ddlPrivilegeLevel']//option[@value='SegmentAdmin']")
	private WebElement Privelege_Enterprise;
	@FindBy(xpath="//select[@id='ddlSegment_Member_0']//option[@value='24429']")
	private WebElement SelectMember;
	@FindBy(xpath="//select[@id='ddlSegment_State_1']//option[@value='24430']")
	private WebElement SelectState;
	@FindBy(xpath="//select[@id='ddlSegment_City_2']//option[@value='24434']")
	private WebElement SelectCity;
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
//	Re-login into the Application
	@FindBy(xpath="//input[@id='newPassword']")
	private WebElement Resert_newPswd;
	@FindBy(xpath="//input[@id='confirmNewPassword']")
	private WebElement Reset_Confirmpswd;
	@FindBy(xpath="//button[@id='btnChangePassoword']")
	private WebElement Change_Password;	

	public void CreateSegAdmin() throws Exception{
//		Login into the application		
		Segment_Admin_username.sendKeys("lkhetan");
		Segment_Admin_password.sendKeys("Ishir@123");
		Segment_Admin_Signinbtn.click();
		Thread.sleep(1000);
//	Navigate to Client Enterprise Listing page
		Select_Enterprise.click();
		Select_btn.click();
		Thread.sleep(3000);
		System.out.println("Successfully Directed to Dashboard");
//		Assert.assertEquals(getYamlValue("DashboardValidation"),driver.findElement(By.xpath("//ol[@class='breadcrumb']/li[2]")).getText());
//	    System.out.println("Navigated to Dashboard");
	
//	Navigate to Dashboard and Click on Admin Tab
		Admin_btn.click();
		User_Acc.click();
		System.out.println("Successfully Directed to Security Management Page");	
		Tega_Create.click();
//	Navigate to Add User Page
		Privelege_Enterprise.click();
		Thread.sleep(1500);
		SelectMember.click();
		SelectState.click();
		SelectCity.click();
		Enter_email.sendKeys("lkhetan@ishir.com");
		Enter_CellPhone.sendKeys("9999999999");
		Network_select.click();
		Enter_name.sendKeys("Lavish Khetan");
		Enter_username.sendKeys("Tega_SA_1");
		Enter_password.sendKeys("test");
		Verify_password.sendKeys("test");
		Save_btn.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(1000);
		Logout_btn.click();	
	}
	public void ResetPassword_SA() throws Exception {
		Segment_Admin_username.sendKeys("Tega_SA_1");
		Segment_Admin_password.sendKeys("test");
		Segment_Admin_Signinbtn.click();
		Thread.sleep(1000);
		Resert_newPswd.sendKeys("Ishir@123");
		Reset_Confirmpswd.sendKeys("Ishir@123");
		Change_Password.click();
		Thread.sleep(1000);
	}
	public void EnterpriseLogin_SA() throws Exception{
		Segment_Admin_username.sendKeys("Tega_SA_1");
		Segment_Admin_password.sendKeys("Ishir@123");
		Segment_Admin_Signinbtn.click();
	}
}




