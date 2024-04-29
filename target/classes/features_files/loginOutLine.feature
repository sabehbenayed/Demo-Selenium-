@loginOutLine
Feature: Je souhaite me connecter a l application avec plusieurs comptes

  Scenario Outline: Je souhaite me connecter a l application avec plusiers comptes
    Given Je me connecte sur l application swag labs
    When Je saisie le username "<username>"
    When Je saisie le mot de passe "<password>"
    And Je clique sur le bouton login

    Examples: 
      | username                | password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
      | error_user              | secret_sauce |
      | visual_user             | secret_sauce |
