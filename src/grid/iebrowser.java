package grid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class iebrowser {

	public static void main(String[] args) throws InterruptedException {
		Thread.sleep(5000);
		System.setProperty("webdriver.ie.driver", "D:\\IEDriverServer_x64_3.8.0\\IEDriverServer.exe");
		 WebDriver driver=new InternetExplorerDriver();
		 driver.get("https://www.google.co.in/");
		 driver.manage().window().maximize();
		 String browserName="iebrowser is opened";

	}

}
