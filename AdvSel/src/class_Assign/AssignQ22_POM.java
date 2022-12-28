package class_Assign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssignQ22_POM 
{
	//Declaration
	@FindBy(name = "email")
	private WebElement username;
	
	@FindBy(name = "pass")
	private WebElement password;
	
	@FindBy(name = "login")
	private WebElement LoginBtn;
	
	//Initialization
	AssignQ22_POM(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Utilization
	public void UN(String un)
	{
		username.sendKeys(un);
	}
	
	public void Pass(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void Btn()
	{
		LoginBtn.click();
	}
}
