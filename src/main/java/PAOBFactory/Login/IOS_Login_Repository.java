package PAOBFactory.Login;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.testng.Assert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import Log_File.Log;
public class IOS_Login_Repository implements Login_Repository {

    private AppiumDriver driver;

    String notification="\"Glyco\" Would ike to Send You Notifications ";
    @FindBy(how = How.ID, using = "SIGN IN")
    public IOSElement Signin;




    @FindBy(how = How.XPATH, using = "//*[@name='ob_icon_username']/following-sibling::XCUIElementTypeTextField[1]")
    public IOSElement Username;


    @FindBy(how = How.XPATH, using = "//*[@name='ob_icon_password']/following-sibling::XCUIElementTypeSecureTextField[1]")
    public IOSElement Password;


    @FindBy(how = How.XPATH, using = "//XCUIElementTypeOther[@name='Weight']")
    public IOSElement HomeTitle;

    @FindBy(how = How.XPATH, using = "//XCUIElementTypeButton[@name='Don't Allow']")
    public IOSElement dontallow;
    @FindBy(how = How.XPATH, using = "//XCUIElementTypeButton[@name='Allow']")
    public IOSElement allow;

    @FindBy(how = How.XPATH, using = "//XCUIElementTypeAlert[@name='\"Glyco\" Would ike to Send You Notifications ']")
    public IOSElement alertnotification;


    public IOS_Login_Repository(AppiumDriver driver2) {
        // TODO Auto-generated constructor stub


        PageFactory.initElements(new AppiumFieldDecorator(driver2,5, TimeUnit.SECONDS),this);
    }

    public void Press_Signin_Button() {
        allow.click();
        Signin.click();
    }
    public MobileElement Enter_Username_Password()
    {
        String sUserName = "test50@gmail.com";

        Username.sendKeys(sUserName);
        Log.info("Username  "+ sUserName +" entered");
        Password.sendKeys("Test50test");
        Log.info("Password entered");
        return Signin;
    }

    public void Verify_Proper_Login()
    {
        if(alertnotification.getText().equals("\"Gylco\" Would Like to Send You Notifications"))
        {
        allow.click();}
        Assert.assertEquals(HomeTitle.getText(),"Weight","The Login Failed");
    }

    public boolean isAlertPresent()
    {
        try
        {
            driver.switchTo().alert();
            return true;
        }   // try
        catch (NoAlertPresentException Ex)
        {
            return false;
        }   // catch
    }   // isAlertPresent()


}
