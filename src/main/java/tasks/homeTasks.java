package tasks;

import org.openqa.selenium.WebDriver;
import appobjects.homeAppObject;

public class homeTasks {
	private homeAppObject home;
	
	public homeTasks(WebDriver driver){
		this.home = new homeAppObject(driver);
	}
	
	public void accessRegistrationPage(){
		home.getAccountButton().click();
	}
	
	public void login(String username, String password) {
		home.getUsernameTextField().sendKeys(username);
		home.getPasswordTextField().sendKeys(password);
		home.getLoginButton().click();
	}
	
	public void logout() {
		home.getLoginButton().click();
	}
}