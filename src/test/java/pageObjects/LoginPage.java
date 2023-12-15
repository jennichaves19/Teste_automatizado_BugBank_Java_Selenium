package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy (xpath = "(//input[@type='email'])")
	private  WebElement campoEmail;
	
	@FindBy (xpath="(//input[@type=\"password\"])")
	private  WebElement campoSenha;
	
	
	@FindBy (xpath ="//button[@type=\"submit\"]")
	private  WebElement botaoAcessar;
	




public void informarCampoEmail(String usuario) {
	campoEmail.sendKeys(usuario);
}
	
public void informarCampoPassword(String senha) {
	campoSenha.sendKeys(senha);
}
								
public void acionarBotaoAcessar() {
	botaoAcessar.click();	
	
}

public  void realizarLogin(String usuario, String senha) {
	campoEmail.sendKeys(usuario);
	campoSenha.sendKeys(senha);
	botaoAcessar.click();
	
}

}