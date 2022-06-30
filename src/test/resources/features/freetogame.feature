Feature: Obtener datos

  @Test1
  Scenario: Obtener datos
    When solicito el platform "pc" , category "shooter"
    Then el código de respuesta es 200



  Scenario: Obtener datos error
    When solicito el platform "" , category "shooter"
    Then el código de respuesta es 404