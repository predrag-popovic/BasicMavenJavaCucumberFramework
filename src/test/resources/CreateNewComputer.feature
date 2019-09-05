@feature_one
Feature: Story 01 - Create new computer

  Test case list:

  TC01 Leave all field empty and try to add new computer
  TC02 Enter valid data only for field Introduced date and try add new computer
  TC03 Enter valid data only for field Discontinued date and try to add new computer
  TC04 Select only Company and try to create new computer
  TC05 Select Company and enter valid data for all fields except required field and try to add new computer
  TC06 Enter wrong date format for Introduced date and try to add new computer
  TC07 Enter text in field Introduced date and try to add new computer
  TC08 Enter number in field Introduced date and try to add new computer
  TC09 Enter wrong date format for Discontinued date and try to add new computer
  TC10 Enter text in field Discontinued date and try to add new computer
  TC11 Enter number in field Discontinued date and try to add new computer
  TC12 Enter valid data in required field computer name and add new computer

  Background:
    Given Open computer database page
    And Click on button for add new computer

  @SmokeTest
  @RegressionTest
  Scenario: TC01 Leave all field empty and try to add new computer
    When Leave all fields empty and click on button create this computer
    Then Verify that User will not create new computer and validation notification will activate on computer name

  @RegressionTest
  Scenario Outline: TC02 Enter valid data only for field Introduced date and try add new computer
    When Enter data only for field Introduced date <testDataForIntroducedDate> and click on button create this computer
    Then Verify that User will not create new computer and validation notification will activate on computer name

    Examples:
      | testDataForIntroducedDate |
      | 2016-11-15                |

  @RegressionTest
  Scenario Outline: TC03 Enter valid data only for field Discontinued date and try to add new computer
    When Enter data only for field Discontinued date <testDataForDiscontinuedDate> and click on button create this computer
    Then Verify that User will not create new computer and validation notification will activate on computer name

    Examples:
      | testDataForDiscontinuedDate |
      | 2018-10-10                  |

  @RegressionTest
  Scenario Outline: TC04 Select only Company and try to create new computer
    When Select one Company <testDataForCompany> from list and click on button create this computer
    Then Verify that User will not create new computer and validation notification will activate on computer name

    Examples:
      | testDataForCompany |
      | Netronics          |

  @SmokeTest
  @RegressionTest
  Scenario Outline: TC05 Select Company and enter valid data for all fields except required field and try to add new computer
    When Enter data in all fields <testDataForCompany> except required field Computer name and try to add new computer
    Then Verify that User will not create new computer and validation notification will activate on computer name

    Examples:
      | testDataForCompany |
      | Netronics          |

  @SmokeTest
  @RegressionTest
  Scenario Outline: TC06 Enter wrong date format for Introduced date and try to add new computer
    When Enter wrong format in field Introduced <testDataForIntroducedDate> date and try to add new computer
    Then Verify that user will not create new computer and validation notification will activate on Introduced date field

    Examples:
      | testDataForIntroducedDate |
      | 15-12-2010                |
      | 15-2010-12                |
      | 40-40-2012                |

  @RegressionTest
  Scenario Outline: TC07 Enter text in field Introduced date and try to add new computer
    When Enter text data in field Introduced <testDataForIntroducedDate> date and try to add new computer
    Then Verify that user will not create new computer and validation notification will activate on Introduced date field

    Examples:
      | testDataForIntroducedDate |
      | test                      |

  @RegressionTest
  Scenario Outline: TC08 Enter number in field Introduced date and try to add new computer
    When Enter number in field Introduced <testDataForIntroducedDate> date and try to add new computer
    Then Verify that user will not create new computer and validation notification will activate on Introduced date field

    Examples:
      | testDataForIntroducedDate |
      | 85                        |
      | 100                       |

  @SmokeTest
  @RegressionTest
  Scenario Outline: TC09 Enter wrong date format for Discontinued date and try to add new computer
    When Enter wrong format in field Discontinued <testDataForDiscontinuedDate> date and try to add new computer
    Then Verify that user will not create new computer and validation notification will activate on Discontinued date field

    Examples:
      | testDataForDiscontinuedDate |
      | 15-12-2010                  |
      | 15-2010-12                  |
      | 40-40-2012                  |

  @RegressionTest
  Scenario Outline: TC10 Enter text in field Discontinued date and try to add new computer
    When Enter text data in field Discontinued <testDataForDiscontinuedDate> date and try to add new computer
    Then Verify that user will not create new computer and validation notification will activate on Discontinued date field

    Examples:
      | testDataForDiscontinuedDate |
      | test                        |


  @RegressionTest
  Scenario Outline: TC11 Enter number in field Discontinued date and try to add new computer
    When Enter number in field Discontinued <testDataForDiscontinuedDate> date and try to add new computer
    Then Verify that user will not create new computer and validation notification will activate on Discontinued date field

    Examples:
      | testDataForDiscontinuedDate |
      | 85                          |
      | 100                         |

  @SmokeTest
  @RegressionTest
  Scenario Outline: TC12 Enter valid data in required field computer name and add new computer
    When Enter valid data in Computer name <testDataForComputerName>,Introduced date <testDataForIntroducedDate>,Discontinued date <testDataForDiscontinuedDate> and select company <testDataForCompany> and add new computer
    Then Verify that User successfully add new computer <testDataForComputerName> and check saved data

    Examples:
      | testDataForComputerName | testDataForIntroducedDate | testDataForDiscontinuedDate | testDataForCompany |
      | GeckoTestComputer       | 2018-10-10                | 2019-02-02                  | Netronics          |