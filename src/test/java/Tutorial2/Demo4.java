package Tutorial2;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo4 {
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test(priority=1)
	public void googleTitle() {
		driver.get("https://www.google.com/");
		System.out.println("driver.get current url");
	}
	@Test(priority=2)
	public void facebookTitle() {
		driver.get("https://www.facebook.com/login/");
		System.out.println("driver.get current url");
	}
	@Test(priority=3)
	public void gurutitle() {
		driver.get("https://www.guru99.com/hp-alm-install.html");
		System.out.println("driver.get current url");
	}
	@Test(priority=4)
	public void flipcart() {
		driver.get("https://www.flipkart.com/");
		System.out.println("driver.get flipkart url");
	}
	@Test(priority=5)
	public void amazonTitle() {
		driver.get("https://www.amazon.in/");
		System.out.println("driver.get amazon url");
	}
	@Test(priority=6)
	public void kiteTitle() {
		driver.get("https://kite.zerodha.com/?next=%2Fmargins");
		System.out.println("driver.get zerodha url");
	}
	@AfterMethod
	public void afterpass() {
		System.out.println("After pass ");
	}
		
	

}
