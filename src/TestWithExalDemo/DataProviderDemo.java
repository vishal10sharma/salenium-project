package TestWithExalDemo;

import org.testng.annotations.DataProvider;

public class DataProviderDemo {
@DataProvider(name="empdata")
	public Object[][] readdata()
	{
		String sheetpath =System.getProperty("user.dir")+"\\Testdata\\LoginData.xls";
		Xls_Reader xlr= new Xls_Reader(sheetpath);
		
		int rowCount=xlr.getRowCount("Sheet1");
		
		int colCount=xlr.getColumnCount("Sheet1");
		return null;
		
	
	
	
	
	}


}
