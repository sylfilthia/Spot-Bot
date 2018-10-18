import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;
public class Logout {

	public static void AutomaticLogout() throws InterruptedException{
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
	
		//Confirmation message
		System.out.println("Are you sure you want to logout?");
		
		String yesorno = keyboard.nextLine();
		
		//If the user says yes
		if (yesorno == "yes" || yesorno== "Yes" || yesorno== "yes." || yesorno== "Yes.");{
			//Full screens the window
			StartBrowser.webdriver.findElement(By.xpath("//*[@id='react-root']/section/nav/div[2]/div/div/div[3]/div/div[3]/a")).click();
			Thread.sleep(3000);
			StartBrowser.webdriver.findElement(By.xpath("//*[@id='react-root']/section/main/div/header/section/div[1]/div/button/span")).click();
			Thread.sleep(1000);
			StartBrowser.webdriver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/button[6]")).click();
			StartBrowser.webdriver.close();
			System.out.println("////////You have been logged out////////");
		}
		//If the user says no
		if (yesorno == "no"  || yesorno== "No" || yesorno== "no." || yesorno== "No."){
			System.out.println("////////You were not logged out/////////");
		}
		
	}
}