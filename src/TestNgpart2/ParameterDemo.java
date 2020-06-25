package TestNgpart2;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterDemo {

	@Parameters({"browser"})
	@Test
	public void Launch(String browser)
	
	{
		
		System.out.println("Browser is  "+browser);
	}
	
	
}
