package com.obsqura.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ManagePaymentTest extends BaseTest {

	@Test(groups= {"Regression"})
	public void MyManagePayment() throws IOException {
		lp.Login();
		mpp.NavigateToManagePayment();
		mpp.CreateEditAndUpdate();

		String alertMessage = mpp.ValidateManagePayment().split("!")[1].trim();
//		if (alertMessage.contains("Payment Method Updated Successfully")) {
//			Assert.assertTrue(true);
//		} else {
//			Assert.fail();
//		}
		
		Assert.assertEquals(alertMessage, "Payment Method Updated Successfully");

	}

}
