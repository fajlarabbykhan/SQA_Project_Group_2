import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class TestCase15 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\fajla\\OneDrive\\Desktop\\Selenium Webdriver(Group-2)\\SQA_Project_Group_2\\Driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //open source demo website
        driver.navigate().to("https://www.saucedemo.com");
        driver.manage().window().maximize();

        //locate username by id
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        //locate password by name
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        //locate login button
        driver.findElement(By.className("btn_action")).click();
        //Switch to product page
//        String currentWindow=driver.getWindowHandle();
//        driver.switchTo().window(currentWindow);
      Thread.sleep(3000);

        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");

    }
}
