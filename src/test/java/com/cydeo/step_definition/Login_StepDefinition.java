package com.cydeo.step_definition;

import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurafionReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefinition {

    LoginPage loginPage=new LoginPage();
    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurafionReader.getProperty("env"));

    }
    @When("The user enters the {string} and {string} information")
    public void the_user_enters_the_and_information(String username, String password) {

        loginPage.username.sendKeys(ConfigurafionReader.getProperty("username"));
        loginPage.username.sendKeys(ConfigurafionReader.getProperty("password"));

    }
    @Then("The user should be able to login")
    public void the_user_should_be_able_to_login() {
        loginPage.loginBtn.click();
        BrowserUtils.waitFor(3);
    }

    @When("User can click on more option")
    public void user_can_click_on_more_option() {
        BrowserUtils.waitFor(2);
        loginPage.moreOption.click();


    }
    @Then("User can click on file btn")
    public void user_can_click_on_file_btn() {
        loginPage.fileBtn.click();
        BrowserUtils.waitFor(2);
    }
    @Then("User can click on upload files icon")
    public void user_can_click_on_upload_files_icon() {
        loginPage.uploadFileBtn.click();
        Assert.assertTrue(loginPage.uploadFileBtn.isEnabled());
    }

    @Then("User can click on Appreciation btn")
    public void user_can_click_on_appreciation_btn() {
        loginPage.appreciationBtn.click();
        BrowserUtils.waitFor(3);

    }
    @Then("User click on add employees btn and add employee")
    public void user_click_on_add_employees_btn_and_add_employee() {
        loginPage.addEmployeesBtn.click();
        Assert.assertTrue(loginPage.EmployeesDeptitle.isDisplayed());

    }

    @When("User click attach link icon")
    public void user_click_attach_link_icon() {
        loginPage.addEmployeesIcon.click();
        BrowserUtils.waitFor(3);

    }
    @Then("Employee attach by clicking link icon")
    public void employee_attach_by_clicking_link_icon() {
        loginPage.linkIcon.click();
        Assert.assertTrue(loginPage.linkIcon.isSelected());

    }

    @When("User click on video icon")
    public void user_click_on_video_icon() {
        loginPage.videoRecordBtn.click();
        BrowserUtils.waitFor(2);

    }
    @Then("video icon is clickable")
    public void video_icon_is_clickable() {
        loginPage.videoRecordBtn.isSelected();
        Assert.assertTrue(loginPage.videoRecordBtn.isSelected());
    }
    @When("User click on comma icon")
    public void user_click_on_comma_icon() {
        loginPage.commaIcon.click();
        BrowserUtils.waitFor(2);

    }
    @Then("comma is displayed")
    public void comma_is_displayed() {
        loginPage.commaShape.isDisplayed();
        Assert.assertTrue(loginPage.commaShape.isDisplayed());

    }
    @When("User click on add mention icon")
    public void user_click_on_add_mention_icon() {
        loginPage.addMentionBtn.click();
        BrowserUtils.waitFor(2);

    }
    @Then("add mention icon is displayed")
    public void add_mention_icon_is_displayed() {
        loginPage.addMentionBtn.isDisplayed();
        Assert.assertTrue(loginPage.addMentionBtn.isDisplayed());

    }

    @When("User click on visual editor")
    public void user_click_on_visual_editor() {
        loginPage.visualEditorBtn.click();
        BrowserUtils.waitFor(2);
    }
    @Then("Editor test-bar is displayed")
    public void editor_test_bar_is_displayed() {
        loginPage.visEditBar.isDisplayed();
        Assert.assertTrue(loginPage.visEditBar.isDisplayed());

    }

    @When("User click on topic icon")
    public void user_click_on_topic_icon() {
        loginPage.topicIcon.click();
        BrowserUtils.waitFor(2);

    }
    @Then("Text box is displayed")
    public void text_box_is_displayed() {
        loginPage.topicTextBox.isDisplayed();
        Assert.assertTrue(loginPage.topicTextBox.isDisplayed());

    }

    @When("User click on add tags")
    public void user_click_on_add_tags() {
        loginPage.addTagsIcon.click();
        BrowserUtils.waitFor(2);
    }
    @Then("Add tags icon is displayed")
    public void add_tags_icon_is_displayed() {
        loginPage.addTagsBox.isEnabled();
        Assert.assertTrue(loginPage.addTagsBox.isEnabled());

    }

}
