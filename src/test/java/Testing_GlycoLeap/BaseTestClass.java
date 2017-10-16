package Testing_GlycoLeap;

import AppiumSupport.AppiumBaseClass;


import PAOBFactory.Comment_Edit_Delete.Add_Photo_Comment_Delete_Edit_Repository;
import PAOBFactory.Comment_Edit_Delete.Android_Add_Photo_Comment_Delete_Edit_Repository;
import PAOBFactory.DashBoard.DashBoard_Weight_Repository;
import PAOBFactory.FoodLog.Android_Food_Log_Repository;
import PAOBFactory.FoodLog.Android_Glucose_Food_Log_Repository;
import PAOBFactory.FoodLog.Food_Log_Repository;
import PAOBFactory.FoodLog.Glucose_Food_Log_Repository;
import PAOBFactory.LeftMenu.Android_LeftMenu_Repository;
import PAOBFactory.LeftMenu.LeftMenu_Repository;
import PAOBFactory.LeftMenu.SettingPage.Android_Settingspage_Repository;
import PAOBFactory.LeftMenu.SettingPage.Settingspage_Repository;
import PAOBFactory.Login.Android_Login_Repository;
import PAOBFactory.Login.IOS_Login_Repository;
import PAOBFactory.Login.Login_Repository;
import PAOBFactory.Notification.Android_Notification_Weight_Repository;
import PAOBFactory.Notification.Notification_Weight_Repository;
import PAOBFactory.RegisterNewUser.Android_PersonalDetail_Registory;
import PAOBFactory.RegisterNewUser.Android_Register_Repository;
import PAOBFactory.DashBoard.Android_DashBoard_Weight_Repository;
import PAOBFactory.RegisterNewUser.PersonalDetail_Repository;
import PAOBFactory.RegisterNewUser.Register_Repository;
import PAOBFactory.TimeLine.Android_Weight_Timeline_Repository;
import PAOBFactory.TimeLine.Weight_Timeline_Repository;
import PAOBFactory.WeightDetailPage.Android_Weight_Detail_Repository;
import PAOBFactory.WeightDetailPage.Weight_Detail_Repository;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import AppiumSupport.AppiumController;

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
    protected Notification_Weight_Repository NWR;
    protected Weight_Detail_Repository WDR;

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
                NWR = new Android_Notification_Weight_Repository(driver());
                WDR= new Android_Weight_Detail_Repository(driver());
                break;
            case IOS:
                LR = new IOS_Login_Repository(driver());

                break;
        }
    }

    @AfterSuite
    public void tearDown() {
        AppiumController.instance.stop();
    }
}
