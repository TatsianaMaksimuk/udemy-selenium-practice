package BrowserDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\tanya\\IdeaProjects\\drivers_v1\\geckodriver.exe");

        // FirefoxDriver driver = new FirefoxDriver();


        WebDriver driver = new FirefoxDriver(); //using WebDriverInterface supports crossdriver testing
        driver.manage().window().maximize();
        driver.get("https://www.automationtesting.co.uk");
    }
}
