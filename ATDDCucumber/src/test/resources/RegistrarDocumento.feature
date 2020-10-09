Feature: Registrar documento

  Scenario Outline: Entidad quiere registrar un documento
    Given La entidad tiene <registrados> documentos registrados
    And La entidad se encuentre en la vista para registrar un documento
    When La entidad presione el boton <iniciar> para iniciar el procedimiento
    And La entidad agregue el documento <documento>
    Then La entidad deberia tener <totales> documentos registrados

    Examples:
      |registrados    |iniciar    |documento| totales |
      |10             |1          |1        |11       |
      |5              |1          |1        |6        |
      |20             |0          |0        |20       |


