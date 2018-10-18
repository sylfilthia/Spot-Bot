import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@SuppressWarnings("unused")
public class BotRunner {
	static Scanner keyboard = new Scanner(System.in);
	
	//The different classes used
	static Login login = new Login();
	static Logout logout = new Logout();
	static StartBrowser startbrowser = new StartBrowser();
	
		public static void main(String[] args) throws InterruptedException {
		
			//Welcome messages
			System.out.println("******Welcome to IG Bot Spot-Bot V.03******"+ "\n");
			System.out.println("//////Please log in to continue//////");
		
			//The login
			login.AutomaticLogin();
		
			//After login
			System.out.println("Here are some commands to get you started:" + "\n" + "- Logout" + "\n" + "- Download" + "\n" + "- Follow" + "\n" + "- Post" + "\n" + "- Comment" + "\n" + "- Direct Message");
			String answer = keyboard.next();
		
			if (answer == "logout"||answer == "Logout");{
				Logout.AutomaticLogout();
			}
			if (answer == "download"||answer == "Download");{
				
			}
		
	}

}
