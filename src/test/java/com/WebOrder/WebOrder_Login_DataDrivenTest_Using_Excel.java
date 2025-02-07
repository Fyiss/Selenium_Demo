package com.WebOrder;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebOrder_Login_DataDrivenTest_Using_Excel extends WebOrder_TestData{
	FirefoxDriver driver;
  @Test(dataProvider="LoginExcelData",priority=1)
  public void login(String uname,String pass) throws InterruptedException {
	   
  
  driver.findElement(By.name("ctl00$MainContent$username")).sendKeys(uname);
  driver.findElement(By.name("ctl00$MainContent$password")).sendKeys(pass);
  driver.findElement(By.name("ctl00$MainContent$login_button")).click();
  driver.findElement(By.linkText("Logout")).isDisplayed();
  driver.findElement(By.xpath("//h2[normalize-space()='List of All Orders']")).isDisplayed();
  driver.findElement(By.linkText("Logout")).click();
  
  }
  @BeforeTest
	public void pre_condition() {
		//WebDriverManager.chromedriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");
	}
	@AfterTest
  
  public void post_condition() {
		
		driver.close();
	}
}
