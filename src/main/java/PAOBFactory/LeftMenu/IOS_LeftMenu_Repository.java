package PAOBFactory.LeftMenu;

import Log_File.Log;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

import static java.lang.Boolean.TRUE;


public class IOS_LeftMenu_Repository implements LeftMenu_Repository {

    SoftAssert s_assert = new SoftAssert();

    private AppiumDriver driver;
    //==========================================================================================================

    //IOSElement LeftMenu Opener
    @FindBy(how = How.ID, using ="button hamburger menu" )
    public IOSElement leftmenuopner;

    //IOSElement LeftMenu ProfileImage
    @FindBy(how = How.ID, using = "iv_nav_header_profile_image")
    public IOSElement leftmenuprofileimage;

    //IOSElement Username
    @FindBy(how = How.ID, using = "Test50")
    public IOSElement username;

    //IOSElement Email
    @FindBy(how = How.ID, using = "test50@gmail.com")
    public IOSElement email;

    //==========================================================================================================
    //IOSElement Settings
    @FindBy(how = How.ID, using = "Settings")
    public IOSElement settings;

    //IOSElement Settings
    @FindBy(how = How.ID, using = "Subscription")
    public IOSElement subscription;
    //IOSElement Ihaveacode
    @FindBy(how = How.ID, using = "I have a code")
    public IOSElement ihaveacode;

    //IOSElement DietitianProfile
    @FindBy(how = How.ID, using = "Dietitians Profile")
    public IOSElement dietitianprofiles;

    //IOSElement AboutGlyco
    @FindBy(how = How.ID, using = "About Glyco")
    public IOSElement aboutglyco;

    //IOSElement Connect Apple Health
    @FindBy(how = How.ID, using = "Connect Apple Health")
    public IOSElement connectappleHealth;

    //IOSElement Write us a review
    @FindBy(how = How.ID, using = "Write us a review")
    public IOSElement writeusareview;

    //IOSElement signout
    @FindBy(how = How.ID, using = "Sign out")
    public IOSElement signout;

    //==========================================================================================================

    //IOSElement Version
    @FindBy(how = How.ID, using = "//XCUIElementTypeStaticText[@name='v3.13.142.c2cbf8c0']")
    public IOSElement version;




    //IOSElement Setting page
    @FindBy(how = How.ID, using = "button back")
    public IOSElement backButton;

    //IOSElement BackButton
    @FindBy(how = How.XPATH, using = "//XCUIElementTypeOther[@name='SETTINGS']")
    public IOSElement settingpage;


    //What's your Unique
    //IOSElement What's your Unique
    @FindBy(how = How.ID, using = "What's your Unique Program ID?")
    public IOSElement ihaveacodetext;

    //IOSElement back button for the ihavecode
    @FindBy(how = How.ID, using = "ob back")
    public IOSElement backButton_ihavecode;



    //IOSElement cancel button
    @FindBy(how = How.XPATH, using = "//XCUIElementTypeNavigationBar[@name='Glyco.HGLSideMenuVC']/XCUIElementTypeButton")
    public IOSElement canceltheleftmenu;


    //Your current subscription plan
    //IOSElement Your current subscription plan
    @FindBy(how = How.ID, using = "Your current subscription plan")
    public IOSElement subscriptiontext;


    //IOSElement Dietitians Profile
    @FindBy(how = How.XPATH, using = "//XCUIElementTypeOther[@name='Dietitians Profile']")
    public IOSElement dietitiansprofiletext;

    //IOSElement Glyco
    @FindBy(how = How.XPATH, using = "//XCUIElementTypeOther[@name='About']")
    public IOSElement glycotext;

    //==========================================================================================================

    @FindBy(how = How.XPATH, using = "//XCUIElementTypeButton[@name='Don't Allow']")
    public IOSElement dontallow;
    @FindBy(how = How.XPATH, using = "//XCUIElementTypeButton[@name='Allow']")
    public IOSElement allow;

    @FindBy(how = How.XPATH, using = "//XCUIElementTypeAlert[@name='\"Glyco\" Would Like to Send You Notifications']")
    public IOSElement alertnotification;




    //==========================================================================================================
    //Constructor for the Android_LeftMenu_Repository
    public IOS_LeftMenu_Repository(AppiumDriver driver2) {
        // TODO Auto-generated constructor stub

         AppiumDriver driver=driver2;
        PageFactory.initElements(new AppiumFieldDecorator(driver2, 5, TimeUnit.SECONDS), this);
    }

    //==========================================================================================================

    @Override
    public void LeftMenu_Navigation(String useremail) {

        /*if(isAlertPresent())
        {
          allow.click();}*/

            allow.click();


        leftmenuopner.click();

        Log.info("Left Menu Opened Properly");
        Assert.assertEquals(username.getText(),"Test50","UserName Displayed in the LeftMenu");
        Log.info("User name "+username.getText() +" Displayed in the Left Menu Page" );

        Assert.assertEquals(email.getText(),"test50@gmail.com","UserName Displayed in the LeftMenu");
        Log.info("Email of the user "+email.getText() +" Displayed in the Left Menu Page" );


        //Navigate to setting Page
        settings.click();
        Log.info("Setting menu clicked");
        Assert.assertEquals(settingpage.getText(),"SETTINGS","Opened the Setting Page");
        Log.info("Setting page opened properly and asserted with value "+settingpage.getText());
        backButton.click();
        Log.info("Back button clicked");


        //Navigate to I have a Code Page


        ihaveacode.click();
        Log.info("I have a code menu clicked");
        Assert.assertEquals(ihaveacodetext.getText(),"What's your Unique Program ID?","Opened the I Have a code  Page");
        Log.info("I have a code opened properly and asserted with value "+ ihaveacodetext.getText());
        backButton_ihavecode.click();
        Log.info("Back button clicked");

        //Navigate to Subscription

        subscription.click();
        Log.info("Subscription menu clicked");
        Assert.assertEquals(subscriptiontext.getText(),"Your current subscription plan","Opened the Subscription page");
        Log.info("Subscription opened properly and asserted with the value "+subscriptiontext.getText());
        backButton.click();
        Log.info("Back button clicked");


        //Navigate to Dietitian Profiles

        dietitianprofiles.click();
        Log.info("Dietitian Profiles menu clicked");
        Assert.assertEquals(dietitiansprofiletext.getText(),"Dietitians Profile","Opened the Dietitian Profile Page");
        Log.info("Dietitian Profiles opened properly and asserted with the value "+dietitiansprofiletext.getText());
        backButton.click();
        Log.info("Back button clicked");


        //Navigate to About Glyco

        aboutglyco.click();
        Log.info("About Glyco menu clicked");
        Assert.assertEquals(glycotext.getText(),"About","Opened the Dietitian Profile Page");
        Log.info("About Glyco opened properly and asserted with the value "+glycotext.getText());
        backButton.click();

        canceltheleftmenu.click();




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