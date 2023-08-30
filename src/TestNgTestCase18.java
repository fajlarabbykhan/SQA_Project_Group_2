package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestNgTestCase18 {
    @Test
    public void verifyPageTitel(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        //launch webpage or navigate to the url
        driver.get("https://www.saucedemo.com/");
         String actualTitle=driver.getTitle();
         String expectedTitle="Swag Labs";

        Assert.assertEquals(actualTitle,expectedTitle);
        driver.quit();



    }
}
