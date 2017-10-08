package Testing_GlycoLeap;

import AppiumSupport.AppiumBaseClass;


import PAOBFactory.Comment_Edit_Delete.Android_Add_Photo_Comment_Delete_Edit_Repository;
import PAOBFactory.FoodLog.Android_Food_Log_Repository;
import PAOBFactory.FoodLog.Android_Glucose_Food_Log_Repository;
import PAOBFactory.LeftMenu.Android_LeftMenu_Repository;
import PAOBFactory.Login.Android_Login_Repository;
import PAOBFactory.RegisterNewUser.Android_PersonalDetail_Registory;
import PAOBFactory.RegisterNewUser.Android_Register_Repository;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import AppiumSupport.AppiumController;


public class BaseTestClass extends AppiumBaseClass{
    protected Android_Login_Repository LR;
    protected Android_Register_Repository RR;
    protected Android_PersonalDetail_Registory PDR;
    protected Android_Food_Log_Repository FLR;
    protected Android_Glucose_Food_Log_Repository GFLR;
    protected Android_Add_Photo_Comment_Delete_Edit_Repository APCDER;
    protected Android_LeftMenu_Repository LMR;


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
