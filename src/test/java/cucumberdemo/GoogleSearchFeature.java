package cucumberdemo;



import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

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

	WebDriver driver;
	private Scenario scenario;
	private Scenario result;
	
	@Before
	public void before(Scenario scenario) {
	    this.scenario = scenario;
	}
	
	
	
	@Given("^The search is Hello World$")
	public void The_search_is_Hello_World() throws Throwable {
		driver = new FirefoxDriver();//new AndroidDriver(); //new HtmlUnitDriver();
        driver.get("http://www.google.co.uk");
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Hello World");
        
        scenario.write("img - 1");
        byte[] screenshot = ((FirefoxDriver) driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshot, "image/png");
	}
	
	@When("^The Search is performed$")
	public void The_Search_is_performed() throws Throwable {
		driver.findElement(By.name("btnG")).click(); 
		
		byte[] screenshot = ((FirefoxDriver) driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshot, "image/png");
		
	}
	
	@Then("^The browser title should have Hello World$")
	public void The_browser_title_should_have_Hello_World() throws Throwable {
		System.err.println("driver title = "+driver.getTitle());
		assertThat ("Browser title:",driver.getTitle(), containsString("Hello World"));
		
		byte[] screenshot = ((FirefoxDriver) driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshot, "image/png");
        
		
		driver.quit();
	}
	
	@After
	public void embedScreenshot(Scenario scenario) {
	    if(result.isFailed()) {
	        byte[] screenshot = ((FirefoxDriver) driver).getScreenshotAs(OutputType.BYTES);
	        scenario.embed(screenshot, "image/png");
	    }
	}
	
	
}