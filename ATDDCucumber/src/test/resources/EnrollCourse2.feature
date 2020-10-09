#Acceptance Test
Feature: Enroll Course two

  Scenario Outline: Enrolling to a selected course
    Given Que el usuario se encuentra viendo la lista de cursos disponibles
    And Y posea <actuales> cursos
    When El usuario presione el boton <inscribirse en curso>
    Then Su cantidad de cursos inscritos seria <nueva>

    Examples:
    |actuales |inscribirse en curso | nueva|
    |3        | 1                    | 4    |
    |5        | 1                    | 6    |
    |0        | 1                    | 1    |
    |10       | 0                    | 10    |

