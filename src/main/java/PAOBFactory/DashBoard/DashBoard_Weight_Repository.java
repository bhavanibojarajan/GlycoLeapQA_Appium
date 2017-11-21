package PAOBFactory.DashBoard;

import org.openqa.selenium.WebElement;

public interface DashBoard_Weight_Repository {
    public void Check_units_DashBoard(String units);
    public WebElement CurrentWeightUnit();
}
