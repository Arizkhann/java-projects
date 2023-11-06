package com.java.hib;

import java.util.List;

public interface EmployDAO {

	List<Employ> showEmployDAO();
	Employ searchEmployDAO(int empno);
	String addEmployDAO(Employ employ);
	String deleteEmployDAO(int empno);
}
