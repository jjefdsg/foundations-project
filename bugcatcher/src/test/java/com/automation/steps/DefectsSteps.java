package com.automation.steps;


import org.junit.internal.runners.statements.ExpectException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.automation.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.internal.com.google.gson.annotations.Until;

public class DefectsSteps {
    @Given("the manager is on the manager home page")
    public void the_manager_is_on_the_manager_home_page() {
        TestRunner.driver.get("File://C:/Users/sain4/Desktop/login-project/foundations-project/bugcatcher/src/test/resources/web-pages/managerpage.html");
    }
    @When("the manager enters the type of defect")
    public void the_manager_enters_the_type_of_defect() {
        TestRunner.createDefects.enterDefect("testing");
}
    @When("the manager selects which tester he chooses")
    public void the_manager_selects_which_tester_he_chooses() {
        TestRunner.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("options")));
        TestRunner.createDefects.Tester();
}
    @When("the manager clicks the assign button")
    public void the_manager_clicks_the_assign_button() {
        TestRunner.createDefects.clickButton();
}
    @Then("The manager should recieve an alert of the defect and tester he assigned to it")
    public void the_manager_should_recieve_an_alert_of_the_defect_and_tester_he_assigned_to_it() {
        TestRunner.wait.until(ExpectedConditions.alertIsPresent());
        TestRunner.createDefects.alert();
}

    
}
