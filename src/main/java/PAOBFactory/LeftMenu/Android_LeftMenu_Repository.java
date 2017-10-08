package PAOBFactory.LeftMenu;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class Android_LeftMenu_Repository implements LeftMenu_Repository {

    //==========================================================================================================
    //FindElement

    //AndroidElement LeftMenu Opener
    @FindBy(how = How.XPATH, using ="//android.widget.ImageButton[@content-desc()='Open navigation drawer'" )
    public AndroidElement leftmenuopner;

    //AndroidElement LeftMenu ProfileImage
    @FindBy(how = How.ID, using = "iv_nav_header_profile_image")
    public AndroidElement leftmenuprofileimage;

    //AndroidElement Username
    @FindBy(how = How.ID, using = "tv_nav_header_username")
    public AndroidElement username;

    //AndroidElement Email
    @FindBy(how = How.ID, using = "tv_nav_header_email")
    public AndroidElement email;


    //AndroidElement Settings
    @FindBy(how = How.XPATH, using = "//*[@text()='Settings']")
    public AndroidElement settings;

    //AndroidElement Ihaveacode
    @FindBy(how = How.XPATH, using = "//*[@text()='I have a code']")
    public AndroidElement ihaveacode;

    //AndroidElement DietitianProfile
    @FindBy(how = How.XPATH, using = "//*[@text()='Dietitian Profiles']")
    public AndroidElement dietitianprofiles;

    //AndroidElement AboutGlyco
    @FindBy(how = How.XPATH, using = "//*[@text()='About Glyco']")
    public AndroidElement aboutglyco;

    //AndroidElement Version
    @FindBy(how = How.ID, using = "iv_slot1")
    public AndroidElement version;


  //==========================================================================================================
    //Constructor for the Android_LeftMenu_Repository
    public Android_LeftMenu_Repository(AppiumDriver driver2) {
        // TODO Auto-generated constructor stub


        PageFactory.initElements(new AppiumFieldDecorator(driver2, 5, TimeUnit.SECONDS), this);
    }

    //==========================================================================================================

    @Override
    public void LeftMenu_Navigation() {

    }
}