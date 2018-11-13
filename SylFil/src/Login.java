import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import java.util.Scanner;

public class Login {
	
	public static void AutomaticLogin() throws InterruptedException{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your username or email: ");
		String username = keyboard.next();
		System.out.println("Enter your password: ");
		String password = keyboard.next();
		
		//Starting the browser
		StartBrowser.startBrowser();
		
		//Full screens the window
		StartBrowser.webdriver.manage().window().maximize();
		Actions action = new Actions(StartBrowser.webdriver);
		
		//Inputs the login info and submits
		StartBrowser.webdriver.get("https://www.instagram.com/accounts/login");
		StartBrowser.webdriver.findElement(By.name("username")).sendKeys(username);
		StartBrowser.webdriver.findElement(By.name("password")).sendKeys(password);
		StartBrowser.webdriver.findElement(By.name("password")).submit();
		Thread.sleep(3000);
		StartBrowser.webdriver.findElement(By.xpath("//*[@id='react-root']/section/main/div/button")).click();
		Thread.sleep(3000);
		StartBrowser.webdriver.switchTo().alert().dismiss();
		
		
		System.out.println("/////////You have been logged in/////////");
			
	}

}
