package object;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Baseobject;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Object extends Baseobject{

	public Object(AndroidDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	private By startJourney = By.id("abi.abi:id/StartJourney");
	private By viewRouteList = By.id("abi.abi:id/MakeACall");
	private By outletList = By.id("abi.abi:id/LoadAll");
	private By outlet = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout");
	private By navigate = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ListView/android.widget.TextView[3]");
	private By vehicleType = By.id("com.in1go.centrixmobile:id/rbTruck");
	private By truckType = By.id("android:id/text1");
	private By selectTruckType = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
	private By calculateRoute = By.id("com.in1go.centrixmobile:id/btnCalculate");
	private By stopNavigation = By.id("com.in1go.centrixmobile:id/btnStopNav");
	private By generalButton = By.id("android:id/button1");
	private By makeACall = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ListView/android.widget.TextView[1]");
	private By setCoordinate = By.id("com.in1go.centrixmobile:id/btnsave");
	private By order = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.Button[5]");
	private By chooseSKU = By.id("abi.abi:id/btnAddProduct");
	private By sku = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout");
	private By skuSave = By.id("abi.abi:id/save_done");
	private By saveOrder = By.id("abi.abi:id/SaveOrder");
	private By saveOrderSummary = By.id("abi.abi:id/SaveOrderSummary");
	private By endCall = By.id("abi.abi:id/endLocation");
	
	//choose discount
	private By tapSKU = By.id("abi.abi:id/linearLayout1");
	private By chooseDiscount = By.id("android:id/button3");
	private By discount = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView");
	private By discountDescription = By.id("abi.abi:id/DiscDesc");
	private By save = By.id("abi.abi:id/Save");
	
	//inventory
	private By inventory = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.Button[1]");
	private By sku2 = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout");
	private By inputCse = By.id("abi.abi:id/input_cse");
	private By inputBtl = By.id("abi.abi:id/input_btl");
	private By inputCsee = By.id("abi.abi:id/input_csee");
	private By inputBtle = By.id("abi.abi:id/input_btle");
	private By inputShle = By.id("abi.abi:id/input_shle");
	
	
	WebDriverWait wait = new WebDriverWait(driver, 30);
	
	public void navigateLocation() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(startJourney));
		driver.findElement(startJourney).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(viewRouteList));
		driver.findElement(viewRouteList).click();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		wait.until(ExpectedConditions.visibilityOfElementLocated(outletList));
		driver.findElement(outletList).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(outlet));
		driver.findElement(outlet).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(navigate));
		driver.findElement(navigate).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.visibilityOfElementLocated(vehicleType));
		driver.findElement(vehicleType).click();
		driver.findElement(truckType).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(selectTruckType));
		driver.findElement(selectTruckType).click();
		driver.findElement(calculateRoute).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(stopNavigation).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(generalButton));
		driver.findElement(generalButton).click();
	}
	
	public void inventory(String cse, String btl, String csee, String btle, String shle) {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(startJourney));
		driver.findElement(startJourney).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(viewRouteList));
		driver.findElement(viewRouteList).click();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		wait.until(ExpectedConditions.visibilityOfElementLocated(outletList));
		driver.findElement(outletList).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(outlet));
		driver.findElement(outlet).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(makeACall));
		driver.findElement(makeACall).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(generalButton));
		driver.findElement(generalButton).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(setCoordinate));
		driver.findElement(setCoordinate).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(inventory));
		driver.findElement(inventory).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(chooseSKU));
		driver.findElement(chooseSKU).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(sku2));
		driver.findElement(sku2).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(inputCse));
		driver.findElement(inputCse).sendKeys(cse);
		driver.findElement(inputBtl).sendKeys(btl);
		driver.findElement(inputCsee).sendKeys(csee);
		driver.findElement(inputBtle).sendKeys(btle);
		driver.findElement(inputShle).sendKeys(shle);
		driver.findElement(generalButton).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(saveOrder));
		driver.findElement(saveOrder).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(saveOrderSummary));
		driver.findElement(saveOrderSummary).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(generalButton));
		driver.findElement(generalButton).click();
	}
	
	public void salesOrder() {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(startJourney));
		driver.findElement(startJourney).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(viewRouteList));
		driver.findElement(viewRouteList).click();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		wait.until(ExpectedConditions.visibilityOfElementLocated(outletList));
		driver.findElement(outletList).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(outlet));
		driver.findElement(outlet).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(makeACall));
		driver.findElement(makeACall).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(generalButton));
		driver.findElement(generalButton).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(setCoordinate));
		driver.findElement(setCoordinate).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(order));
		driver.findElement(order).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(generalButton));
		driver.findElement(generalButton).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(generalButton));
		driver.findElement(generalButton).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(chooseSKU));
		driver.findElement(chooseSKU).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(sku));
		driver.findElement(sku).click();
		//(new TouchAction(driver)).tap(214, 920).perform();
		driver.findElement(skuSave).click();
		
	}

	public void chooseDiscount() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(tapSKU));
		driver.findElement(tapSKU).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(chooseDiscount));
		driver.findElement(chooseDiscount).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(discount));
		driver.findElement(discount).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(generalButton));
		driver.findElement(generalButton).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(discountDescription));
		driver.findElement(discountDescription).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(generalButton));
		driver.findElement(generalButton).click();
		driver.findElement(save).click();
	}
	
	public void saveOrder() {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(saveOrder));
		driver.findElement(saveOrder).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(saveOrderSummary));
		driver.findElement(saveOrderSummary).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(generalButton));
		driver.findElement(generalButton).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(endCall));
		driver.findElement(endCall).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(generalButton));
		driver.findElement(generalButton).click();
	}
	
}
