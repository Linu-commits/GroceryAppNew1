package com.obsqura.tests;

import java.io.IOException;

import org.testng.annotations.Test;

public class NewProductAddTest extends BaseTest{
	
	@Test
	public void MyNewProductAdd() throws IOException {
		lp.Login();
		hp.NavigateToManageProduct();
		//pp.NewBtn();
	}
}
