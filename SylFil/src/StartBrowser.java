import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;


public class StartBrowser {
	
	//This is what makes the web driver (AKA: the browser) public, which we need for the whole project.
	public static WebDriver webdriver;
	
		//Starts the browser
		@SuppressWarnings("deprecation")
		public static void startBrowser(){
			String os = System.getProperty("os.name");
			
			//The Chrome driver location
			if (os.contains ("Windows")){
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
				
				Map<String, String> mobileEmulation = new HashMap<>();
				mobileEmulation.put("deviceName", "Nexus 5");
				ChromeOptions chromeOptions = new ChromeOptions();
				chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
				webdriver = new ChromeDriver(chromeOptions);
			}
			
			if (os.contains("Mac")){
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
			}
	}

}
