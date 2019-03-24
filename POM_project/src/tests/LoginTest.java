package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends AbstractTest
{
	@Test
	public void verifyLogin()
	{
		loginComponent.login();
		Assert.assertTrue(loginComponent.verifyLoginfunc(),"verify login");
		
		
	}


}
