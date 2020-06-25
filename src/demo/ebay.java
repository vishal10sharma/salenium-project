package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ebay {
WebDriver driver;
String path;
	
	public void Launch() {
		path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
		     //System.out.println(path);

		     //Setting the path of ChromeDriver
		     System.setProperty("webdriver.chrome.driver", path);
		     //Initialize Chrome Driver
		     driver=new ChromeDriver();
   driver.get("https://www.flipkart.com/");
	
	driver.findElement(By.className("_2AkmmA _29YdH8")).click();
	
	
	}
	
	public static void main(String[] args) {
	
	ebay oo= new ebay();
	oo.Launch();
	
	
}
}