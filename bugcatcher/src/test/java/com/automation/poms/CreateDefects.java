package com.automation.poms;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;


public class CreateDefects {

    private WebDriver driver;

    @FindBy(id = "defect")
    public WebElement textInput;

    @FindBy(id = "options")
    public Select select;

    @FindBy(id = "click")
    public WebElement assignDefectBtn;

    public Alert alert;

    

    public CreateDefects(WebDriver driver){
        this.driver = driver;


        PageFactory.initElements(driver, this);
    }

   
    // method section
    public void enterDefect(String defect){
        this.textInput.sendKeys(defect);

    }

    public void alert(){
        Alert alert = this.driver.switchTo().alert();
        Assert.assertTrue(alert.getText().contains("testing"));
        alert.accept();

    }

    public void Tester(){
        //this.select.selectByVisibleText("TesterOne");
        Select element = new Select(this.driver.findElement(By.id("options")));
        element.selectByVisibleText("TesterOne");
        


    }
    
    public void clickButton(){
        this.assignDefectBtn.click();
    }
}
