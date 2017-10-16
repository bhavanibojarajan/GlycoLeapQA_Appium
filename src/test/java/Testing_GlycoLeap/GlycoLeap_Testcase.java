package Testing_GlycoLeap;

import org.apache.log4j.PropertyConfigurator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.appium.java_client.MobileElement;
import Log_File.Log;

import java.io.File;

import static org.apache.log4j.PropertyConfigurator.configure;

public class GlycoLeap_Testcase extends BaseTestClass {

public static String UserEmail;

    File classpathRoot = new File(System.getProperty("user.dir"));
    File appDir = new File(classpathRoot, "/app");
    File prop = new File (appDir, "log4j.properties");


    @Test
    public void Login()

    {



   PropertyConfigurator.configure(prop.getAbsolutePath());

        MobileElement login;
        Log.startTestCase("Login");
        LR.Press_Signin_Button();


        Log.info("Signin Button Pressed");
        login = LR.Enter_Username_Password();

        login.click();

        LR.Verify_Proper_Login();
        //Assert.assertEquals(LR.HomeTitle.getText(), "Home", "GlycoLeap App opened the Home Page");

        Log.endTestCase("Login");
    }


 /*   @Test
    public void Food_Log() throws InterruptedException
    {

        FLR.Taking_One_Full_Food_Log();
        //FLR.View_Edit_Delete();
        GFLR.Taking_Before_Food_Glucose().click();
        GFLR.taking_Glucose();
        // GFLR.Taking_After_Food_Glucose().click();
        //GFLR.taking_Glucose();
        APCDER.AddCommentandImage();

    }*/


 /*  @Test
    public void Left_Menu() {

       Log.startTestCase("Left Menu Navigation");


       // LeftMenu TestCase
     // LMR.LeftMenu_Navigation(UserEmail);


       Log.endTestCase("LeftMenu Navigation");





     //LeftMenu - SettingPage Navigation
       Log.startTestCase("Settings Navigation");

       LMR.leftmenuopner.click();
       Log.info("Left Menu opened Properly");
        LMR.settings.click();
       Log.info("Settings page opened Properly");
        SR.Setting_Navigation();


        Log.endTestCase("Settings Navigation");


    }*/


   /* @Test
    public void Units()
    {
        Log.startTestCase("Unit System - Weight Unit");

        String weightunit;

        LMR.leftmenuopner.click();
        Log.info("Left Menu opened Properly");
        LMR.settings.click();
        Log.info("Settings page opened Properly");



        //Weight Checking
        weightunit=SR.CheckUnits_weight();
        Log.info("In Units Page the weight units set to "+ weightunit);

        SR.backbutton.click();
        SR.backbutton.click();

       /* //Checking the units in the DashBoard
        Log.info("Check same unit displayed in the DashBoard Page");
        DWR.Check_units_DashBoard(weightunit);


        //Checking the units in the Timeline
        Log.info("Check same unit displayed in the TimeLine");
        WTR.weightbuttontimeline.click();
        Log.info("Pressed the Weight button to display all the Logged weight cards");
        WTR.Check_units_Timeline(weightunit);

        //Checking the units in the notification
        Log.info("Check the same unit dislayed in the Notification");
        NWR.Check_units_Notification(weightunit);


        //Checking the units in the Weight Detail page
        WDR.Check_units_Weight_Detail(weightunit);

        Log.endTestCase("Unit System - Weight Unit");


    }*/

    @Test
    public void Profile()
    {

    }

}
