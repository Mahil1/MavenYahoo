package com.yahoo.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.yahoo.generics.BaseTest;
import com.yahoo.pom.YahooSignupPage;

public class TESTYahooSignup extends BaseTest {
	
	@Test
	public void signup() throws IOException, InterruptedException
	{
		YahooSignupPage page=new YahooSignupPage(driver);
		page.signupMethod();
	}

}
