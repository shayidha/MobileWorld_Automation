package Mobile_world;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sign_in {
@Test
	public void signIn() throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shayidha.s\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://mobileworld.banyanpro.com/");
		Thread.sleep(1000);
		driver.findElement(By.className("my-2")).click();
		driver.findElement(By.id("username")).sendKeys("shayidha");
		driver.findElement(By.id("password")).sendKeys("shayu@123");
		Thread.sleep(1000);
		driver.findElement(By.className("btn-block")).click();
		Thread.sleep(1000);
	    }
}
