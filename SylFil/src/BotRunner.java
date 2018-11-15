import java.util.Scanner;

public class BotRunner {
	static Scanner keyboard = new Scanner(System.in);
	
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

