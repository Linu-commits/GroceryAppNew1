package com.obsqura.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MobileSliderTest extends BaseTest{

	@Test
	public void MyMobileSlider() throws InterruptedException, IOException {
		lp.Login();
		ms.NavigateToMobileSlider();
		ms.CreateNewMobileSlider();
		
		/* Validation part */
		
		String alertTeext = ms.ValidateMobileSlider().split("!")[1].trim();
//		if(alertTeext.contains("Mobile Slider Created Successfully")) {
//			Assert.assertTrue(true);
//		}else {
//			Assert.fail();
//		}
		
		Assert.assertEquals(alertTeext, "Mobile Slider Created Successfully");
	}
	
}
