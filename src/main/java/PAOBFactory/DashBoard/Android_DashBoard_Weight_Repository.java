package PAOBFactory.DashBoard;

import Log_File.Log;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import org.testng.annotations.Test;
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

  public WebElement CurrentWeightUnit() {
        return currentweightunits;
  }


    public void Check_units_DashBoard(String units)
        {


        assertThat(units, containsString(currentweightunits.getText()));

        Log.info("The Units displayed for the current weight same as in the settings "+currentweightunits.getText());


        assertThat(units,containsString(startweightunits.getText()));

        Log.info("The Units displayed for the start weight same as in the settings "+startweightunits.getText());
        assertThat(units,containsString(goalweightunits.getText()));

        Log.info("The Units displayed for the goal weight same as in the settings "+goalweightunits.getText());


    }
}
