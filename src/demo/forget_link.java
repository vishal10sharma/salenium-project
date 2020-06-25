package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class forget_link {
String path;
WebDriver driver;
	
public void forget()
{
	path=System.getProperty("user.dir") +"//Driver//chromedriver.exe";
	System.setProperty("webdriver.chrome.driver" , path);
	driver= new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		
	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
forget_link oo=new forget_link();
oo.forget();
	}

}
