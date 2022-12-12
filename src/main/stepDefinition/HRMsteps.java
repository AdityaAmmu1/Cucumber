import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRMsteps {
    public static WebDriver driver;

    @Given("I launched a chrome browser")
    public void i_launched_a_chrome_browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @When("I open orange hrm homepage")
    public void i_open_orange_hrm_homepage() {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://gassitplaydigital1.dev.igt.com/en-us/home.html");
    }

    @Then("I verify that the logo present on page")
    public void i_verify_that_the_logo_present_on_page() {
        System.out.println("Opening the browser");
    }

    @Then("close browser")
    public void close_browser() {
        // Write code here that turns the phrase above into concrete actions
        driver.close();
    }
}
