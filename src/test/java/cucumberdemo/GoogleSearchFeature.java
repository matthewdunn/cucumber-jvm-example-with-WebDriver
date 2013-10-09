package cucumberdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.android.AndroidDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class GoogleSearchFeature{

	WebDriver driver;
	
	@Given("^The search is Hello World$")
	public void The_search_is_Hello_World() throws Throwable {
		driver = new FirefoxDriver();//new AndroidDriver(); //new HtmlUnitDriver();
        driver.get("http://www.google.co.uk");
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Hello World");
	}
	
	@When("^The Search is performed$")
	public void The_Search_is_performed() throws Throwable {
		driver.findElement(By.xpath("//input[@name='btnG']")).click(); 
	}
	
	@Then("^The browser title should have Hello World$")
	public void The_browser_title_should_have_Hello_World() throws Throwable {
		assertThat ("Browser title:",driver.getTitle(), containsString("Hello World"));
        driver.quit();
	}
}