package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Grid_Single_BR {

	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities capb=DesiredCapabilities.chrome();
		
		capb.setBrowserName("chrome");
		
		capb.setPlatform(Platform.WINDOWS);
		
		
		RemoteWebDriver rm=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capb);
		
		rm.get("http://google.com");

	}

}
