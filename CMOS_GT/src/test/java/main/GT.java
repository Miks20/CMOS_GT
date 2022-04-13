package main;

import org.testng.annotations.Test;

import base.Basegt;
import object.Object;

public class GT extends Basegt{
	
	@Test
	public void execute() {
		
		Object obj = new Object(driver);
		
		obj.navigateLocation();
		
		obj.inventory("1", "1", "1", "1", "1");
		
		obj.salesOrder();
		
		obj.chooseDiscount();
		
		obj.saveOrder();
	}
}
