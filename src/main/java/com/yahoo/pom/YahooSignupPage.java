package com.yahoo.pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.yahoo.generics.AutoConstant;
import com.yahoo.generics.BasePage;
import com.yahoo.generics.ExcelLibrary;

public class YahooSignupPage extends BasePage  implements AutoConstant{
	
	//declaration
	@FindBy(xpath="//input[contains(@placeholder,'First')]")
	private WebElement firstnameTextfield;
	
	@FindBy(xpath="//input[@placeholder='Surname']")
	private WebElement lastnameTextfield;
	
	@FindBy(xpath="//input[contains(@placeholder,'Email')]")
	private WebElement emailaddressTextfield;
	
	@FindBy(xpath="//input[@name='password']")
    private WebElement passwordTextfield;
	
	@FindBy(xpath="//select[@type='select']")
	private WebElement countrycodeDropdownlist; 
	
	@FindBy(xpath="//input[contains(@aria-label,'Mobile phone')]")
	private WebElement mobilenoTextfield;
	
	@FindBy(xpath="//select[@name='mm']")
	private WebElement birthmonthDropdownlist;
	
	@FindBy(xpath="//input[@placeholder='Day']")
	private WebElement dayTextfield;
	
	@FindBy(xpath="//input[@placeholder='Year']")
	private WebElement yearTextfield;
	
	@FindBy(xpath="//input[@name='freeformGender']")
	private WebElement genderTextfield;
	
	//initialization
	public YahooSignupPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//utilization
	public void signupMethod() throws IOException, InterruptedException
	{
	firstnameTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path,sheet_name,5,2));
	lastnameTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path,sheet_name,5,3));
	emailaddressTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path,sheet_name,5,4));
	passwordTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path,sheet_name,5,5));
	Thread.sleep(5000);
	selectbyvisibletext(countrycodeDropdownlist,"Iran ‪(+98)‬");
	mobilenoTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path,sheet_name,5,6));
	Thread.sleep(5000);
	selectbyvisibletext(birthmonthDropdownlist,"June");
	dayTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path,sheet_name,5,7));
	yearTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path,sheet_name,5,8));
	genderTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path,sheet_name,5,9));
	}
	}
