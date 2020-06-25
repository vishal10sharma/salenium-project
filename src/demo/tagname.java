package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagname {
	String path,ckeck;
	WebDriver driver;
	static int count=0;
	static String[] link=null; 
	
	public void launch() throws InterruptedException
	{
		path=System.getProperty("user.dir") +"//Driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		List<WebElement> al = (List<WebElement>) driver.findElement(By.tagName("a"));
		
		count= al.size();
		
		
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
