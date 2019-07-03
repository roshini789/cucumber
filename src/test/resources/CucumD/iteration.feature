Feature: login

Background:
Given the user wants home page

@Sanity
Scenario: loginpage
When user enters credentials
Then user can do the successful login




@smoke
Scenario: login

When user enters below credentails and clicks sing in
     |username |password |
     |invalidUN|invalidPW|
     |validUN  |validPN  |
Then the expected behavior could be
