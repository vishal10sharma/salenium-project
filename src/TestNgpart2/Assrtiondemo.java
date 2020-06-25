package TestNgpart2;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;




public class Assrtiondemo {
	 WebDriver driver;
     String path;
     
     @Test
	public void Launch() {
    	 
    	 SoftAssert ast= new SoftAssert();
		path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
	
    //System.out.println(path);

    //Setting the path of ChromeDriver
    System.setProperty("webdriver.chrome.driver", path);
    //Initialize Chrome Driver
    driver=new ChromeDriver();
    //Launch application
//driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
    driver.get("https://opensource-demo.orangehrmlive.com/");
	// heard assertions
  // Assert.assertEquals("OrangeHrm", driver.getTitle());
    
    //soft assertion
	ast.assertEquals(driver.getTitle(), "Orange hrm");
    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
	ast.assertAll();
	
	}
}