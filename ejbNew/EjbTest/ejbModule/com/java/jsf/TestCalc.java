package com.java.jsf;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class TestCalc
 */
@Stateless
@Remote(TestCalcRemote.class)

public class TestCalc implements TestCalcRemote {

    /**
     * Default constructor. 
     */
    public TestCalc() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public int sum(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}

	@Override
	public int sub(int x, int y) {
		// TODO Auto-generated method stub
		return x-y;
	}

	@Override
	public int mult(int x, int y) {
		// TODO Auto-generated method stub
		return x*y;
	}

}
