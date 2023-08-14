package StepDefination;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.AfterStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Cogmentoallfunctions
{
	 public static WebDriver driver;
	@Given("user is on login page")
	public void user_is_on_login_page() {
	     driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	     driver.manage().deleteAllCookies();
	     driver.get("https://ui.cogmento.com");
	    
	}

	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password() {
	    
	driver.findElement(By.name("email")).sendKeys("prafulp1010@gmail.com");
	driver.findElement(By.name("password")).sendKeys("Pr@ful0812");
	driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
	}

	@Given("user is on homepage")
	public void user_is_on_homepage() {
	  driver.findElement(By.xpath("//div[@class='header item']"));  
	 
	}

	@Then("user validate Hpmepage and url")
	public void user_validate_hpmepage_and_url() {
	   String actualurl= driver.getCurrentUrl();
	   Assert.assertEquals(actualurl.contains("ui.cogment"), true);
	}

	
	@Then("click on contact button") public void click_on_contact_button() {
	 driver.findElement(By.xpath("//a[@ href='/contacts']")).click();
	 
	}
	 /* 
	 * @Then("click on create button") public void click_on_create_button() {
	 * driver.findElement(By.xpath("//a[@href='/contacts/new']")).click(); }
	 * 
	 * @Then("user enter {string} and {string} and {string} and {string}") public
	 * void user_enter_and_and_and(String fname, String lname, String Email, String
	 * status) { driver.findElement(By.name("first_name")).sendKeys(fname);
	 * driver.findElement(By.name("last_name")).sendKeys(lname);
	 * driver.findElement(By.name("value")).sendKeys(Email);
	 * driver.findElement(By.name("status")).click(); List<WebElement>
	 * ls=driver.findElements(By.xpath("//div[@name='status']/span"));
	 * for(WebElement a:ls) if(a.getText().equalsIgnoreCase(status)) { a.click();
	 * break; } }
	 * 
	 * @Then("Takescreenshot") public void takescreenshot() throws IOException {
	 * TakesScreenshot tks= (TakesScreenshot)driver; File F=
	 * tks.getScreenshotAs(OutputType.FILE); String path
	 * =System.getProperty("user.dir")+"//screenshot//"+date()+".png";
	 * FileUtils.copyFile(F, new File (path)); }
	 * 
	 * 
	 * 
	 * @Then("click on save button") public void click_on_save_button() {
	 * driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click()
	 * ; }
	 * 
	 * @Then("user click on delete button") public void
	 * user_click_on_delete_button() {
	 * driver.findElement(By.xpath("//button[@class='ui button icon']")).click();
	 * driver.findElement(By.xpath("//button[@class='ui red button']")).click(); }
	 * 
	 * public String date() { return new
	 * SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date()); }
	 * 
	 * 
	 * @AfterStep public static void abc() throws InterruptedException {
	 * Thread.sleep(2000); }
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
