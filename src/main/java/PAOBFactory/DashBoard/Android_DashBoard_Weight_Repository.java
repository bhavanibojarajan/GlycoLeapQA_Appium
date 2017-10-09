package PAOBFactory.DashBoard;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class Android_DashBoard_Weight_Repository implements DashBoard_Weight_Repository{


    //AndroidElement currentweightunits
    @FindBy(how = How.ID, using = "uom_weight")
    public AndroidElement currentweightunits;

    //AndroidElement goalweightunits
    @FindBy(how = How.ID, using = "goalUOM_weight")
    public AndroidElement goalweightunits;

    //AndroidElement currentweightunits
    @FindBy(how = How.ID, using = "startUOM_weight")
    public AndroidElement startweightunits;


    //Created object of testng SoftAssert class to use It's Properties.
    SoftAssert s_assert = new SoftAssert();


    //=========================================================================
    public Android_DashBoard_Weight_Repository(AppiumDriver driver2) {
        // TODO Auto-generated constructor stub


        PageFactory.initElements(new AppiumFieldDecorator(driver2,5, TimeUnit.SECONDS),this);
    }
    //=========================================================================


    public void Check_units_DashBoard(String units)
    {
        s_assert.assertEquals(currentweightunits.getText(),units,"Units matches with current Weight in the DashBoard");
        s_assert.assertEquals(startweightunits.getText(),units,"Units matches with start Weight in the DashBoard");

        s_assert.assertEquals(startweightunits.getText(),units,"Units matches with start Weight in the DashBoard");


    }
}
