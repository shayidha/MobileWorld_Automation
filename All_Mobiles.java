package Mobile_world;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class All_Mobiles {
@Test
	public void model_1() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shayidha.s\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://mobileworld.banyanpro.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space()='All Mobiles']")).click();
		driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys("Samsung Galaxy s21");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Order")).click();
		Thread.sleep(1000);
		driver.quit();
}
@Test		
	public void model_2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shayidha.s\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://mobileworld.banyanpro.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space()='All Mobiles']")).click();
		driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys("Samsung Galaxy A13");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Order")).click();
		Thread.sleep(1000);
		driver.quit();
}
@Test
	public void model_3() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shayidha.s\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://mobileworld.banyanpro.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space()='All Mobiles']")).click();
		driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys("Samsung Galaxy Z");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Order")).click();
		Thread.sleep(1000);
		driver.quit();
}
@Test
	public void model_4() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shayidha.s\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://mobileworld.banyanpro.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space()='All Mobiles']")).click();
		driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys("Lenovo Legion 2");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("tbody tr:nth-child(4) td:nth-child(5) a:nth-child(1)")).click();
		Thread.sleep(1000);
		driver.quit();
}
@Test
	public void model_5() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shayidha.s\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://mobileworld.banyanpro.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space()='All Mobiles']")).click();
		driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys("Lenovo K13");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Order")).click();
		Thread.sleep(1000);
		driver.quit();
}
@Test
	public void model_6() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shayidha.s\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://mobileworld.banyanpro.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space()='All Mobiles']")).click();
		driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys("Lenovo A8");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Order")).click();
		Thread.sleep(1000);
		driver.quit();
}
@Test
	public void model_7() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shayidha.s\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://mobileworld.banyanpro.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space()='All Mobiles']")).click();
		driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys("Apple iphone xs");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Order")).click();
		Thread.sleep(1000);
		driver.quit();
}
@Test
	public void model_8() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shayidha.s\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://mobileworld.banyanpro.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space()='All Mobiles']")).click();
		driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys("Apple iphone 13");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Order")).click();
		Thread.sleep(1000);
		driver.quit();
}
@Test
	public void model_9() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shayidha.s\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://mobileworld.banyanpro.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space()='All Mobiles']")).click();
		driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys("Apple iphone 12");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Order")).click();
		Thread.sleep(1000);
		driver.quit();
	}

}
