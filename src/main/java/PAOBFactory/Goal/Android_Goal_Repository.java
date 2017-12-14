package PAOBFactory.Goal;

import Log_File.Log;
import PAOBFactory.LeftMenu.LeftMenu_Repository;
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


public class Android_Goal_Repository implements Goal_Repository {

    SoftAssert s_assert = new SoftAssert();

    //==========================================================================================================



    //AndroidElement BackButton
    @FindBy(how = How.XPATH, using = "//*[@content-desc='Navigate up']")
    public AndroidElement backButton;


    //AndroidElement BackButton
    @FindBy(how = How.ID, using = "tv_unit")
    public AndroidElement weightunit;
    //==========================================================================================================
    //Constructor for the Android_LeftMenu_Repository
    public Android_Goal_Repository(AppiumDriver driver2) {
        // TODO Auto-generated constructor stub


        PageFactory.initElements(new AppiumFieldDecorator(driver2, 5, TimeUnit.SECONDS), this);
    }

    //==========================================================================================================

    @Override
    public void Check_units_Goal_Page(String units) {


        Log.info("----------------------------- Goal PAGE ------------------------------");

        assertThat(weightunit.getText().toLowerCase(), containsString(units));
        Log.info("The Units displayed goal page weight is same as in the settings "+weightunit.getText());







    }


    }
