package PAOBFactory.GlucoseDetailPage;

import Log_File.Log;
import PAOBFactory.WeightDetailPage.Weight_Detail_Repository;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class IOS_Glucose_Detail_Repository implements Glucose_Detail_Repository
{

    //IOSElement current  weight in the Weight detail page
    @FindBy(how = How.XPATH, using = "//XCUIElementTypeOther/child::XCUIElementTypeStaticText[1]")
    public IOSElement currentweight;

    //IOSElement previous weight in the Weight detail page
    @FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name='Previous']/following-sibling::XCUIElementTypeStaticText[1]")
    public IOSElement previousweight;

    //IOSElement goal weight in the Weight detail page
    @FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name='Change']/following-sibling::XCUIElementTypeStaticText[1]")
    public IOSElement changeweight;





    //IOSElement BackButton
    @FindBy(how = How.XPATH, using = "//XCUIElementTypeButton")
    public IOSElement backButton;


    //Created object of testng SoftAssert class to use It's Properties.
    SoftAssert s_assert = new SoftAssert();


    //=========================================================================
    public IOS_Glucose_Detail_Repository(AppiumDriver driver2) {
        // TODO Auto-generated constructor stub


        PageFactory.initElements(new AppiumFieldDecorator(driver2,5, TimeUnit.SECONDS),this);
    }
    //=========================================================================


    public void Check_units_glucose_Detail(String units)
    {
        Log.info("------------Glucose DETAIL PAGE------------------------------");

        assertThat(units, containsString(previousweight.getText().toLowerCase()));
        Log.info("The Units displayed for the previous  weight same as in the settings "+previousweight.getText());

        assertThat(units, containsString(changeweight.getText().toLowerCase()));
        Log.info("The Units displayed for the Change weight same as in the settings "+changeweight.getText());


        assertThat(currentweight.getText().toLowerCase(), containsString(units));
        Log.info("The Units displayed for the current weight same as in the settings "+currentweight.getText());

        //back to the home page
        backButton.click();
        Log.info("Pressed back Button to reach the home page");

    }
}
