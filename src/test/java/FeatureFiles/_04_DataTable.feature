Feature: Data Table Example

  Scenario:
    Given Go to the WebPage
    And Fill the form with valid data
    | John |
    | Snow |
    | 2356 Spring Ave. |
    | 8654123658 |

    Then Save the form

    Scenario:
      Given Go to the WebPage
      And Fill the form with valid data
        | John             |
        | Snow             |
        | 2356 Spring Ave. |
        | 8654123658       |
      And Enter Valid information
        | Name      | John             |
        | Last Name | Snow             |
        | Address   | 2356 Spring Ave. |
        | Phone     | 8654123658       |
      Then Save the form
