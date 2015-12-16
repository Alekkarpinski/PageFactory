package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by student03 on 16.12.15.
 */
public class Task6Locators {
    @FindBy(how = How.XPATH, using = ".//*[@id='LoginForm__username']")
    public WebElement login_field;

    @FindBy(how = How.XPATH, using = ".//*[@id='LoginForm__password']")
    public WebElement password_field;

    @FindBy(how = How.XPATH, using = ".//*[@id='LoginForm_save']")
    public WebElement save_button;

    @FindBy(how = How.XPATH, using = "html/body/div[1]/div/div[1]/div/ul/li")
    public WebElement error;

}
