package com.obsqura.tests;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.obsqura.pages.LoginPage;


public class LoginTest extends BaseTest {
	

	@Test 
	public void MyLoginTest() throws IOException {
		
		LoginPage lp = new LoginPage(driver);
		lp.Login();
		
		lp.ValidateLogin();	
		String alertMsg = lp.ValidateLogin();
		
	    Assert.assertEquals(alertMsg, "Dashboard");
	    
	}
}
