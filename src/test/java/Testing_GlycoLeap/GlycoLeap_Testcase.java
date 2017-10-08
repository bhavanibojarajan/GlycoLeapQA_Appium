package Testing_GlycoLeap;

import PAOBFactory.Comment_Edit_Delete.Android_Add_Photo_Comment_Delete_Edit_Repository;
import PAOBFactory.FoodLog.Android_Food_Log_Repository;
import PAOBFactory.FoodLog.Android_Glucose_Food_Log_Repository;
import PAOBFactory.Login.Android_Login_Repository;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GlycoLeap_Testcase extends BaseTestClass {
    @BeforeClass
    public void Login()

    {
        LR.Ok.click();
        LR.Signin.click();
        LR.Enter_Username_Password().click();
       // Assert.assertEquals("Home",LR.);
    }
    @Test
    public void Left_Menu() {
        LMR.leftmenuopner.click();
    }



    @Test
    public void Food_Log() throws InterruptedException
    {

        FLR.Taking_One_Full_Food_Log();
        //FLR.View_Edit_Delete();
        GFLR.Taking_Before_Food_Glucose().click();
        GFLR.taking_Glucose();
        // GFLR.Taking_After_Food_Glucose().click();
        //GFLR.taking_Glucose();
        APCDER.AddCommentandImage();

    }

}
