package com.java.ejb;

//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
import java.util.List;
//import java.util.ArrayList;

import javax.naming.NamingException;

//import org.hibernate.SessionFactory;

public class EjbImpl {

	public List<Doctor> showDoctorDao() throws NamingException {
		HmsBeanRemote remote = RemoteHelper.lookupRemoteStatelessHms();
		return remote.showDoctor();
	}

}
