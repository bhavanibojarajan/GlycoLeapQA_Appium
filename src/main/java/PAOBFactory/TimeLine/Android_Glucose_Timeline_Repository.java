package PAOBFactory.TimeLine;

import Log_File.Log;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class Android_Glucose_Timeline_Repository implements Glucose_Timeline_Repository {

    //AndroidElement currentweightunits
    @FindBy(how = How.ID, using = "btn_glucose")
    public AndroidElement glucosebuttontimeline;

    //AndroidElement goalweightunits
    @FindBy(how = How.ID, using = "card_icon")
    public AndroidElement cardicon;

    //AndroidElement currentweightunits
    @FindBy(how = How.ID, using = "card_uom")
    public AndroidElement glucoseunits;

    //AndroidElement currentweightunits
    @FindBy(how = How.ID, using = "card_name")
    public AndroidElement glucosecarditem;

    //Created object of testng SoftAssert class to use It's Properties.
    SoftAssert s_assert = new SoftAssert();
    //=========================================================================
    //AndroidElement Home Page button
    @FindBy(how = How.ID, using = "tv_slot1")
    public AndroidElement homebutton;


    //=========================================================================

    //=========================================================================
    public Android_Glucose_Timeline_Repository(AppiumDriver driver2) {
        // TODO Auto-generated constructor stub


        PageFactory.initElements(new AppiumFieldDecorator(driver2,5, TimeUnit.SECONDS),this);
    }
    //=========================================================================


    public void Check_units_Timeline(String units)
    {
        //Press the Weight button in the TimeLine to check the units in the time line page
        homebutton.click();
        Log.info("Home button reached");
        glucosebuttontimeline.click();
        Log.info("Pressed the Weight button in the TimeLine to check the units in the time line page");
        Log.info("--------------------TIMELINE WEIGHT -----------------------");

        //Assert the unit of the weight value.
        assertThat(units, containsString(glucoseunits.getText().toLowerCase()));
        Log.info("The Units displayed for the weight log  same as in the settings "+glucoseunits.getText());

        //Press the Weight card icon to check the unit in the weight detail page
        glucosecarditem.click();
        Log.info("Pressed weight Log card to check the unit in the glucose detail page");





    }
}
