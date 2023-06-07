package BrowserDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\tanya\\IdeaProjects\\drivers_v1\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.automationtesting.co.uk");
    }
}
