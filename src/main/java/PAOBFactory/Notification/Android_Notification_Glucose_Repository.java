package PAOBFactory.Notification;

import Log_File.Log;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class Android_Notification_Glucose_Repository implements Notification_Glucose_Repository{


    //AndroidElement bell Symbol - alert Button
    @FindBy(how = How.ID, using = "action_alert")
    public AndroidElement alertbutton;

    //AndroidElement card_icon_nonfood
    @FindBy(how = How.ID, using = "card_icon_nonfood")
    public AndroidElement cardiconnonfood;

    //AndroidElement card_icon_nonfood
    @AndroidFindBy(id="tv_uom")
    public List<AndroidElement> glucosevalueunits;

    //Created object of testng SoftAssert class to use It's Properties.
    SoftAssert s_assert = new SoftAssert();


    //=========================================================================
    public Android_Notification_Glucose_Repository(AppiumDriver driver2) {
        // TODO Auto-generated constructor stub


        PageFactory.initElements(new AppiumFieldDecorator(driver2,5, TimeUnit.SECONDS),this);
    }
    //=========================================================================


    public void Check_glucose_units_Notification(String units)
        {
            int i=0,j=0;
            alertbutton.click();
            Log.info("--------------------Notification Page -----------------------");
            Log.info("Pressed the Notification Button");



            do {
                if (glucosevalueunits.get(i).getText().toLowerCase().contains("mg/dl") || glucosevalueunits.get(i).getText().toLowerCase().contains("mmol/l"))

                {

                    assertThat(units, containsString(glucosevalueunits.get(i).getText().toLowerCase()));j=1;
                }
                i++;
            }while(j!=1);

        Log.info("The Units displayed for the current weight same as in the settings "+glucosevalueunits.get(i-1).getText());


       // cardiconnonfood.click();




    }
}
