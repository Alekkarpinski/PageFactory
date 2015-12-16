package pgs;

import locators.HomePageLocators;
import locators.Task6Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by student03 on 16.12.15.
 */
public class Task6Page {
    private Task6Locators task6Locators;


    public Task6Page(WebDriver driver)
    {
        task6Locators = new Task6Locators();
        PageFactory.initElements(driver,task6Locators);
    }
    public void loginAs(String username, String password)
    {
        task6Locators.login_field.sendKeys(username);
        task6Locators.password_field.sendKeys(password);
        task6Locators.save_button.click();
    }
}
