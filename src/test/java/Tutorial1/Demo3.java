package Tutorial1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class Demo3 {
	WebDriver driver;
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	public void loginFuctionality()
	{
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		
	}
	
	public void validatePIMPageTitle()
	{
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		
		String a =driver.getCurrentUrl();
		if(a.contains("pim"))
		{
			System.out.println("Test case is pass");
		}
		else {
			System.out.println("test case is fail");
		}
		
	}
	
	

}
