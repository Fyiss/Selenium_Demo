package com.WebOrder;

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

//-------------------------------------------- This is to read Excel Data------------

	@DataProvider(name = "LoginExcelData")
	public Object[][] ReadDataFromExcel() throws Exception {
		Read_Excel excel = new Read_Excel();
		String RelativePath = System.getProperty("user.dir");
		// Object[][] testObjArray = excel.getExcelData("C:\\Training_Scripts\\Selenium
		// Training
		// Data\\workspace\\Maven_Selenium_WebDriver_4\\TestDataFile\\WebOrder_Login_TestData.xls","AddUsers");
		Object[][] testObjArray = excel.getExcelData(RelativePath + "\\Test_Data_Files\\Excel_File.xls", "Sheet1");
		// System.out.println(testObjArray);
		return testObjArray;

	


	}
}