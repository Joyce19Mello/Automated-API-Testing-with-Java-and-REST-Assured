Feature: Crud API
  Scenario: Efetundo CRUD
    Given que for acessado o endpoint "https://reqres.in/api/users/1"
    When seja efetuado o CREATED
    And seja efetuado o UPDATE
    Then seja efetuado o DELETE