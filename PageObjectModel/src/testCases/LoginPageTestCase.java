package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageObject.LoginPageObject;

public class LoginPageTestCase {

@Test
public void login() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pwaha\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://phptravels.net/login");
		
		LoginPageObject.userName(driver).sendKeys("pwahab04@gmail.com");
		LoginPageObject.password(driver).sendKeys("demouser");
		LoginPageObject.loginbut(driver).click();
		
		Thread.sleep(5000);
		
		LoginPageObject.myProfile(driver).click();
		LoginPageObject.stateCheck(driver).sendKeys("Tamil Nadu");
		LoginPageObject.updateProfile(driver).click();
		LoginPageObject.dashboard(driver).click();
		
		driver.quit();
	}
}
