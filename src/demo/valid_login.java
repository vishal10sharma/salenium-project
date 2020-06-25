package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class valid_login {
	 String path;
     WebDriver driver;
     WebElement uname,pass,login;
     public void login() {
         path = System.getProperty("user.dir") +"//Driver//chromedriver.exe";
         System.setProperty("webdriver.chrome.driver", path);
         driver = new ChromeDriver();
         driver.get("https://opensource-demo.orangehrmlive.com/");
         
         // Locate element username
         
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
 		
 		valid_login oo = new  valid_login();
 	         oo.login();
 		
 		}
   


}
