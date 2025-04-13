package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashbord {
	WebDriver driver;
	
	@FindBy(id="")
	private WebElement ele1;
	
	public Dashbord(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}

}
