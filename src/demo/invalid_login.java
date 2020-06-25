package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class invalid_login 
{
	String path,error ;
	WebDriver driver;
	 WebElement uname,pass,login;
	public void invalid()
	{
		path=System.getProperty("user.dir") +"//Driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 
		 //invalid login credentials 
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		
		error=driver.findElement(By.id("spanMessage")).getText();
		
		if(error.equalsIgnoreCase("Invalid credentials"))
		{
			System.out.println("user has entered invalid credentials");
		}
		 
		
		}
	
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		invalid_login oo = new invalid_login();
		oo.invalid();
		
	}

}
