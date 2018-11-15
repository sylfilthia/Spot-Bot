import java.util.Scanner;

import org.openqa.selenium.*;

public class FollowFeature {
	
	static Scanner keyboard = new Scanner(System.in);
	public static void following() throws InterruptedException{

		//How many people do you want to follow
		System.out.println("How many people would you like to follow? (ONLY FOLLOW UP TO 100 PER HOUR)");
		int HowMany = keyboard.nextInt();
		
		//Where to follow from
		StartBrowser.webdriver.get("https://www.instagram.com/explore/people/suggested/");
		Thread.sleep(500);
		
		//Follows (HowMany) amount of people
		for (int x = 1; x <= HowMany; x++){
				Thread.sleep(500);
				WebElement followbutton = StartBrowser.webdriver.findElement(By.xpath("//*[@id='react-root']/section/main/div/div[2]/div/div/div[" + x + "]/div[3]/button"));
				String scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
                        + "var elementTop = arguments[0].getBoundingClientRect().top;"
                        + "window.scrollBy(0, elementTop-(viewPortHeight/2));";

				((JavascriptExecutor) StartBrowser.webdriver).executeScript(scrollElementIntoMiddle, followbutton);
				followbutton.click();

			if (x >= HowMany){
				System.out.println("You have followed " +HowMany + " people.");
				StartBrowser.webdriver.navigate().refresh();
			
			}
		}
	}
}
