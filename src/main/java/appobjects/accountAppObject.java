package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// Classe para mapeamento dos objetos da pagina de registro de usuarios.
public class accountAppObject {
	private WebDriver driver;
	
	public accountAppObject(WebDriver driver){
		this.driver = driver;
	}

	public WebElement getEmailTextField(){		
		return driver.findElement(By.id("email_field"));
	}
	
	public WebElement getUsernameTextField(){		
		return driver.findElement(By.id("username_field"));
	}

	public WebElement getNameTextField(){
		return driver.findElement(By.id("name_field"));
	}	

	public WebElement getPasswordTextField(){		
		return driver.findElement(By.id("password_field"));
	}
	
	public WebElement getConfirmPasswordTextField(){		
		return driver.findElement(By.id("password2_field"));
	}
	
	public WebElement getRegisterButton(){
		return driver.findElement(By.xpath("//*[@type = 'submit' and text() = 'Register']"));
	}
}