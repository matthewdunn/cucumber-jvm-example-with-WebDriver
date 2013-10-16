package cucumberdemo;



import java.io.File;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.android.AndroidDriver;


import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class GoogleSearchFeature{

	private WebDriver driver;
	private Scenario scenario;
	
	
	@Before
	public void before(Scenario scenario) {
	    this.scenario = scenario;
	}
	
	// http://test3-hub-static.gtsplc.com/
	
	@Given("^The search is Hello World$")
	public void The_search_is_Hello_World() throws Throwable {
		driver =  getWebDriver();//new AndroidDriver(); //new HtmlUnitDriver();
        driver.get("http://www.google.co.uk");
        
      
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Hello World");
        
        
        captureScreenshot("img 1", (RemoteWebDriver) driver);
	}
	
	@When("^The Search is performed$")
	public void The_Search_is_performed() throws Throwable {
		driver.findElement(By.name("btnG")).click(); 
		
		 captureScreenshot("img 2", (RemoteWebDriver) driver);
		
	}
	
	@Then("^The browser title should have Hello World$")
	public void The_browser_title_should_have_Hello_World() throws Throwable {
		System.err.println("driver title = "+driver.getTitle());
		assertThat ("Browser title:",driver.getTitle(), containsString("Hello World"));
		
	   captureScreenshot("img 3", (RemoteWebDriver) driver);
	   driver.quit();
	}
	
	@After
	public void embedScreenshot(Scenario scenario) {
	    if(scenario.isFailed()) {
	    	WebDriver webDriver = driver;
			webDriver = new Augmenter().augment(webDriver);
			byte[] screenshot = ((TakesScreenshot) webDriver)
					.getScreenshotAs(OutputType.BYTES);

			scenario.write("ERROR");
			scenario.embed(screenshot, "image/png");
	    }
	}
	
	
	private void captureScreenshot(String comment, RemoteWebDriver driver){

		WebDriver webDriver = driver;
		webDriver = new Augmenter().augment(webDriver);
		byte[] screenshot = ((TakesScreenshot) webDriver)
				.getScreenshotAs(OutputType.BYTES);
		scenario.write(comment);
		scenario.embed(screenshot, "image/png");		
		
	}
	
	private WebDriver getWebDriver() throws Exception {
		
			//	WebDriver driver = new AndroidDriver();
				
			
				//			WebDriver driver = new RemoteWebDriver(
			//	                new URL("http://localhost:8080/wd/hub"), 
			//	                DesiredCapabilities.chrome());
			//			
				// We could use any driver for our tests...
				DesiredCapabilities chrome = DesiredCapabilities.chrome();
				// ... but only if it supports javascript
				chrome.setJavascriptEnabled(true);
				// Get a handle to the driver. This will throw an exception
				// if a matching driver cannot be located
				driver = new RemoteWebDriver(new URL("http://localhost:8080/wd/hub"), chrome);
				//DesiredCapabilities firefox = DesiredCapabilities.firefox();
				//driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), firefox);
				// Query the driver to find out more information			
				Capabilities actualCapabilities = ((RemoteWebDriver) driver).getCapabilities();
				System.err.println(actualCapabilities.getBrowserName());
				return driver;
		}
	
	
}