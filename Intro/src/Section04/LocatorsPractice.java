package Section04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPractice {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tanya\\IdeaProjects\\drivers_v1\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.automationtesting.co.uk/index.html");
        driver.findElement(By.linkText("LOADER")).click(); //needs to be uppercase because it's uppercase on a webpage, not html
    }
}
