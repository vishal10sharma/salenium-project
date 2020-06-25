package TestNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MethodParallel {

	@BeforeMethod
	public void beforeMethod() 
	
	{
		System.out.println("in before method");
	}
	
	@Test
public void testOne() 
	
	{
		System.out.println("in test one");
	}
@Test	
public void testTwo() 

{
	System.out.println("in test Two");
}
@AfterMethod	
public void afterMethod() 

{
	System.out.println("in  after Method");
}	
	
	
	
	
	
	
	
}
