package com.obsqura.tests;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PushNotificationSaveTest extends BaseTest{

	@Test
	public void MyPushSaveTest() throws IOException {
		lp.Login();
		pn.PushNotification();
		String title = null;
		pn.TitleForPushNotification(title);
		pn.DescriptionForPushNotification(); 
		pn.SaveFunctionality();
		
		
		String alertText = pn.validatePushNotificationPage().split("!")[1].trim();
//		if(alertText.contains("Message send successfully")) {
//			Assert.assertTrue(true);
//		}
//		else {
//			Assert.fail();
//		}
		
		Assert.assertEquals(alertText, "Message send successfully");

	}
}
