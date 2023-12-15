package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TransferenciaPage {
	
	
	
	@FindBy (xpath = "(//a[@id=\"btn-TRANSFERÊNCIA\"])")
	private WebElement botaoTransferencia;
	
	@FindBy (xpath = "(//input[@type=\"accountNumber\"])")
	private WebElement campoNumerodaConta;
	
	@FindBy (xpath = "(//input[@type=\"digit\"])")
	private WebElement campoDigito;
	
	@FindBy (xpath = "(//input[@type=\"transferValue\"])")
	private WebElement campoValordaTransferencia;
	
	@FindBy (xpath = "(//input[@type=\"description\"])")
	private WebElement campoDescricao ;
	
	@FindBy (xpath = "(//button[@type=\"submit\"])")
	private WebElement botaoTransferirAgora;
	
	
	public void acionarBotaoTransferecia(){
		botaoTransferencia.click(); 
	}
	
	public void informarCampoNumerodaConta(String NumerodaConta) {
		campoNumerodaConta.sendKeys(NumerodaConta);
	}
		
	public void informarCampoDigito(String Digito) {
		campoDigito.sendKeys(Digito);
	}
									
	public void informarCampoValordaTransferencia(String ValordaTransferencia) {
	   campoValordaTransferencia.sendKeys(ValordaTransferencia);
	}
	   
	public void informarCampoDescricao(String Descricao) {
	   campoDescricao.sendKeys(Descricao);
	}
	   
	public void acionarBotaoTransferirAgora() {
		botaoTransferirAgora.click();
	   
}
	
}	
