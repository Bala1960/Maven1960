package com.testgnSimple;

import org.testng.annotations.Test;

public class SampleTestNG {
@Test(priority=2)
	public void loginTest()
	{
		System.out.println("Login into the website according to the URL");
	}
@Test(priority=2)
public void checkTestCase()
{
	System.out.println("Check for the Search Link for the product");
}
@Test(priority=2)
public void LogoutTest()
{
	System.out.println("Test case with negative value");
}

}
