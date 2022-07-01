Feature: Manager Should be able to create defects and assign them to tester

    Scenario: When the manager is on the manager page he should create defects and assign them to tester

        Given   the manager is on the manager home page
        When    the manager enters the type of defect
        When    the manager selects which tester he chooses
        When    the manager clicks the assign button
        Then    The manager should recieve an alert of the defect and tester he assigned to it

    