package TestNgpart2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Driver {
	public static String path;
	public static WebDriver driver;
@BeforeSuite
public void Launch()
{
	path = System.getProperty("user.dir") + "//Driver//chromedriver.exe";
	// System.out.println(path);

	// Setting the path of ChromeDriver
	System.setProperty("webdriver.chrome.driver", path);
	// Initialize Chrome Driver
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	// Launch application
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
}
@AfterSuite
public void Close_Browser()
{
	driver.close();
}


}
