package com.java.jsf;

import java.util.Date;

public class Greeting {
	
	public String Company() {
		return"company is infinite";
	}
	
	
	public String saluation() {
		Date obj=new Date();
		int hr=obj.getHours();
		if(hr<=12) {
			return "good morning";
		}else if(hr>12 && hr<16) {
			return "good Afternoon";
		}else {
			return "good evening";
		}
	}
	
}
