package com.java.ejb;

import java.util.List;

import javax.naming.NamingException;

public class EjbImpl {

	public List<Employ> showEmploy() throws NamingException{
	EmployBeanRemote remote=RemoteHelper.lookupRemoteStatelessHms();
	return remote.showEmployDao();
	
}
public String addEmploy(Employ employ) throws NamingException {
	EmployBeanRemote remote=RemoteHelper.lookupRemoteStatelessHms();
	return remote.addEmployDao(employ);
	
	
	
	
}




}
