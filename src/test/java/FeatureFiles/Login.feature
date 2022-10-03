#Senaryo ;
#1- https://parabank.parasoft.com/ siteyi açınız.
#2- username ve password u gönderin ve Login butonuna tıklatın.
#3- Login olduğunuzu doğrulayın.

  #- Sonra Yukarıdaki Senaryoyu Gherkin dilinde yazdık.

Feature: Login Functionality

  Scenario Outline: login with valid username and password

    Given Navigate to basqar

    When login with valid username as "<username>" password as "<password>"


    Then User should login successfuly

    And Logout Button


    Examples:

      | username | password |

      | sozens     | smh123    |



    Scenario Outline: login with invalid username and password

    When login with valid username as "<username>" password as "<password>"


    Then User should invalid login

    Examples:

      | username | password |

      | asdash     | smh1234567 |