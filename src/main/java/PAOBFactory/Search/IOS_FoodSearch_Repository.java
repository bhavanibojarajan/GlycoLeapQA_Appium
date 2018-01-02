package PAOBFactory.Search;

import Log_File.Log;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class IOS_FoodSearch_Repository implements FoodSearch_Repository {



    //IOSElement search button
    @FindBy(how = How.ID, using = "button search")
    public IOSElement searchbutton;


    //IOSElement search text
    @FindBy(how = How.XPATH, using = "//XCUIElementTypeSearchField[@name='Search Here...']")
    public IOSElement searchtext;

    //IOSElement search close button
    @FindBy(how = How.XPATH, using = "//XCUIElementTypeButton[@name='Cancel']")
    public IOSElement searchclosebutton;;


    //IOSElement BackButton
    @FindBy(how = How.CLASS_NAME, using = "android.widget.ImageButton")
    public IOSElement backButton;

    //IOSElement BackButton
    @FindBy(how = How.CLASS_NAME, using = "android.widget.ImageView")
    public IOSElement notificationbutton;


    @FindBy(how = How.XPATH, using = "//XCUIElementTypeButton[@name='Allow']")
    public IOSElement allow;

    //IOSElement LeftMenu Opener
    @FindBy(how = How.ID, using ="button hamburger menu" )
    public IOSElement leftmenuopner;

    //==========================================================================================================
    //Constructor for the Android_FoodSearch_Repository
    public IOS_FoodSearch_Repository(AppiumDriver driver2) {
        // TODO Auto-generated constructor stub


        PageFactory.initElements(new AppiumFieldDecorator(driver2, 5, TimeUnit.SECONDS), this);
    }

    //==========================================================================================================



    public void search_and_find_food()
    {
        allow.click();
        Log.info("Press the Food Search button");
        searchbutton.click();
        Log.info("Pressed the food search button");

        Log.info("Enter the food text to search ");
        searchtext.sendKeys("crab");
        Log.info("Entered the Food name to search "+searchtext.getText() );

        searchclosebutton.click();

        Log.info("Pressed the Cancel button");


        leftmenuopner.click();
    }

}
