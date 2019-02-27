package org.vms.testscripts;

import org.testng.annotations.Test;
import org.vms.base.Base;
import org.vms.pages.LoginPage;

public class TC001 extends Base {
	
	@Test
	public void testLogin() {
		
		LoginPage lp=new LoginPage(driver, prop);
		lp.Login("123","123");
	}

}
