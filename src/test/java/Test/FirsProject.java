package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirsProject {
    public static void main(String[]args) {

            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("http://google.com");
        }
    }

