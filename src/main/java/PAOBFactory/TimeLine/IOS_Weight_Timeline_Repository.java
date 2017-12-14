package PAOBFactory.TimeLine;

import Log_File.Log;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class IOS_Weight_Timeline_Repository implements Weight_Timeline_Repository {

    //IOSElement currentweightunits
    @FindBy(how = How.XPATH, using = "//*[@name='WEIGHT']")
    public IOSElement weightbuttontimeline;



    //IOSElement currentweightunits
    @FindBy(how = How.XPATH, using = "//XCUIElementTypeCell[1]/descendant::XCUIElementTypeStaticText[1]")
    public IOSElement weightunits;

    //IOSElement currentweightunits
    @FindBy(how = How.XPATH, using = "//XCUIElementTypeCell[1]/descendant::XCUIElementTypeOther[1]")
    public IOSElement weightcard;

    //Created object of testng SoftAssert class to use It's Properties.
    SoftAssert s_assert = new SoftAssert();


    //=========================================================================
    public IOS_Weight_Timeline_Repository(AppiumDriver driver2) {
        // TODO Auto-generated constructor stub


        PageFactory.initElements(new AppiumFieldDecorator(driver2,5, TimeUnit.SECONDS),this);
    }
    //=========================================================================


    public void Check_units_Timeline(String units)

    {

       //Press the Weight button in the TimeLine to check the units in the time line page
        weightbuttontimeline.click();
        Log.info("Pressed the Weight button in the TimeLine to check the units in the time line page");
        Log.info("--------------------TIMELINE WEIGHT -----------------------");

        //Assert the unit of the weight value.
        assertThat(weightunits.getText().toLowerCase(), containsString(units));
        Log.info("The Units displayed for the weight log  same as in the settings "+weightunits.getText());

        //Press the Weight card icon to check the unit in the weight detail page
        weightcard.click();
        Log.info("Pressed weight Log card to check the unit in the weight detail page");
    }
}
