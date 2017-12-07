package PAOBFactory.Profile;


import FindUnits.FindUnits;
import Log_File.Log;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class Android_Profilepage_Repository implements Profilepage_Repository {

    //AndroidElement BackButton
    @FindBy(how = How.XPATH, using = "//*[@class='android.widget.ImageButton']" )
    public AndroidElement leftmenuopener;

    //AndroidElement Settings
    @FindBy(how = How.XPATH, using = "//*[@text='Settings']")
    public AndroidElement settings;

    //AndroidElement Profile
    @FindBy(how = How.XPATH, using ="//*[@text='Profile']")
    public AndroidElement profile;

    //AndroidELement Close icon
    @FindBy(how = How.ID, using = "icon close")
    public AndroidElement iconclose;

    //AndroidElement BACK BUTTON

    @FindBy(how = How.ID, using = "button back")
    public AndroidElement backbutton;

    //AndroidElement email

    @FindBy(how = How.XPATH, using = "//*[@name='Email']/following-sibling::XCUIElementTypeStaticText[1]")
    public AndroidElement email;


    //AndroidElement name

    @FindBy(how = How.XPATH, using = "//*[@name='Name']/following-sibling::XCUIElementTypeTextField[1]")
    public AndroidElement name;

    //AndroidElement dob

    @FindBy(how = How.XPATH, using = "//*[@name='Date of Birth']/following-sibling::XCUIElementTypeStaticText[1]")
    public AndroidElement dob;



    //AndroidElement gender

    @FindBy(how = How.XPATH, using = "//*[@name='Gender']/following-sibling::XCUIElementTypeTextField[1]")
    public AndroidElement gender;


    //AndroidElement startweight

    @FindBy(how = How.XPATH, using = "//*[@name='Start Weight']/following-sibling::XCUIElementTypeTextField[1]")
    public AndroidElement startweight;


    //AndroidElement startheight

    @FindBy(how = How.XPATH, using = "//*[@name='Start Height']/following-sibling::XCUIElementTypeTextField[1]")
    public AndroidElement startheight;

//AndroidElement Health Condition

    @FindBy(how = How.XPATH, using = "//*[@name='Health Condition']/following-sibling::XCUIElementTypeStaticText[1]")
    public AndroidElement healthcondition;


    //IAndroidElement Food Preference

    @FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText/following-sibling::XCUIElementTypeStaticText[@name='Food Preference'][1]")
    public AndroidElement foodpreference;

    //AndroidElement change pasword

    @FindBy(how = How.ID, using = "Change Password")
    public AndroidElement changepassword;

    //AndroidElement Allow button
    @FindBy(how = How.XPATH, using = "//XCUIElementTypeButton[@name='Allow']")
    public AndroidElement allow;

    //==========================================================================================================
    //Constructor for the IOS_LeftMenu_Repository
    public Android_Profilepage_Repository(AppiumDriver driver2) {
        // TODO Auto-generated constructor stub


        PageFactory.initElements(new AppiumFieldDecorator(driver2,5, TimeUnit.SECONDS),this);
    }

    //==========================================================================================================
    public void Profile_page_validation()
    {
        leftmenuopener.click();
        Log.info("Left Menu opened Properly");
        settings.click();
        Log.info("Settings page opened Properly");



        //Navigate to profile page
        profile.click();
        Log.info("Profile menu clicked");

        //check the email
        Assert.assertEquals(email.getText(),"test50@gmail.com","The user email is wrong");
        Log.info("User email  displayed properly "+email.getText());

        //Check the displayed name
        Assert.assertEquals(name.getText(),"Test50","The user name is wrong");
        Log.info("User name displayed properly "+name.getText());


        //Check the date of birth
        Assert.assertEquals(dob.getText(),"Apr 10, 1982","Date of birth displayed is wrong ");
        Log.info("User date of birth displayed properly "+dob.getText());


        //Check the Gender
        Assert.assertEquals(gender.getText(),"Female","Displayed gender is wrong");
        Log.info("User gender displayed properly "+gender.getText());

        //Check the start weight
        String startweightvalue= FindUnits.WeightUnit(startweight.getText());
        if(startweightvalue.equals("kg")) {
            Assert.assertEquals(startweightvalue, "kg", "Displayed weight unit is not in kg");
        } else {
            Assert.assertEquals(startweightvalue, "lbs", "Displayed weight unit is not in lbs");

        }Log.info("Start weight unit displayed properly "+startweight.getText());

        //Check the start height
        String startheightvalue = FindUnits.HeightUnit(startheight.getText());
        if(startheightvalue.equals("cm")) {
            Assert.assertEquals(startweightvalue, "cm", "Displayed height unit is not in cm");
        }else {
            Assert.assertEquals(startweightvalue, "ft", "Displayed height unit is not in ft");
        }Log.info("Start height unit displayed properly "+startheight.getText());


    }
    public void Check_units_Profile_Page(String units)
    {
        Log.info("----------------------------- Profile PAGE ------------------------------");

        assertThat(units, containsString(startweight.getText().toLowerCase()));
        Log.info("The Units displayed goal page weight is same as in the settings "+startweight.getText());

        if(units== "kg")
        {
            assertThat("cm", containsString(startheight.getText().toLowerCase()));


        }
        else
        {
            assertThat("ft", containsString(startheight.getText().toLowerCase()));
        }

        Log.info("The Units displayed goal page weight is same as in the settings "+startheight.getText());
    }




}