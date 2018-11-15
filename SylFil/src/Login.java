import org.openqa.selenium.By;
//import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Login {
	
	public static void AutomaticLogin() throws InterruptedException{
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your username or email: ");
		String username = keyboard.next();
		System.out.println("Enter your password: ");
		String password = keyboard.next();
		
		//Starting the browser
		StartBrowser.startBrowser();
		
		//Full screens the window
		StartBrowser.webdriver.manage().window().maximize();
		//Actions action = new Actions(StartBrowser.webdriver);
		
		//Inputs the login info and submits
		StartBrowser.webdriver.get("https://www.instagram.com/accounts/login");
		StartBrowser.webdriver.findElement(By.name("username")).sendKeys(username);
		StartBrowser.webdriver.findElement(By.name("password")).sendKeys(password);
		StartBrowser.webdriver.findElement(By.name("password")).submit();
		StartBrowser.webdriver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		StartBrowser.webdriver.findElement(By.xpath("//*[@id='react-root']/section/main/div/button")).click();
		StartBrowser.webdriver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		try {
		    WebElement popUp = StartBrowser.webdriver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[3]/button[2]"));
		    popUp.click();  
		} catch(NoSuchElementException | StaleElementReferenceException e) {
		    System.out.println("Impossible to click the pop-up. Reason: " + e.toString() + "\n");
		}
		
		try {
		    WebElement popUp = StartBrowser.webdriver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[3]/button[2]"));
		    popUp.click();  
		} catch(NoSuchElementException | StaleElementReferenceException e) {
		    System.out.println("Impossible to click the pop-up. Reason: " + e.toString() + "\n");
		}
		
		
		System.out.println("/////////You have been logged in/////////");
			
	}

}
