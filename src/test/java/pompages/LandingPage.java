package pompages;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.paulhammant.ngwebdriver.NgWebDriver;

public class LandingPage {

	public WebDriver driver;
	public void loadPage(){
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}	
			driver = new ChromeDriver();
			driver.get("https://developer.here.com/documentation");
	}
	public void verifyPage(){
		String expectedTitle = " Documentation, Code Examples and API References - HERE Developer ";
		String titleOfPage = driver.getTitle();
		if (titleOfPage.equals(expectedTitle)) {
			System.out.println("Webpage loaded successfully.");
		}
	}
	
	public void checkBrokenLinks(){
		HttpsURLConnection huc = null;
		String homepage="https://developer.here.com/documentation";
		String url=" ";
		int respCode =200;
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		Iterator it = links.iterator();
		while (it.hasNext()) {
			url = ((WebElement) it.next()).getAttribute("href");
			if (url==null || url.isEmpty()) {
				System.out.println("URL is either not configured for anchor tag or it is empty");
				continue;
			}
			if (!url.startsWith(homepage)) {
				System.out.println("URL belongs to another domain, skipping it.");
				continue;
			}
			try{
				huc = (HttpsURLConnection)(new URL(url).openConnection());
				huc.setRequestMethod("POST");
				huc.connect();
				respCode = huc.getResponseCode();
				if (respCode>=400) {
					System.out.println(url+ " is a broken link");
				} else {
					System.out.println(url+ " is a valid link");
				}
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		driver.quit();
	}
	
}
