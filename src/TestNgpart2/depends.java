package TestNgpart2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class depends extends Driver{
@Test(enabled = false )
	public void login()
	{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	}
	@Test(dependsOnMethods="login")
	public void admin() throws InterruptedException
	{
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("menu_admin_Job")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("menu_admin_viewJobTitleList")).click();
	}
}
