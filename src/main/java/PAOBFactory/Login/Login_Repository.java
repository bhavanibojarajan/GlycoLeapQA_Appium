package PAOBFactory.Login;

import io.appium.java_client.MobileElement;

public interface Login_Repository {
    public void Press_Signin_Button();

    public MobileElement Enter_Username_Password();
 public void Verify_Proper_Login();
}