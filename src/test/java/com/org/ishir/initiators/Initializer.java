package com.org.ishir.initiators;

import static com.org.ishir.util.YamlReader.getYamlValue;
import static com.org.ishir.util.YamlReader.setYamlFilePath;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import com.org.ishir.util.TakeScreenshot;
import com.org.pageObject.ClientAdmin;
import com.org.pageObject.ClientUser;
import com.org.pageObject.EnterpriseAdmin;
import com.org.pageObject.EnterpriseUser;
import com.org.pageObject.SegmentAdmin;
import com.org.pageObject.SegmentUser;
import com.org.pageObject.TegaAccountManagement;
import com.org.pageObject.TegaAdmin;
import com.org.pageObject.TegaExecutive;
public class Initializer {

	private WebDriver driver;
	private DriverFactory drFactory;
	public TakeScreenshot takescreenshot;
	public TegaAdmin Tega_Admin;
	public EnterpriseAdmin EntAdmin;
	public ClientAdmin CntAdmin;
	public SegmentAdmin SegAdmin;
	public TegaExecutive TegaExe;
	public TegaAccountManagement TegaAccMgmt;
	public EnterpriseUser EntUser;
	public ClientUser ClntUser;
	public SegmentUser SegUser;

	
	public Initializer(String browser){
		drFactory = new DriverFactory();
		_startBrowser(browser);
		_initPageObject();
	}
	
	private void _startBrowser(String browser){
		driver = drFactory.getDriver(browser);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	private void _initPageObject(){	
		Tega_Admin = new TegaAdmin(driver);
		EntAdmin = new EnterpriseAdmin(driver);
		CntAdmin = new ClientAdmin(driver);
		SegAdmin = new SegmentAdmin(driver);
		TegaExe = new TegaExecutive(driver);
		TegaAccMgmt = new TegaAccountManagement(driver);
		EntUser = new EnterpriseUser(driver);
		ClntUser = new ClientUser(driver);
		SegUser = new SegmentUser(driver);
		
	}
	public void stepStartMessage(String testStepName) {		
		Reporter.log(" ", true);
		Reporter.log("***** STARTING TEST STEP:- " + testStepName.toUpperCase() + " *****", true);
		Reporter.log(" ", true);
	}
	
	public void launchApplication() {
		setYamlFilePath();
		driver.get(getYamlValue("baseUrl"));
	}
}
