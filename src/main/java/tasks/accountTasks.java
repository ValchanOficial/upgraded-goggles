package tasks;

import org.openqa.selenium.WebDriver;
import appobjects.accountAppObject;

public class accountTasks {
	
	private accountAppObject appObjects;
	
	public accountTasks(WebDriver driver){
		this.appObjects = new accountAppObject(driver);
	}
	
	public void fillForm(String name, String userName, String password, String confirmPassword, String email){
		appObjects.getNameTextField().sendKeys(name);
		appObjects.getUsernameTextField().sendKeys(userName);
		appObjects.getPasswordTextField().sendKeys(password);
		appObjects.getConfirmPasswordTextField().sendKeys(confirmPassword);
		appObjects.getEmailTextField().sendKeys(email);
	}
	
	public void toRegister(){
		appObjects.getRegisterButton().click();
	}
}