package PAOBFactory.FoodLog;

import Log_File.Log;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.*;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class Android_Food_Log_Repository implements Food_Log_Repository {

AndroidDriver driver;

    //AndroidElement -- plusicon in the home page
    @FindBy(how = How.ID, using = "fabMain")
    public AndroidElement plusicon;


    //AndroidElement -- food icon come from + button
    @FindBy(how = How.ID, using = "fab_food")
    public AndroidElement foodLogIcon;

    //AndroidElement --  Camera shutter round button
    @FindBy(how = How.ID, using = "ib_shutter")
    public AndroidElement camerashutter;

    //AndroidElement -- Library option
    @FindBy(how = How.ID, using = "tab_indicator")
    public AndroidElement libraryoption;


    //AndroidElement -- skip
    @FindBy(how = How.ID, using = "btn_skip")
    public AndroidElement skip;

    //AndroidElement -- X
    @FindBy(how = How.ID, using = "ib_close")
    public AndroidElement closefoodlog;

    //AndroidElement -- buttonUse
    @FindBy(how = How.ID, using = "btnUse")
    public AndroidElement buttonUse;

//=========================================================
    //AndroidElement -- photo1
    @FindBy(how = How.ID, using = "photo1")
    public AndroidElement photo1;

    //AndroidElement -- photo2
    @FindBy(how = How.ID, using = "photo2")
    public AndroidElement photo2;

    //AndroidElement -- photo3
    @FindBy(how = How.ID, using = "photo3")
    public AndroidElement photo3;

    //AndroidElement -- photo4
    @FindBy(how = How.ID, using = "photo4")
    public AndroidElement photo4;

    //AndroidElement -- Food Description
    @FindBy(how = How.ID, using = "ac_logfood_desc")
    public AndroidElement foodDescription;

//============================================================

    //AndroidElement -- Excited mood button
    @FindBy(how = How.ID, using = "ivExcited")
    public AndroidElement excited;

    //AndroidElement -- Relaxed mood button
    @FindBy(how = How.ID, using = "ivRelaxed")
    public AndroidElement relaxed;

    //AndroidElement -- Tired
    @FindBy(how = How.ID, using = "ivTired")
    public AndroidElement tired;

    //AndroidElement -- Stressed
    @FindBy(how = How.ID, using = "ivStressed")
    public AndroidElement stressed;

    //AndroidElement -- Sicked
    @FindBy(how = How.ID, using = "ivSicked")
    public AndroidElement sicked;

//============================================================
//AndroidElement -- Submit
@FindBy(how = How.ID, using = "btnSubmit")
public AndroidElement submit;

    //AndroidElement -- Closed
    @FindBy(how = How.ID, using = "btnClose")
    public AndroidElement close;

//============================================================

    //AndroidElement -- GOT IT button
    @FindBy(how = How.ID, using = "btn_ok_tut_multiphoto")
    public AndroidElement multiphoto;

    //AndroidElement -- Image to be touched and moved
    @FindBy(how = How.ID, using = "dim_filter")
    public AndroidElement dim_filter_image;


    //AndroidElement -- photos to be displayed
    @FindBy(how = How.ID, using = "iv_photo")
    public AndroidElement photos_fordisplay;

//============================================================

    //AndroidElement -- time to find
    @FindBy(how = How.ID, using = "tv_logfood_time")
    public AndroidElement settime;

    //AndroidElement --Set Current Time
    @FindBy(how = How.ID, using = "btn_SetCurrent")
    public AndroidElement setcurrenttime;

    //AndroidElement -- select the time
    @FindBy(how = How.CLASS_NAME, using = "android.widget.EditText")
    public AndroidElement inputtime;

    /*@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/numberpicker_input\")")
    public AndroidElement inputtime;*/

//============================================================


    //Constructor for the Android_Food_Log_Repository
    public Android_Food_Log_Repository(AppiumDriver driver2) {
        // TODO Auto-generated constructor stub



        PageFactory.initElements(new AppiumFieldDecorator(driver2,5, TimeUnit.SECONDS),this);
    }

//============================================================
    //Taking full food log process
    public void Taking_One_Full_Food_Log()
    {

        plusicon.click();
        Log.info("Plus Button Pressed");
        foodLogIcon.click();
        Log.info("----------------------------- Food Log Page ------------------------------");

        Log.info("FoodLogIcon Button Pressed");
        camerashutter.click();
        Log.info("Camera Shutter button Pressed");
        buttonUse.click();
        Log.info("Use button Pressed");
        photo2.click();
        Log.info("Thumbnail icon Pressed to take picture");
        camerashutter.click();
        Log.info("Camera Shutter button Pressed");
        buttonUse.click();
        Log.info("Use button Pressed");
        /*photo3.click();
        camerashutter.click();
        buttonUse.click();
        photo4.click();
        camerashutter.click();
        buttonUse.click();*/
        foodDescription.sendKeys("crab");

        Log.info("Food Description Entered");


        /*settime.click();

        Log.info("Select the Time");


        inputtime.sendKeys(" Nov 20 10 31");


        settime.click();*/
        Log.info("Food time set");
        relaxed.click();
        Log.info("Mood selected");
        submit.click();
        Log.info("Submit Button Pressed");
        multiphoto.click();
    }
//============================================================

   /* //View, Edit and delete of the food log
    public void View_Edit_Delete()
       {
          AndroidElement ele1=  (AndroidElement) driver.findElementByClassName("android.widget.ImageView");


           Dimension size = ele1.getSize();
           int x1 = (int) (size.width* 0.60);
           int x2 = (int) (size.width * 0.80);
           System.out.println(size);

        multiphoto.click();
        dim_filter_image.click();


        //swipe the element

           TouchAction action = new TouchAction((AndroidDriver)driver);

           //Find element to swipe from right to left.


           action.longPress(ele1).moveTo(x1,0).release().perform();




    }*/



//============================================================


// ============================================================

}
