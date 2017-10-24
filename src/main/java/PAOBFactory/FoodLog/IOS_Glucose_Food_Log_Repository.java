package PAOBFactory.FoodLog;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class IOS_Glucose_Food_Log_Repository implements Glucose_Food_Log_Repository {


    //IOSElement premeal
    @FindBy(how = How.XPATH, using = "//*[@name='BEFORE']/following-sibling::XCUITypeButton[@name='card Add']")
    public IOSElement premealadd;

    @FindBy(how = How.ID, using = "action_next")
    public AndroidElement tickactionnext;



    @FindBy(how = How.ID, using = "btn_dialog_message_promopt_positive")
    public AndroidElement OKforglucose;

    //IOSElement postmeal
    @FindBy(how = How.XPATH, using = "//*[@name='AFTER']/following-sibling::XCUITypeButton[@name='card Add']")
    public IOSElement postmealadd;




    @FindBy(how = How.ID, using = "iv_fragment_glucose_tag_morning")
    public AndroidElement morning;

    @FindBy(how = How.ID, using = "iv_fragment_glucose_tag_breakfast")
    public AndroidElement breakfast;

    @FindBy(how = How.ID, using = "iv_fragment_glucose_tag_lunch")
    public AndroidElement lunch;

    @FindBy(how = How.ID, using = "iv_fragment_glucose_tag_snack")
    public AndroidElement snack;

    @FindBy(how = How.ID, using = "iv_fragment_glucose_tag_dinner")
    public AndroidElement dinner;


    @FindBy(how = How.ID, using = "iv_fragment_glucose_tag_happy")
    public AndroidElement happy;



    @FindBy(how = How.ID, using = "iv_fragment_glucose_tag_excited")
    public AndroidElement excited;


    @FindBy(how = How.ID, using = "iv_fragment_glucose_tag_relax")
    public AndroidElement relax;


    @FindBy(how = How.ID, using = "iv_fragment_glucose_tag_tired")
    public AndroidElement tired;

    @FindBy(how = How.ID, using = "iv_fragment_glucose_tag_stress")
    public AndroidElement stress;

    @FindBy(how = How.CLASS_NAME, using = "android.widget.FrameLayout")
    public AndroidElement glucosevalueclick;


    //Constructor for the Android_Food_Log_Repository
    public IOS_Glucose_Food_Log_Repository(AppiumDriver driver2) {
        // TODO Auto-generated constructor stub



        PageFactory.initElements(new AppiumFieldDecorator(driver2,5, TimeUnit.SECONDS),this);
    }


    public MobileElement Taking_Before_Food_Glucose()  {
        return premealadd;}

        //driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"6.8\"));");
        //glucosevalueclick.click();

        public void taking_Glucose()
        {

            // have to add the drag function and time
        tickactionnext.click();
        OKforglucose.click();
        morning.click();
        relax.click();
        tickactionnext.click();

    }


    public  MobileElement Taking_After_Food_Glucose()
    {
        return postmealadd;
    }




    }


