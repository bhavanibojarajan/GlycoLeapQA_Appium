package PAOBFactory;

import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class PersonalDetail_Registory {


    AndroidDriver driver;
    @FindBy(how = How.ID, using = "btn_male")
    public AndroidElement male;

    @FindBy(how = How.ID, using = "btn_female")
    public AndroidElement female;

    @FindBy(how = How.ID, using = "et_dob")
    public AndroidElement DOB;

    @FindBy(how = How.ID, using = "btn_ft")
    public AndroidElement feet;

    @FindBy(how = How.ID, using = "btn_cm")
    public AndroidElement centi;

    @FindBy(how = How.ID, using = "et_height")
    public AndroidElement height;


    @FindBy(how=How.ID,using="date_picker_year")
    public AndroidElement year;

    /*@AndroidUIAutomatorFindBy (uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().textContains(\"2002\"))")
    public  AndroidElement selectedyear;*/


    public PersonalDetail_Registory(AndroidDriver driver2) {
        // TODO Auto-generated constructor stub
        this.driver=driver2;

        PageFactory.initElements(new AppiumFieldDecorator(driver,5, TimeUnit.SECONDS),this);
    }

public void selecting_date_time()
{
    year.click();
    //driver.findByAndroidUIAutomator( "new UiScrollable(new UiSelector()).scrollIntoView(text(\"2002\"));");
    //driver.
    //driver.findElementByXPath("//*[@text='2002']").click();




}

}
