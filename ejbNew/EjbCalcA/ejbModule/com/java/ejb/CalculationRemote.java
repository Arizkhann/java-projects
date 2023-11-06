package com.java.ejb;

import javax.ejb.Remote;

@Remote
public interface CalculationRemote {

	public int add(int a, int b);
	
}
