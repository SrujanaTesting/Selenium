package seleniumweek2day1classwork;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.*;

public class LearningAnnotations {
	@BeforeSuite
	void beforeSuite()
	{
		System.out.println("beforeSuite");
	}
	@BeforeMethod
	void beforeMethod()
	{
		System.out.println("beforeMethod");
	}
	@BeforeTest
	void beforeTest()
	{
		System.out.println("beforeTest");
	}
	@BeforeClass
	void beforeClass()
	{
		System.out.println("beforeClass");
	}
	@Test
	void Test1()
	
	{
		System.out.println("Test1");
	}
	@Test
	void Test2()
	{
		System.out.println("Test2");
	}
	
	@AfterTest
	void AfterTest()
	{
		System.out.println("AfterTest");
	}
	@AfterClass
	void AfterClass()
	{
		System.out.println("Afterclass");
	}
	@AfterMethod
	void AfterMethod()
	{
		System.out.println("AfterMethod");
	}
	@AfterSuite
	void AfterSuite()
	{
		System.out.println("Aftersuite");
	}
	
	
	
	

}
