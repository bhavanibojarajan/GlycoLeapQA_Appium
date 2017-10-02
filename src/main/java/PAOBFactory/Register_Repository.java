package PAOBFactory;


import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import static org.openqa.selenium.support.PageFactory.initElements;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.concurrent.TimeUnit;

public class Register_Repository {

    AndroidDriver driver;

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

    public Register_Repository(AndroidDriver driver2) {
        // TODO Auto-generated constructor stub
        this.driver=driver2;


        PageFactory.initElements(new AppiumFieldDecorator(driver,5, TimeUnit.SECONDS),this);
    }


    public void signup_personal_details()
    {
        username.sendKeys("Test12");
        useremail.sendKeys("Test12@gmail.com");
        password.sendKeys("Test12test");

    }
}
