package selenium_sessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*------------------------04/05/21------------------------------------
 * # TestNG--Testing new generation Framework.
Unit level testing
open source
available in the form of jar files
Also called Java unit testing framework
only can be worked with Java
also called TDD (test driven development)Framework
Advantages:
-design test cases in a systematic way
-generate very good html report
-gives lot of annotations
-lots of properties like priority of test cases, sequence of test cases, dependency, grouping,
data provider feature(execute same test case again and again)

# installation:
-download testng plugin for eclipse
-"http://beust.com/eclipse/"
-go to "help"--install new software--paste the url above--follow the steps
-go to properties on project.click java build path and add testng library

#There are 3 sections in a testng class
precondition, test and postcondition

#Sequencing is very important in TestNG

#@BeforeMethod
 @Test --1
 @Aftermethod
 
 @BeforeMethod
 @Test --2
 @Aftermethod
 
 BeforeMethod and AfterMethod will always be paired with the test case. This applies to 
 n number of test cases
 
 #Test cases can be sequenced using "priority" keyword
 
 #We can also use "groups" keyword to group the test cases under different groups. This generates
 a very systematic report
 
 #"dependsOnMethods" keyword is used to add dependency of one test case to another. eg: loginPageTest
 needs to pass in order to test other pages. so if all the test cases are dependent on loginPageTest
 we can use dependsOnMethods keyword in that test to add dependency. if loginPageTest fails, 
 all other test cases with the dependency are skipped.see example
 
 #"invocationCount" keyword is used to execute same test case multiple times.
 
 #to handle exception, we can use "expectedExceptions" keyword. this means we know that some
 exception may occur during the test case execution, so skip that exception and 
 execute the test case. we need to give <exceptionName>.class.
 
 #to execute test cases from different classes, we don't need to go to each class and run test
 one by one, we can simply create an xml file and run the suite from this xml file. xml file has
 the suite name, test name, and the classes name all together combinely.see example
 
 #to generate report, refresh the project. under testng_outputs, go to index.html and right click
 click properties and copy the path. paste the path to browser and you can see the testng report for
 the executed tests.
 

*/

public class TestNG_tutorial1 {
	
	//pre condition annotations--starting with @Before keyword
	
	@BeforeSuite //1
	public void setUp() {
		System.out.println("@BeforeSuite--Setup system property for chrome");
	}
	
	@BeforeTest //2
	public void launchBrowser() {
		System.out.println("@BeforeTest--Launch the browser");
	}
	
	@BeforeClass  //3
	public void loginMethod() {
		System.out.println("@BeforeClass--login to the app");
	}
	
	@BeforeMethod  //4
	public void enterUrl() {
		System.out.println("@BeforeMethod--Enter URL");
	}
	
	
	
	//Test case--starting with @Test
	
	@Test //5
	public void googleTitleTest() {
		System.out.println("@Test--Google title test");
	}
	
	@Test
	public void searchTest() {
		System.out.println("@Test--search test");
	}
	
	@Test
	public void googleLogoTest() {
		System.out.println("@Test--google logo test");
	}
	
	//post condition annotations--starting with @After
	
	@AfterMethod //6
	public void logOut() {
		System.out.println("@AfterMethod--Log out from app");
	}
	
	@AfterClass //7
	public void closebrowser() {
		System.out.println("@AfterClass--Close browser");
	}
	
	@AfterTest //8
	public void deleteAllCookies() {
		System.out.println("@AfterTest--deleteAllCookies");
	}
	
	@AfterSuite //9
	public void generateTestReport() {
		System.out.println("@AfterSuite--Generate test report");
	}
	
	

}
