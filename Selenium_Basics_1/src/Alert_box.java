import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class Alert_box extends TestBase{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		new TestBase();
		
	driver.get("https://www.testandquiz.com/selenium/testing.html");
	
	driver.manage().window().maximize();
	
	
	driver.findElement(By.xpath("//button[contains(text(),'Generate Alert Box')]")).click();
	Thread.sleep(3000);
	
	Alert al= driver.switchTo().alert();
	//al.accept(); //click ok
	al.dismiss(); //click cancel
		
		

	}

}
