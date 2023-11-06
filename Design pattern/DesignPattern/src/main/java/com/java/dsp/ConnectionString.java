package com.java.dsp;

public class ConnectionString {

	
	private ConnectionString() {}
	private static ConnectionString cs;
	 public static ConnectionString getInstance() {
		 if (cs==null) {
			 cs=new ConnectionString();
		 }
		 return cs;
	 }
	
	public String getCredentials(String db) {
		String result="";
		switch(db) {
		case "Mysql":
			result="root/India@123";
			break;
		case "oracle":
			result="scott/tiger";
			break;
			
			
		case "sqlserver":
			result="sa/pass123";
			break;
		}return result;
	}
	
}
