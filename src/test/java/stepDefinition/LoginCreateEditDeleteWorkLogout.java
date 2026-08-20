package stepDefinition;

import java.awt.AWTException;
import java.io.IOException;

import com.actitime.pages.CreateTypeOfWorkPage;
import com.actitime.pages.EditTypeOfWorkPage;
import com.actitime.pages.HomePage;
import com.actitime.pages.ListManagementPage;
import com.actitime.pages.TypesOfWorkPage;
import com.actitime.utility.BasePage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginCreateEditDeleteWorkLogout extends BasePage {

	@When("User clicks on work List Management")
	public void user_clicks_on_work_list_management() {
		HomePage homePage = new HomePage(driver);
		homePage.ClickOnListManagement();
	}

	@When("User clicks on Type of Work button")
	public void user_clicks_on_type_of_work_button() {
		ListManagementPage listmanagementPage = new ListManagementPage(driver);
		listmanagementPage.clickOnTypeOfWorkButton();
	}

	@When("User clicks on New Type button")
	public void user_clicks_on_new_type_button() {
		TypesOfWorkPage workPage = new TypesOfWorkPage(driver);
		workPage.clickOnNewTypeButton();
	}

	@When("User enters work name")
	public void user_enters_work_name() throws IOException {
		CreateTypeOfWorkPage createWork=new CreateTypeOfWorkPage(driver);
		createWork.enterNameTextfield();
	}

	@When("User clicks on work Save button")
	public void user_clicks_on_work_save_button() throws InterruptedException {
		CreateTypeOfWorkPage createWork=new CreateTypeOfWorkPage(driver);
		createWork.clickOnSaveButton();
	}

	@Then("Work should be created successfully")
	public void work_should_be_created_successfully() {
		System.out.println("new work created");
	}

	@When("User clicks on Work name")
	public void user_clicks_on_work_name() throws InterruptedException {
		TypesOfWorkPage workPage = new TypesOfWorkPage(driver);
		workPage.clickOnWorkName();
	}

	@When("User edits the work name")
	public void user_edits_the_work_name() throws InterruptedException, AWTException, IOException {
		EditTypeOfWorkPage editWork = new EditTypeOfWorkPage(driver);
		editWork.editName();
		editWork.clickOnSaveButton();
	}

	@Then("Work should be edited successfully")
	public void work_should_be_edited_successfully() {
		System.out.println("work name edited");
	}

	@When("User clicks on Work checkbox")
	public void user_clicks_on_work_checkbox() {
		TypesOfWorkPage workPage = new TypesOfWorkPage(driver);
		workPage.clickOnCheckbox();
	}

	@When("User clicks on Delete button")
	public void user_clicks_on_delete_button() {
		TypesOfWorkPage workPage = new TypesOfWorkPage(driver);
		workPage.clickOnDeleteButton();
	}

	@When("User clicks on work OK Delete button")
	public void user_clicks_on_work_ok_delete_button() {
		TypesOfWorkPage workPage = new TypesOfWorkPage(driver);
		workPage.clickOnOkDeleteButton();
	}

	@When("User clicks on work Cross icon")
	public void user_clicks_on_work_cross_icon() {
		ListManagementPage listmanagementPage = new ListManagementPage(driver);
		listmanagementPage.clickOnCrossIcon();
	}

	@Then("Work should be deleted successfully")
	public void work_should_be_deleted_successfully() {
		System.out.println("work name deleted successfully");
	}


}
