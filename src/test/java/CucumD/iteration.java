package CucumD;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class iteration {
	WebDriver driver;
		@Given("the user wants home page")
		public void the_user_wants_home_page() {
			System.setProperty("webdriver.chrome.driver","C:\\NexGenTesting\\chromedriver_win32\\chromedriver.exe");
		      driver=new ChromeDriver();
		      driver.get("http://demoaut.com/");
		      driver.manage().window().maximize();
		
		}

		@When("user enters credentials")
		public void user_enters_credentials() {
			driver.findElement(By.name("userName")).sendKeys("invalidUN");
	        driver.findElement(By.name("password")).sendKeys("invalidPW");
	        driver.findElement(By.name("login")).click();
		    
		}

		@Then("user can do the successful login")
		public void user_can_do_the_successful_login() {
			driver.close();
	        //Assert.assertEquals("Find a Flight: Mercury Tours:",driver.getTitle());
		   
		}
		public class Credentials
		{
			public String username;
			public String password;
		}
		@When("user enters below credentails and clicks sing in")
		public void user_enters_below_credentails_and_clicks_sing_in(List<Credentials> dataTable) {
			for(Credentials credentials:dataTable)
			{
				 driver.findElement(By.name("userName")).sendKeys(credentials.username);
		          driver.findElement(By.name("password")).sendKeys(credentials.password);
		          driver.findElement(By.name("login")).click();
		          driver.navigate().back();
			}
		   
		}

		@Then("the expected behavior could be")
		public void the_expected_behavior_could_be() {
			  System.out.println("end");
		    
		}
}

