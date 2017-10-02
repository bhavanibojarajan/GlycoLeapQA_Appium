package Launch;

import PAOBFactory.Food_Log_Repository;
import PAOBFactory.Glucose_Food_Log_Repository;
import PAOBFactory.PersonalDetail_Registory;
import PAOBFactory.Add_Photo_Comment_Delete_Edit_Repository;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.swiften.xtestkit.mobile.Platform;
import org.swiften.xtestkitcomponents.xpath.Attributes;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.swiften.xtestkit.mobile.Platform;
import org.swiften.xtestkitcomponents.common.ErrorProviderType;
import org.swiften.xtestkitcomponents.platform.PlatformType;
import org.swiften.xtestkitcomponents.xpath.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.annotations.BeforeMethod;
import PAOBFactory.Login_Repository;
import PAOBFactory.Register_Repository;
import java.net.MalformedURLException;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import java.net.URL;
import java.util.concurrent.TimeUnit;
public class Launch_app {

   static AndroidDriver driver;
    Login_Repository LR;
    Register_Repository RR;
    PersonalDetail_Registory PDR;
    Food_Log_Repository FLR;
    Glucose_Food_Log_Repository GFLR;
    Add_Photo_Comment_Delete_Edit_Repository APCDER;
    @BeforeClass
    public void setup() throws MalformedURLException {

        DesiredCapabilities d=new DesiredCapabilities();


        d.setCapability(MobileCapabilityType.DEVICE_NAME,"Nexus_4_API_22");
        d.setCapability(MobileCapabilityType.PLATFORM_NAME,"ANDROID");

        d.setCapability(MobileCapabilityType.APP,"//Users//bhavani//GlycoLeap_apk//Release//glycoRelease.apk");
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

        LR = new Login_Repository(driver);

             LR.Ok.click();
         LR.Signin.click();
         LR.Enter_Username_Password().click();


    }

        @Test
        public void Register_New_USer() throws InterruptedException {

                  RR = new Register_Repository(driver);
                PDR =new PersonalDetail_Registory(driver);

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

            FLR=new Food_Log_Repository(driver);
            GFLR=new Glucose_Food_Log_Repository(driver);
            APCDER =new Add_Photo_Comment_Delete_Edit_Repository(driver);
            FLR.Taking_One_Full_Food_Log();
            //FLR.View_Edit_Delete();
            GFLR.Taking_Before_Food_Glucose().click();
            GFLR.taking_Glucose();
           // GFLR.Taking_After_Food_Glucose().click();
            //GFLR.taking_Glucose();
            APCDER.AddCommentandImage();

        }





}
