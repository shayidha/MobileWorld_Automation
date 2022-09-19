package Mobile_world;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sign_up1 {
@Test
public void signup() throws InterruptedException {
	     // TODO Auto-generated method stub
	     System.setProperty("webdriver.chrome.driver","C:\\Users\\shayidha.s\\Downloads\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     //driver.manage().window().maximize();
	     //  driver.get("https://mobileworld.azurewebsites.net/");
	     LandingPage landingpage2 = new LandingPage(driver);
	     landingpage2.goTo();
	     Thread.sleep(1000);
	     landingpage2.signup1application("Shayidha","S","shayu2000@gmail.com","shayidha" ,"11/30/2000","9887767787","Hello!!!How are u??");	
	}

}
