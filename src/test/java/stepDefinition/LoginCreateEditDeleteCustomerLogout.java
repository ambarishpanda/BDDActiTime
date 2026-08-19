package stepDefinition;

import java.awt.AWTException;
import java.io.IOException;

import com.actitime.pages.CreateNewCustomerPage;
import com.actitime.pages.HomePage;
import com.actitime.pages.TaskPage;
import com.actitime.utility.BasePage;
import com.actitime.utility.Hooks;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginCreateEditDeleteCustomerLogout extends BasePage{

	@Given("User is logged into ActiTime application")
	public void user_is_logged_into_acti_time_application() {
		System.out.println("User is logged into ActiTime application");
	}

	@When("User clicks on Task")
	public void user_clicks_on_task() {
		HomePage homePage = new HomePage(driver);
		homePage.clickOnTask();
	}

	@When("User clicks on Add New button")
	public void user_clicks_on_add_new_button() {
		TaskPage taskpage = new TaskPage(driver);
		taskpage.clickOnAddNewButton();
	}

	@When("User clicks on New Customer button")
	public void user_clicks_on_new_customer_button() {
		TaskPage taskpage = new TaskPage(driver);
		taskpage.clickOnNewCustomerButton();
	}

	@When("User enters customer name")
	public void user_enters_customer_name() throws IOException {
		CreateNewCustomerPage customerpage = new CreateNewCustomerPage(driver);
		customerpage.EnterCustomerName();
	}

	@When("User clicks on Create Customer button")
	public void user_clicks_on_create_customer_button() {
		CreateNewCustomerPage customerpage = new CreateNewCustomerPage(driver);

		customerpage.clickOnCreateCustomerButton();
	}

	@Then("Customer should be created successfully")
	public void customer_should_be_created_successfully() {
		System.out.println("Customer created successfully");
	}

	@When("User clicks on Edit button")
	public void user_clicks_on_edit_button() {
		TaskPage taskpage = new TaskPage(driver);
		taskpage.clickOnEditButton();
	}

	@When("User clicks on Customer name")
	public void user_clicks_on_customer_name()
			throws AWTException, InterruptedException, IOException {
		TaskPage taskpage = new TaskPage(driver);
		taskpage.clickOnName();
	}

	@Then("Customer should be edited successfully")
	public void customer_should_be_edited_successfully() {
		System.out.println("Customer edited successfully");
	}

	@When("User deletes the customer name")
	public void user_deletes_the_customer_name() {
		TaskPage taskpage = new TaskPage(driver);
		taskpage.deleteCustomerName();
	}

	@Then("Customer should be deleted successfully")
	public void customer_should_be_deleted_successfully() {
		System.out.println("Customer deleted successfully");
	}
}