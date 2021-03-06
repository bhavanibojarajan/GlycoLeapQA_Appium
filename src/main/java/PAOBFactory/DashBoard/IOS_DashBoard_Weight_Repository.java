package PAOBFactory.DashBoard;

import Log_File.Log;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class IOS_DashBoard_Weight_Repository implements DashBoard_Weight_Repository{


    //IOSElement currentweightunits
    @FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name='CURRENT']/following-sibling::XCUIElementTypeStaticText[2]")
    public IOSElement currentweightunits;

    //IOSElement goalweightunits
    @FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name='GOAL']/following-sibling::XCUIElementTypeStaticText[2]")
    public IOSElement goalweightunits;

    //IOSElement currentweightunits
    @FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name='START']/following-sibling::XCUIElementTypeStaticText[2]")
    public IOSElement startweightunits;


    //Created object of testng SoftAssert class to use It's Properties.
    SoftAssert s_assert = new SoftAssert();


    //=========================================================================
    public IOS_DashBoard_Weight_Repository(AppiumDriver driver2) {
        // TODO Auto-generated constructor stub


        PageFactory.initElements(new AppiumFieldDecorator(driver2,5, TimeUnit.SECONDS),this);
    }
    //=========================================================================

    public WebElement CurrentWeightUnit()
    {
        return currentweightunits;
    }
    public void Check_units_DashBoard(String units)
    {



        Log.info("Press the home Page button to check the weight unt in the Dashboard ");
        Log.info("-------------------- DashBoard Page -----------------------");

        //Check the unit value with the  current weight unit vaule
        assertThat(currentweightunits.getText().toLowerCase(), containsString(units));
        Log.info("The Units displayed for the current weight same as in the settings "+currentweightunits.getText());

        //Check the unit value with the  start weight unit vaule
        assertThat(startweightunits.getText().toLowerCase(),containsString(units));
        Log.info("The Units displayed for the start weight same as in the settings "+startweightunits.getText());


        //Check the unit value with the  start weight unit vaule
        assertThat(goalweightunits.getText().toLowerCase(),containsString(units));
        Log.info("The Units displayed for the goal weight same as in the settings "+goalweightunits.getText());

    }
}
