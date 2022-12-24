package Tutorial1;


import org.testng.annotations.Test;
public class Demo1 {
	@Test(priority=3)
	public void HomePage() {
		System.out.println("Home page functionality");
	}
	@Test(priority=2)
	public void LoginPage() {
		System.out.println("Login Page functionality");
	}
	@Test(priority=1)
	public void PIMPage() {
		System.out.println("PIM Page functionality");
	}
	@Test(priority=5)
	public void Dashboard() {
		System.out.println("Dash board functionality");
	}
	@Test(priority=4)
	public void EmployeePage() {
		System.out.println("EmployeePage functionality");

}
}
