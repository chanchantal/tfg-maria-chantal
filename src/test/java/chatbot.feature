Feature: Maria Chantal TFG

  Background:
    Given I am in the main page
    Then I click on the bot


  Scenario Outline: seleccion escrita
    Then I write <seleccion>
    And I receive the <seleccion> response
    Examples:
    |seleccion              |
    |que ofrece             |
    |masters                |
    |doctorados             |
    |TUI                    |
    |cursos cero            |
    |departamentos          |
    |erasmus                |
    |delegacion             |
    |cafeteria              |
    |reprografia            |
    |matricula              |
    |becas                  |
    |fechas examenes        |
    |cambio de grupo grande |
    |wifi                   |
    |donde esta             |
    |laboratorios           |


  Scenario Outline: preguntas frecuentes
    When I say hola to the chatbot
    Then I click on the preguntas frecuentes button
    And I search until I find my destiny in <seleccion>
    Then I go to the <seleccion> web
    Examples:
      |seleccion              |
      |informacion general    |
      |normativa              |
      |correo electronico     |
      |cuenta usuario         |
      |curso cero ADE         |
      |panorama universitario |
      |asignaturas            |
      |horario                |
      |practicas              |
      |tfg                    |
      |grupos investigacion   |
      |biblioteca             |


  Scenario Outline: tramites administrativos
    When I say hola to the chatbot
    Then I click on the tramites administrativos button
    And I search until I find my destiny for tramites in <seleccion>
    Then I go to the <seleccion> web for tramites
    Examples:
      |seleccion              |
      |calendario academico   |
      |solicitudes            |
      |evau                   |
      |mas25                  |
      |mas40                  |

  Scenario Outline: convalidaciones
    When I say hola to the chatbot
    Then I click on the convalidaciones button
    And I search until I find my destiny for convalidaciones in <seleccion>
    Then I go to the <seleccion> web for convalidaciones
    Examples:
      |seleccion                 |
      |reconocimiento creditos   |
      |nivel idioma              |
      |traslado expediente       |

  Scenario Outline: redes
    When I say hola to the chatbot
    Then I click on the redes button
    And I search until I find my destiny for redes in <seleccion>
    Then I go to the <seleccion> web for redes
    Examples:
      |seleccion          |
      |vpn                |
      |contrasenas        |

  Scenario: como moverme
    When I say hola to the chatbot
    Then I click on the localizaciones button
    And I search until I find my destiny for como moverme
    Then I receive the como moverme response message

  Scenario: delegacion
    When I say hola to the chatbot
    Then I click on the localizaciones button
    And I search until I find my destiny for delegacion
    Then I receive the delegacion response message









