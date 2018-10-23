import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BotRunner {
	static Scanner keyboard = new Scanner(System.in);
	
	//The different classes used
	static Login login = new Login();
	static Logout logout = new Logout();
	static FollowFeature followfeature = new FollowFeature();
	static StartBrowser startbrowser = new StartBrowser();
	static AnswerChoices answerchoices = new AnswerChoices();
	
		public static void main(String[] args) throws InterruptedException {
		
			//Welcome messages
			System.out.println("******Welcome to IG Bot Spot-Bot V.03******"+ "\n");
			System.out.println("//////Please log in to continue//////");
		
			//The login
			Login.AutomaticLogin();
				
			//After Login
			AnswerChoices.answerchoice();
			

	}
		
}

