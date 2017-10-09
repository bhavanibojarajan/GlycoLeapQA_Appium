package PAOBFactory.LeftMenu.SettingPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


import java.util.concurrent.TimeUnit;


public class Android_Settingspage_Repository implements Settingspage_Repository{

    //AndroidElement BackButton
    @FindBy(how = How.XPATH, using = "//*[@content-desc='Navigate up']")
    public AndroidElement backbutton;

    //AndroidElement Settings
    @FindBy(how = How.XPATH, using = "//*[@text='Settings']")
    public AndroidElement settings;

    //AndroidElement Profile
    @FindBy(how = How.XPATH, using = "//*[@text='Profile']")
    public AndroidElement profile;


    //AndroidElement Goal
    @FindBy(how = How.XPATH, using = "//*[@text='Goal']")
    public AndroidElement goal;

    //AndroidElement FooD Tap Button
    @FindBy(how = How.ID, using = "sw_food")
    public AndroidElement foodtapbutton;

    //AndroidElement Glucose Tap Button
    @FindBy(how = How.ID, using = "sw_glucose")
    public AndroidElement glucosetapbutton;



    //AndroidElement Save Image Tap Button
    @FindBy(how = How.ID, using = "sw_save_images")
    public AndroidElement saveimagetapbutton;



    //AndroidElement Glucose Tap Button
    @FindBy(how = How.ID, using = "sw_location")
    public AndroidElement locationtapbutton;


    //AndroidElement Unit System
    @FindBy(how = How.XPATH, using = "//*[@text='Unit System']")
    public AndroidElement units;



    //AndroidElements glucoseunit
    @FindBy(how = How.ID, using = "sw_glucose_unit")
    public AndroidElement glucoseunit;


    //AndroidElements weightunit
    @FindBy(how = How.ID, using = "sw_weight_unit")
    public AndroidElement weightunit;

    //AndroidElements weightunit
    @FindBy(how = How.ID, using = " navigationBarBackground")
    public AndroidElement privacybackbutton;

    //AndroidElement Privacy Settings
    @FindBy(how = How.XPATH, using = "//*[@text='Privacy Settings']")
    public AndroidElement privacy;




    //AndroidElement Privacy setting page header

    @FindBy(how = How.XPATH, using = "//*[@text='App info']")
    public AndroidElement privacyTitle;





    //==========================================================================================================
    //Constructor for the Android_LeftMenu_Repository
    public Android_Settingspage_Repository(AppiumDriver driver2) {
        // TODO Auto-generated constructor stub


        PageFactory.initElements(new AppiumFieldDecorator(driver2, 5, TimeUnit.SECONDS), this);
    }

    //==========================================================================================================

public void Setting_Navigation() {
        String value="OFF";

    //Navigate to profile page
        profile.click();
        Assert.assertEquals(profile.getText(),"Profile","Opened Profile Page");
        backbutton.click();

        //Navigate to Goal page
        goal.click();
        Assert.assertEquals(goal.getText(),"Goal","Opened Goal Page");
        backbutton.click();


        //Try to Toggle the Food button

        foodtapbutton.click();

    foodtapbutton.click();
            //Try to Toggle the Glucose
                glucosetapbutton.click();
    glucosetapbutton.click();

   /* if(value.equals(glucosetapbutton.getText()))

        glucosetapbutton.click();*/




      //Navigate to Unit System
            units.click();
            Assert.assertEquals(units.getText(),"Unit System", "Opened Unit System");
            backbutton.click();


           /*//Navigate to Privacy
            privacy.click();
            Assert.assertEquals(privacyTitle.getText(),"App info","Opened App info");
            privacybackbutton.click();
            */



}



public String  CheckUnits_glucose() {
    units.click();
    return glucoseunit.getText();
      }
public String  CheckUnits_weight() {
    units.click();
        return weightunit.getText();

}



}


