package com.java.ejb;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.naming.NamingException;

public class EmployEjbImpl {

	
	public List<Employ> showEmployEjb() throws ClassNotFoundException, SQLException, NamingException{
	
	EmployEjbBeanRemote remote=
						RemoteHelper.lookupRemoteStatelessEmploy();
	return remote.showEmploy();
	
	}
	
	public String updateEmployEjb(Employ editEmploy) throws ClassNotFoundException, SQLException, NamingException{
		
		EmployEjbBeanRemote remote=
							RemoteHelper.lookupRemoteStatelessEmploy();
		return remote.updateEmploy(editEmploy);
	
	}
public String addEmployEjb(Employ employ) throws ClassNotFoundException, SQLException, NamingException{
		
		EmployEjbBeanRemote remote=
							RemoteHelper.lookupRemoteStatelessEmploy();
		return remote.addEmploy(employ);
	
	}
	
	
	
	public String searchEmployEjb(int empno) throws ClassNotFoundException, SQLException, NamingException {
	
	EmployEjbBeanRemote remote=
	RemoteHelper.lookupRemoteStatelessEmploy();
	Employ employ=remote.searchEmploy(empno);
	Map<String,Object> sessionMap=
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
	sessionMap.put("editEmploy", employ);
	return"UpdateEmploy.jsp?faces-redirect=true";
}
	
	
	public String deleteEmployEjb(int empno) throws ClassNotFoundException, SQLException, NamingException {
		
		EmployEjbBeanRemote remote=
		RemoteHelper.lookupRemoteStatelessEmploy();
		String employ=remote.deleteEmploy(empno);
		Map<String,Object> sessionMap=
				FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("deleteEmploy", employ);
		return"Record Deleted";
	}
	
	
	
	
}
