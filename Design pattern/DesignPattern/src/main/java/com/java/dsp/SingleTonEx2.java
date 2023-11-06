package com.java.dsp;

public class SingleTonEx2 {

	
	private static ConnectionString cs;
	static {
		cs=ConnectionString.getInstance();
	}
	
	
	public static void main(String[] args) {
		System.out.println(cs.getCredentials("Mysql"));
		System.out.println(cs.getCredentials("oracle"));
		System.out.println(cs.getCredentials("sqlserver"));
	}
	
	
	
}
