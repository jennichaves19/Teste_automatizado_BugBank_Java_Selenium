package stepsDefinitions;

import static org.junit.Assert.assertTrue;
import static utils.Utils.Na;
import static utils.Utils.acessarSistema;
import static utils.Utils.driver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CadastroPage;


public class CadastroSteps {
	

@Dado("que eu acessar o sistema")
public void queEuAcessarOSistema() {
	acessarSistema();
}

@Quando("eu clicar o botao registrar")
public void euClicarOBotaoRegistrar() {
	Na(CadastroPage.class).acionarBotaoRegistrar();
  
}

@Quando("informar o email {string}")
public void informarOEmail(String string) {
	Na(CadastroPage.class).informarCampoEmail(string);
    
}

@Quando("informar o nome {string}")
public void informarONome(String string) {
	Na(CadastroPage.class).informarCampoName(string);
    
}

@Quando("informar a senha {string}")
public void informarASenha(String string) {
	Na(CadastroPage.class).informarCampoPassword(string);
    
}

@Quando("confimar senha {string}")
public void confimarSenha(String string) {
	Na(CadastroPage.class).informarCampoConfirmarSenha(string);
}

@Quando("confirmar criar conta com saldo")
public void confirmarCriarContaComSaldo() {
	Na(CadastroPage.class).acionarBotaoSaldo();
}
    
@Quando("clicar no botao cadastrar")
public void clicarNoBotaoCadastrar() {
    Na(CadastroPage.class).acionarBotaoCadastrar();
}




@Entao("a conta sera cadastrada")
public void aContaSeraCadastrada() {
	
	//boolean bodyText = driver.findElement(By.xpath("//p[@id='modalText']")).get.contains("As senhas não são iguais.");
	
	assertTrue("MEnsagem de erro", driver.getPageSource().contains("foi criada com sucesso"));
	

 }


}
	
	
	
	/*
	
	@Dado("eu estou acessando o sistema")
	public void euEstouAcessandoOSistema() {
		acessarSistema();
	}

	@Quando("eu informar o usuario {string}")
	public void euInformarOUsuario(String usuario) {
		Na(LoginPage.class).informarCampoUserName(usuario);
	}
	
	@Quando("informar a senha {string}")
	public void informarASenha(String senha) {
	   Na(LoginPage.class).informarCampoPassWord(senha);
	}

	@Quando("eu clicar no botao de login")
	public void euClicarNoBotaoDeLogin() {
	   Na(LoginPage.class).acionarBotaoLogin();
	   
	
	}
	
		
	@Entao("o sistema exibe a mensagem de usuario invalido")
	public void oSistemaExibeAMensagemDeUsuariovalido() {
		assertEquals("Epic sadface: Username and password do not match any user in this service", driver.findElement(By.xpath("//h3[@data-test='error']")).getText());	
	}
		
		
	  
	@Entao("o sistema efetua o login")
	public void oSistemaEfetuaOLogin() {
	       assertEquals("Products", driver.findElement(By.xpath("//div[@class='product_label']")).getText());
	}
	*/



	

	


