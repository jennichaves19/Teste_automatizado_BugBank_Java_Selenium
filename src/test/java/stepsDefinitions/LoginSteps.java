package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.Na;
import static utils.Utils.driver;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.LoginPage;


public class LoginSteps {
	 
	
	@Quando("informar email {string}")
	public void informarEmail(String string) {
	Na(LoginPage.class).informarCampoEmail(string);
	   
	}

	@Quando("informar senha {string}")
	public void informarSenha(String string) {
	Na(LoginPage.class).informarCampoPassword(string);
	    
	}

	@Quando("clicar o botao acessar")
	public void clicarBotaoAcessar() {
		Na(LoginPage.class).acionarBotaoAcessar();
	}

	@Entao("o sistema efetua o login")
	public void oSistemaEfetuaOLogin() {
	 
		 assertEquals("Olá nezuko,", driver.findElement(By.xpath("//p[@id=\"textName\"]")).getText());
	}
	

}
	

	



	

	


