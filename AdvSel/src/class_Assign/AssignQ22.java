package class_Assign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AssignQ22 extends AssignQ22_Fetch
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		
		String un = getData("Sheet1",2,0);
		String pass = getData("Sheet1",2,1);
		
		AssignQ22_POM a = new AssignQ22_POM(driver);
		
		a.UN(un);
		Thread.sleep(2000);
		a.Pass(pass);
		Thread.sleep(2000);
		a.Btn();
	}
}
