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

       Assert.assertEquals(previousweight.getText(),units,"Units matches with Previous weight in the weight Detail page");
        Log.info("The Units displayed for the previous  weight same as in the settings "+previousweight.getText());

        Assert.assertEquals(changeinweight.getText(),units,"Units matches with Change in weight in the weight Detail page");
        Log.info("The Units displayed for the Change weight same as in the settings "+changeinweight.getText());


        Assert.assertEquals(startweight.getText(),units,"Units matches with start weight in the weight Detail page");
        Log.info("The Units displayed for the start weight same as in the settings "+startweight.getText());

        Assert.assertEquals(currentweight.getText(),units,"Units matches with Current weight in the weight Detail page");

        Log.info("The Units displayed for the current weight same as in the settings "+currentweight.getText());

        Assert.assertEquals(goalweight.getText(),units,"Units matches with goal weight in the weight Detail page");

        Log.info("The Units displayed for the goal weight same as in the settings "+goalweight.getText());

    }
}
