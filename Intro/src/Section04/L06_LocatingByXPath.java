package Section04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L06_LocatingByXPath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tanya\\IdeaProjects\\drivers_v1\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.automationtesting.co.uk/buttons.html");
        //absolute
        //driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[1]/button")).click();
        // relative
        driver.findElement(By.xpath("//[@id='btn_one']")).click(); // - "//*[@id='btn_one']" works too
     }
}
