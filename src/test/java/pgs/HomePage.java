package pgs;

import locators.HomePageLocators;
import locators.Task6Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by student03 on 15.12.15.
 */
public class HomePage {

    private HomePageLocators homePagelocators;


    public HomePage(WebDriver driver)
    {
        homePagelocators = new HomePageLocators();
        PageFactory.initElements(driver,homePagelocators);
    }
    public void clickTask6()
    {
        homePagelocators.task6_button.click();
    }

}
