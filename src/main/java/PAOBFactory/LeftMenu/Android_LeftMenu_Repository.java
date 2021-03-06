package PAOBFactory.LeftMenu;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import org.testng.asserts.SoftAssert;
import java.util.concurrent.TimeUnit;
  import Log_File.Log;



public class Android_LeftMenu_Repository implements LeftMenu_Repository {

    SoftAssert s_assert = new SoftAssert();

    //==========================================================================================================
    //FindElement
//android.widget.ImageButton[@content-desc='Open navigation drawer']
    //AndroidElement LeftMenu Opener
    @FindBy(how = How.XPATH, using ="//*[@class='android.widget.ImageButton']" )
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
    @FindBy(how = How.XPATH, using = "//*[@text='Settings']")
    public AndroidElement settings;

    //AndroidElement Settings
    @FindBy(how = How.XPATH, using = "//*[@text='Subscription']")
    public AndroidElement subscription;
    //AndroidElement Ihaveacode
    @FindBy(how = How.XPATH, using = "//*[@text='I have a code']")
    public AndroidElement ihaveacode;

    //AndroidElement DietitianProfile
    @FindBy(how = How.XPATH, using = "//*[@text='Dietitian Profiles']")
    public AndroidElement dietitianprofiles;

    //AndroidElement AboutGlyco
    @FindBy(how = How.XPATH, using = "//*[@text='About Glyco']")
    public AndroidElement aboutglyco;

    //AndroidElement Version
    @FindBy(how = How.ID, using = "iv_slot1")
    public AndroidElement version;

    //AndroidElement BackButton
    @FindBy(how = How.XPATH, using = "//*[@content-desc='Navigate up']")
    public AndroidElement backButton;


    //AndroidElement BackButton
    @FindBy(how = How.ID, using = "btn_back")
    public AndroidElement backButtonUniquecode;


    //What's your Unique
    //AndroidElement What's your Unique
    @FindBy(how = How.ID, using = "btn_programID")
    public AndroidElement ihaveacodetext;



    //Your current subscription plan
    //AndroidElement What's your Unique
    @FindBy(how = How.XPATH, using = "//*[@text='Your current subscription plan']")
    public AndroidElement subscriptiontext;

    //AndroidElement Glyco
    @FindBy(how = How.XPATH, using = "//*[@text='Glyco']")
    public AndroidElement glycotext;

    //==========================================================================================================
    //Constructor for the Android_LeftMenu_Repository
    public Android_LeftMenu_Repository(AppiumDriver driver2) {
        // TODO Auto-generated constructor stub


        PageFactory.initElements(new AppiumFieldDecorator(driver2, 5, TimeUnit.SECONDS), this);
    }

    //==========================================================================================================

    @Override
    public void LeftMenu_Navigation() {

        leftmenuopner.click();

        Log.info("Left Menu Opened Properly");
        Assert.assertEquals(username.getText(),"Test50","UserName Displayed in the LeftMenu");
        Log.info("User name "+username.getText() +" Displayed in the Left Menu Page" );

        Assert.assertEquals(email.getText(), "test50@gmail.com","Email Displayed in the LeftMenu");
        Log.info("Email of the user "+email.getText() +" Displayed in the Left Menu Page" );


        //Navigate to setting Page
        settings.click();
        Log.info("Setting menu clicked");
        Assert.assertEquals(settings.getText(),"Settings","Opened the Setting Page");
        Log.info("Setting page opened properly and asserted with value "+settings.getText());
        backButton.click();
        Log.info("Back button clicked");


        //Navigate to I have a Code Page
        leftmenuopner.click();

        ihaveacode.click();
        Log.info("I have a code menu clicked");
        Assert.assertEquals(ihaveacodetext.getText(),"Where do I find my UPID?","Opened the I Have a code  Page");
        Log.info("I have a code opened properly and asserted with value "+ ihaveacodetext.getText());
        backButtonUniquecode.click();
        Log.info("Back button clicked");

        //Navigate to Subscription
        leftmenuopner.click();
        subscription.click();
        Log.info("Subscription menu clicked");
        Assert.assertEquals(subscriptiontext.getText(),"Your current subscription plan","Opened the Subscription page");
        Log.info("Subscription opened properly and asserted with the value "+subscriptiontext.getText());
        backButton.click();
        Log.info("Back button clicked");


        //Navigate to Dietitian Profiles
        leftmenuopner.click();
        dietitianprofiles.click();
        Log.info("Dietitian Profiles menu clicked");
        Assert.assertEquals(dietitianprofiles.getText(),"Dietitian Profiles","Opened the Dietitian Profile Page");
        Log.info("Dietitian Profiles opened properly and asserted with the value "+dietitianprofiles.getText());
        backButton.click();
        Log.info("Back button clicked");


        //Navigate to About Glyco
        leftmenuopner.click();
        aboutglyco.click();
        Log.info("About Glyco menu clicked");
        Assert.assertEquals(glycotext.getText(),"Glyco","Opened the Dietitian Profile Page");
        Log.info("About Glyco opened properly and asserted with the value "+glycotext.getText());
        backButton.click();






    }

    public void Left_Menu_and_setting_Opener() {

        leftmenuopner.click();
        Log.info("Left Menu Opened Properly");
        settings.click();
        Log.info("Setting menu clicked");

    }


    }
