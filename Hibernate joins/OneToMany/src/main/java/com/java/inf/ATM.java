package com.java.inf;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		   System.out.println("Upto which: ");
	        int range = sc.nextInt();
	        
	        for(int i=1;i<=range;i++) {
	        	
	        	int a = (int) Math.pow(i, i);
	        	System.out.println(i+"-"+a);
	        }
	

	}
	
	
}
