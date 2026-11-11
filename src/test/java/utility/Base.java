package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Base {
	
	public WebDriver driver;
	
	@BeforeMethod()
	
	public void lauchurl()
	{
		driver =new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.navigate().refresh();
	}

}
