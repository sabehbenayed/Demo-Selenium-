package com.e2etests.automation.page_objects;

import java.time.Duration;
//import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class LoginPageObject {
    //creation de lobjet de la classe ConfigFileReader
	public ConfigFileReader configFileReader;

	// recherche des elements
	@FindBy(how = How.ID, using = "user-name")
	public static WebElement username;

	@FindBy(how = How.ID, using = "password")
	public static WebElement password;

	@FindBy(how = How.ID, using = "login-button")
	public static WebElement login;

	@FindBy(how = How.XPATH, using = "//span[@class='title']")
	public static WebElement title;

	@FindBy(how = How.XPATH, using = "//div[@id='login_button_container']//form//h3")
	public static WebElement messageErreur;

	@FindBy(how = How.ID, using = "react-burger-menu-btn")
	public static WebElement liste;

	@FindBy(how = How.ID, using = "logout_sidebar_link")
	public static WebElement logout;

    //les methodes creer
	// constructeur de la classe LoginPageObject
	public LoginPageObject() {
		// Initialisation de driver dans la classe Setup,this revient sur cette classe
		// LoginPageObject
		PageFactory.initElements(Setup.getDriver(), this);
		// initialisation de lobjet configFileReader
		configFileReader = new ConfigFileReader();
	}

	// creation d'une nouvelle methode pour ouvrir l'url
	public void connectToAp() {
		//Setup.getDriver().get("https://www.saucedemo.com/");
		Setup.getDriver().get(configFileReader.getProperties("url"));
	}

	// une methode pour envoyer la valeur de username
	public void saisieUsername(String usr) {
		username.sendKeys(usr);
	}

	// une methode pour envoyer la valeur du password
	public void saisiePassword(String pwd) {
		password.sendKeys(pwd);
	}

	public void cliqueBoutton() {
		login.click();
	}

	public void cliqueListe() {
		liste.click();
	}

	public void selectLogout() {
		Setup.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		logout.click();
	}

	public String verficationRedirection() {
		return Setup.getDriver().getCurrentUrl();
	}

	// travail avec le fichier configFile
	public void fileUsername() {
    username.sendKeys(configFileReader.getProperties("username"));
	}

	public void filePassword() {
    password.sendKeys(configFileReader.getProperties("password"));
	}
}
