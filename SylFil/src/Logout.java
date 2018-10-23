import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;
public class Logout {

	public void AutomaticLogout() throws InterruptedException{
		Scanner keyboard = new Scanner(System.in);
		Exit exit = new Exit();
	
		//Confirmation message
		System.out.println("Are you sure you want to logout?");
		
		String yesorno = keyboard.nextLine();
		
		//If the user says yes
		if (yesorno.equals("yes") || yesorno.equals("Yes") || yesorno.equals("yes.") || yesorno.equals("Yes.")){
			//Full screens the window
			StartBrowser.webdriver.findElement(By.xpath("//*[@id='react-root']/section/nav/div[2]/div/div/div[3]/div/div[3]/a")).click();
			Thread.sleep(1000);
			StartBrowser.webdriver.findElement(By.xpath("//*[@id='react-root']/section/main/div/header/section/div[1]/div/button/span")).click();
			Thread.sleep(1000);
			StartBrowser.webdriver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/button[6]")).click();
			StartBrowser.webdriver.close();
			System.out.println("////////You have been logged out////////");
		}else {
			System.out.println("////////You were not logged out/////////");
		
		}
		
		System.out.println("Would you like to exit the program?");
		
		if (keyboard.next().equals("Yes")||keyboard.next().equals("yes")||keyboard.next().equals("Yes.")||keyboard.next().equals("yes.")) {
			Exit.exitprogram();
		}else {
			System.out.println("Returning to main menu.");
		}
		
	}
}