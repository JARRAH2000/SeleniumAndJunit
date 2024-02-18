import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tests {
    WebDriver webDriver;
    @Test
    public void firstTest() {
        webDriver = new ChromeDriver();

        webDriver.navigate().to("https://www.google.com/");
    }
}
