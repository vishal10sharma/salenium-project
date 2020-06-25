package TestNgpart2;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class LoginPageTest extends Driver{
	//@Test(groups= {"Smoke"})
		@Test()
	public void login()
	{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	}
	//@Test(groups= {"Regression"})
	//public void ForgetPass()
	//{
//		driver.findElement(By.linkText("Forgotten account?")).click();
	//}
	@Test(dependsOnMethods="dashbord")
	public void Logout() throws InterruptedException
{
		Thread.sleep(3000);
		driver.findElement(By.linkText("Welcome Admin")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Logout")).click();
}
	@Test(dependsOnMethods="admin")
	public void dashbord() throws InterruptedException
		{
		Thread.sleep(3000);
		driver.findElement(By.id("menu_dashboard_index")).click();
		
		
		Thread.sleep(3000);
		driver.findElement(By.className("quickLinkText")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("assignleave[txtEmployee][empName]")).sendKeys("John Smith");
		driver.findElement(By.name("assignleave[txtLeaveType]")).sendKeys("FMLA US");
		driver.findElement(By.name("assignleave[txtFromDate]")).click();
		driver.findElement(By.name("assignleave[txtFromDate]")).sendKeys("2020-01-10");
		Thread.sleep(3000);
		driver.findElement(By.name("assignleave[txtToDate]")).clear();
		driver.findElement(By.name("assignleave[txtToDate]")).sendKeys("2020-05-20");
		Thread.sleep(5000);
		driver.findElement(By.id("assignBtn")).click();
		
	}
	@Test(dependsOnMethods="login" ,priority=1)
	public void admin() throws InterruptedException
	{
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("menu_admin_Job")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("menu_admin_viewJobTitleList")).click();
	}
	
	}

