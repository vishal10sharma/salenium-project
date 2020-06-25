package TestNgpart2;

import org.testng.annotations.Test;

public class Multithreaddemo {

	//@Test(threadPoolSize =3,invocationCount = 6,timeOut= 1000)
	@Test
	public void TestCase1()
	{
		
		System.out.println("Test case 1   "+Thread.currentThread().getId());
	}
	//@Test(threadPoolSize =3,invocationCount = 6,timeOut= 1000)
	@Test
	public void TestCase2()
	{
		
		System.out.println("Test case 2   "+Thread.currentThread().getId());
	}
	
	
}
