package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.html5.WebStorage;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.core.api.Scenario;

public class Utils {
	
public static WebDriver driver;


public static void acessarSistema() {
	System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	driver.get("https://bugbank.netlify.app/");
	
	WebStorage webStorage = (WebStorage) new Augmenter().augment(driver);
	LocalStorage localStorage = webStorage.getLocalStorage();
	
	localStorage.setItem("nezukokamado@gmail.com", "{\"name\":\"nezuko\",\"email\":\"nezukokamado@gmail.com\",\"password\":\"demonslayer123\",\"accountNumber\":\"4-4\",\"balance\":1000,\"logged\":false}");
	localStorage.setItem("transaction:nezukokamado@gmail.com", "[{\"id\":\"af7050b5-518a-4d02-8c98-d901fb29aadf\",\"date\":\"20/11/2023\",\"type\":\"Abertura de conta\",\"transferValue\":1000,\"description\":\"Saldo adicionado ao abrir conta\"}]");
	
	
	localStorage.setItem("daenerystargaryen@gmail.com", "{\"name\":\"Daenerys Targaryen\",\"email\":\"daenerystargaryen@gmail.com\",\"password\":\"12345678\",\"accountNumber\":\"5-5\",\"balance\":1000,\"logged\":false}");
	localStorage.setItem("transaction:daenerystargaryen@gmail.com", "[{\"id\":\"af7050b5-518a-4d02-8c98-d901fb29aadf\",\"date\":\"20/11/2023\",\"type\":\"Abertura de conta\",\"transferValue\":1000,\"description\":\"Saldo adicionado ao abrir conta\"}]");
	
	
}
    
    



public static <T> T Na(Class<T> classe) {
	return PageFactory.initElements(driver, classe);
}

public static void capturarTela(Scenario scenario) {
	final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	scenario.embed(screenshot, "image/png");
 }
}



