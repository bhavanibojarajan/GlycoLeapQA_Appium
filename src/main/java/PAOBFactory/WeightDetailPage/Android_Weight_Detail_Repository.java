package PAOBFactory.WeightDetailPage;

import Log_File.Log;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class Android_Weight_Detail_Repository implements Weight_Detail_Repository
{

    //AndroidElement start  weight in the Weight detail page
    @FindBy(how = How.ID, using = "pv_item_activity_weight_detail_weightleft")
    public AndroidElement startweight;

    //AndroidElement current weight in the Weight detail page
    @FindBy(how = How.ID, using = "pv_item_activity_weight_detail_weightmid")
    public AndroidElement currentweight;

    //AndroidElement goal weight in the Weight detail page
    @FindBy(how = How.ID, using = "tv_item_activity_weight_detail_weightright")
    public AndroidElement goalweight;

    //AndroidElement Previous weight in the Weight detail page
    @FindBy(how = How.ID, using = "tv_item_activity_weight_detail_unitleft")
    public AndroidElement previousweight;

    //AndroidElement Change in weight in the Weight detail page
    @FindBy(how = How.ID, using = "tv_item_activity_weight_detail_unitmid")
    public AndroidElement changeinweight;



    //AndroidElement BackButton
    @FindBy(how = How.XPATH, using = "//*[@content-desc='Navigate up']")
    public AndroidElement backButton;


    //Created object of testng SoftAssert class to use It's Properties.
    SoftAssert s_assert = new SoftAssert();


    //=========================================================================
    public Android_Weight_Detail_Repository(AppiumDriver driver2) {
        // TODO Auto-generated constructor stub


        PageFactory.initElements(new AppiumFieldDecorator(driver2,5, TimeUnit.SECONDS),this);
    }
    //=========================================================================


    public void Check_units_Weight_Detail(String units)
    {
        Log.info("-------------WEIGHT DETAIL PAGE------------------------------");

        assertThat(units, containsString(previousweight.getText().toLowerCase()));
        Log.info("The Units displayed for the previous  weight same as in the settings "+previousweight.getText());

        assertThat(units, containsString(changeinweight.getText().toLowerCase()));
        Log.info("The Units displayed for the Change weight same as in the settings "+changeinweight.getText());

        assertThat(units, containsString(startweight.getText().toLowerCase()));
        Log.info("The Units displayed for the start weight same as in the settings "+startweight.getText());

        assertThat(units, containsString(currentweight.getText().toLowerCase()));
        Log.info("The Units displayed for the current weight same as in the settings "+currentweight.getText());

        assertThat(units, containsString(goalweight.getText().toLowerCase()));
        Log.info("The Units displayed for the goal weight same as in the settings "+goalweight.getText());

        //back to the home page
        backButton.click();
        Log.info("Pressed back Button to reach the home page");

    }
}
