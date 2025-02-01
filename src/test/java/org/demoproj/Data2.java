package org.demoproj;

import org.testng.annotations.DataProvider;

public class Data2 {

	
	
	@DataProvider(name="username&password")
	private Object Datas(){
		
		Object[][] obj = {{"sasi","java"},{"kumar","python"},{"wiki","selenium"},{"junit","testng"}};
		return obj;
		
	}
	

	@DataProvider(name="username&password2")
	private Object Datas1(){
		
		Object[][] obj = {{"sasi@gmail.com","736844"},{"kumar@tcs.com","84785"},{"wiki@admin.com","74674"},{"junit","7365784"}};
		return obj;
		
	}
	
}
