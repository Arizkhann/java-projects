package com.java.jsf;

import java.util.ArrayList;
import java.util.List;

public class EmployDAO {
	
	
	public List<String> getNames(){
		
		List<String> names=new ArrayList<String>();
		names.add("Rahul");
		names.add("Amit");
		names.add("Ansal");
		names.add("Subudhi");
		names.add("Satya");
		return names;
	}
	
	
	
	

	public List<Employ> showEmploy(){
		
		List<Employ> employList=new ArrayList<>();
		employList.add(new Employ(1,"Gaurav","java","Developer",84245.3));
		employList.add(new Employ(2,"ARiz","sql","boss",82225.33));
		employList.add(new Employ(3,"amit","dotnet","ceo",8222522.33));
		employList.add(new Employ(4,"subudi","html","trainer",12335.33));
		employList.add(new Employ(5,"anirudh","jsf","pppp",23125.33));
		
		return employList;
	}
	
	
}
