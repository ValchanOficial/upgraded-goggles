package testcases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.Status;
import framework.drivers;
import framework.report;
import framework.screenshot;
import tasks.accountTasks;
import tasks.homeTasks;
import verificationpoints.accountVerificationPoint;

public class registrationWrongPasswordTestCase {
	
	private WebDriver driver;
	
	private homeTasks homePage; 
	private accountTasks accountPage;
	private accountVerificationPoint verificationPoint;
	
	@Before
	public void setUp() {
		report.startTest("Register Fails");
		driver = drivers.getFirefoxDriver();
		
		homePage = new homeTasks(driver);
		accountPage = new accountTasks(driver);
		verificationPoint = new accountVerificationPoint(driver);
	}
	
	@Test
	public void testMain() {
		driver.get("http://demo.virtuemart.net/");
		driver.manage().window().maximize();
		
		report.log(Status.INFO, "The website has started.", screenshot.capture(driver));
		
		homePage.accessRegistrationPage();
		
		report.log(Status.INFO, "Register Page loaded.", screenshot.capture(driver));
		
		accountPage.fillForm("Ana Terra", "anaterra", "mascada123", "mascada1234", "ana@terra.com.br");		
		accountPage.toRegister();
		
		verificationPoint.checkPasswordFieldErrorMessage();
	}	

	@After
	public void tearDown() {
		driver.quit();
	}
}
