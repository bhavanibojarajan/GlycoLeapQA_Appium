package PAOBFactory.RegisterNewUser;


import io.appium.java_client.AppiumDriver;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


import io.appium.java_client.android.AndroidElement;



import java.util.concurrent.TimeUnit;

public class Android_Register_Repository implements Register_Repository {


    @FindBy(how = How.ID, using = "button1")
    public AndroidElement Ok;

    @FindBy(how = How.ID, using = "btn_register")
    public AndroidElement Register;

    @FindBy(how = How.ID, using = "btn_signup_email")
    public AndroidElement SignupWithEmail;

    @FindBy(how = How.ID, using = "et_name")
    public AndroidElement username;


    @FindBy(how = How.ID, using = "et_email")
    public AndroidElement useremail;


    @FindBy(how = How.ID, using = "et_password")
    public AndroidElement password;

    @FindBy(how = How.ID, using = "btn_next")
    public AndroidElement next;

    @FindBy(how = How.ID, using = "cb_type2")
    public AndroidElement type2Diabetes;

    @FindBy(how = How.ID, using = "cb_prediabetes")
    public AndroidElement prediabetes;

    @FindBy(how = How.ID, using = "cb_hc")
    public AndroidElement highcholestrol;


    @FindBy(how = How.ID, using = "cb_hbp")
    public AndroidElement highbloodpressure;

    @FindBy(how = How.ID, using = "cb_none")
    public AndroidElement none;

    //@FindBys({ @FindBy(id = "subSection"), @FindBy(name = "specificElement") })

    /*@FindBys({@FindBy(id="btn_signup"), @FindBy(className="android.widget.Button")})
    public AndroidElement submit;*/
    @FindBy(how=How.ID,using="btn_signup")
    public AndroidElement submit;




   /* @FindBys(how = How.ID, using = "btn_signup")
    public AndroidElement submit;*/

    public Android_Register_Repository(AppiumDriver driver2) {
        // TODO Auto-generated constructor stub


        PageFactory.initElements(new AppiumFieldDecorator(driver2,5, TimeUnit.SECONDS),this);
    }


    public void signup_personal_details()
    {
        username.sendKeys("Test12");
        useremail.sendKeys("Test12@gmail.com");
        password.sendKeys("Test12test");

    }
}
