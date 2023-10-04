package com.obsqura.tests;

import java.io.IOException;

import org.testng.annotations.Test;

public class ResetTest extends BaseTest{

	@Test
	public void MyReset() throws IOException {
		lp.Login();
		hp.NavigateToManageProduct();
		//pp.ResetBtn();
	}
}
