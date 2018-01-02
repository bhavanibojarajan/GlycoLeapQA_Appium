package PAOBFactory.Image_Swipe;

import org.openqa.selenium.WebElement;

public interface Image_Swipe_Repository {

   public void  flick_left(WebElement flick_element);
    public void swipe(int swipe_start_x, int swipe_start_y, int swipe_end_x, int swipe_end_y,int duration);
}
