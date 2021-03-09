package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_stepDef {
	
WebDriver driver;
	
	@Before
	public void setup() {
		
		System.setProperty("Webdriver.chrome.driver", "chromedriver");
		driver = new ChromeDriver();
		
		
	}
	
	@After
	public void teardown() {
		
		driver.quit();
		
	}
	

	
	@Given("^User has opened swigy website on Chrome Browser$")
    public void user_has_opened_swigy_website_on_chrome_browser() throws Throwable {
        
		driver.get("https://www.swiggy.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
    }

	@When("^User enters correct \"([^\"]*)\"$")
    public void user_enters_correct_something(String mobilenumber) throws Throwable {
       
		WebElement lnkLogin = driver.findElement(By.linkText("Login"));
        lnkLogin.click();
        
        WebElement mobileno = driver.findElement(By.xpath("//*[@id=\"mobile\"]"));
        mobileno.sendKeys(mobilenumber);
        
        WebElement login_btn = driver.findElement(By.xpath("//input[@type=\'submit\']"));
        login_btn.click();
    }

	
	
   
    @When("^User enters incorrect mobile$")
    public void user_enters_incorrect_mobile() throws Throwable {
        
    }

    @Then("^user should be able to login successfully$")
    public void user_should_be_able_to_login_successfully() throws Throwable {
        
    }

}
