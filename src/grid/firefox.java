package grid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {

	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		 driver.get("https://www.google.co.in/");
		 //driver.manage().window().maximize();
		 //String browserName="firefoxbrowser is opened";

	}

}
