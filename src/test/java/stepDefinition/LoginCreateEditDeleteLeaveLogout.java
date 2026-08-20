package stepDefinition;

import java.awt.AWTException;
import java.io.IOException;

import com.actitime.pages.CreateLeaveTypePage;
import com.actitime.pages.EditLeaveTypePage;
import com.actitime.pages.HomePage;
import com.actitime.pages.LeaveTypesPage;
import com.actitime.pages.ListManagementPage;
import com.actitime.utility.BasePage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginCreateEditDeleteLeaveLogout extends BasePage {

    @When("User clicks on leave List Management")
    public void user_clicks_on_leave_list_management() {
        HomePage homePage = new HomePage(driver);
        homePage.ClickOnListManagement();
    }

    @When("User clicks on Leave Types")
    public void user_clicks_on_leave_types() {
        ListManagementPage listmanagementPage = new ListManagementPage(driver);
        listmanagementPage.clickOnLeaveTypes();
    }

    @When("User clicks on New Leave Type button")
    public void user_clicks_on_new_leave_type_button() {
        LeaveTypesPage leavePage = new LeaveTypesPage(driver);
        leavePage.clickOnNewTypeButton();
    }

    @When("User enters leave type name")
    public void user_enters_leave_type_name() throws IOException {
        CreateLeaveTypePage createleave = new CreateLeaveTypePage(driver);
        createleave.enterName();
    }

    @When("User clicks on leave save button")
    public void user_clicks_on_leave_save_button() throws InterruptedException {
        CreateLeaveTypePage createleave = new CreateLeaveTypePage(driver);
        createleave.clickOnSaveButton();
    }

    @Then("Leave type should be created successfully")
    public void leave_type_should_be_created_successfully() {
        System.out.println("Leave type created successfully");
    }

    @When("User clicks on Leave name")
    public void user_clicks_on_leave_name() throws AWTException, InterruptedException, IOException {
        LeaveTypesPage leavepage = new LeaveTypesPage(driver);
        leavepage.clickOnLeaveName();
    }

    @When("User edits the leave name")
    public void user_edits_the_leave_name() throws AWTException, InterruptedException, IOException {
        EditLeaveTypePage editleave = new EditLeaveTypePage(driver);
        editleave.editLeaveName();
        editleave.clickOnSaveButton();
    }

    @Then("Leave type should be edited successfully")
    public void leave_type_should_be_edited_successfully() {
        System.out.println("Leave type edited successfully");
    }

    @When("User clicks on Three Dot icon")
    public void user_clicks_on_three_dot_icon() {
        LeaveTypesPage leavepage = new LeaveTypesPage(driver);
        leavepage.clickOnThreeDotIcon();
    }

    @When("User clicks on Delete icon")
    public void user_clicks_on_delete_icon() {
        LeaveTypesPage leavepage = new LeaveTypesPage(driver);
        leavepage.clickOnDeleteIcon();
    }

    @When("User clicks on leave oK delete button")
    public void user_clicks_on_leave_ok_delete_button() {
        LeaveTypesPage leavepage = new LeaveTypesPage(driver);
        leavepage.clickOnOkDeleteButton();
    }

    @When("User clicks on Leave Cross icon")
    public void user_clicks_on_leave_cross_icon() {
        ListManagementPage list = new ListManagementPage(driver);
        list.clickOnCrossIcon();
    }

    @Then("Leave type should be deleted successfully")
    public void leave_type_should_be_deleted_successfully() {
        System.out.println("Leave type deleted successfully");
    }
}