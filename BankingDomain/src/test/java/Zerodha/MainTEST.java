package Zerodha;

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



import zerodha.login_page1;

public class MainTEST
{
	WebDriver driver;
	//WebDriverWait Wait;
		@BeforeClass
		public void beforeclass() throws InterruptedException
		{    
		      System.setProperty("webdriver.chrome.driver","E:\\newchrome\\chromedriver_win32\\chromedriver.exe");
		   driver=new ChromeDriver();
		   Thread.sleep(4000);
			  driver.get("https://kite.zerodha.com/");
			//  Wait= new WebDriverWait(driver,20);
		}
		@BeforeMethod
		public void beforemethod() 
		{
			System.out.println("beforemethodA");
		}
		@Test
		public void testcases() throws InterruptedException
		{  
			//Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txtUsername']")));
			login_page1 login= new login_page1(driver);
			login.sendUsername();
			login.sendpassword();
			login.click();
			login.pin();
			login.pinclick();
			
			//span[text()='GOLDBEES']
		}
		
		@AfterMethod
		public void aftermethod() 
		{
			System.out.println("aftermethodA");
		}
		@AfterClass
		public void afterclass()
		{
			
		}

}
