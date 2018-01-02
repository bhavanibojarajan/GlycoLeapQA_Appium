package PAOBFactory.LeftMenu.SettingPage;

import Log_File.Log;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
    @FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name='Profile']")
    public IOSElement profile;


    //IOSElement Goal
    @FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name='Goal']")
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


    //IOSELement Close icon
    @FindBy(how = How.ID, using = "icon close")
    public IOSElement iconclose;

    //IOSElement BACK BUTTON

    @FindBy(how = How.ID, using = "button back")
    public IOSElement backbutton;


//IOSElement PROFILE PAGE

    @FindBy(how = How.XPATH, using = "//XCUIElementTypeOther[@name='Profile']")
    public IOSElement profilepage;


    //IOSElement GOAL PAGE
    @FindBy(how = How.XPATH, using = "//XCUIElementTypeOther[@name='Personal Goal']")
    public IOSElement goalpage;



    //IOSElement Units PAGE
    @FindBy(how = How.XPATH, using = "//XCUIElementTypeOther[@name='Units']")
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
    @FindBy(how = How.XPATH, using = "//XCUIElementTypeButton[@name='mg/DL']")
    public IOSElement glucoseunitsmg;

    //IOSElement Units PAGE mmol/L
    @FindBy(how = How.XPATH, using = "//XCUIElementTypeButton[@name='mmol/L']")
    public IOSElement glucoseunitsmmol;

    @FindBy(how = How.XPATH, using = "//XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton")
    public IOSElement canceltheleftmenu;



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
        Assert.assertEquals(profilepage.getText(),"Profile","Opened Profile Page");
        Log.info("Profile opened properly and asserted with the value "+profilepage.getText());
        backbutton.click();
        Log.info("Back button clicked");


        //Navigate to Goal page
        goal.click();
        Log.info("Goal menu clicked");
        Assert.assertEquals(goalpage.getText(),"Personal Goal","Opened Goal Page");
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
        Assert.assertEquals(unitspage.getText(),"Units", "Opened Unit System");
        Log.info("Unit System opened properly and asserted with the value "+unitspage.getText());
        backbutton.click();
        Log.info("Back button clicked");
        backbutton.click();

      canceltheleftmenu.click();

           /*//Navigate to Privacy
            privacy.click();
            Assert.assertEquals(privacyTitle.getText(),"App info","Opened App info");
            privacybackbutton.click();
            */



    }



    public String  CheckUnits_glucose() { units.click();
        ExpectedConditions.visibilityOf(glucoseunitsmg);
        Log.info("glucose mg element value" + glucoseunitsmg.getAttribute("value"));
        Log.info("glucose mmol element value" + glucoseunitsmmol.getAttribute("value"));
        if (glucoseunitsmg.getAttribute("value")=="1") {

            glucoseunitsmmol.click();
            Log.info("Unit System menu clicked" + glucoseunitsmmol.getText());
            return "mmol/l";
        }
        else
        {
            glucoseunitsmg.click();
            Log.info("Unit System menu clicked "+glucoseunitsmg.getText());
            return "mg/dl";

        }


    }

    public String  CheckUnits_weight() {
        units.click();
        ExpectedConditions.visibilityOf(weightunitkg);
        Log.info("kg element value" + weightunitkg.getAttribute("value"));
        Log.info("lbs element value" + weightunitlbs.getAttribute("value"));
        if (weightunitkg.getAttribute("value")=="1") {

            weightunitlbs.click();
            Log.info("Unit System menu clicked");
            return "lbs";
        }
        else
          {
            weightunitkg.click();
            Log.info("Unit System menu clicked");
            return "kg";

        }
    }



    public void Reach_Goal_Page()
    {
        backbutton.click();
        Log.info("reached setting page");
        goal.click();
        Log.info("Goal page opened properly");


    }
    public void Reach_Profile_Page()
    {
        backbutton.click();
        Log.info("reached setting page");
        profile.click();
        Log.info("Profile page opened properly");
    }


    public void Reach_to_Home_Page(){
        backbutton.click();
        backbutton.click();
        canceltheleftmenu.click();
        Log.info("Reached the Home page");
    }
}
