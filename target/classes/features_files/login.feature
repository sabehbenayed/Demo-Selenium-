
@login
Feature: Test de la fonctionnalite de l authentification de l application swag labs
  En tant que utilisateur je souhaite tester la page de connexion de l application swag labs
Background:
 Given Je me connecte sur l application swag labs
  @login-cas-passant
  Scenario: Je souhaite tester la page de connexion avec un cas passant
    When Je saisie le username "standard_user"
    And Je saisie le mot de passe "secret_sauce"
    And Je clique sur le bouton login
    Then Je me redirige vers la page d accueil "Products"
    
    @login-cas-non-passant
  Scenario: Je souhaite tester la page de connexion avec un cas passant
    When Je saisie le username "sabeh"
    And Je saisie le mot de passe "sabeh123"
    And Je clique sur le bouton login
    Then Un message d erreur s affiche "Epic sadface: Username and password do not match any user in this service"

    @login-config-file
    Scenario: Je souhaite tester la page de connexion avec un cas passant
    When Je saisie le username
    And Je saisie le mot de passe
    And Je clique sur le bouton login
    Then Je me redirige vers la page d accueil "Products"
    