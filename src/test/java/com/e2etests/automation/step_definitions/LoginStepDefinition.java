package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.LoginPageObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	// declaration de l'objet LoginPageObject
	private LoginPageObject loginPageObject;

	// declaration du constructeur de la classe
	public LoginStepDefinition() {
		// initialisation de la classe
		loginPageObject = new LoginPageObject();
	}

	@Given("Je me connecte sur l application swag labs")
	public void jeMeConnecteSurLApplicationSwagLabs() {
		loginPageObject.connectToAp();
	}

	@When("Je saisie le username {string}")
	public void jeSaisieLeUsername(String usr) {
		loginPageObject.saisieUsername(usr);
	}

	@When("Je saisie le mot de passe {string}")
	public void jeSaisieLeMotDePasse(String pwd) {
		loginPageObject.saisiePassword(pwd);
	}

	@When("Je clique sur le bouton login")
	public void jeCliqueSurLeBoutonLogin() {
		loginPageObject.cliqueBoutton();
	}

	@Then("Je me redirige vers la page d accueil {string}")
	// resultat attendu du feature et l'assertion se fait tjrs dans
	// loginstepdefinition
	public void jeMeRedirigeVersLaPageDAccueil(String attendu) {
		// en a utiliser webelemnt directement on fait appelle directement a traver la
		// classe
		String obtenu = LoginPageObject.title.getText();
		Assert.assertEquals(obtenu, attendu);
	}

	@Then("Un message d erreur s affiche {string}")
	public void unMessageDErreurSAffiche(String msgAttendu) {
		String msgErreurObtenu = LoginPageObject.messageErreur.getText();
		Assert.assertEquals(msgErreurObtenu, msgAttendu);
	}
	
	@When("Je clique sur le menu a gauche")
	public void jeCliqueSurLeMenuAGauche() {
	loginPageObject.cliqueListe();
	}
	@When("Je clique sur logout")
	public void jeCliqueSurLogout() {
	    loginPageObject.selectLogout();
	}
	
	@Then("Je me redirige vers la page d'authentification {string}")
	public void jeMeRedirigeVersLaPageDAuthentification(String urlAttendu) {
	String urlObtenu=loginPageObject.verficationRedirection();
	Assert.assertEquals(urlAttendu, urlObtenu);
		
	}

	
	@When("Je saisie le username")
	public void jeSaisieLeUsername() {
	loginPageObject.fileUsername();
	}
	@When("Je saisie le mot de passe")
	public void jeSaisieLeMotDePasse() {
	loginPageObject.filePassword();
	}









}
