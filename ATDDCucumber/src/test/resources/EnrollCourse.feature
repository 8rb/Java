Feature: Enroll Course

  Scenario Outline: Enrolling to a selected course
    Given Que el usuario se encuentra visualizando el detalle del curso previamente seleccionado
    And Y tenga <actuales> cursos inscritos
    When El usuario le de click al boton <registrarme en curso>
    Then El usuario deberia tener <inscritos> cursos inscritos


    Examples:
      |actuales       |registrarme en curso|inscritos|
      |10             |1                   |11       |
      |0              |1                   |1        |
      |20             |0                   |20       |