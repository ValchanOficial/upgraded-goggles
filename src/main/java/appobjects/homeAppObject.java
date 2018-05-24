package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//Classe para mapeamento dos objetos da pagina inicial.
public class homeAppObject {	
	private WebDriver driver;
	
	public homeAppObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getAccountButton() {
		return this.driver.findElement(By.linkText("Account"));
	}
	
	public WebElement getUsernameTextField() {
		return this.driver.findElement(By.id("modlgn-username"));
	}

	public WebElement getPasswordTextField() {
		return this.driver.findElement(By.id("modlgn-passwd"));
	}
	
	public WebElement getLoginButton() {
		return this.driver.findElement(By.name("Submit"));
	}
}