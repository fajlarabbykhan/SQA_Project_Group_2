import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase7 {
    public static void main(String[] args) {
        //launch chrome browser
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\fajla\\OneDrive\\Desktop\\Selenium Webdriver(Group-2)\\SQA_Project_Group_2\\Driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //open swag lab web page
        driver.navigate().to("https://www.saucedemo.com/v1/");

//        //locate username using single attribute
//        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");

        //locate username using contains
        driver.findElement(By.xpath("//input[contains(@id,'user')]")).sendKeys("standard_user");


        //locate password using multiple attribute
        driver.findElement(By.xpath("//input[@id='password'][@name='password']")).sendKeys("secret_sauce");

        //locate login
        driver.findElement(By.xpath("//input[@id='login-button']")).click();


        //Switch to product page
        String currentWindow=driver.getWindowHandle();
        driver.switchTo().window(currentWindow);
        System.out.println(currentWindow);

        //add to cart using xpath and or;
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack' and @name='add-to-cart-sauce-labs-backpack']")).click();
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light' or @name='add-to-cart-sauce-labs-bike-light']")).click();





    }
}
