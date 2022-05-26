package TESTNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import project.Login_page1;
import project.login_page;



public class Test_ClassA 
{
	WebDriver driver;
	WebDriverWait Wait;
		@BeforeClass
		public void beforeclass() throws InterruptedException
		{    
		      System.setProperty("webdriver.chrome.driver","E:\\newchrome\\chromedriver_win32\\chromedriver.exe");
		   driver=new ChromeDriver();
		   Thread.sleep(4000);
			  driver.get("https://opensource-demo.orangehrmlive.com/");
			  Wait= new WebDriverWait(driver,20);
		}
		@BeforeMethod
		public void beforemethod() 
		{
			System.out.println("beforemethodA");
		}
		@Test
		public void testcases()
		{  
			Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txtUsername']")));
			Login_page1 login= new Login_page1(driver);
			login.sendUsername();
			login.sendpassword();
			login.clickSubmitButton();
		}
		@Test
		public void home()
		{
			
			Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='quickLaunge'])[1]")));
			login_page login= new login_page(driver);
			login.Assignleave();
			login.leavelist();
			login.Applyleave();
			
		}
		@AfterMethod
		public void aftermethod() 
		{
			System.out.println("aftermethodA");
		}
		
		
		@AfterClass
		public void afterclass()
		{
			driver.quit();
		}

}
