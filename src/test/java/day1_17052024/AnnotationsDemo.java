package day1_17052024;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsDemo {
	@BeforeSuite
	public void bsmethod()
	{
	System.out.println("Before Method");	
	}
	@BeforeTest
	public void btmethod()
	{
		System.out.println("Before Test");
	}
	@BeforeClass
	public void bcmethod()
	{
		System.out.println("Before Class");
	}
	@BeforeMethod
	public void bmmethod()
	{
	System.out.println("Before Method");	
	}
	@Test
	public void test1()
	{
	System.out.println("test1");	
	}
	@Test
	public void test2()
	{
	System.out.println("test2");	
	}
	@AfterMethod
	public void ammethod()
	{
	System.out.println("After Method");	
	}
	@AfterClass
	public void acmethod()
	{
	System.out.println("after Class");	
	}
	@AfterTest
	public void atmethod()
	{
	System.out.println("After Test");	
	}
	@AfterSuite
	public void asmethod()
	{
		System.out.println("After Suite");
	}
	

}
