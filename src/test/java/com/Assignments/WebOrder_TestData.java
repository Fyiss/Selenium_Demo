package com.Assignments;

import org.testng.annotations.DataProvider;

public class WebOrder_TestData {
	@DataProvider(name = "Login")
	public Object[][] getDataforLogin() {
		// Multidimensional Object
		// 3X3 or 4X3 or 4X5 or 2X4
		return new Object[][] {

				{ "Tester", "test" }, { "Tester", "test" }, { "Tester", "test" }, { "Tester", "test" } };

	}

	@DataProvider(name = "product")
	public Object[][] product() {
		return new Object[][] {

				{ "MyMoney", }, { "FamilyAlbum" }, { "ScreenSaver" } };
	}
	@DataProvider(name = "Hover_Content")
	public Object[][] Hover_Content() {
		return new Object[][] { { "Desktops", "1800.00" }, { "Notebooks", "1590.00" }, { "Accessories", "3000.00" } };

	}
}
