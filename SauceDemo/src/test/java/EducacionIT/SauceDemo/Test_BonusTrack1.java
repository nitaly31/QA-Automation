package EducacionIT.SauceDemo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_BonusTrack1 {
	// variable para almacenar la url de la pagina a probar
	String url = "https://www.saucedemo.com/";
	
	/**
	 * Prueba - Login 
	 */
	@Test
	public void login() {
		// 1) Definir que navegador vamos a usar para la prueba
		WebDriver driver = new FirefoxDriver();
		// 2) Abrir el navegador en la URL de prueba
		driver.get(url);
		// 3) Maximizamos el navegador
		driver.manage().window().maximize();
		// 4) Borrar las cookies
		driver.manage().deleteAllCookies();
		// 5) Escribir Username valido
		WebElement txtUserName = driver.findElement(By.cssSelector("#user-name"));
		txtUserName.sendKeys("standard_user");
		// 6) Escribir password valido
		WebElement txtPassword = driver.findElement(By.cssSelector("#password"));
		txtPassword.sendKeys("secret_sauce");
		// 7) Hacer clic en login
		WebElement clicLogin = driver.findElement(By.cssSelector("#login-button"));
		clicLogin.click();
	}
}
