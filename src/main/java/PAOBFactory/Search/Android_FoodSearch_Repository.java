package PAOBFactory.Search;

import Log_File.Log;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class Android_FoodSearch_Repository implements FoodSearch_Repository {

AndroidDriver driver;

    //AndroidElement search button
    @FindBy(how = How.ID, using = "action_search")
    public AndroidElement searchbutton;

    //AndroidElement photoswipeimage
    @FindBy(how = How.ID, using = "action_search")
    public AndroidElement photoswipeimage;


    //AndroidElement search text
    @FindBy(how = How.ID, using = "search_src_text")
    public AndroidElement searchtext;

    //AndroidElement search close button
    @FindBy(how = How.ID, using = "search_close_btn")
    public AndroidElement searchclosebutton;


    //AndroidElement foodname
    @FindBy(how = How.ID, using = "tv_food_name")
    public AndroidElement foodname;


    //AndroidElement BackButton
    @FindBy(how = How.CLASS_NAME, using = "android.widget.ImageButton")
    public AndroidElement backButton;

    //AndroidElement BackButton
    @FindBy(how = How.CLASS_NAME, using = "android.widget.ImageView")
    public AndroidElement notificationbutton;

    //==========================================================================================================
    //Constructor for the Android_FoodSearch_Repository
    public Android_FoodSearch_Repository(AppiumDriver driver2) {
        // TODO Auto-generated constructor stub


        PageFactory.initElements(new AppiumFieldDecorator(driver2, 5, TimeUnit.SECONDS), this);
    }

    //==========================================================================================================



    public void search_and_find_food()
    {
        Log.info("Press the Food Search button");
        searchbutton.click();
        Log.info("Pressed the food search button");

        Log.info("Enter the food text to search ");
        searchtext.sendKeys("crab");
        Log.info("Entered the Food name to search "+searchtext.getText() );

        Log.info("Click the food named "+ searchtext.getText());
        foodname.click();





    }




    /*public void Horizontal_swipe()
    {
        Dimension dim =driver.manage().window().getSize();
        int height =dim.getHeight();
        int widht=dim.getWidht();
        int y=(int)(height*0.20);
        int startx=(int)(width*0.75);
        int endx=(int)(widht*0.35);
        driver.swipe(startx,y,endx,y,500);
    }*/

}
