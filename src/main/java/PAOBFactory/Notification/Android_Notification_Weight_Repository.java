package PAOBFactory.Notification;

import Log_File.Log;
import PAOBFactory.DashBoard.DashBoard_Weight_Repository;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class Android_Notification_Weight_Repository implements Notification_Weight_Repository{


    //AndroidElement bell Symbol - alert Button
    @FindBy(how = How.ID, using = "action_alert")
    public AndroidElement alertbutton;

    //AndroidElement card_icon_nonfood
    @FindBy(how = How.ID, using = "card_icon_nonfood")
    public AndroidElement cardiconnonfood;

    //AndroidElement card_icon_nonfood
    @FindBy(how = How.ID, using = "tv_uom")
    public AndroidElement weightvalueunits;

    //Created object of testng SoftAssert class to use It's Properties.
    SoftAssert s_assert = new SoftAssert();


    //=========================================================================
    public Android_Notification_Weight_Repository(AppiumDriver driver2) {
        // TODO Auto-generated constructor stub


        PageFactory.initElements(new AppiumFieldDecorator(driver2,5, TimeUnit.SECONDS),this);
    }
    //=========================================================================


    public void Check_units_Notification(String units)
        {
            alertbutton.click();
            Log.info("Pressed the Notification Button");
        s_assert.assertEquals(weightvalueunits.getText(),units,"Units matches with weight in the Notification");
        Log.info("The Units displayed for the current weight same as in the settings "+weightvalueunits.getText());


        cardiconnonfood.click();




    }
}
