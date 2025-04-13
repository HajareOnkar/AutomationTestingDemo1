package genericLib;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass extends AbstractTestNGCucumberTests{
	
	public static  WebDriver driver;
	
	public static Connection connection;
	

    // This method will run before any test method
    @BeforeSuite
    public void setUp() throws SQLException {
        // Get the connection from DatabaseConnectionManager
        connection = DatabaseConnectionManager.getConnection();
        
    }
    
    @AfterSuite
    public void tearDown() {
        // Close the connection after tests
        DatabaseConnectionManager.closeConnection();
    }

	
	@BeforeMethod
	@Parameters("browser")
	public void openbrowser(String browser) {
		
		if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
              driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
              driver = new FirefoxDriver();
        } else {
            throw new IllegalArgumentException("Unsupported browser: " + browser);
        }
	
	}
	@AfterMethod
	public void closebrowser() {
		//driver.quit();
	}
}
