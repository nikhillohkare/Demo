package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_page1 
{
WebDriver driver;
	
	@FindBy(xpath="//input[@id='txtUsername']")
	private WebElement Username;
	
	@FindBy(xpath="//input[@id='txtPassword']")
	private WebElement Password;
	
	@FindBy(xpath="//input[@id='btnLogin']")
	private WebElement SubmitButton;
	
	public Login_page1(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void sendUsername()
	{
		WebDriverWait wait= new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txtUsername']")));
		Username.sendKeys("Admin");
	}
	
	
	public void sendpassword()
	{
		Password.sendKeys("admin123");
	}
	
	public void clickSubmitButton()
	{
		SubmitButton.click();
	}
	
	

}
