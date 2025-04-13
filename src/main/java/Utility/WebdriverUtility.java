package Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebdriverUtility {
	
	public void selectDDValue(WebElement ele,int index) {
		Select s=new Select(ele);
		s.selectByIndex(index);
	}
	public void deSelectDDValue(WebElement ele,int index) {
		
		Select s=new Select(ele);
		s.deselectByIndex(index);
	}

}
