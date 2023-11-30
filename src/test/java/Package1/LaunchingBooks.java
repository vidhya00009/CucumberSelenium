package Package1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LaunchingBooks {
	public static WebDriver driver;
	
	
	
	PropertiesUtils a = new PropertiesUtils("Buybooks.properties");

	public void MouseOver() {
		Actions b = new Actions(driver);
		WebElement a1 = driver.findElement(a.getLocator("children"));
		b.moveToElement(a1).build().perform();
	}

	public void MouseOver1() {
		Actions b1 = new Actions(driver);
		WebElement a2 = driver.findElement(a.getLocator("Fiction"));
		b1.moveToElement(a2).build().perform();
	}

	public void MouseOver2() {
		Actions b2 = new Actions(driver);
		WebElement a3 = driver.findElement(a.getLocator("School"));
		b2.moveToElement(a3).build().perform();
	}

	public void MouseOver3() {
		Actions b3 = new Actions(driver);
		WebElement a4 = driver.findElement(a.getLocator("TestPrepare"));
		b3.moveToElement(a4).build().perform();
	}

	public void MouseOver4() {
		Actions b4 = new Actions(driver);
		WebElement a5 = driver.findElement(a.getLocator("Games"));
		b4.moveToElement(a5).build().perform();
	}

	@Given("Enter the Url")
	public void enter_the_url() {
        
		driver = new ChromeDriver();
		String url = "https://www.buybooksindia.com/";
		driver.get(url);
		driver.manage().window().maximize();

	}

	@When("Search the {string}")
	public void search_the(String Books) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(a.getLocator("searchbox")).click();
		driver.findElement(a.getLocator("searchbox")).sendKeys(Books + Keys.ENTER);
		Thread.sleep(3000);
	}

	@Then("Select Book")
	public void select_book() {
		 driver.findElement(a.getLocator("selectbook")).click();
	}

	@Then("Addcart and Buy")
	public void addcart_and_buy() {
		 driver.findElement(a.getLocator("Addcart")).click();
		 driver.findElement(a.getLocator("Buy")).click();
	}

	@When("Click BestSeller")
	public void click_best_seller() throws InterruptedException {
		Thread.sleep(3000);
		Set<String> handles = driver.getWindowHandles();
		for (String h1 : handles) {
			driver.switchTo().window(h1);
		}
		driver.findElement(a.getLocator("Bestseller")).click();
	}

	

	@When("Click NewArrival")
	public void click_new_arrival() {
		driver.findElement(a.getLocator("Newarrival")).click();
	}

	

	@When("Click the Preorder")
	public void click_the_preorder() {
		driver.findElement(a.getLocator("Preorder")).click();
	}

	

	@Then("select a book")
	public void select_a_book() throws InterruptedException {
		driver.findElement(a.getLocator("selectbook")).click();
		Thread.sleep(3000);
	}

	@Then("addcart and buynow and add quantity")
	public void addcart_and_buynow_and_add_quantity() throws InterruptedException {
		driver.findElement(a.getLocator("Addcart1")).click();
		driver.findElement(a.getLocator("buy1")).click();
		Thread.sleep(3000);
		 driver.findElement(a.getLocator("quantity")).click();
		 Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		ExtentCucumberAdapter.addTestStepLog(Status.INFO+"3.Module 3 Completed");
		
	}

	@When("select Action Books")
	public void select_action_books() {
		MouseOver();
		driver.findElement(a.getLocator("Action")).click();
	}

	
	@When("Select Zombie Book")
	public void select_zombie_book() {

		driver.findElement(a.getLocator("Zombie")).click();

	}

	@Then("Addcart and Buynow")
	public void addcart_and_buynow() {
		driver.findElement(a.getLocator("Addcart2")).click();
		driver.findElement(a.getLocator("buy2")).click();
		driver.navigate().back();
	}

	@When("Click Craft")
	public void click_craft() {

		MouseOver();
		driver.findElement(a.getLocator("Craft")).click();
	}

	
	@When("Select any book")
	public void select_any_book() {
		driver.findElement(a.getLocator("Mandala")).click();
	}

	@Then("Add to cart and Buy")
	public void add_to_cart_and_buy() {
		driver.findElement(a.getLocator("Addcart3"));
		driver.findElement(a.getLocator("buy3")).click();
		ExtentCucumberAdapter.addTestStepLog(Status.INFO+"4.Module 4 Completed");
	}

	@When("Select Travel Books")
	public void select_travel_books() throws InterruptedException {
		MouseOver1();
		driver.findElement(a.getLocator("Travel")).click();
		Thread.sleep(3000);

	}

	

	@When("Select TourismBooks")
	public void select_tourism_books() {
		driver.findElement(a.getLocator("TourismAssam")).click();
	}

	@Then("click Addcart and buy")
	public void click_addcart_and_buy() {
		driver.findElement(a.getLocator("Addcart4")).click();
		driver.findElement(a.getLocator("buy4")).click();
	}

	@When("Click a Memoir Books")
	public void click_a_memoir_books() {
		MouseOver1();
		driver.findElement(a.getLocator("MemoirBook")).click();
	}

	

	@Then("AddCart and BuyNow")
	public void add_cart_and_buy_now() {

		driver.findElement(a.getLocator("CalltoPurity")).click();
		ExtentCucumberAdapter.addTestStepLog(Status.INFO+"5.Module 5 Completed");
	}

	@When("click Subject")
	public void click_subject() {
		MouseOver2();
		driver.findElement(a.getLocator("Subjectwise")).click();
	}

	@When("Select English Books")
	public void select_english_books() {
		driver.findElement(a.getLocator("English")).click();
	}

	
	@When("Select  Aiming  of Progress Books")
	public void select_aiming_of_progress_books() {

		driver.findElement(a.getLocator("AimingofProgress")).click();
	}

	@Then("AddtoCart and Buy")
	public void addto_cart_and_buy() {

		driver.findElement(a.getLocator("Addcart5")).click();
		driver.findElement(a.getLocator("buy5")).click();
	}

	@When("Click Boardwise Books")
	public void click_boardwise_books() {

		MouseOver2();
		driver.findElement(a.getLocator("BoardWise")).click();
	}

	@When("Select State Boaard")
	public void select_state_boaard() {
		driver.findElement(a.getLocator("StateBoard")).click();
	}

	

	@Then("Select Central Book")
	public void select_central_book() throws InterruptedException {
		driver.findElement(a.getLocator("Central")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		ExtentCucumberAdapter.addTestStepLog(Status.INFO+"6.Module 6 Completed");
	}

	@When("Select Interview Prepare Books")
	public void select_interview_prepare_books() {
		MouseOver3();
		driver.findElement(a.getLocator("InterviewPrepare")).click();
	}

	

	@When("Select CommunicationSkills")
	public void select_communication_skills() {
		driver.findElement(a.getLocator("ConversationSkill")).click();
	}

	@Then("Add To Cart and Buy Now")
	public void add_to_cart_and_buy_now() {
		driver.findElement(a.getLocator("Addcart6")).click();
		driver.findElement(a.getLocator("buy6")).click();
		ExtentCucumberAdapter.addTestStepLog(Status.INFO+"7.Module 7 Completed");
	}

	@When("Click Puzzles")
	public void click_puzzles() {

		MouseOver4();
		driver.findElement(a.getLocator("Puzzles")).click();
	}



	@When("Select Aladdin Books")
	public void select_aladdin_books() {

		driver.findElement(a.getLocator("Aladdin")).click();
	}

	@Then("Click Add to Cart and Buy")
	public void click_add_to_cart_and_buy() {

		driver.findElement(a.getLocator("Addcart7")).click();
		driver.findElement(a.getLocator("buy7")).click();
		ExtentCucumberAdapter.addTestStepLog(Status.INFO+"8.Module 8 Completed");
		driver.navigate().back();
		driver.close();
	}
}
