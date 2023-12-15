package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CadastroPage {
	
	@FindBy (xpath= "(//button[@type='button'])[2]")
	private WebElement campoRegistrar;
	
	@FindBy (xpath="(//input[@type='email'])[2]")
	private WebElement campoEmail;
	
	@FindBy (name="name")
	private WebElement campoName;
	
	@FindBy (xpath ="(//input[@ type='password'])[2]")
	private WebElement campoPassword;
	
	@FindBy (xpath ="(//input[@ type='password'])[3]")
	private WebElement campoConfirmarPassword;
	
	@FindBy (id ="toggleAddBalance")
	private WebElement campoSaldo;
	
	@FindBy (xpath="(//button[@type='submit'])[2]")
	private WebElement botaoCadastrar;
	
	
	public void acionarBotaoRegistrar() {
	    campoRegistrar.click();
	}
	
	
	public void informarCampoEmail(String usuario) {
		campoEmail.sendKeys(usuario);
	}
	
	public void informarCampoName(String name) {
		campoName.sendKeys(name);
	}
		
	public void informarCampoPassword(String senha) {
		campoPassword.sendKeys(senha);
	}
			
	public void informarCampoConfirmarSenha(String senha) {
		campoConfirmarPassword.sendKeys(senha);
	}
				
	public void acionarBotaoSaldo() {
		campoSaldo.click();
	}
					
	public void acionarBotaoCadastrar() {
		botaoCadastrar.click();
		
	}
	
	
	}
