package PAOBFactory.Login;

import PAOBFactory.Login.Login_Repository;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidElement;

import static org.openqa.selenium.support.PageFactory.initElements;

import org.openqa.selenium.support.How;

import java.util.concurrent.TimeUnit;
import Log_File.Log;

public class Android_Login_Repository implements Login_Repository {

    @FindBy(how = How.ID, using = "btn_sign_in")
    public AndroidElement Signin;


    @FindBy(how = How.ID, using = "button1")
    public AndroidElement Ok;


    @FindBy(how = How.ID, using = "et_email")
    public AndroidElement Username;


    @FindBy(how = How.ID, using = "et_password")
    public AndroidElement Password;


    @FindBy(how = How.XPATH, using = "//*[@text='Home']")
    public AndroidElement HomeTitle;






    public Android_Login_Repository(AppiumDriver driver2) {
        // TODO Auto-generated constructor stub


        PageFactory.initElements(new AppiumFieldDecorator(driver2,5, TimeUnit.SECONDS),this);
    }


public MobileElement Enter_Username_Password()
{
    String sUserName = "bhavani.bose@gmail.com";

    Username.sendKeys("bhavani.bose@gmail.com");
    Log.info("Username is "+ sUserName );
    Password.sendKeys("Test4test");
    Log.info("Password is entered");
    return Signin;
    }






}
