import org.testng.annotations.Test;

public class LoginTest {
	
	@Test
	public void logintest() throws InterruptedException {
		
		Login l= new Login();
		l.login("standard_user","secret_sauce");
		l.login("locked_out_user", "secret_sauce");
		l.login("performance_glitch_user", "secret_sauce");
		
	}

}
