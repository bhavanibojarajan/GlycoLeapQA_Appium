package PAOBFactory.Ask_Coach;

import Log_File.Log;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.sql.Timestamp;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.testng.Assert.assertTrue;

public class Android_Ask_Coach_Repository implements Ask_Coach_Repository {

AppiumDriver driver;

    @FindBy(how = How.ID, using = "et_coach_fp_ask")
    public AndroidElement addcomment;

    @FindBy(how = How.ID, using = "iv_coach_fp_camera")
    public AndroidElement cammeraicon;


    @FindBy(how = How.ID, using = "iv_send")
    public AndroidElement chat_send_btn;


    @FindBy(how = How.ID, using = "ib_shutter")
    public AndroidElement camerashutter;


    @FindBy(how = How.ID, using = "iv_slot4")
    public AndroidElement askcoach;



    @FindBy(how = How.ID, using = "et_photo_caption")
    public AndroidElement photo_caption;


    @FindBy(how = How.ID, using = "iv_photo_accept")
    public AndroidElement photoaccept;

    @AndroidFindBy(id="tv_item_chat_content")
    public List<AndroidElement> displayed_chatcontent;



    @FindBy(how = How.ID, using = "tv_item_chat_content_photo")
    public AndroidElement displayed_chatcontent_photo;


    @FindBy(how = How.ID, using = "tv_item_chat_time")
    public AndroidElement displayed_chatcontent_time;

    //=========================================================================
    public Android_Ask_Coach_Repository(AppiumDriver driver2) {
        // TODO Auto-generated constructor stub


        PageFactory.initElements(new AppiumFieldDecorator(driver2,5, TimeUnit.SECONDS),this);
    }
    //=========================================================================

    public void Ask_Coach_Msg_Validation()

    {

        askcoach.click();
        Log.info("----------------------------- Adding comments ------------------------------");

        String comments="A good com";
        int index=0;
        addcomment.sendKeys(comments);
        //String time = driver.getDeviceTime();
        Timestamp time_value=new Timestamp(System.currentTimeMillis());
        //Log.info("Timestamp Value "+time);
        Log.info("Comments added in the add comment text box "+addcomment.getText());
       chat_send_btn.click();
        Log.info("Send Button Pressed ");

        int sizeofthelist =displayed_chatcontent.size()-1;
        Assert.assertEquals(displayed_chatcontent.get(sizeofthelist).getText(),comments,"The Chat message mismatch with the send message");

        Log.info("Content displayed in the chat box matches"+ displayed_chatcontent.get(sizeofthelist).getText());















        Log.info("----------------------------- Image sent ------------------------------");
        cammeraicon.click();
        Log.info("Clicked Camera Button ");
        // select for the camera option
        camerashutter.click();
        Log.info("Clicked Camera shutter");



        photo_caption.sendKeys("photocaption");
        photoaccept.click();


    }

}
