package org.vms.testscripts;

import org.testng.annotations.Test;
import org.vms.base.Base;
import org.vms.pages.CreateRoleType;
import org.vms.pages.LoginPage;

public class TC002 extends Base{
	
	@Test
	public void testRoleCreate() throws InterruptedException {
		
		LoginPage login = new LoginPage(driver);
		login.Login("123", "123");
		
		CreateRoleType role = new CreateRoleType(driver);
		role.roleType("5678","Testing");
	}

}
