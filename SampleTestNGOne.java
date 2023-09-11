package com.testgnSimple;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTestNGOne {

@BeforeClass
public void OpenBrowser()
{
	System.out.println("Browser can be opened through selenium");
}
@BeforeMethod
public void SearchBrowser()
{
	System.out.println("Check for the link tab for the browser");
}
@Test(description="This method displays the message without validation")
public void FindElement()
{
	System.out.println("locate elements in the homepage of the website");
}
@Test
public void assertOne()
{
	  String one="username";
	  String two="password";
	  Assert.assertEquals(one, two);
}
@AfterMethod
public void closetab()
{
	System.out.println("Close the home page tab");
}
@AfterClass
public void closeBrowser()
{
	System.out.println("close the browser");
}
}
