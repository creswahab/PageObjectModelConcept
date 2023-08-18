package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class PageObjectModelWithoutFindBy {
	
	public static WebElement email;
	public static WebElement password;
	public static WebElement submitBTN;
	
	@Test
	public void login() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pwaha\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://phptravels.net/login");
		
		PageFactory.initElements(driver, PageObjectModelWithoutFindBy.class);
		
		email.sendKeys("pwahab04@gmail.com");
		password.sendKeys("demouser");
		submitBTN.click();
		
		driver.quit();
		
	
	}

}
