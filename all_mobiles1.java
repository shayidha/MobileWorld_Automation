package Mobile_world;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class all_mobiles1 {

@Test(dataProvider="mobdata")
  public void allmob(String data) throws InterruptedException {
         
       System.setProperty("webdriver.chrome.driver","C:\\Users\\shayidha.s\\Downloads\\chromedriver_win32\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       LandingPage landingpage3 = new LandingPage(driver);
       landingpage3.goTo();
       Thread.sleep(1000);
       landingpage3.allmobiles1application(data);
     }
@DataProvider
public Object[][] mobdata(){
	Object[][] data=new Object[8][1];
	data[0][0]="Samsung Galaxy s21";
	data[1][0]="Samsung Galaxy A13";
	data[2][0]="Samsung Galaxy z";
	data[3][0]="Lenovo K13";
	data[4][0]="Lenovo A8";
	data[5][0]="Apple iphone xs";
	data[6][0]="Apple iphone 13";
	data[7][0]="Apple iphone 12";
	return data;	
}
}
