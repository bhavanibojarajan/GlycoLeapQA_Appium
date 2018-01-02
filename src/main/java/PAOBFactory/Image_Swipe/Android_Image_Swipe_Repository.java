package PAOBFactory.Image_Swipe;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

public class Android_Image_Swipe_Repository {

    AndroidDriver driver;


    public void flick_left(WebElement flick_element) {
        Point location = flick_element.getLocation();
        Dimension size = flick_element.getSize();

        int flick_x, flick_y, flick_start_x, flick_end_x,flick_start_y,flick_end_y;

        flick_x =size.getWidth();
        flick_y = location.y + (size.getHeight()/2);

        flick_start_x = flick_x - (int)((double)flick_x*0.25);
        flick_end_x = flick_x -(int)((double)flick_x*0.55);
        swipe(flick_start_x, flick_y, flick_end_x, flick_y,-200);

    }



    public void swipe(int swipe_start_x, int swipe_start_y, int swipe_end_x, int swipe_end_y,int duration){

        int x = swipe_start_x;
        int y = swipe_start_y;
        int x_travel =  swipe_end_x-swipe_start_x;
        int y_travel =  swipe_end_y-swipe_start_y;
        TouchAction action1 = new TouchAction(driver).longPress(x,y).moveTo(x_travel, y_travel).release();
        action1.perform();


    }
}
