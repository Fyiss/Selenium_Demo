package com.WebOrder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebOrder_Login2_gettext {
	WebDriver driver;
  @Test
  public void login() throws InterruptedException {
	   
  Thread.sleep(3000);
  driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
  driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
  driver.findElement(By.name("ctl00$MainContent$login_button")).click();
  Thread.sleep(2000);
  String actvalue= driver.findElement(By.tagName("h2")).getText();
  String reqvalue= "List of All Orders";
  Assert.assertEquals(actvalue,reqvalue);
  
  
  }
  @AfterTest
  public void close() {
	  driver.quit();
  }
  @BeforeTest
  public void launch() {
	  driver = new ChromeDriver();
		 driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");
		 driver.manage().window().maximize();
	  
  }
  
  
}
