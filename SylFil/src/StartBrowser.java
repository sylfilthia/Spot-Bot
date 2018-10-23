import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class StartBrowser {
	
	//This is what makes the web driver (AKA: the browser) public, which we need for the whole project.
	public static WebDriver webdriver;
	
		//Starts the browser
		public static void startBrowser(){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shandon\\Desktop\\Documents\\chromedriver.exe");
			webdriver = new ChromeDriver();
	}

}
