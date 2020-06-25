package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {
	String path , data ;
	WebDriver driver ;
	
	public void web()
	{
		path=System.getProperty("user.dir") +"//Driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver" , path);
		driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/search?q=sanitizer&sid=g9b%2Cema%2Crhm%2Cjrn&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_1_4_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_1_4_na_na_na&as-pos=1&as-type=RECENT&suggestionId=sanitizer%7CHand+Sanitizer&requestId=f245143a-a503-4764-9f16-bcd42c04db8b&as-backfill=on");
		data = driver.findElement(By.className("_2cLu-l")).getText();
			System.out.println(data);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
flipkart oo=new flipkart();
oo.web();
	}


}
