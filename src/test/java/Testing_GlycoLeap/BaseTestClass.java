package Testing_GlycoLeap;

import AppiumSupport.AppiumBaseClass;


import PAOBFactory.Comment_Edit_Delete.Android_Add_Photo_Comment_Delete_Edit_Repository;
import PAOBFactory.FoodLog.Android_Food_Log_Repository;
import PAOBFactory.FoodLog.Android_Glucose_Food_Log_Repository;
import PAOBFactory.LeftMenu.Android_LeftMenu_Repository;
import PAOBFactory.LeftMenu.SettingPage.Android_Settingspage_Repository;
import PAOBFactory.Login.Android_Login_Repository;
import PAOBFactory.Notification.Android_Notification_Weight_Repository;
import PAOBFactory.RegisterNewUser.Android_PersonalDetail_Registory;
import PAOBFactory.RegisterNewUser.Android_Register_Repository;
import PAOBFactory.DashBoard.Android_DashBoard_Weight_Repository;
import PAOBFactory.TimeLine.Android_Weight_Timeline_Repository;
import PAOBFactory.WeightDetailPage.Android_Weight_Detail_Repository;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import AppiumSupport.AppiumController;

import java.io.File;

public class BaseTestClass extends AppiumBaseClass{
    protected Android_Login_Repository LR;
    protected Android_Register_Repository RR;
    protected Android_PersonalDetail_Registory PDR;
    protected Android_Food_Log_Repository FLR;
    protected Android_Glucose_Food_Log_Repository GFLR;
    protected Android_Add_Photo_Comment_Delete_Edit_Repository APCDER;
    protected Android_LeftMenu_Repository LMR;
    protected Android_Settingspage_Repository SR;
    protected Android_DashBoard_Weight_Repository DWR;
    protected Android_Weight_Timeline_Repository WTR;
    protected Android_Notification_Weight_Repository NWR;
    protected Android_Weight_Detail_Repository WDR;

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

                break;
        }
    }

    @AfterSuite
    public void tearDown() {
        AppiumController.instance.stop();
    }
}
