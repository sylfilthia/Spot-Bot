import java.util.Scanner;
import org.openqa.selenium.*;

public class Like {
	
	Scanner keyboard = new Scanner(System.in);
	public void likeposts() throws InterruptedException{
		
		//How many post do you want to like
		System.out.println("How many post would you like to like?");
		int HowMany = keyboard.nextInt();
		
		//Where to follow from
		StartBrowser.webdriver.get("https://www.instagram.com");
		Thread.sleep(500);
		
		//Likes (HowMany) amount of posts
		for (int x = 1; x <= HowMany; x++){
				Thread.sleep(500);
				WebElement likebutton = StartBrowser.webdriver.findElement(By.xpath("//*[@id='react-root']/section/main/section/div[1]/div[1]/div/article[" + x + "]/div[2]/section[1]/span[1]/button/span"));
				String scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
                        + "var elementTop = arguments[0].getBoundingClientRect().top;"
                        + "window.scrollBy(0, elementTop-(viewPortHeight/2));";

				((JavascriptExecutor) StartBrowser.webdriver).executeScript(scrollElementIntoMiddle, likebutton);
				likebutton.click();

			if (x >= HowMany){
				System.out.println("You have liked " +HowMany + " posts.");
				Thread.sleep(1500);
				StartBrowser.webdriver.navigate().refresh();
			}
		}
	}
}
