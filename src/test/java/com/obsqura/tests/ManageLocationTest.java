package com.obsqura.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ManageLocationTest extends BaseTest {

	@Test
	public void MyManageLocationTest() throws IOException {

		lp.Login();
		mp.NavigateToManageLocation();
		mp.enterLocationInfo();

		String alertMsg = mp.ValidateManageLocation().split("!")[1].trim();

//		if (alertMsg.contains("Location Created Successfully")) {
//			Assert.assertTrue(true);
//		} else {
//			Assert.fail();
//		}
		
		Assert.assertEquals(alertMsg, "Location Created Successfully");

	}
}
