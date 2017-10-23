package PAOBFactory.Profile;


import FindUnits.FindUnits;
import Log_File.Log;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class Android_Profilepage_Repository implements Profilepage_Repository {

    //IOSElement BackButton
    @FindBy(how = How.ID, using = "button hamburger menu")
    public IOSElement leftmenuopener;

    //IOSElement Settings
    @FindBy(how = How.ID, using = "Settings")
    public IOSElement settings;

    //IOSElement Profile
    @FindBy(how = How.ID, using = "Profile")
    public IOSElement profile;

    //IOSELement Close icon
    @FindBy(how = How.ID, using = "icon close")
    public IOSElement iconclose;

    //IOSElement BACK BUTTON

    @FindBy(how = How.ID, using = "button back")
    public IOSElement backbutton;

    //IOSElement email

    @FindBy(how = How.XPATH, using = "//*[@name='Email']/following-sibling::XCUIElementTypeStaticText[1]")
    public IOSElement email;


    //IOSElement name

    @FindBy(how = How.XPATH, using = "//*[@name='Name']/following-sibling::XCUIElementTypeTextField[1]")
    public IOSElement name;

    //IOSElement dob

    @FindBy(how = How.XPATH, using = "//*[@name='Date of Birth']/following-sibling::XCUIElementTypeStaticText[1]")
    public IOSElement dob;



    //IOSElement gender

    @FindBy(how = How.XPATH, using = "//*[@name='Gender']/following-sibling::XCUIElementTypeTextField[1]")
    public IOSElement gender;


    //IOSElement startweight

    @FindBy(how = How.XPATH, using = "//*[@name='Start Weight']/following-sibling::XCUIElementTypeTextField[1]")
    public IOSElement startweight;


    //IOSElement startheight

    @FindBy(how = How.XPATH, using = "//*[@name='Start Height']/following-sibling::XCUIElementTypeTextField[1]")
    public IOSElement startheight;

//IOSElement Health Condition

    @FindBy(how = How.XPATH, using = "//*[@name='Health Condition']/following-sibling::XCUIElementTypeStaticText[1]")
    public IOSElement healthcondition;


    //IOSElement Food Preference

    @FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText/following-sibling::XCUIElementTypeStaticText[@name='Food Preference'][1]")
    public IOSElement foodpreference;

    //IOSElement change pasword

    @FindBy(how = How.ID, using = "Change Password")
    public IOSElement changepassword;

    //IOSElement Allow button
    @FindBy(how = How.XPATH, using = "//XCUIElementTypeButton[@name='Allow']")
    public IOSElement allow;

    //==========================================================================================================
    //Constructor for the IOS_LeftMenu_Repository
    public Android_Profilepage_Repository(AppiumDriver driver2) {
        // TODO Auto-generated constructor stub


        PageFactory.initElements(new AppiumFieldDecorator(driver2,5, TimeUnit.SECONDS),this);
    }

    //==========================================================================================================
    public void Profile_page_validation()
    {  allow.click();
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




}