package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjectFindBy {

	@FindBy(name="email")
	public static WebElement username;
	
	@FindBy(name="password")
	public static WebElement password;
	
	@FindBy(id="submitBTN")
	public static WebElement loginButton;
	
	@FindBy(xpath="//*[@id='fadein']/div[1]/div/div[1]/div[2]/ul/li[3]/a")
	public static WebElement myProfile;
	
	
	@FindBy(id="State")
	public static WebElement state;
	
	@FindBy(xpath="//*[@id='profile']/div/div[6]/button")
	public static WebElement updateProfile;
	

	@FindBy(xpath="//*[@id='fadein']/div[1]/div/div[1]/div[2]/ul/li[1]/a")
	public static WebElement dashboard;
	
}
