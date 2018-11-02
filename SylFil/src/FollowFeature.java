import java.util.Scanner;
import java.util.Random;

import org.openqa.selenium.*;

public class FollowFeature {
	
	Scanner keyboard = new Scanner(System.in);
	public void following() throws InterruptedException{
		
		Random rando = new Random();
		
		//How many people do you want to follow
		System.out.println("How many people would you like to follow? (ONLY FOLLOW UP TO 100 PER HOUR)");
		int HowMany = keyboard.nextInt();
		
		//Where to follow from
		StartBrowser.webdriver.get("https://www.instagram.com/explore/people/suggested/");
		Thread.sleep(500);
		
		//Follows (HowMany) amount of people
		for (int x = 1; x <= HowMany; x++){
				Thread.sleep(500);
				WebElement followbutton = StartBrowser.webdriver.findElement(By.xpath("//*[@id='react-root']/section/main/div/ul/div/li[" + x + "]/div/div[1]/div[2]/button"));
				String scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
                        + "var elementTop = arguments[0].getBoundingClientRect().top;"
                        + "window.scrollBy(0, elementTop-(viewPortHeight/2));";

				((JavascriptExecutor) StartBrowser.webdriver).executeScript(scrollElementIntoMiddle, followbutton);
				followbutton.click();
				//System.out.println(randomnum);

			if (x >= HowMany){
				System.out.println("You have followed " +HowMany + " people.");
				Thread.sleep(1500);
				StartBrowser.webdriver.navigate().refresh();
			
			}
		}
	}
}
