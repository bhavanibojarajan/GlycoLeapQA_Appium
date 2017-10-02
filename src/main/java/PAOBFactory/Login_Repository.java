package PAOBFactory;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import static org.openqa.selenium.support.PageFactory.initElements;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.How;

import java.util.concurrent.TimeUnit;

public class Login_Repository {

    @FindBy(how = How.ID, using = "btn_sign_in")
    public AndroidElement Signin;


    @FindBy(how = How.ID, using = "button1")
    public AndroidElement Ok;


    @FindBy(how = How.ID, using = "et_email")
    public AndroidElement Username;


    @FindBy(how = How.ID, using = "et_password")
    public AndroidElement Password;



    AndroidDriver driver;




    public Login_Repository(AndroidDriver driver2) {
        // TODO Auto-generated constructor stub
        this.driver=driver2;

        PageFactory.initElements(new AppiumFieldDecorator(driver,5, TimeUnit.SECONDS),this);
    }


public AndroidElement  Enter_Username_Password()
{

    Username.sendKeys("bhavani.bose@gmail.com");
    Password.sendKeys("Test4test");
    return Signin;
    }






}
