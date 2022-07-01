package com.automation.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.automation.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TesterSteps {

    @Given("The tester is on the testers homepage")
    public void the_tester_is_on_the_testers_homepage() {
        TestRunner.driver.get("File://C:/Users/sain4/Desktop/login-project/foundations-project/bugcatcher/src/test/resources/web-pages/testerpage.html");
        
}

    @When("the tester enters defect id number")
    public void the_tester_enters_defect_id_number() {
        TestRunner.updateDefect.enterDefectId("14284");
}
    @When("the tester selects accept or decline")
    public void the_tester_selects_accept_or_decline() {
        TestRunner.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("select")));
        TestRunner.updateDefect.acceptOrDecline();
}
    @When("the tester selects fixed, shelved, or rejected")
    public void the_tester_selects_fixed_shelved_or_rejected() {
        TestRunner.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("select2")));
        TestRunner.updateDefect.updateAgain();
    
}
    @Then("the tester can update the defect")
    public void the_tester_can_update_the_defect() {
        TestRunner.updateDefect.clickButton();
   
}


    
}
