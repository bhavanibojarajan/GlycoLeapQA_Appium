package PAOBFactory.Profile;



        import Log_File.Log;
        import io.appium.java_client.AppiumDriver;
        import io.appium.java_client.ios.IOSElement;
        import io.appium.java_client.pagefactory.AppiumFieldDecorator;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.How;
        import org.openqa.selenium.support.PageFactory;
        import org.testng.Assert;
        import java.util.concurrent.TimeUnit;
        import FindUnits.FindUnits;

        import static org.hamcrest.MatcherAssert.assertThat;
        import static org.hamcrest.Matchers.containsString;

public class IOS_Profilepage_Repository implements Profilepage_Repository {

    //IOSElement BackButton
    @FindBy(how = How.ID, using = "button hamburger menu")
    public IOSElement leftmenuopener;

    //IOSElement Settings
    @FindBy(how = How.ID, using = "Settings")
    public IOSElement settings;

    //IOSElement Profile
    @FindBy(how = How.ID, using = "Profile")
    public IOSElement profile;

    //IOSELement Close icon
    @FindBy(how = How.ID, using = "icon close")
    public IOSElement iconclose;

    //IOSElement BACK BUTTON

    @FindBy(how = How.ID, using = "button back")
    public IOSElement backbutton;

    //IOSElement email

    @FindBy(how = How.XPATH, using = "//*[@name='Email']/preceding-sibling::XCUIElementTypeStaticText")
    public IOSElement email;


    //IOSElement name

    @FindBy(how = How.XPATH, using = "//*[@name='Name']/preceding-sibling::XCUIElementTypeTextField/XCUIElementTypeTextField")
    public IOSElement name;

    //IOSElement dob

    @FindBy(how = How.XPATH, using = "//*[@name='Date of Birth']/preceding-sibling::XCUIElementTypeStaticText")
    public IOSElement dob;



    //IOSElement gender

    @FindBy(how = How.XPATH, using = "//*[@name='Gender']/preceding-sibling::XCUIElementTypeTextField")
    public IOSElement gender;


    //IOSElement startweight

    @FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name='Start Weight']/following-sibling::XCUIElementTypeTextField[1]")
    public IOSElement startweight;


    //IOSElement startheight

    @FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name='Start Height']/following-sibling::XCUIElementTypeTextField[1]")
    public IOSElement startheight;

//IOSElement Health Condition

    @FindBy(how = How.XPATH, using = "//*[@name='Health Condition']/following-sibling::XCUIElementTypeStaticText")
    public IOSElement healthcondition;


    //IOSElement Food Preference

    @FindBy(how = How.XPATH, using = "//[@name='Food Preference']/following-sibling::XCUIElementTypeStaticText")
    public IOSElement foodpreference;

    //IOSElement change pasword

    @FindBy(how = How.ID, using = "Change Password")
    public IOSElement changepassword;

    //IOSElement Allow button
    @FindBy(how = How.XPATH, using = "//XCUIElementTypeButton[@name='Allow']")
    public IOSElement allow;

    //==========================================================================================================
    //Constructor for the IOS_LeftMenu_Repository
    public IOS_Profilepage_Repository (AppiumDriver driver2) {
        // TODO Auto-generated constructor stub


        PageFactory.initElements(new AppiumFieldDecorator(driver2,5, TimeUnit.SECONDS),this);
    }

    //==========================================================================================================
    public void Profile_page_validation()
    {  allow.click();
        leftmenuopener.click();
        Log.info("Left Menu opened Properly");
        settings.click();
        Log.info("Settings page opened Properly");



        //Navigate to profile page
        profile.click();
        Log.info("Profile menu clicked");

        //check the email
        Assert.assertEquals(email.getText(),"test50@gmail.com","The user email is wrong");
        Log.info("User email  displayed properly "+email.getText());

        //Check the displayed name
        Assert.assertEquals(name.getText(),"Test50","The user name is wrong");
        Log.info("User name displayed properly "+name.getText());


        //Check the date of birth
        Assert.assertEquals(dob.getText(),"Apr 11, 1982","Date of birth displayed is wrong ");
        Log.info("User date of birth displayed properly "+dob.getText());


        //Check the Gender
        Assert.assertEquals(gender.getText(),"Female","Displayed gender is wrong");
        Log.info("User gender displayed properly "+gender.getText());

        //Check the start weight
        String startweightvalue= FindUnits.WeightUnit(startweight.getText());
        if(startweightvalue.equals("kg")) {
            Assert.assertEquals(startweightvalue, "kg", "Displayed weight unit is not in kg");
        } else {
            Assert.assertEquals(startweightvalue, "lbs", "Displayed weight unit is not in lbs");

        }Log.info("Start weight unit displayed properly "+startweight.getText());

        //Check the start height
        String startheightvalue = FindUnits.HeightUnit(startheight.getText());
        if(startheightvalue.equals("cm")) {
            Assert.assertEquals(startheightvalue, "cm", "Displayed height unit is not in cm");
        }else {
            Assert.assertEquals(startheightvalue, "ft", "Displayed height unit is not in ft");
        }Log.info("Start height unit displayed properly "+startheight.getText());


    }


    public void Check_units_Profile_Page(String units)
    {
        Log.info("----------------------------- Profile PAGE ------------------------------");



        assertThat(startweight.getText().toLowerCase(), containsString(units));
        Log.info("The Units displayed in the profile page  is same as in the settings "+startweight.getText());

        if(units== "kg")
        {
            assertThat(startheight.getText().toLowerCase(), containsString("cm"));


        }
        else
        {
            assertThat(startheight.getText().toLowerCase(), containsString("ft"));
        }

        Log.info("The Units displayed in the profile page  is same as in the settings "+startheight.getText());
    }

}