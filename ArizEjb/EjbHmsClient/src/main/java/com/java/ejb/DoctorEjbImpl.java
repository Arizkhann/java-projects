package com.java.ejb;

import java.sql.SQLException;
import java.util.List;

import javax.naming.NamingException;

public class DoctorEjbImpl {

	
	
	public List<DoctorMaster> showDoctorEjb() throws ClassNotFoundException, SQLException, NamingException{
		
		HmsEjbBeanRemote remote=
							RemoteHelper.lookupRemoteStatelessEmploy();
		return remote.showDoctor();
		
		}
	
}
