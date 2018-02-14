package grid;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class crossbrowser_testing {
public static WebDriver driver;
public static String browserName;
public static int browser;
	public static void main(String[] args) throws InterruptedException {
		for(browser=1; browser<=3; browser++) {
			if(browser==1) {
				System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SET UP\\chromedriver.exe");
				 driver=new ChromeDriver();
				 driver.get("https://www.google.co.in/");
				 driver.manage().window().maximize();
				 browserName="chromebrowser is opened";
			}
			else if(browser==2) {
				//System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.19.1-win64\\geckodriver.exe");
				 driver=new FirefoxDriver();
				 driver.get("https://www.google.co.in/");
				 driver.manage().window().maximize();
				 browserName="firefoxbrowser is opened";
			}
			else if(browser==3) {
				Thread.sleep(5000);
				System.setProperty("webdriver.ie.driver", "D:\\IEDriverServer_x64_3.8.0\\IEDriverServer.exe");
				 driver=new InternetExplorerDriver();
				 driver.get("www.google.com");
				 driver.manage().window().maximize();
				 browserName="iebrowser is opened";
			}
	
		
		}
		

	}

}
