package PAOBFactory.Goal;

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


public class IOS_Goal_Repository implements Goal_Repository {

    SoftAssert s_assert = new SoftAssert();

    //==========================================================================================================



//IOSElement BACK BUTTON

    @FindBy(how = How.ID, using = "button back")
    public IOSElement backbutton;




    //IOSElement -- FoodTime
    @FindBy(how = How.XPATH, using = "//*[@name='Weight']/following-sibling::XCUIElementTypeStaticText[1]")
    public IOSElement weightunit;


    //==========================================================================================================
    //Constructor for the Android_LeftMenu_Repository
    public IOS_Goal_Repository(AppiumDriver driver2) {
        // TODO Auto-generated constructor stub


        PageFactory.initElements(new AppiumFieldDecorator(driver2, 5, TimeUnit.SECONDS), this);
    }

    //==========================================================================================================

    @Override
    public void Check_units_Goal_Page(String units) {


        Log.info("----------------------------- Goal PAGE ------------------------------");

        assertThat(units, containsString(weightunit.getText().toLowerCase()));
        Log.info("The Units displayed goal page weight is same as in the settings "+weightunit.getText());







    }


    }
