import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase3 {
    public static void main(String[] args) {
        //launch chrome browser
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\fajla\\OneDrive\\Desktop\\Selenium Webdriver(Group-2)\\SQA_Project_Group_2\\Driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //open swag lab web page
        driver.navigate().to("https://www.saucedemo.com/v1/");

        //locate user name --tag#id
        driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user\n");

        //locate password -tag[attribute=value]
        driver.findElement(By.cssSelector("input[name=password]")).sendKeys("secret_sauce");

        //locate login  tag.value_of_class_name

        driver.findElement(By.cssSelector("input.btn_action")).click();




        //sub string method
        //tag[attribute^=substring]--start
        //tag[attribute$=substring]--end
        //tag[attribute*=substring]--contain
    }
}
