import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {
    public static void main(String[] args) {

//        System.out.printf("Hello and welcome!");


        //Launch or open the  chrome browser
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\fajla\\OneDrive\\Desktop\\Selenium Webdriver(Group-2)\\SQA_Project_Group_2\\Driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
//        ChromeDriverService service = new ChromeDriverService.Builder().build();
//        WebDriver driver = new ChromeDriver(service);

        //launch webpage or navigate to the url
        driver.navigate().to("https://www.saucedemo.com/");

        //close the webpage
        driver.close();




    }
}
