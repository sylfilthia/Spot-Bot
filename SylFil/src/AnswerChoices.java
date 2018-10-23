import java.util.Scanner;
public class AnswerChoices {

	static Login login = new Login();
	static Logout logout = new Logout();
	static FollowFeature followfeature = new FollowFeature();
	static StartBrowser startbrowser = new StartBrowser();
	static Exit exit = new Exit();
	
	static Scanner keyboard = new Scanner(System.in);
	
	public static void answerchoice() throws InterruptedException{
		System.out.println("Please enter a command:" + "\n" +"- Logout" + "\n" + "- Download" + "\n" + "- Follow" + "\n" + "- Exit");
		String answer = keyboard.next();
		
		if (answer.equals ("Follow")||answer.equals("follow")){
			followfeature.following();
		}
		
		if (answer.equals ("logout")||answer.equals("Logout")){
			logout.AutomaticLogout();
		}
			
		if (answer.equals("Download")||answer.equals("download")) {
			System.out.println("The Download feature has no been implemented yet.");
		}
		
		if (answer.equals("Exit")||answer.equals("exit")) {
			Exit.exitprogram();
		}
		if (answer.equals("Post")||answer.equals("post")||answer.equals("Post.")||answer.equals("post.")){
			System.out.println("The Post feature has not been implemented yet.");
		}
		else {
			System.out.println("Invalid command.");
		}
		
		answerchoice();
	}
	
}
