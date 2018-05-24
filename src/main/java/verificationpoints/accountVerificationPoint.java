package verificationpoints;

import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.Status;
import framework.report;
import framework.screenshot;

public class accountVerificationPoint {
	
	private static final String PASSWORD_ERROR_MESSAGE = "The password you entered do not match.";
	
	private WebDriver driver;
	
	public accountVerificationPoint(WebDriver driver) {
		this.driver = driver;
	}
	
	public void checkPasswordFieldErrorMessage() {
		if(this.pageContains(PASSWORD_ERROR_MESSAGE)) {
			report.log(Status.PASS, "A mensagem de erro foi exibida corretamente.", screenshot.capture(driver));
		} else {
			report.log(Status.FAIL, "A mensagem de erro nao foi exibida conforme esperado.", screenshot.capture(driver));
		}
	}

	private boolean pageContains(String text){
		return this.driver.getPageSource().contains(text);
	}
	
}