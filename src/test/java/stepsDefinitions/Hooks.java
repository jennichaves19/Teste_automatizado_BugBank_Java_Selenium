package stepsDefinitions;

import static utils.Utils.*;
import pageObjects.LoginPage.*;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import pageObjects.LoginPage;

public class Hooks {
	
	

	@Before(value = "@login")
    public void setUp() {
    acessarSistema(); 
		
	} 
	
	@Before(value = "@transferencia")
    public void logar() {
    acessarSistema();
    Na(LoginPage.class).realizarLogin("nezukokamado@gmail.com", "demonslayer123");   
   
	} 
	
	
   @After
   public void TearDown(Scenario scenario) {
	  capturarTela(scenario);
	   
	  //driver.quit();
    
   }
    
}
