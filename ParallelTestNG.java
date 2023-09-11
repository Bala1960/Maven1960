package com.testgnSimple;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class ParallelTestNG {

	@Test(priority=1)
	public void FirstMethod()
	{
		System.out.println("First method paralled test for chrome Browser");
	}
@Test(priority=2)
    public void SecondMethod()
    {
	System.out.println("Second method paralled for fire fox");
    }
@AfterClass
public void exittest()
{
	System.out.println("Close both the browser");
}
}
