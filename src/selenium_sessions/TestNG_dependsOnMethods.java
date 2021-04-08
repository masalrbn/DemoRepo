package selenium_sessions;

import org.testng.annotations.Test;

public class TestNG_dependsOnMethods {
	
	@Test
	public void loginTest() {
		System.out.println("login test");
	}
	
	@Test (dependsOnMethods="loginTest")
	public void homePageTest() {
		System.out.println("home page totally depends on login test");
	}
	
	@Test (dependsOnMethods="loginTest")
	public void searchPageTest() {
		System.out.println("search page test");
	}
	
	@Test (dependsOnMethods="loginTest")
	public void registrationPageTest() {
		System.out.println("registration page test");
	}

}
