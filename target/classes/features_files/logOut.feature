
@logOut
Feature: Je veux me connecter a l application swag labs et se deconnecter
  
  Scenario: Je veux me connecter a l application swag labs et se deconnecter
    Given Je me connecte sur l application swag labs
    When Je saisie le username "standard_user"
    And Je saisie le mot de passe "secret_sauce"
    And Je clique sur le bouton login
    And Je me redirige vers la page d accueil "Products"
    And Je clique sur le menu a gauche
    And Je clique sur logout
    Then Je me redirige vers la page d'authentification "https://www.saucedemo.com/"
    