package org.example.tests;

import org.example.config.Config;
import org.example.driver.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver webDriver;

    @BeforeMethod
    public void setUp(){
        String browser = Config.get("browser","chrome");
        webDriver = WebDriverFactory.createDriver(browser);
        webDriver.manage().window().maximize();
    }

    @AfterMethod
    public  void tearDown(){
        if(webDriver!=null){
            webDriver.quit();
        }
    }
}
