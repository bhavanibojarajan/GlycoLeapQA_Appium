package PAOBFactory.Notification;

import Log_File.Log;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.asserts.SoftAssert;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class IOS_Notification_Weight_Repository implements Notification_Weight_Repository{


    //IOSElement bell Symbol - alert Button
    @FindBy(how = How.ID, using = "button notification")
    public IOSElement alertbutton;

    //AndroidElement card_icon_nonfood
    @FindBy(how = How.ID, using = "card_icon_nonfood")
    public IOSElement cardiconnonfood;

    //AndroidElement card_icon_nonfood
    @FindBy(how = How.XPATH, using = "//XCUIElementTypeButton[@name='button back']")
    public IOSElement backbutton;

    //AndroidElement card_icon_nonfood
    @FindBy(how = How.XPATH, using = "//XCUIElementTypeOther/XCUIElementTypeImage/following-sibling::XCUIElementTypeStaticText[2]")
    public List<IOSElement> weightvalueunits;

    //Created object of testng SoftAssert class to use It's Properties.
    SoftAssert s_assert = new SoftAssert();


    //=========================================================================
    public IOS_Notification_Weight_Repository(AppiumDriver driver2) {
        // TODO Auto-generated constructor stub


        PageFactory.initElements(new AppiumFieldDecorator(driver2,5, TimeUnit.SECONDS),this);
    }
    //=========================================================================


    public void Check_weight_units_Notification(String units)
        {

            Log.info("Press the Notification bell button");
            ExpectedConditions.visibilityOf(alertbutton);


            alertbutton.click();
            Log.info("--------------------Notification Page -----------------------");
            Log.info("Pressed the Notification Button");

            int i=0,j=0;

            do {
                String unitLabel = weightvalueunits.get(i).getText().toLowerCase();

                if (unitLabel.contains("kg") || unitLabel.contains("lbs"))
                {
                        Log.info("The unit displayed "+unitLabel);
                    assertThat(units, containsString(unitLabel));
                    j=1;
                }
                i++;
            }while(j!=1);

            Log.info("The Units displayed for the current weight same as in the settings "+ weightvalueunits.get(i).getText());




            backbutton.click();
            Log.info("Back button pressed");






    }
}
