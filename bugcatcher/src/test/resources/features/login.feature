Feature: Users of my bug catcher application should be able to sign in to thier respective homepages

    Scenario:  As a manager I want to sign in to view my custom homepage

        Given   the employee is on the login page
        When    the manager enters his correct username
        When    the manager enters his correct password
        When    the employee clicks the login button
        Then    the manager should be logged in to the manager page



    Scenario:   As a tester I want to sign in to view my custom homepage

        Given   the employee is on the login page
        When    the tester enters his correct username
        When    the tester enters his correct password
        When    the employee clicks the login button
        Then    the tester should be logged in to the tester home page   






    