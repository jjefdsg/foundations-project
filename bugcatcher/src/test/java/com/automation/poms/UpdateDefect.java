package com.automation.poms;

import javax.naming.directory.SearchResult;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class UpdateDefect {

    private WebDriver driver;

    @FindBy(id = "secondinput")
    public WebElement defectId;

    @FindBy(id = "select")
    public Select select;

    @FindBy(id = "select2")
    public Select select2;

    @FindBy(id = "btn")
    public WebElement updateButton;



    public UpdateDefect(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    // Method Section
    public void enterDefectId(String id){
        this.defectId.sendKeys(id);
    }

    public void acceptOrDecline(){
        Select element= new Select(this.driver.findElement(By.id("select")));
        element.selectByVisibleText("Accepted");
    }
  
    

    public void updateAgain(){
        Select element= new Select(this.driver.findElement(By.id("select2")));
        element.selectByVisibleText("Fixed");
    }

    public void clickButton(){
        this.updateButton.click();
    }





    
}
