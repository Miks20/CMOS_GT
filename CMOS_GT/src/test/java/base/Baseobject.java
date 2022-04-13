package base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Baseobject {
	
	protected AndroidDriver<MobileElement> driver;
	
	public Baseobject(AndroidDriver<MobileElement> driver) {
		
		this.driver = driver;
		
	}

}
