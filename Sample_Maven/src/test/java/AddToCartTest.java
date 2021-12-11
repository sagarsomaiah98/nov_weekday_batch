import org.testng.annotations.Test;

public class AddToCartTest {
	
	@Test
	public void addTocart() throws InterruptedException {
		
		AddToCart a = new AddToCart();
		a.addTocart("standard_user", "secret_sauce");
	}

}
