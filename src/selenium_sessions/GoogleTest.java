package selenium_sessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajesh\\Desktop\\selenium\\drivers\\chromeDriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		
	}
	
	@Test(priority =1, groups = "Title")
	public void googleTitleTest() {
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google");
	}
	
	@Test(priority =2, groups = "Logo")
	public void googleLogoTest() {
		boolean imgPresent = driver.findElement(By.className("lnXdpd")).isDisplayed();
		Assert.assertTrue(imgPresent);
		
	}
	
	@Test(priority =3, groups = "Link")
	public void gmailLinkTest() {
		boolean gmailLink = driver.findElement(By.className("gb_g")).isDisplayed();
		Assert.assertTrue(gmailLink);
	}
	
	@Test(priority =4, groups ="Random")
	public void test1() {
		
	}
	
	@Test(priority =5, groups ="Random")
	public void test2() {
		
	}
	
	@Test(priority =6,groups ="Random")
	public void test3() {
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	


}
