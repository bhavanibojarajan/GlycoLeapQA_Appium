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
import Log_File.Log;
public class IOS_Glucose_Food_Log_Repository implements Glucose_Food_Log_Repository {


    //IOSElement premeal
    @FindBy(how = How.XPATH, using = "//*[@name='BEFORE']/following-sibling::XCUIElementTypeButton[@name='card Add']")
    public IOSElement premealadd;

    @FindBy(how = How.XPATH, using = "//XCUIElementTypeButton[@name='Next']")
    public IOSElement tickactionnext;


    @FindBy(how = How.XPATH, using = "//XCUIElementTypeButton[@name='Save']")
    public IOSElement saveglucose;


    @FindBy(how = How.ID, using = "btn_dialog_message_promopt_positive")
    public IOSElement OKforglucose;

    //IOSElement postmeal
    @FindBy(how = How.XPATH, using = "//*[@name='AFTER']/following-sibling::XCUIElementTypeButton[@name='card Add']")
    public IOSElement postmealadd;


    @FindBy(how = How.ID, using = "Ok")
    public IOSElement OKbeforeglucose;




    @FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name='Morning']")
    public IOSElement morning;

    @FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name='Breakfast']")
    public IOSElement breakfast;

    @FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name='Lunch']")
    public IOSElement lunch;

    @FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name='Snacks']")
    public IOSElement snack;

    @FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name='Dinner']")
    public IOSElement dinner;


    @FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name='Sick']")
    public IOSElement sick;



    @FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name='Excited']")
    public IOSElement excited;


    @FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name='Relaxed']")
    public IOSElement relax;


    @FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name='Tired']")
    public IOSElement tired;

    @FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name='Stressed']")
    public IOSElement stress;

    @FindBy(how = How.CLASS_NAME, using = "android.widget.FrameLayout")
    public IOSElement glucosevalueclick;


    //Constructor for the IOS_Glucose_Food_Log_Repository
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
            Log.info("Pre meal Glucose value selected");
        tickactionnext.click();
            OKbeforeglucose.click();

        morning.click();
        relax.click();
            saveglucose.click();

            Log.info("Full Pre meal Glucose flow done");
    }


    public  MobileElement Taking_After_Food_Glucose()
    {
        return postmealadd;
    }




    }


