package Testing_GlycoLeap;

import PAOBFactory.Comment_Edit_Delete.Android_Add_Photo_Comment_Delete_Edit_Repository;
import PAOBFactory.FoodLog.Android_Food_Log_Repository;
import PAOBFactory.FoodLog.Android_Glucose_Food_Log_Repository;
import PAOBFactory.Login.Android_Login_Repository;
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


    @BeforeClass
    public void Login()

    {
        PropertyConfigurator.configure(prop.getAbsolutePath());

    MobileElement login;
        Log.startTestCase("Login");
        LR.Ok.click();

        LR.Signin.click();
        Log.info("Signin Button Pressed");
       login= LR.Enter_Username_Password();
       UserEmail=LR.Username.getText();
       login.click();

        Assert.assertEquals(LR.HomeTitle.getText(),"Home", "GlycoLeap App opened the Home Page");
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


  /* @Test
    public void Left_Menu() {
      // DOMConfigurator.configure("log4j.xml");
      // Log.startTestCase("LeftMenu");

        /*

       // LeftMenu TestCase
      LMR.LeftMenu_Navigation(UserEmail);*/



       // Log.endTestCase("LeftMenu");


       /* //LeftMenu - SettingPage Navigation
       LMR.leftmenuopner.click();
        LMR.settings.click();
        SR.Setting_Navigation();






    }*/


    @Test
    public void Units()
    {
        String weightunit;

        LMR.leftmenuopner.click();
        LMR.settings.click();



        //Weight Checking
        weightunit=SR.CheckUnits_weight();
        SR.backbutton.click();
        SR.backbutton.click();

        //Checking the units in the DashBoard
        DWR.Check_units_DashBoard(weightunit);

        //Checking the units in the Timeline
        WTR.weightbuttontimeline.click();
        WTR.Check_units_Timeline(weightunit);



    }

    @Test
    public void Profile()
    {

    }

}
