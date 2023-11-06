package com.java.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class Calculation
 */
@Stateless
@Remote(CalculationRemote.class)
public class Calculation implements CalculationRemote {

    /**
     * Default constructor. 
     */
    public Calculation() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

}
