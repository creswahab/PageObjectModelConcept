package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageObject {

	public static WebElement userName(WebDriver driver) {
		return driver.findElement(By.name("email"));
	} 
		
	public static WebElement password(WebDriver driver) {
		return driver.findElement(By.name("password"));
	}
	
	public static WebElement loginbut(WebDriver driver) {
		return driver.findElement(By.id("submitBTN"));
	}
	
	public static WebElement myProfile(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div/div[2]/ul/li[3]/a"));
	}
	
	public static WebElement stateCheck(WebDriver driver) {
		return driver.findElement(By.id("State"));
	}
	
	public static WebElement updateProfile(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"profile\"]/div/div[6]/button"));
	}
	
	public static WebElement dashboard(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[1]/div[2]/ul/li[1]/a"));
	}
	
}
