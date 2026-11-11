package DataEntryform;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dataentryfields {
	
	public WebDriver driver;
	WebDriverWait W1;
	
	@FindBy(xpath="//input[@id=\"name\"]")
	WebElement Name;
	
	@FindBy(xpath="//input[@id=\"email\"]")
	WebElement Email;
	
	@FindBy(xpath="//input[@id=\"phone\"]")
	WebElement Phone;
	
	public void Name() throws InterruptedException
	{
		Thread.sleep(3000);
		JavascriptExecutor Js =(JavascriptExecutor) driver;
		Js.executeScript("window.scrollBy(0,300)");
		W1.until(ExpectedConditions.visibilityOf(Name));
		Name.sendKeys("Ashok");
	}
	
	public void Email() throws InterruptedException
	{
		Thread.sleep(3000);
		W1.until(ExpectedConditions.visibilityOf(Email));
		Email.sendKeys("ashoksurya410@gmail.com");
	}
	
	public void Phone() throws InterruptedException
	{
		Thread.sleep(3000);
		W1.until(ExpectedConditions.visibilityOf(Phone));
		Phone.sendKeys("8737828892");
	}
	
	public Dataentryfields(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
		W1 = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

}
