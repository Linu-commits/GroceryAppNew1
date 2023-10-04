package com.obsqura.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.obsqura.utilities.DateUtility;

public class CreateDeliveryBoy extends BaseTest{
	
	
	@Test(groups= {"Smoke"})
	public void CreateDeliveryBoyTest() throws IOException {
		lp.Login();
		hp.NavigateTo_ManageDeliverBoy();
		String date= DateUtility.GetCurrentDate();
		ldp.CreateDeliveryBoy(date);
		
		ldp.ValidateDeliveryBoyIsCreated();	
		String alertMsg = ldp.ValidateDeliveryBoyIsCreated();
		
	    Assert.assertEquals(alertMsg, "Delivery Boy Details Created Successfully");


		
	}

}
