package stepDefinition;

import java.io.IOException;

import com.actitime.pages.AddUserPage;
import com.actitime.pages.DeleteUser;
import com.actitime.pages.EditUserPage;
import com.actitime.pages.HomePage;
import com.actitime.pages.ListsOfUsersPage;
import com.actitime.utility.BasePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginCreateEditDeleteUserLogout extends BasePage {

	@Given("User is on Home Page")
	public void user_is_on_home_page() {
		System.out.println("user navigate to home page");
	}

	@When("User clicks on Users")
	public void user_clicks_on_users() {
		HomePage home = new HomePage(driver);
		home.ClickOnUsers();
	}

	@When("User clicks on New User button")
	public void user_clicks_on_new_user_button() {
		ListsOfUsersPage list = new ListsOfUsersPage(driver);
		list.clickOnNewUserButton();
	}

	@When("User enters user details")
	public void user_enters_user_details() throws IOException {
		AddUserPage addUser = new AddUserPage(driver);
		addUser.enterdetails();
	}

	@When("User clicks on Save button")
	public void user_clicks_on_save_button() throws InterruptedException {
		AddUserPage addUser = new AddUserPage(driver);
		addUser.clickOnSave();
	}

	@When("User clicks on Cross icon")
	public void user_clicks_on_cross_icon() {
		AddUserPage addUser = new AddUserPage(driver);
		addUser.clickOnCrossIcon();
	}

	@When("User clicks on User Name")
	public void user_clicks_on_user_name() {
		ListsOfUsersPage list = new ListsOfUsersPage(driver);
		list.clickOUserName();
	}

	@When("User edits user details")
	public void user_edits_user_details() throws IOException {
		EditUserPage edit = new EditUserPage(driver);
		edit.editUserDetails();
	}

	@When("User clicks on Name for Delete")
	public void user_clicks_on_name_for_delete() {
		ListsOfUsersPage list = new ListsOfUsersPage(driver);
		list.clickONameForDelete();
	}

	@When("User deletes the user")
	public void user_deletes_the_user() {
		DeleteUser delete = new DeleteUser(driver);
		delete.deleteUser();
	}
}
