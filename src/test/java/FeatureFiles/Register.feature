#Senaryo ;
#1- https://parabank.parasoft.com/ siteyi açınız.
#2- username ve password u gönderin ve Login butonuna tıklatın.
#3- Login olduğunuzu doğrulayın.

  #- Sonra Yukarıdaki Senaryoyu Gherkin dilinde yazdık.

Feature: Register Functionality

  Scenario Outline: Register to valid information

    Given Navigate to basqar

    When fill out the register form firstname as "<firstname>" lastname as "<lastname>" streetAddress as "<streetAddress>" cityAddress as "<cityAddress>" stateAddress as "<stateAddress>" zipCode as "<zipCode>" phoneNumber as "<phoneNumber>" ssn as "<ssn>" username as "<username>" password as "<password>"repeatedPassword as "<repeatedPassword>"


    Then verify register successfuly

    Examples:
      | firstname | lastname | streetAddress | cityAddress | stateAddress | zipCode | phoneNumber | ssn       | username |password | repeatedPassword |

      | semih     | sozen    | Ulubatlı Mah  | Ankara      | Kadıkoy      | 34732   | 05314562341 | 123456789 | sozens   |smh123   | smh123           |


