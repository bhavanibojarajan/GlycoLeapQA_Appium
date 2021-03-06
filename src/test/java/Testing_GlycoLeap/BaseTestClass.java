package Testing_GlycoLeap;

import AppiumSupport.AppiumBaseClass;


import PAOBFactory.Ask_Coach.Android_Ask_Coach_Repository;
import PAOBFactory.Ask_Coach.Ask_Coach_Repository;
import PAOBFactory.Comment_Edit_Delete.Add_Photo_Comment_Delete_Edit_Repository;
import PAOBFactory.Comment_Edit_Delete.Android_Add_Photo_Comment_Delete_Edit_Repository;
import PAOBFactory.DashBoard.DashBoard_Weight_Repository;
import PAOBFactory.FoodLog.*;
import PAOBFactory.GlucoseDetailPage.Android_Glucose_Detail_Repository;
import PAOBFactory.GlucoseDetailPage.Glucose_Detail_Repository;
import PAOBFactory.Goal.Android_Goal_Repository;
import PAOBFactory.Goal.IOS_Goal_Repository;
import PAOBFactory.LeftMenu.Android_LeftMenu_Repository;
import PAOBFactory.LeftMenu.IOS_LeftMenu_Repository;
import PAOBFactory.LeftMenu.LeftMenu_Repository;
import PAOBFactory.LeftMenu.SettingPage.Android_Settingspage_Repository;
import PAOBFactory.LeftMenu.SettingPage.IOS_Settingspage_Repository;
import PAOBFactory.LeftMenu.SettingPage.Settingspage_Repository;
import PAOBFactory.Login.Android_Login_Repository;
import PAOBFactory.Login.IOS_Login_Repository;
import PAOBFactory.Login.Login_Repository;
import PAOBFactory.Notification.Notification_Glucose_Repository;
import PAOBFactory.Notification.Notification_Weight_Repository;
import PAOBFactory.Notification.*;
import PAOBFactory.Profile.Android_Profilepage_Repository;
import PAOBFactory.Profile.IOS_Profilepage_Repository;
import PAOBFactory.Profile.Profilepage_Repository;
import PAOBFactory.RegisterNewUser.Android_PersonalDetail_Registory;
import PAOBFactory.RegisterNewUser.Android_Register_Repository;
import PAOBFactory.DashBoard.Android_DashBoard_Weight_Repository;
import PAOBFactory.DashBoard.IOS_DashBoard_Weight_Repository;
import PAOBFactory.RegisterNewUser.PersonalDetail_Repository;
import PAOBFactory.RegisterNewUser.Register_Repository;
import PAOBFactory.Search.Android_FoodSearch_Repository;
import PAOBFactory.Search.FoodSearch_Repository;
import PAOBFactory.Search.IOS_FoodSearch_Repository;
import PAOBFactory.TimeLine.*;

import PAOBFactory.WeightDetailPage.Android_Weight_Detail_Repository;
import PAOBFactory.WeightDetailPage.IOS_Weight_Detail_Repository;
import PAOBFactory.WeightDetailPage.Weight_Detail_Repository;
import PAOBFactory.Goal.Goal_Repository;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import AppiumSupport.AppiumController;
import PAOBFactory.Goal.Android_Goal_Repository;
import PAOBFactory.Goal.IOS_Goal_Repository;

import java.io.File;

public class BaseTestClass extends AppiumBaseClass{
    protected Login_Repository LR;
    protected Register_Repository RR;
    protected PersonalDetail_Repository PDR;
    protected Food_Log_Repository FLR;
    protected Glucose_Food_Log_Repository GFLR;
    protected Add_Photo_Comment_Delete_Edit_Repository APCDER;
    protected LeftMenu_Repository LMR;
    protected Settingspage_Repository SR;
    protected DashBoard_Weight_Repository DWR;
    protected Weight_Timeline_Repository WTR;
    protected Glucose_Timeline_Repository GTR;
    protected Notification_Weight_Repository NWR;
    protected Weight_Detail_Repository WDR;
    protected Glucose_Detail_Repository GDR;
    protected Profilepage_Repository PR;
    protected Goal_Repository GR;
    protected FoodSearch_Repository FSR;
    protected Ask_Coach_Repository ACR;
    protected Notification_Glucose_Repository NGR;

    protected IOS_Login_Repository ILR;

    @BeforeSuite
    public void setUp() throws Exception {
        AppiumController.instance.start();
        switch (AppiumController.executionOS) {
            case ANDROID:

                LR = new Android_Login_Repository(driver());
                FLR=new Android_Food_Log_Repository(driver());
                GFLR=new Android_Glucose_Food_Log_Repository(driver());
                APCDER =new Android_Add_Photo_Comment_Delete_Edit_Repository(driver());
                RR = new Android_Register_Repository(driver());
                PDR =new Android_PersonalDetail_Registory(driver());
                LMR=new Android_LeftMenu_Repository(driver()) ;
                SR= new Android_Settingspage_Repository(driver());
                DWR=new Android_DashBoard_Weight_Repository(driver());
                WTR=new Android_Weight_Timeline_Repository(driver());
                GTR=new Android_Glucose_Timeline_Repository(driver());
                NWR = new Android_Notification_Weight_Repository(driver());
                WDR= new Android_Weight_Detail_Repository(driver());
                PR=new Android_Profilepage_Repository(driver());
                GR=new Android_Goal_Repository(driver());
                FSR=new Android_FoodSearch_Repository(driver());
                ACR=new Android_Ask_Coach_Repository(driver());
                NGR= (Notification_Glucose_Repository) new Android_Notification_Glucose_Repository(driver());
                GDR =new Android_Glucose_Detail_Repository(driver());
                break;
            case IOS:
                LR = new IOS_Login_Repository(driver());

                LMR=new IOS_LeftMenu_Repository(driver());
                SR = new IOS_Settingspage_Repository(driver());
                PR = new IOS_Profilepage_Repository(driver());
                FLR=new IOS_Food_Log_Repository(driver());
                GR=new IOS_Goal_Repository(driver());
                GFLR=new IOS_Glucose_Food_Log_Repository(driver());
                //APCDER =new IOS_Add_Photo_Comment_Delete_Edit_Repository(driver());
               DWR=new IOS_DashBoard_Weight_Repository(driver());
                WTR=new IOS_Weight_Timeline_Repository(driver());
                NWR = new IOS_Notification_Weight_Repository(driver());
                WDR= new IOS_Weight_Detail_Repository(driver());
                FSR=new IOS_FoodSearch_Repository(driver());

                break;
        }
    }

    @AfterSuite
    public void tearDown() {
        AppiumController.instance.stop();
    }
}
