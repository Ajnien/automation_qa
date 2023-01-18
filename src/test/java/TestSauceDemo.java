import lv.acodemy.constants.Generic;
import lv.acodemy.page_object.LoginPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static lv.acodemy.constants.Generic.SAUCE_URL;

public class TestSauceDemo {
    ChromeDriver driver;
    LoginPage loginPage;

    @BeforeMethod
    public void initialize() {
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);

    }

    @Test
    public void authorizeTest() {
        driver.get(SAUCE_URL);
        loginPage.authorize("standard_user", "secret_sauce");

    }
    @AfterMethod
    public void tearDown() {
        driver.close();
        driver.quit();
    }



}
