package org.vms.testscripts;

import java.io.IOException;

import org.testng.annotations.Test;
import org.vms.base.Base;
import org.vms.dataprovider.TestDataProvider;
import org.vms.pages.CreateRoleType;
import org.vms.pages.LoginPage;

public class CreateRoleTypeTest extends Base{
	
	@Test(dataProvider="XL",dataProviderClass=TestDataProvider.class)
	public void testRoleCreate(String roleCode, String roleName) throws InterruptedException, IOException {
		
		
		LoginPage lp=new LoginPage(driver);
		lp.setLoginId("123");
		lp.setLoginPass("123");
		lp.setLoginButtonClick();
		Thread.sleep(5000);
		
		CreateRoleType role = new CreateRoleType(driver);
		role.RoleType();
		role.CreateRole();
		role.RoleTypeCode(roleCode);		
		role.RoleTypeName(roleName);
		role.RList();		
		role.Button();		
	}
}

