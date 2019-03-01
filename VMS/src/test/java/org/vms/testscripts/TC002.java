package org.vms.testscripts;

import java.io.IOException;

import org.testng.annotations.Test;
import org.vms.base.Base;
import org.vms.pages.CreateRoleType;
import org.vms.pages.LoginPage;
import org.vms.utility.TakeScreenShot;

public class TC002 extends Base{
	
	@Test
	public void testRoleCreate() throws InterruptedException, IOException {
		
	/*	LoginPage login = new LoginPage(driver);
		login.Login("123", "123");*/
		
		LoginPage lp=new LoginPage(driver);
		lp.setLoginId("123");
		lp.setLoginPass("123");
		lp.setLoginButtonClick();
		
		CreateRoleType role = new CreateRoleType(driver);
		role.RoleType();
		role.CreateRole();
		role.RoleTypeCode("12455");		
		role.RoleTypeName("Mohit");
		role.RList();		
		role.Button();	
		TakeScreenShot.screenShot(driver);
	}
}

