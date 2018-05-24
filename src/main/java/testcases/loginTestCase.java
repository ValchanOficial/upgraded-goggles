package testcases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.Status;
import framework.drivers;
import framework.report;
import framework.screenshot;
import tasks.homeTasks;
import verificationpoints.loginVerificationPoint;

public class loginTestCase {
	
	private WebDriver driver;
	
	private homeTasks homePage;
	private loginVerificationPoint verificationPoint;
	
	@Before
	public void setUp() {
		report.startTest("Login");
		driver = drivers.getFirefoxDriver();
		
		homePage = new homeTasks(driver);
		verificationPoint = new loginVerificationPoint(driver);
	}
	
	@Test
	public void testMain() {
		driver.get("http://demo.virtuemart.net/");
		driver.manage().window().maximize();
		
		report.log(Status.INFO, "The website was loaded.", screenshot.capture(driver));
		
		homePage.login("invalid", "invalid");
		
		report.log(Status.INFO, "Dados inseridos no formulario.", screenshot.capture(driver));

		verificationPoint.checkInvalidLoginMessage();
	}	

	@After
	public void tearDown() {
		driver.quit();
	}
}