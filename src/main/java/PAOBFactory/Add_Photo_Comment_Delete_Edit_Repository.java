package PAOBFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.How.XPATH;

public class Add_Photo_Comment_Delete_Edit_Repository {
    AndroidDriver driver;

    @FindBy(how = How.ID, using = "et_item_chat_entry_field")
    public AndroidElement addcomment;

    @FindBy(how = How.ID, using = "iv_item_chat_entry_camera")
    public AndroidElement cammeraicon;


    @FindBy(how = How.ID, using = "btn_send_msg")
    public AndroidElement send_btn;


    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Edit')]")
    public AndroidElement edit;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Delete')]")
    public AndroidElement delete;


    @FindBy(how = How.ID, using = "action_menu")
    public AndroidElement dotdeleteoredit;

    @FindBy(how = How.ID, using = "btn_dialogButtonLeft")
    public AndroidElement gallery;


    @FindBy(how = How.ID, using = "btn_dialogButtonMiddle")
    public AndroidElement camera;

    @FindBy(how = How.ID, using = "btn_dialogButtonRight")
    public AndroidElement recentfood;


    @FindBy(how = How.XPATH, using = "//*[@content-desc='Shutter button']")
    public AndroidElement camerashutter;

    @FindBy(how = How.ID, using = "btn_done")
    public AndroidElement done;

    @FindBy(how = How.ID, using = "btn_cancel")
    public AndroidElement cancel;


    @FindBy(how = How.ID, using = "iv_photo_accept")
    public AndroidElement photoaccept;

    @FindBy(how = How.ID, using = "et_photo_caption")
    public AndroidElement photocaption;


    //Constructor for the Food_Log_Repository
    public Add_Photo_Comment_Delete_Edit_Repository(AndroidDriver driver2) {
        // TODO Auto-generated constructor stub
        this.driver=driver2;


        PageFactory.initElements(new AppiumFieldDecorator(driver,5, TimeUnit.SECONDS),this);
    }

    public void AddCommentandImage() {
        addcomment.sendKeys("adja");
        send_btn.click();
        cammeraicon.click();
        // select for the camera option
        camera.click();
        camerashutter.click();
        done.click();
        photocaption.sendKeys("photocaption");
        photoaccept.click();
        send_btn.click();



    }

}
