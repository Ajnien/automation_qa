import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestChrome {
    @Test
    public void chromeTest() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.lv/?hl=en");
driver.findElement(By.xpath("//button//div[contains(text), 'Accept all'))]"));
    }
}
