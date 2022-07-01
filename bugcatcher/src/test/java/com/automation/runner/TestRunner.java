package com.automation.runner;

import java.time.Duration;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automation.poms.CreateDefects;
import com.automation.poms.LoginPage;
import com.automation.poms.UpdateDefect;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", glue= "com/automation/steps", plugin = "pretty")
public class TestRunner {

    public static WebDriver driver;
    public static LoginPage login;
    public static WebDriverWait wait;
    //creating defects section
    public static CreateDefects createDefects;
    //updating defects
    public static UpdateDefect updateDefect;
    public static Alert alert;


    @BeforeClass
    public static void setup(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver=new ChromeDriver();
        login = new LoginPage(driver);
        wait=new WebDriverWait(driver, 6);
        createDefects=new CreateDefects(driver);
        updateDefect =new UpdateDefect(driver);
        


        
    }
    @AfterClass
    public static void teardown(){
        driver.quit();
    }

    




    
}
