package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageObject.LoginPageObject;
import PageObject.LoginPageObjectFindBy;

public class LoginTestCaseFindBy {

	@Test
	public void login() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pwaha\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://phptravels.net/login");
		
		PageFactory.initElements(driver, LoginPageObjectFindBy.class);
		
		LoginPageObjectFindBy.username.sendKeys("pwahab04@gmail.com");
		LoginPageObjectFindBy.password.sendKeys("demouser");
		LoginPageObjectFindBy.loginButton.click();
		
		
		Thread.sleep(5000);
		
		LoginPageObjectFindBy.myProfile.click();
		LoginPageObjectFindBy.state.sendKeys("Tamil Nadu");
		LoginPageObjectFindBy.updateProfile.click();
		LoginPageObjectFindBy.dashboard.click();
		
		driver.quit();
		
	}
}
