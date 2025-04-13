package Hooks;

import java.io.IOException;
import java.time.Duration;

import genericLib.BaseClass;
import genericLib.PropertyFileClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookClass extends BaseClass{
	PropertyFileClass pdata=new PropertyFileClass();
	
	@Before
	public void openApp() throws IOException {
		driver.get(pdata.getPropertyData("URL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@After
	public void closeApp() {
		//driver.close();
		driver.quit();
	}
	

}
