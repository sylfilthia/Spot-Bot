import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.Scanner;

public class Login {
	
	static StartBrowser startbrowser = new StartBrowser();

	public void AutomaticLogin() throws InterruptedException{
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your username or email: ");
		String username = keyboard.next();
		System.out.println("Enter your password: ");
		String password = keyboard.next();
		
		//Starting the browser
		startbrowser.startBrowser();
		
		//Full screens the window
		StartBrowser.webdriver.manage().window().maximize();
		
		//Inputs the login info and submits
		StartBrowser.webdriver.get("https://www.instagram.com/accounts/login");
		StartBrowser.webdriver.findElement(By.name("username")).sendKeys(username);
		StartBrowser.webdriver.findElement(By.name("password")).sendKeys(password);
		StartBrowser.webdriver.findElement(By.name("password")).submit();
		
		//After successfully logging in
		Thread.sleep(3000);
		StartBrowser.webdriver.findElement(By.cssSelector("body > div:nth-child(15) > div > div > div > div.mt3GC > button.aOOlW.HoLwm")).click();
		System.out.println("/////////You have been logged in/////////");
		
	}

}
