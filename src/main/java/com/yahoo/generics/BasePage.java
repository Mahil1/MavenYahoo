package com.yahoo.generics;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	
	
	public void selectbyvisibletext(WebElement element,String text)
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(text);	
	}
	
	public void selectbyvalue(WebElement element,String value)
	{
		Select sel=new Select(element);
		sel.selectByValue(value);
	}
	
	public void selectbyindex(WebElement element,int index)
	{
		Select sel=new Select(element);
		sel.selectByIndex(index);		
	}

}
