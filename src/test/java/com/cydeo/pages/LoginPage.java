package com.cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    public WebElement username;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement password;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginBtn;

    @FindBy(xpath = "//span[@id='feed-add-post-form-link-text']")
    public WebElement moreOption;

    @FindBy(xpath = "(//span[@class='menu-popup-item-text']) [1]")
    public WebElement fileBtn;

    @FindBy(xpath = "(//span[@class='wd-fa-add-file-light-title-text diskuf-selector-link'])[1]")
    public WebElement uploadFileBtn;

    @FindBy(xpath = "(//span[@class='menu-popup-item-text']) [2]")
    public WebElement appreciationBtn;

    @FindBy(xpath = "//a[@class='feed-add-grat-link']")
    public WebElement addEmployeesBtn;

    @FindBy(xpath = "//a[@id='destDepartmentTab_mBs3Z3']")
    public WebElement EmployeesDeptitle;

    @FindBy(xpath = "//a[@class='feed-add-grat-link']")
    public WebElement addEmployeesIcon;

    @FindBy(xpath = "//a[@class='bx-finder-company-department-employee bx-finder-element bx-finder-company-department-employee-selected']")
    public WebElement linkIcon;

    @FindBy(xpath = "(//span[@class='feed-add-post-form-but-cnt feed-add-videomessage'])[1]")
    public WebElement videoRecordBtn;

    @FindBy(xpath = "//span[@class='bxhtmled-top-bar-btn bxhtmled-button-quote bxhtmled-top-bar-btn-active']")
    public WebElement commaIcon;

    @FindBy(xpath = "(//blockquote[@class='bxhtmled-quote'])[2]")
    public WebElement commaShape;

    @FindBy(xpath = "(//span[@class='feed-add-post-form-but feed-add-mention'])[1]")
    public WebElement addMentionBtn;

    @FindBy(xpath = "//*[@id=lhe_button_editor_blogPostForm]")
    public WebElement visualEditorBtn;

    @FindBy(xpath = "(//div[@class=bxhtmled-toolbar])[1]")
    public WebElement visEditBar;

    @FindBy(xpath = "//span[@title='Topic']")
    public WebElement topicIcon;

    @FindBy(xpath = "//input[@id='POST_TITLE']")
    public WebElement topicTextBox;

    @FindBy(xpath = "//span[@class='feed-add-post-form-but feed-add-tag']")
    public WebElement addTagsIcon;

    @FindBy(xpath = "//input[@name='TAGS_blogPostForm']")
    public WebElement addTagsBox;


}
