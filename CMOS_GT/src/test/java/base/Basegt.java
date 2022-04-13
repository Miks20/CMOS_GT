package base;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Basegt {
	
	protected AndroidDriver<MobileElement> driver;
	protected DesiredCapabilities dcap;
	protected URL url;
	
	@BeforeTest
	public void setup() {
		
		dcap = new DesiredCapabilities();
		
		dcap.setCapability("deviceName", "52003770c00ab400");
		dcap.setCapability("platformName","android");
		dcap.setCapability("appPackage", "abi.abi");
		dcap.setCapability("appActivity", "crc6448eab5539d4b7ba8.Splash");
		
		try {
			url = new URL("http://0.0.0.0:4723/wd/hub");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver = new AndroidDriver<MobileElement>(url,dcap);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	}

}
