package PAOBFactory.LeftMenu.SettingPage;

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


public class IOS_Settingspage_Repository implements Settingspage_Repository{

    //IOSElement BackButton
    @FindBy(how = How.ID, using = "button hamburger menu")
    public IOSElement leftmenuopener;

    //IOSElement Settings
    @FindBy(how = How.ID, using = "Settings")
    public IOSElement settings;

    //IOSElement Profile
    @FindBy(how = How.ID, using = "Profile")
    public IOSElement profile;


    //IOSElement Goal
    @FindBy(how = How.ID, using = "Goal")
    public IOSElement goal;

    //IOSElement FooD Tap Button
    @FindBy(how = How.XPATH, using = "//XCUIElementTypeSwitch[@name='Food']")
    public IOSElement foodtapbutton;

    //AndroidElement Glucose Tap Button
    @FindBy(how = How.XPATH, using = "//XCUIElementTypeSwitch[@name='Glucose']")
    public IOSElement glucosetapbutton;



    //AndroidElement Save Image Tap Button
    @FindBy(how = How.XPATH, using = "//XCUIElementTypeSwitch[@name='Save to Photos']")
    public IOSElement saveimagetapbutton;



    //IOSElement Location
    @FindBy(how = How.ID, using = "Enable Location")
    public IOSElement locationtapbutton;


    //IOSElement Unit System
    @FindBy(how = How.ID, using = "Measurement Units")
    public IOSElement units;



    //IOSElements privacy
    @FindBy(how = How.ID, using = "Privacy Settings")
    public IOSElement privacysetting;




    //IOSElement BACK BUTTON

    @FindBy(how = How.ID, using = "back button")
    public IOSElement backbutton;


//IOSElement PROFILE PAGE

    @FindBy(how = How.ID, using = "PROFILE")
    public IOSElement profilepage;


    //IOSElement GOAL PAGE
    @FindBy(how = How.ID, using = "GOAL")
    public IOSElement goalpage;



    //IOSElement Units PAGE
    @FindBy(how = How.ID, using = "UNITS")
    public IOSElement unitspage;

    //IOSElement Allow button
    @FindBy(how = How.XPATH, using = "//XCUIElementTypeButton[@name='Allow']")
    public IOSElement allow;

    //IOSElement Units PAGE kg
    @FindBy(how = How.XPATH, using = "//XCUIElementTypeButton[@name='kg']")
    public IOSElement weightunitkg;


    //IOSElement Units PAGE lbs
    @FindBy(how = How.XPATH, using = "//XCUIElementTypeButton[@name='lbs']")
    public IOSElement weightunitlbs;

    //IOSElement Units PAGE mg/DL
    @FindBy(how = How.ID, using = "//XCUIElementTypeButton[@name='mg/DL']")
    public IOSElement glucoseunitsmg;

    //IOSElement Units PAGE mmol/L
    @FindBy(how = How.ID, using = "//XCUIElementTypeButton[@name='mmol/L']")
    public IOSElement glucoseunitsmmol;

    //==========================================================================================================
    //Constructor for the IOS_LeftMenu_Repository
    public IOS_Settingspage_Repository(AppiumDriver driver2) {
        // TODO Auto-generated constructor stub


        PageFactory.initElements(new AppiumFieldDecorator(driver2,5, TimeUnit.SECONDS),this);
    }

    //==========================================================================================================

    public void Setting_Navigation() {
        // String value="OFF";

        leftmenuopener.click();
        Log.info("Left Menu opened Properly");
        settings.click();
        Log.info("Settings page opened Properly");



        //Navigate to profile page
        profile.click();
        Log.info("Profile menu clicked");
        Assert.assertEquals(profilepage.getText(),"PROFILE","Opened Profile Page");
        Log.info("Profile opened properly and asserted with the value "+profilepage.getText());
        backbutton.click();
        Log.info("Back button clicked");


        //Navigate to Goal page
        goal.click();
        Log.info("Goal menu clicked");
        Assert.assertEquals(goalpage.getText(),"PERSONAL GOAL","Opened Goal Page");
        Log.info("Goal opened properly and asserted with the value "+goalpage.getText());
        backbutton.click();
        Log.info("Back button clicked");

        //Try to Toggle the Food button

        /*foodtapbutton.click();
        foodtapbutton.click();
            Log.info("Food Toggle Button Working");

    //Try to Toggle the Glucose
    glucosetapbutton.click();
    glucosetapbutton.click();
    Log.info("Glucose Toggle Button Working");


   /* if(value.equals(glucosetapbutton.getText()))

        glucosetapbutton.click();*/




        //Navigate to Unit System
        units.click();
        Log.info("Unit System menu clicked");
        Assert.assertEquals(unitspage.getText(),"UNITS", "Opened Unit System");
        Log.info("Unit System opened properly and asserted with the value "+unitspage.getText());
        backbutton.click();
        Log.info("Back button clicked");
        backbutton.click();

           /*//Navigate to Privacy
            privacy.click();
            Assert.assertEquals(privacyTitle.getText(),"App info","Opened App info");
            privacybackbutton.click();
            */



    }


/*
    public String  CheckUnits_glucose_mg() {
        units.click();
        Log.info("Unit System menu clicked");
        return glucoseunitsmg.getText();
    }

    public String  CheckUnits_glucose_mmol() {
        units.click();
        Log.info("Unit System menu clicked");
        return glucoseunitsmmol.getText();
    }
    public String  CheckUnits_weight_kg() {
        units.click();
        Log.info("Unit System menu clicked");
        return weightunitkg.getText();

    }
    public String  CheckUnits_weight_lbs() {
        units.click();
        Log.info("Unit System menu clicked");
        return weightunitlbs.getText();

    }
*/

    public String  CheckUnits_glucose() {return glucoseunitsmg.getText();
    }

    public String  CheckUnits_weight(){return weightunitkg.getText();

    }


}
