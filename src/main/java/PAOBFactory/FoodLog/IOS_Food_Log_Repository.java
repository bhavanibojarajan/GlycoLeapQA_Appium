package PAOBFactory.FoodLog;

import Log_File.Log;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class IOS_Food_Log_Repository implements Food_Log_Repository {


    //IOSElement -- plusicon in the home page
    @FindBy(how = How.ID, using = "card Add")
    public IOSElement plusicon;


    //IOSElement -- food icon come from + button
    @FindBy(how = How.ID, using = "Food")
    public IOSElement foodLogIcon;

    //IOSElement --  Camera shutter round button
    @FindBy(how = How.ID, using = "ib_shutter")
    public IOSElement camerashutter;

    //IOSElement -- Library option
    @FindBy(how = How.ID, using = "OK")
    public IOSElement okbutton;


    //IOSElement -- Library option
    @FindBy(how = How.ID, using = "Library")
    public IOSElement libraryoption;


    //IOSElement -- skip
    @FindBy(how = How.ID, using = "Skip")
    public IOSElement skip;

    //AndroidElement -- X
    @FindBy(how = How.ID, using = "Cancel")
    public IOSElement cancel;

    //IOSElement -- buttonUse
    @FindBy(how = How.ID, using = "Use")
    public IOSElement buttonUse;


    @FindBy(how = How.XPATH, using = "//XCUIElementTypeButton[@name='Allow']")
    public IOSElement allow;
//=========================================================
    //IOSElement -- photo1
    @FindBy(how = How.XPATH, using = "//XCUIElementTypeCell[1]/descendant::XCUIElementTypeImage")
    public IOSElement photo1;

    //IOSElement -- photo2
    @FindBy(how = How.XPATH, using = "//XCUIElementTypeCell[2]/descendant::XCUIElementTypeImage")
    public IOSElement photo2;

    //IOSElement -- photo3
    @FindBy(how = How.XPATH, using = "//XCUIElementTypeCell[3]/descendant::XCUIElementTypeImage")
    public IOSElement photo3;

    //IOSElement -- photo4
    @FindBy(how = How.XPATH, using = "//XCUIElementTypeCell[4]/descendant::XCUIElementTypeImage")
    public IOSElement photo4;

    //IOSElement -- Food Description
    @FindBy(how = How.XPATH, using = "//XCUIElementTypeCell[1]/XCUIElementTypeTextView")
    public IOSElement foodDescription;

//============================================================

    //IOSElement -- Excited mood button
    @FindBy(how = How.ID, using = "Excited")
    public IOSElement excited;

    //IOSElement -- Relaxed mood button
    @FindBy(how = How.ID, using = "Relaxed")
    public IOSElement relaxed;

    //IOSElement -- Tired
    @FindBy(how = How.ID, using = "Tired")
    public IOSElement tired;

    //IOSElement -- Stressed
    @FindBy(how = How.ID, using = "Stressed")
    public IOSElement stressed;

    //IOSElement -- Sicked
    @FindBy(how = How.ID, using = "Sick")
    public IOSElement sicked;

//============================================================
//IOSElement -- Submit
@FindBy(how = How.XPATH, using = "//XCUIElementTypeButton[@name='Submit']")
public IOSElement submit;

    //IOSElement -- Closed
    @FindBy(how = How.XPATH, using = "//XCUIElementTypeButton[@name='Cancel']")
    public IOSElement cancel_submit;

//============================================================

    //IOSElement -- GOT IT button
    @FindBy(how = How.ID, using = "btn_ok_tut_multiphoto")
    public IOSElement multiphoto;

    //IOSElement -- Image to be touched and moved
    @FindBy(how = How.ID, using = "dim_filter")
    public IOSElement dim_filter_image;


    //IOSElement -- photos to be displayed
    @FindBy(how = How.ID, using = "iv_photo")
    public IOSElement photos_fordisplay;



//============================================================


    //Constructor for the Android_Food_Log_Repository
    public IOS_Food_Log_Repository(AppiumDriver driver2) {
        // TODO Auto-generated constructor stub



        PageFactory.initElements(new AppiumFieldDecorator(driver2,5, TimeUnit.SECONDS),this);
    }

//============================================================
    //Taking full food log process
    public void Taking_One_Full_Food_Log()
    {
        allow.click();
        plusicon.click();
        Log.info("Log button Pressed");
        foodLogIcon.click();
        Log.info("Food Log button pressed");
        okbutton.click();
        okbutton.click();
        //camerashutter.click();
        libraryoption.click();
        Log.info("Library option pressed");
        photo1.click();
        photo2.click();
        photo3.click();
        photo4.click();
               buttonUse.click();
        /*photo3.click();
        camerashutter.click();
        buttonUse.click();
        photo4.click();
        camerashutter.click();
        buttonUse.click();*/
        foodDescription.sendKeys("High calorie food");
        relaxed.click();
        submit.click();
       // multiphoto.click();
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

}
