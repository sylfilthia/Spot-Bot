import java.util.Scanner;
public class AnswerChoices {


	
	static Scanner keyboard = new Scanner(System.in);
	
	public static void answerchoice() throws InterruptedException{
		System.out.println("Please enter a command:" + "\n" + "1 - Like" + "\n" + "2 - Follow" + "\n" + "3 - Download" + "\n" + "4 - Exit" + "\n" + "5 - Logout");
		String answer = keyboard.next();
		
		if (answer.equals ("2")){
			FollowFeature.following();
		}
		
		if (answer.equals ("5")){
			Logout.AutomaticLogout();
		}
			
		if (answer.equals("3")) {
			System.out.println("The Download feature has no been implemented yet.");
		}
		
		if (answer.equals("4")) {
			Exit.exitprogram();
		}
		if (answer.equals("Post")||answer.equals("post")||answer.equals("Post.")||answer.equals("post.")){
			System.out.println("The Post feature has not been implemented yet.");
		}
		if (answer.equals("1")){
			Like.likeposts();
		}
		else {
			System.out.println("Invalid command.");
		}
		
		answerchoice();
	}
	
}
