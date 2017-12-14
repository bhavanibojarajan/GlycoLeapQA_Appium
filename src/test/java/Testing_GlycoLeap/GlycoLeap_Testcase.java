package Testing_GlycoLeap;

import org.apache.log4j.PropertyConfigurator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.MobileElement;
import Log_File.Log;

import java.io.File;

import static org.apache.log4j.PropertyConfigurator.configure;
import org.openqa.selenium.support.ui.ExpectedCondition;
public class GlycoLeap_Testcase extends BaseTestClass {

public static String UserEmail;

    File classpathRoot = new File(System.getProperty("user.dir"));
    File appDir = new File(classpathRoot, "/app");
    File prop = new File (appDir, "log4j.properties");


    @BeforeTest
    public void Login()

    {



   PropertyConfigurator.configure(prop.getAbsolutePath());

        MobileElement login;
        Log.startTestCase("Login");
        LR.Press_Signin_Button();


        Log.info("Signin Button Pressed");
        login = LR.Enter_Username_Password();

        login.click();
        Log.info("Login button Pressed");

        //LR.Verify_Proper_Login();


        Log.endTestCase("Login");
    }




  @Test
    public void Left_Menu() {

   Log.startTestCase("Left Menu Navigation");


       // LeftMenu TestCase
      LMR.LeftMenu_Navigation();


       Log.endTestCase("LeftMenu Navigation");





    //LeftMenu - SettingPage Navigation
       Log.startTestCase("Settings Navigation");


        SR.Setting_Navigation();


        Log.endTestCase("Settings Navigation");


    }


  @Test
    public void Units_weight() throws InterruptedException {


     String weightunit ;



     // Opening the Left menu and setting the Units

       LMR.Left_Menu_and_setting_Opener();





       if(SR.CheckUnits_weight().toLowerCase().contains("lbs"))
       {
        weightunit="lbs";}
        else
       {
         weightunit="kg";
       }




        Log.info("In Units Page the weight units set to "+ weightunit);

        Log.startTestCase("Unit System - Weight Unit  "+weightunit);


        //WEight check in the GoalPage
      Log.info("Check the same unit dislayed in the Goal Page");
       SR.Reach_Goal_Page();
       Log.info("Goal page displayed - unit "+weightunit);
        GR.Check_units_Goal_Page(weightunit);



        //Weight check in  the  Profile page --- have to check
        Log.info("Check the same unit dislayed in the Profile Page");
        SR.Reach_Profile_Page();
       PR.Check_units_Profile_Page(weightunit);


        // Reach home page
        SR.Reach_to_Home_Page();

        //Checking the units in the notification page

        NWR.Check_units_Notification(weightunit);
        Log.info("Check the same unit dislayed in the Notification");


       //Checking the units in the DashBoard
        Log.info("Check same unit displayed in the DashBoard Page");
        DWR.Check_units_DashBoard(weightunit);


       //Checking the units in the Timeline

        Log.info("Pressed the Weight button to display all the Logged weight cards");
        WTR.Check_units_Timeline(weightunit);



        //Checking the units in the Weight Detail page
        WDR.Check_units_Weight_Detail(weightunit);

        Log.endTestCase("Unit System - Weight Unit");


        //Checking the units in the Goal Page



    }



    @Test
    public void Units_Glucose()
    {
        String glucoseunit;


        // Opening the Left menu and setting the Units

        LMR.Left_Menu_and_setting_Opener();


        if(SR.CheckUnits_glucose().toLowerCase().contains("mmol/l"))
        {
            glucoseunit="mmol/l";}
        else
        {
            glucoseunit="mg/dl";
        }

        Log.info("In Units Page the glucose units set to "+ glucoseunit);

        Log.startTestCase("Unit System - glucose Unit  "+glucoseunit);


        //Checking the units in the notification page

        NWR.Check_units_Notification(glucoseunit);
        Log.info("Check the same unit dislayed in the Notification");

        //Checking the units in the Timeline

        Log.info("Pressed the Weight button to display all the Logged weight cards");
        WTR.Check_units_Timeline(glucoseunit);



        //Checking the units in the Weight Detail page
        WDR.Check_units_Weight_Detail(glucoseunit);

        Log.endTestCase("Unit System - Weight Unit");



    }


   @Test
    public void Food_Log() throws InterruptedException
    {

       Log.startTestCase("Full Food Log");
        FLR.Taking_One_Full_Food_Log();
        //FLR.View_Edit_Delete();
        GFLR.Taking_Before_Food_Glucose().click();
        Log.info("Before Food Glucose button Pressed");
        GFLR.taking_Glucose();
        Log.info("Before Food Glucose reading taken");

         //GFLR.Taking_After_Food_Glucose().click();
        //GFLR.taking_Glucose();
     /*APCDER.AddCommentandImage();
        Log.endTestCase("Full Food Log");*/
    }


    @Test
    public void Profile()
    {
        Log.startTestCase("Profile Page");


       PR.Profile_page_validation();


        Log.endTestCase("Profile Page");

    }

}
