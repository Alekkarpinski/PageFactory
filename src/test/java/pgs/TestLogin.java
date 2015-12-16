package pgs;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by student03 on 15.12.15.
 */
public class TestLogin {
    private static WebDriver driver;
    private static HomePage homePage;
    private static Task6Page task6Page;
    @BeforeClass
    public static void setUp(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

    }

//    @Test
//    public void testLoginPage(){
//        driver.navigate().to("https://owa.pgs-soft.com/");
//        WebElement usernameInput = driver.findElement(By.id("username"));
//        usernameInput.sendKeys("login");
//        WebElement passwordInput = driver.findElement(By.id("password"));
//        passwordInput.sendKeys("haslo");
//        WebElement signInButton = driver.findElement(By.className("signinbutton"));
//        signInButton.submit();
//
//    }
//    @Test
//    public void testRadioButton() throws InterruptedException
//
//    {
//        driver.navigate().to("http://codeseven.github.io/toastr/demo.html");
//        List<WebElement> toastTypeRadioButtons =  driver.findElements(By.xpath(".//*[@id='toastTypeGroup']//input[@type='radio']"));
//        while(true){
//        toastTypeRadioButtons.get(3).click();
//        Thread.sleep(1000);
//        toastTypeRadioButtons.get(2).click();
//        Thread.sleep(1000);
//        toastTypeRadioButtons.get(1).click();
//        Thread.sleep(1000);
//        toastTypeRadioButtons.get(0).click();
//        Thread.sleep(1000);}
//
//    }

//    public void testDropdown()
//    {
//        driver.navigate().to("https://testingcup.pgs-soft.com");
//        driver.findElement(By.linkText("Zadanie 8")).click();
//
//        WebElement typyKartyWebElement = driver.findElement(By.id("task8_form_cardType"));
//        Select typyKarty = new Select(typyKartyWebElement);
//        typyKarty.selectByVisibleText("Discover");
//
//        WebElement monthCard = driver.findElement(By.id("task8_form_cardInfo_month"));
//        Select cardMonth = new Select(monthCard);
//        cardMonth.selectByVisibleText("December");
//        driver.findElement(By.id("task8_form_name")).sendKeys("Aleksander Karpiński");
//        driver.findElement(By.id("task8_form_cardNumber")).sendKeys("6011000990139424");
//        driver.findElement(By.id("task8_form_cardCvv")).sendKeys("601");
//
//        WebElement rokWaznosciWebElement = driver.findElement(By.id("task8_form_cardInfo_year"));
//        Select rokWaznosci = new Select(rokWaznosciWebElement);
//        rokWaznosci.selectByVisibleText("2020");
//        driver.findElement(By.name("task8_form[save]")).submit();
//        //Assert.assertEquals("Discover",typyKarty.getFirstSelectedOption().getText());
//    }

    @Test
    public void test() throws InterruptedException {
        driver.navigate().to("https://testingcup.pgs-soft.com");
        homePage = new HomePage(driver);
        task6Page = new Task6Page(driver);

        Thread.sleep(1000);
        homePage.clickTask6();
        Thread.sleep(1000);
        task6Page.loginAs("tester","123-xyz");
        //Assert.assertTrue(loginPage.isError());
    }
    @AfterClass
    public static void tearDown(){
        //driver.close();
       // driver.quit();
    }
}
