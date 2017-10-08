package Launch;

import PAOBFactory.Comment_Edit_Delete.Android_Add_Photo_Comment_Delete_Edit_Repository;
import PAOBFactory.FoodLog.Android_Food_Log_Repository;
import PAOBFactory.FoodLog.Android_Glucose_Food_Log_Repository;
import PAOBFactory.Login.Android_Login_Repository;
import PAOBFactory.RegisterNewUser.Android_PersonalDetail_Registory;
import PAOBFactory.RegisterNewUser.Android_Register_Repository;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Launch_app {

   static AndroidDriver driver;
    Android_Login_Repository LR;
    Android_Register_Repository RR;
    Android_PersonalDetail_Registory PDR;
    Android_Food_Log_Repository FLR;
    Android_Glucose_Food_Log_Repository GFLR;
    Android_Add_Photo_Comment_Delete_Edit_Repository APCDER;
    @BeforeClass
    public void setup() throws MalformedURLException {

        DesiredCapabilities d=new DesiredCapabilities();


        d.setCapability(MobileCapabilityType.DEVICE_NAME,"Nexus_4_API_22");
        d.setCapability(MobileCapabilityType.PLATFORM_NAME,"ANDROID");

        d.setCapability(MobileCapabilityType.APP,"C:\\Users\\bhava\\glycoleap\\app-release.apk");
        d.setCapability("appActivity","com.holmusk.glycoleap.ui.activity.SplashActivity");
        d.setCapability("appPackage","com.holmusk.glycoleap");


      driver =new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),d);


        //Attributes attrs = Attributes.of(Platform.ANDROID);

      /*  Attribute attribute = attrs.containsID();

        String byId = driver.findElementByXPath()*/
          /*  XPath.builder()
                    .addAttribute(attrs.containsID("123"))
                    .build()
                    .attribute();

*/    }

    @Test
    public void Login()

    {

        LR = new Android_Login_Repository(driver);

             LR.Ok.click();
         LR.Signin.click();
         LR.Enter_Username_Password().click();


    }

        @Test
        public void Register_New_USer() throws InterruptedException {

                  RR = new Android_Register_Repository(driver);
                PDR =new Android_PersonalDetail_Registory(driver);

            RR.Ok.click();
            RR.Register.click();
            RR.SignupWithEmail.click();
            RR.signup_personal_details();
            driver.hideKeyboard();
            Thread.sleep(10000);
            RR.submit.click();
            RR.next.click();
            RR.highbloodpressure.click();
            RR.highcholestrol.click();
            RR.type2Diabetes.click();
            RR.next.click();
            PDR.male.click();
            PDR.DOB.click();
            PDR.selecting_date_time();
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"1984\"));");
            driver.findElementByXPath("//*[@content-desc='1984']").click();
            PDR.feet.click();

        }

        @Test(dependsOnMethods = { "Login" })
        public void Food_Log() throws InterruptedException
        {

            FLR=new Android_Food_Log_Repository(driver);
            GFLR=new Android_Glucose_Food_Log_Repository(driver);
            APCDER =new Android_Add_Photo_Comment_Delete_Edit_Repository(driver);
            FLR.Taking_One_Full_Food_Log();
            //FLR.View_Edit_Delete();
            GFLR.Taking_Before_Food_Glucose().click();
            GFLR.taking_Glucose();
           // GFLR.Taking_After_Food_Glucose().click();
            //GFLR.taking_Glucose();
            APCDER.AddCommentandImage();

        }





}
