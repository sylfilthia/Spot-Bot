import java.util.Scanner;
public class Exit {

	public static void exitprogram() throws InterruptedException {
		System.out.println("Are you sure you want to close the program?");
		Scanner keyboard = new Scanner(System.in);
		
		if (keyboard.next().equals("Yes")||keyboard.next().equals("yes")||keyboard.next().equals("Yes.")||keyboard.next().equals("yes.")) {
			System.out.println("Program closing in 10 seconds");
			Thread.sleep(10000);
			StartBrowser.webdriver.close();
			System.out.println("<<<<<Program has closed>>>>>");
			System.exit(1);
		} else {
			System.out.println("Returning to main menu");
		}
	}
}
