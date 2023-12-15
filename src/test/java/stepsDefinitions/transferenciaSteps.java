package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.Na;
import static utils.Utils.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.TransferenciaPage;


public class transferenciaSteps {
	
	@Dado("eu esteja logado no sistema")
	public void euEstejaLogadoNoSistema() {
	
	}

	@Quando("eu clicar no botao transferencia")
	public void euClicarNoBotaoTransferencia() {
	Na(TransferenciaPage.class).acionarBotaoTransferecia();    
	}

	@Quando("informar numero da conta {string}")
	public void informarNumeroDaConta(String string) {
	Na(TransferenciaPage.class).informarCampoNumerodaConta(string);   
	}

	@Quando("informar o digito {string}")
	public void informarODigito(String string) {
	Na(TransferenciaPage.class).informarCampoDigito(string);
	    
	}

	@Quando("informar o valor da transferencia {string}")
	public void informarOValorDaTransferencia(String string) {
	Na(TransferenciaPage.class).informarCampoValordaTransferencia(string);   
	}

	@Quando("informar uma descricao {string}")
	public void informarUmaDescricao(String string) {
	Na(TransferenciaPage.class).informarCampoDescricao(string);    
	}

	@Quando("acionar o botao transferir agora")
	public void acionarOBotaoTransferirAgora() {
	Na(TransferenciaPage.class).acionarBotaoTransferirAgora();   
	}

	@Entao("a transferencia sera realizada")
	public void aTransferenciaSeraRealizada() throws InterruptedException  {
		
	 Thread.sleep(3000); 
	 assertEquals("Transferencia realizada com sucesso", driver.findElement(By.xpath("//p[@id='modalText']")).getText());	
	
	}
	

  


 


}
	
	
	



	

	


