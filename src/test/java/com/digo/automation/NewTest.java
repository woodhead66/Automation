package com.digo.automation;

import org.testng.annotations.Test;

import com.digo.automation.base.GlobalData;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.lang.reflect.Method;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest extends GlobalData{
  @Test
  public void d() {
	  webDriver.get("www.baidu.com");
  }
//  @Test(dataProvider = "dp")
//  public void f(Integer n, String s) {
//	  
//  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @DataProvider
  public Object[][] dp(Method method) {
	  return new Object[][] {
		  new Object[] { 1, "a" },
		  new Object[] { 2, "b" },
	  };
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println(System.getProperties());
//	  String chromePath = Paths.get(userDir, "dirvers","chromedriver.exe").toString();
//	  System.setProperty("webdriver.chrome.driver",chromePath);
	  String firefoxPath = Paths.get(userDir, "dirvers","geckodriver.exe").toString();
	  System.setProperty("webdriver.gecko.driver",firefoxPath);
	  System.out.println(System.getProperties());
//	  GlobalData.webDriver = new ChromeDriver();
	  FirefoxOptions firefoxOptions = new FirefoxOptions();
	  GlobalData.webDriver = new FirefoxDriver(firefoxOptions);
	 
	 
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
