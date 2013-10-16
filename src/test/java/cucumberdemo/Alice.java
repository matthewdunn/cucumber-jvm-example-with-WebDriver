package cucumberdemo;

import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.android.AndroidDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberdemo.utils.RobotPowered;

public class Alice {

	private WebDriver driver;
	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	private Scenario scenario;
	

	@Given("^The game is loaded$")
	public void The_game_is_loaded() throws Throwable {
	   
		driver =  getWebDriver();
		
		String gameurl = "http://test5-hub-static.gtsplc.com/igaming/AG-AMAZON";
		//String gameurl = "http://test3-hub-static.gtsplc.com/";
        driver.get(gameurl);
        captureScreenshot("Loading game img 1", (RemoteWebDriver) driver);
        
    //    navigateLobby(driver);
        
        WebElement element = (new WebDriverWait(driver, 140))
				  .until(ExpectedConditions.elementToBeClickable(By.className("ctp")));

		element.click();
		captureScreenshot("Loading game img 2", (RemoteWebDriver) driver);

		RobotPowered robot = new RobotPowered(driver);
		robot.robotPoweredMoveMouseToCoordinatesOnPage(100, 200);
		captureScreenshot("Loading game img 3", (RemoteWebDriver) driver);
		robot.robotPoweredMoveMouseToCoordinatesOnPage(150, 200);
		captureScreenshot("Loading game img 3", (RemoteWebDriver) driver);
		robot.robotPoweredMoveMouseToCoordinatesOnPage(180, 200);
		captureScreenshot("Loading game img 3", (RemoteWebDriver) driver);
		robot.robotPoweredMoveMouseToCoordinatesOnPage(190, 200);
		captureScreenshot("Loading game img 3", (RemoteWebDriver) driver);
		robot.robotPoweredMoveMouseToCoordinatesOnPage(200, 200);
		captureScreenshot("Loading game img 3", (RemoteWebDriver) driver);
		robot.robotPoweredMoveMouseToCoordinatesOnPage(210, 200);
		captureScreenshot("Loading game img 3", (RemoteWebDriver) driver);
		robot.robotPoweredMoveMouseToCoordinatesOnPage(250, 200);
		captureScreenshot("Loading game img 3", (RemoteWebDriver) driver);
		robot.robotPoweredMoveMouseToCoordinatesOnPage(280, 200);
		captureScreenshot("Loading game img 3", (RemoteWebDriver) driver);
		robot.robotPoweredMoveMouseToCoordinatesOnPage(300, 200);
		captureScreenshot("Loading game img 3", (RemoteWebDriver) driver);
		robot.robotPoweredMoveMouseToCoordinatesOnPage(350, 200);
		captureScreenshot("Loading game img 3", (RemoteWebDriver) driver);
		robot.robotPoweredClick();
		
		
	
	}

	
	
	/**
	 * Navigates throught the lobby to start the game.
	 * @param driver
	 */
	private void navigateLobby(WebDriver driver) {
		
		WebElement element = (new WebDriverWait(driver, 10))
				  .until(ExpectedConditions.elementToBeClickable(By.className("img-box")));

		element.click();
		captureScreenshot("Loading game img 2", (RemoteWebDriver) driver);


		element = (new WebDriverWait(driver, 10))
				  .until(ExpectedConditions.elementToBeClickable(By.className("lobby-img-box")));
		element.click();

		captureScreenshot("Loading game img 3", (RemoteWebDriver) driver);
		//element = driver.findElement(By.linkText("Demo"));
		element = (new WebDriverWait(driver, 10))
				  .until(ExpectedConditions.elementToBeClickable(By.linkText("Demo")));		
		element.click();
        
        
        
        captureScreenshot("Loading game img 4", (RemoteWebDriver) driver);
	}
	
