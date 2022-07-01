Feature: Testers should be able to update defects so they can monitor their progress
    Scenario: update from pending to accepted
    Scenario: update from pending to rejected
    Scenario: udate from defect accepted to defect rejected
    Scenario: update from defect accepted to defect fixed
    Scenario: update from defect accepted to defect shelved

        Given The tester is on the testers homepage
        When  the tester enters defect id number
        When  the tester selects accept or decline
        When  the tester selects fixed, shelved, or rejected
        Then  the tester can update the defect

    


