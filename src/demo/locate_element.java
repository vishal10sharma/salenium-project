package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class locate_element {

	 String path;
     WebDriver driver;
     WebElement uname,pass,login;
     public void Locate() {
         path = System.getProperty("user.dir") +"//Driver//chromedriver.exe";
         System.setProperty("webdriver.chrome.driver", path);
         driver = new ChromeDriver();
         driver.get("https://opensource-demo.orangehrmlive.com/");
         
         // Locate element Username
         
    //valid login credentials     
         uname=driver.findElement(By.name("txtUsername"));
         if(uname.isDisplayed())
         {
                 uname.sendKeys("admin");
         }
         else
         {
             System.out.println("Element is not available on page");
         }
         
     
         //Locate password by Name
         pass=driver.findElement(By.name("txtPassword"));
                 pass.sendKeys("admin123");
         // locate Submit button and click on it
         login=driver.findElement(By.id("btnLogin"));
         login.submit();
         // driver.findElement(By.id("btnLogin")).click()
         
         
         

     }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 locate_element oo = new  locate_element();
	         oo.Locate();
		
		}

}
