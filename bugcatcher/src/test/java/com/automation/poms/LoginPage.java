package com.automation.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// this class is the java version of webpage
public class LoginPage {
    


    private WebDriver driver;

    @FindBy(id = "Username")
    public WebElement usernameInput;

    @FindBy(id = "Password")
    public WebElement passwordInput;

    @FindBy(id = "btn")
    public WebElement loginButton;

    public LoginPage(WebDriver driver){
        this.driver= driver;

        // the page factory is provided by with selenium
        PageFactory.initElements(driver, this);
    }   

    /*
    These methods are public so we can access them in the steps, and thier return type is 
    void because the function does not return any value: They jus interact with the webpage
     */
    //This method allows both managers and testers to enter their username
    public void enterUsername(String username){
        // to enter username into input element we use the sendKeys method
        this.usernameInput.sendKeys(username);

    }
        //This method allows both managers and testers to enter their password
    public void enterPassword(String password){
        this.passwordInput.sendKeys(password);
    }

    public void clickButton(){
        this.loginButton.click();
    }
}
