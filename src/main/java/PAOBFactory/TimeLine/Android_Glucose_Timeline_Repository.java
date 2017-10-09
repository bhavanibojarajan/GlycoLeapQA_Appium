package PAOBFactory.TimeLine;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class Android_Glucose_Timeline_Repository implements Glucose_Timeline_Repository {

    //AndroidElement currentweightunits
    @FindBy(how = How.ID, using = "btn_glucose")
    public AndroidElement weightbuttontimeline;

    //AndroidElement goalweightunits
    @FindBy(how = How.ID, using = "card_icon")
    public AndroidElement cardicon;

    //AndroidElement currentweightunits
    @FindBy(how = How.ID, using = "card_uom")
    public AndroidElement glucoseunits;

    //AndroidElement currentweightunits
    @FindBy(how = How.ID, using = "card_name")
    public AndroidElement weightvalue;

    //Created object of testng SoftAssert class to use It's Properties.
    SoftAssert s_assert = new SoftAssert();


    //=========================================================================
    public Android_Glucose_Timeline_Repository(AppiumDriver driver2) {
        // TODO Auto-generated constructor stub


        PageFactory.initElements(new AppiumFieldDecorator(driver2,5, TimeUnit.SECONDS),this);
    }
    //=========================================================================


    public void Check_units_Timeline(String units)
    {
        s_assert.assertEquals(glucoseunits.getText(),units,"Units matches with current Weight in the DashBoard");



    }
}