	@When("^Play the game$")
	public void Play_the_game() throws Throwable {
	    
		WebElement element =(new WebDriverWait(driver, 30))
				  .until(ExpectedConditions.elementToBeClickable(By.linkText("graphics")));		 
				
        String path = element.getAttribute("src");
        scenario.write(path);
        
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript(arg0, arg1)
//		
		scenario.write((String) js.executeScript("return document.title"));
		
		List<WebElement> allOptions = getDriver().findElements(By.partialLinkText("play"));
		for (WebElement option : allOptions) {
		    System.out.println(String.format("Value is: %s", option.getAttribute("value")));
		    option.click();
		}
		
		RobotPowered robot = new RobotPowered(driver);
		robot.robotPoweredMoveMouseToCoordinatesOnPage(100, 200);
		captureScreenshot("Loading game img 3", (RemoteWebDriver) driver);
		robot.robotPoweredMoveMouseToCoordinatesOnPage(150, 200);
		captureScreenshot("Loading game img 3", (RemoteWebDriver) driver);
		robot.robotPoweredMoveMouseToCoordinatesOnPage(180, 200);
		captureScreenshot("Loading game img 3", (RemoteWebDriver) driver);
		robot.robotPoweredMoveMouseToCoordinatesOnPage(190, 200);
		captureScreenshot("Loading game img 3", (RemoteWebDriver) driver);
		robot.robotPoweredMoveMouseToCoordinatesOnPage(200, 200);
		captureScreenshot("Loading game img 3", (RemoteWebDriver) driver);
		robot.robotPoweredMoveMouseToCoordinatesOnPage(210, 200);
		captureScreenshot("Loading game img 3", (RemoteWebDriver) driver);
		robot.robotPoweredMoveMouseToCoordinatesOnPage(250, 200);
		captureScreenshot("Loading game img 3", (RemoteWebDriver) driver);
		robot.robotPoweredMoveMouseToCoordinatesOnPage(280, 200);
		captureScreenshot("Loading game img 3", (RemoteWebDriver) driver);
		robot.robotPoweredMoveMouseToCoordinatesOnPage(300, 200);
		captureScreenshot("Loading game img 3", (RemoteWebDriver) driver);
		robot.robotPoweredMoveMouseToCoordinatesOnPage(350, 200);
		captureScreenshot("Loading game img 3", (RemoteWebDriver) driver);
		robot.robotPoweredClick();
		
		
	}
	
	@Then("^The game should play.$")
	public void The_game_should_play() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	
	
public void testAshGame() throws Exception{
		
		System.err.println(DesiredCapabilities.android().getBrowserName());

		
		WebDriver driver = (RemoteWebDriver)getWebDriver();
	
		// And now use it
		
		driver.get("http://test3-hub-static.gtsplc.com/");
		
		captureScreenshot("Loading game img 3", (RemoteWebDriver) driver);
		System.err.println("WebDriverDemo "+ driver.getPageSource());
		WebElement element = (new WebDriverWait(driver, 60))
				  .until(ExpectedConditions.elementToBeClickable(By.className("img-box")));
		
		//WebElement element = driver.findElement(By.className("img-box"));
		element.click();
		//Thread.sleep(7000);
		captureScreenshot("Loading game img 3", (RemoteWebDriver) driver);
		
		//element = driver.findElement(By.className("lobby-img-box"));
		element = (new WebDriverWait(driver, 60))
				  .until(ExpectedConditions.elementToBeClickable(By.className("lobby-img-box")));
		element.click();
		//Thread.sleep(7000);
		captureScreenshot("Loading game img 3", (RemoteWebDriver) driver);
		
		//e = driver.findElement(By.partialLinkText("Topic 3"));
		//element = driver.findElement(By.linkText("Demo"));
		element = (new WebDriverWait(driver, 60))
				  .until(ExpectedConditions.elementToBeClickable(By.linkText("Demo")));
		//element = driver.findElement(By.className("btn skin4"));
		element.click();
		
	}
	


	@Before
	public void before(Scenario scenario) {
	    this.scenario = scenario;
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
		
				
		
		
			//	driver = new AndroidDriver();
				
				//ChromeDriver chromeDriver = new ChromeDriver();
				// We could use any driver for our tests...
				//DesiredCapabilities chrome = DesiredCapabilities.chrome();
				
				
				DesiredCapabilities android = DesiredCapabilities.android();
				android.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

			//	WebDriver driver = new AndroidDriver(android);
				// ... but only if it supports javascript
				//chrome.setJavascriptEnabled(true);
				android.setJavascriptEnabled(true);
				// Get a handle to the driver. This will throw an exception
				// if a matching driver cannot be located
				//driver = new RemoteWebDriver(new URL("http://localhost:8080/wd/hub"), chrome);
				driver = new RemoteWebDriver(new URL("http://localhost:8080/wd/hub"), android);
				//driver = new ChromeDriver(new URL("http://localhost:8080/wd/hub"));
				
				
				//TO RUN ON PC via RemoteServer
				//DesiredCapabilities firefox = DesiredCapabilities.firefox();
				//driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), firefox);
				
				// Query the driver to find out more information			
				Capabilities actualCapabilities = ((RemoteWebDriver) driver).getCapabilities();
				System.err.println("Browser :" +actualCapabilities.getBrowserName());
				return driver;
		}
	
	
	
	
}
