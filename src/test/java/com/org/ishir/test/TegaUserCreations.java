package com.org.ishir.test;

import java.lang.reflect.Method;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.org.ishir.initiators.Initializer;
import com.org.ishir.util.DataReadWrite;

public class TegaUserCreations {
	Initializer test;
	
	@BeforeClass
		public void Start_Test_Session(){
			test = new Initializer(DataReadWrite.getProperty("browser"));
	}
	@BeforeMethod
		public void handleTestMethodName(Method method){
			test.stepStartMessage(method.getName()); 
	}
	@Test
		public void launchTheApplication(){
			test.launchApplication();
	}
	
//	@Test(priority=1 )
//		public void EnterpriseAdmin() throws Exception{
//			test.EntAdmin.CreateEntAdmin();
//			System.out.println("*****Validated EnterpriseAdmin Creation*****");
//	}
//	@Test(priority=2)
//		public void ResetEntAdmin() throws Exception{
//			test.launchApplication();
//			test.EntAdmin.ResetPassword_EA();
//			System.out.println("*****Validated Reset Password*****");
//	}
//	@Test(priority=3)
//		public void NewLogin() throws Exception {
//			test.EntAdmin.Enterpriselogin_EA();
//			System.out.println("*****Validated New Login*****");
//	}
//	@Test(priority=1, dependsOnMethods = {"launchTheApplication"})
//		public void ClientAdmin() throws Exception{
////		test = new Initializer(DataReadWrite.getProperty("browser"));
////		test.launchApplication();
//			test.CntAdmin.CreateCntAdmin();
//			System.out.println("*****Validated ClientAdmin Creation*****");
//	}
//	@Test(priority=2, dependsOnMethods = {"ClientAdmin"})
//		public void ResetClientAdmin() throws Exception{
//			test.launchApplication();
//			test.CntAdmin.ResetPassword_CA();
//			System.out.println("*****Validated Client Reset Password*****");
//	}
//	@Test(priority=3, dependsOnMethods = {"ResetClientAdmin"})
//		public void NewClientLogin() throws Exception{
//			test.CntAdmin.EnterpriseLogin_CA();
//			System.out.println("*****Validated New Login for ClientAdmin*****");
//	}
//	@Test(priority=1, dependsOnMethods = {"launchTheApplication"})
//		public void SegmentAdmin() throws Exception{
////			test = new Initializer(DataReadWrite.getProperty("browser"));
////			test.launchApplication();
//			test.SegAdmin.CreateSegAdmin();
//			System.out.println("*****Validated SegmentAdmin Creation*****");
//	}	
//	@Test(priority=2, dependsOnMethods = {"SegmentAdmin"})
//		public void ResetSegmentAdmin() throws Exception{
//			test.launchApplication();
//			test.SegAdmin.ResetPassword_SA();
//			System.out.println("*****Validated Segment Reset Password*****");
//	}
//	@Test(priority=3, dependsOnMethods = {"ResetSegmentAdmin"})
//		public void NewSegmentLogin() throws Exception{
//			test.SegAdmin.EnterpriseLogin_SA();
//			System.out.println("*****Validated New Login for SegmentAdmin ");
//	}
//	@Test(priority=1, dependsOnMethods = {"launchTheApplication"})
//		public void TegaExecutive() throws Exception{
////		test = new Initializer(DataReadWrite.getProperty("browser"));
////		test.launchApplication();
//			test.TegaExe.CreateTegaExe();
//			System.out.println("*****Validated TegaExecutive Creation*****");
//	}
//	@Test(priority=2, dependsOnMethods = {"TegaExecutive"})
//		public void ResetPassword_TE() throws Exception{
//			test.TegaExe.ResetPassword_TE();
//			test.launchApplication();
//			System.out.println("*****Validated Executive Reset Password*****");
//	}
//	@Test(priority=3, dependsOnMethods = {"ResetPassword_TE"})
//		public void NewExecutiveLogin() throws Exception{
//			test.TegaExe.EnterpriseLogin_TE();
//			System.out.println("*****Validated New Login for TegaExecutive*****");
//	}
//	@Test(priority=1, dependsOnMethods = {"launchTheApplication"})
//		public void TegaAccountManagement() throws Exception{
////		test = new Initializer(DataReadWrite.getProperty("browser"));
////		test.launchApplication();
//			test.TegaAccMgmt.CreateTegaAcc();
//			System.out.println("*****Validated EnterpriseAdmin Creation*****");
//	}
//	@Test(priority=2, dependsOnMethods = {"TegaAccountManagement"})
//		public void ResetPassword_TAM() throws Exception{
//			test.launchApplication();
//			test.TegaAccMgmt.ResetPassword_TAM();
//			System.out.println("*****Validated EnterpriseAdmin Creation*****");
//	}
//	@Test(priority=3, dependsOnMethods = {"ResetPassword_TAM"})
//		public void NewAccountMgmtLogin() throws Exception{
//			test.TegaAccMgmt.EnterpriseLogin_TAM();
//			System.out.println("*****Validated EnterpriseAdmin Creation*****");
//	}
//	
//	@Test(priority=1, dependsOnMethods = {"launchTheApplication"})
//		public void EnterpriseUSer() throws Exception{
////		test = new Initializer(DataReadWrite.getProperty("browser"));
////		test.launchApplication();
//			test.EntUser.CreateEntUser();
//			System.out.println("*****Validated EnterpriseUser Creation*****");
//	}
//	@Test(priority=2, dependsOnMethods = {"EnterpriseUSer"})
//		public void ResetPassword_EU() throws Exception{
//			test.launchApplication();
//			test.EntUser.ResetPassword_EU();
//			System.out.println("*****Validated Reset Password of EnterpriseUser*****");
//	}
//	@Test(priority=3, dependsOnMethods = {"ResetPassword_EU"})
//		public void NewLogin_EU() throws Exception{
//			test.EntUser.EnterpriseLogin_EU();
//			System.out.println("*****Validated New Login of EnterpriseUser*****");
//	}	
//	@Test(priority=1, dependsOnMethods = {"launchTheApplication"})
//		public void ClientUser() throws Exception{
////		test = new Initializer(DataReadWrite.getProperty("browser"));
////		test.launchApplication();
//			test.ClntUser.CreateCntUser();
//			System.out.println("*****Validated ClientUser Creation*****");
//	}
//	@Test(priority=2, dependsOnMethods = {"ClientUser"})
//		public void ResetPassword_CU() throws Exception{
//			test.launchApplication();
//			test.ClntUser.ResetPassword_CU();
//			System.out.println("*****Validated Reset Password of ClientUser*****");
//	}
//	@Test(priority=3, dependsOnMethods = {"ResetPassword_CU"})
//		public void NewLogin_CU() throws Exception{
//			test.ClntUser.EnterpriseLogin_CU();
//			System.out.println("*****Validated New Login of ClientUSer*****");
//	}	
//	@Test(priority=1, dependsOnMethods = {"launchTheApplication"})
//		public void SegmentUser() throws Exception{
////		test = new Initializer(DataReadWrite.getProperty("browser"));
////		test.launchApplication();
//			test.SegUser.CreateSegUser();
//			System.out.println("*****Validated SegmentUser Creation*****");
//	}
//	@Test(priority=2, dependsOnMethods = {"SegmentUser"})
//		public void ResetPassword_SU() throws Exception{
//			test.launchApplication();
//			test.SegUser.ResetPassword_SU();
//			System.out.println("*****Validated Reset Password of SegmentUser*****");
//	}
//	@Test(priority=3, dependsOnMethods = {"ResetPassword_SU"})
//		public void NewLogin_SU() throws Exception{
//			test.SegUser.EnterpriseLogin_SU();
//			System.out.println("*****Validated New Login of SegmentUser*****");
//	}
	
//	@Test(priority=1, dependsOnMethods= {"launchTheApplication"} )
//		public void CreateTegaAdmin() throws Exception{
//			test.Tega_Admin.CreateTegaAdmin();
//			System.out.println("*****Validated TegaAdmin Creation*****");
//	}
//	@Test(priority=2, dependsOnMethods = {"CreateTegaAdmin"})
//		public void ResetPassword_TA() throws Exception{
//			test.launchApplication();
//			test.Tega_Admin.ResetPassword_TA();
//			System.out.println("*****Validated Reset Password of TegaAdmin*****");
//	}
	@Test(priority=1, dependsOnMethods= {"launchTheApplication"})
		public void EnterpriseLogin_TA() throws Exception {
			test.Tega_Admin.Enterpriselogin_TA();
			System.out.println("*****Validated New Login of TegaAdmin*****");
	}
	@Test(priority=2, dependsOnMethods = {"EnterpriseLogin_TA"})
		public void CreateCampaign_TA()throws Exception{
		test.Tega_Admin.CreateCampaign_TA();
		System.out.println("*****Validated Creation of new Campaign*****");
	}
////@AfterMethod
////	public void take_screenshot_on_failure(ITestResult result) {
////		test.takescreenshot.takeScreenShotOnException(result);
////}	
//	@AfterClass
		public void close_Test_Session() throws InterruptedException{
			test.Tega_Admin.closeBrowser();
	}
	
}
