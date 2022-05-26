package zerodha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class login_page1 
{
WebDriver driver;
	
	@FindBy(xpath="//input[@id='userid']")
	private WebElement UserID;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement Pass;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement Click;
	
	@FindBy(xpath="//input[@id='pin']")
	private WebElement PIN;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement PINclick;
	
	public login_page1(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void sendUsername()
	{
		WebDriverWait wait= new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='userid']")));
		UserID.sendKeys("OZ5698");
	}
	
	
	public void sendpassword()
	{
		Pass.sendKeys("nikhil@123");
	}
	
	public void click()
	{
		 Click.click();
	}

	public void pin() throws InterruptedException
	{
		Thread.sleep(2000);
		PIN.sendKeys("311095");
	}
    
	public void pinclick()
	{
		PINclick.click();
	}
}
