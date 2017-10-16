package PAOBFactory.Login;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import Log_File.Log;
public class IOS_Login_Repository implements Login_Repository {

    @FindBy(how = How.ID, using = "SIGN IN")
    public IOSElement Signin;




    @FindBy(how = How.XPATH, using = "//*[@name='ob_icon_username']/following-sibling::XCUIElementTypeTextField[1]")
    public IOSElement Username;


    @FindBy(how = How.XPATH, using = "//*[@name='ob_icon_password']/following-sibling::XCUIElementTypeSecureTextField[1]")
    public IOSElement Password;


    @FindBy(how = How.XPATH, using = "//XCUIElementTypeNavigationBar[contains(@name,'Weight')]")
    public IOSElement HomeTitle;



    public IOS_Login_Repository(AppiumDriver driver2) {
        // TODO Auto-generated constructor stub


        PageFactory.initElements(new AppiumFieldDecorator(driver2,5, TimeUnit.SECONDS),this);
    }

    public void Press_Signin_Button() {


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
        Assert.assertEquals(HomeTitle.getText(),"Weight","The Login Failed");
    }
}
