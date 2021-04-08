package selenium_sessions;

import org.testng.annotations.Test;

public class TestNG_InvocationCountTest {
	
	@Test(invocationCount=10)
	public void sum() {
		int a =10;
		int b=20;
		int c=30;
		int sum = a+b+c;
		System.out.println(sum);
	}

}
