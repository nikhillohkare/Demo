package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class login_page 
{
WebDriver driver;
	
	@FindBy(xpath="(//div[@class='quickLaunge'])[1]")
	private WebElement Assignleave;
	
	@FindBy(xpath="(//div[@class='quickLaunge'])[2]")
	private WebElement leavelist;
	
	@FindBy(xpath="(//div[@class='quickLaunge'])[4]")
	private WebElement Applyleave;
	
	public login_page(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Assignleave()
	{
		WebDriverWait wait= new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txtUsername']")));
		boolean result=Assignleave.isDisplayed();
		
		System.out.println("Result is" + result);
	}
	
	
	public void  leavelist()
	{
		boolean result=leavelist.isDisplayed();
		System.out.println("Result is" + result);
	}
	
	public void Applyleave()
	{
		boolean result=Applyleave.isDisplayed();
		System.out.println("Result is" + result);
	}
	
	//input[@id='txtUsername']
			//input[@id='txtPassword']
			//input[@id='btnLogin']
}
	


