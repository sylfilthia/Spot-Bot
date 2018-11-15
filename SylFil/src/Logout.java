import org.openqa.selenium.By;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class Logout {

	public static void AutomaticLogout() throws InterruptedException{
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
	
		//Confirmation message
		System.out.println("Are you sure you want to logout?");
		
		String yesorno = keyboard.nextLine();
		
		//If the user says yes
		if (yesorno.equals("yes") || yesorno.equals("Yes") || yesorno.equals("yes.") || yesorno.equals("Yes.")){
			//Full screens the window
			StartBrowser.webdriver.findElement(By.xpath("//*[@id='react-root']/section/nav/div[2]/div/div/div[3]/div/div[3]/a")).click();
			StartBrowser.webdriver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			StartBrowser.webdriver.findElement(By.xpath("//*[@id='react-root']/section/main/div/header/section/div[1]/div/button/span")).click();
			StartBrowser.webdriver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			StartBrowser.webdriver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/button[6]")).click();
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