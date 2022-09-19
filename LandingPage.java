package Mobile_world;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LandingPage {
WebDriver driver;


public LandingPage(WebDriver driver) {
    this.driver=driver;
    PageFactory.initElements(driver,this);
}

//sign up

@FindBy(xpath="//button[@type='submit']")
WebElement Signin1;

@FindBy(css= "a[href='signup.html']")
WebElement Signup1;

@FindBy(id =  "myName")
WebElement firstname;

@FindBy(xpath = "//input[@placeholder='Last Name']")
WebElement lastname;

@FindBy(xpath ="//input[@placeholder='Enter Email']")
WebElement email;

@FindBy(xpath ="//input[@placeholder='Password']")
WebElement signuppassword;

@FindBy(xpath ="//input[@type='date']")
WebElement date;

@FindBy(xpath ="//div[@class='col-md-3']//input[@name='gender']")
WebElement gender;

@FindBy(xpath ="//input[@placeholder='91XXXXXXXXXX']")
WebElement mobile;

@FindBy(css= " textarea[placeholder='Short Bio'] ")
WebElement shortbio;

@FindBy(xpath= "//button[@type='submit']")
WebElement register;

//Sign In

@FindBy(id="username")
WebElement username;

@FindBy(xpath="//input[@id='password']")
WebElement signinpassword;

@FindBy(xpath="//a[@type='submit']")
WebElement submit;

//allmobiles

@FindBy(xpath="//a[normalize-space()='All Mobiles']")
WebElement AllMobiles;

@FindBy(xpath="//input[@id='myInput']")
WebElement Search;

@FindBy(linkText="Order")
WebElement Order;

@FindBy(xpath="//button[@id='btn-back-to-top']")
WebElement uparrow;

public void goTo()
{
     driver.get("https://mobileworld.banyanpro.com/");
}

public void signup1application(String fname,String lname,String mail,String uppwd,String dob,String phone,String bio) throws InterruptedException
{
    Signin1.click();
    Thread.sleep(1000);
     Signup1.click();
     Thread.sleep(1000);
     firstname.sendKeys(fname);
     Thread.sleep(1000);
     lastname.sendKeys(lname);
     Thread.sleep(1000);
     email.sendKeys(mail);
     Thread.sleep(1000);
     signuppassword.sendKeys(uppwd);
     Thread.sleep(1000);
     date.sendKeys(dob);
     Thread.sleep(1000);
     gender.click();
     Thread.sleep(1000);
     mobile.sendKeys(phone);
     Thread.sleep(1000);
     shortbio.sendKeys(bio);
     Thread.sleep(1000);
     register.click();
     driver.quit();
}

public void Signin1application(String name, String pwd) throws InterruptedException
{
     Signin1.click();
     username.sendKeys(name);
     Thread.sleep(1000);
     signinpassword.sendKeys(pwd);
     Thread.sleep(1000);
     submit.click();
     driver.quit();
}

public void allmobiles1application(String name ) throws InterruptedException
{
       AllMobiles.click();
       Thread.sleep(1000);
       Search.sendKeys(name);
       Thread.sleep(1000);
       Order.click();
       Thread.sleep(1000);
       uparrow.click();
       Thread.sleep(1000);
       driver.quit();
}
}
