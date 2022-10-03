Feature: Bill Pay Functionality

  Background:

  Scenario Outline: login with valid username and password

    Given Navigate to basqar

    When login with valid username as "<username>" password as "<password>"

    Then User should login successfuly

    Examples:

      | username | password |

      | sozens     | smh123 |


  Scenario Outline: pay bill

    And pay bill button click

    When pay electricity , water and natural gas bills payeeName as "<payeeName>" streetAddress as "<streetAddress>" cityAddress as "<cityAddress>" stateAddress as "<stateAddress>" zipCode as "<zipCode>" phoneNumber as "<phoneNumber>" Account as "<Account>" VerifyAccount as "<VerifyAccount>" Amount as "<Amount>"


    Then verify that the bills have been paid after each payment


    Examples:

      | payeeName | streetAddress | cityAddress | stateAddress | zipCode | phoneNumber | Account | VerifyAccount | Amount |
      | elektrik  | Ulubatlı Mah  | Ankara      | Kadıkoy      | 34732   | 05314562341 | 1234567 | 1234567       | 85     |
      | su        | Ulubatlı Mah  | Ankara      | Kadıkoy      | 34732   | 05314562341 | 1234567 | 1234567       | 45     |
      | dogalgaz  | Ulubatlı Mah  | Ankara      | Kadıkoy      | 34732   | 05314562341 | 1234567 | 1234567       | 120    |

