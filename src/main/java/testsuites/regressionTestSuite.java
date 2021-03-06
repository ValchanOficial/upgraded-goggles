package testsuites;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import framework.report;
import testcases.loginTestCase;
import testcases.registrationWrongPasswordTestCase;

@RunWith(Suite.class)
@SuiteClasses({
	loginTestCase.class,
	registrationWrongPasswordTestCase.class
})
public class regressionTestSuite {
	
	@BeforeClass
	public static void initTest() {
		report.create("Virtue Mart", "Suite de Regressao");
	}

	@AfterClass
	public static void endTest() {
		report.close();
	}

}