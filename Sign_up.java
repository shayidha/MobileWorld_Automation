package Mobile_world;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sign_up {
@Test

	public void signUp() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shayidha.s\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://mobileworld.banyanpro.com/");
		Thread.sleep(1000);
		driver.findElement(By.className("my-2")).click();
		driver.findElement(By.linkText("Sign up")).click();
		driver.findElement(By.id("myName")).sendKeys("Shayidha");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("S");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[placeholder='Enter Email']")).sendKeys("shayu2000@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("shayidha");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[type='date']")).sendKeys("11/30/2000");
		driver.findElement(By.cssSelector("div[class='col-md-2'] input[name='gender']")).click();
		driver.findElement(By.cssSelector("input[placeholder='91XXXXXXXXXX']")).sendKeys("9887767787");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("textarea[placeholder='Short Bio']")).sendKeys("Hello!!!How are u??");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Register']")).click();
		Thread.sleep(1000);
	}

}
