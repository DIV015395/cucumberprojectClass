package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class StepDefinitions {

    WebDriver driver;
    @Given("Browser is open")
    public void browser_is_open() {
        System.out.println("Step1: browser is open");

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    }
    @And("User is on google page")
    public void user_is_on_google_page() {
        System.out.println("Step2: user is on google page");

        driver.get("https://www.google.com/");

    }
    @When("user enters a text in the search box")
    public void user_enters_a_text_in_the_search_box() throws InterruptedException {
        System.out.println("step3-user will enter text in search box");
        driver.findElement(By.name("q")).sendKeys("Mobile");
        Thread.sleep(1000);

    }
    @And("press enter")
    public void press_enter() throws InterruptedException {
        System.out.println("step4-user will press enter");
        driver.findElement(By.name("btnK")).click();
        Thread.sleep(1000);


    }
    @Then("user is navigated to search results")
    public void user_is_navigated_to_search_results() {
        System.out.println("step5-user is navigated to results");
        Assert.assertEquals(driver.getTitle(), "Mobile - Google Search");


        driver.close();
    }
}