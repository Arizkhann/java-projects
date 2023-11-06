package com.java.jsf;

import javax.ejb.Remote;

@Remote
public interface TestCalcRemote {

	
	int sum(int x,int y);
	int sub(int x,int y);
	int mult(int x,int y);
	
	
}
