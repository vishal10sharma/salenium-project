package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebAlert {
WebDriver driver;
	String path;
	public void web()
	{
	path=System.getProperty("user.dir") +"//Driver//chromedriver.exe";
	System.setProperty("webdriver.chrome.driver" , path);
	driver= new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
