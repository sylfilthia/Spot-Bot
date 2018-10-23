import org.openqa.selenium.By;

public class Downloads {

	public static void download() {
		StartBrowser.webdriver.get("https://www.reddit.com/r/memes/");
		StartBrowser.webdriver.findElement(By.xpath("//*[@id='t3_9qi2xi']/div[2]/div[3]/div/div[2]/a/div/div/img"));
	}
}
