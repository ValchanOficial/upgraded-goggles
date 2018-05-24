package verificationpoints;

import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.Status;
import framework.report;
import framework.screenshot;

public class loginVerificationPoint {
	
	private static final String INVALID_LOGIN_MESSAGE = "Username and password do not match or you do not have an account yet.";
	
	private WebDriver driver;
	
	public loginVerificationPoint(WebDriver driver) {
		this.driver = driver;
	}
	
	public void checkInvalidLoginMessage() {
		if(this.pageContains(INVALID_LOGIN_MESSAGE)) {
			report.log(Status.PASS, "Mensagem exibida corretamente.", screenshot.capture(driver));
		} else {
			report.log(Status.FAIL, "Mensagem nao exibida conforme esperado.", screenshot.capture(driver));
		}
	}

	private boolean pageContains(String text){
		return this.driver.getPageSource().contains(text);
	}
	
}
