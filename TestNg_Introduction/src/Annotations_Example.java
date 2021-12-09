import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations_Example {
	
	@Test
	public void method1() {
		
		System.out.println("CALLING METHOD 1");
	}
	
	
	
	@BeforeMethod
	public void beforemethod() {
		
		System.out.println("CALLING BEFORE METHOD");
	}
	
	
	@AfterMethod
	public void aftermethod() {
		
		System.out.println("CALLING AFTER METHOD");
	}
	@Test
public void method2() {
		
		System.out.println("CALLING METHOD 2");
	}
	
	@Test
public void method3() {
		
		System.out.println("CALLING METHOD 3");
	}

	
	
}
