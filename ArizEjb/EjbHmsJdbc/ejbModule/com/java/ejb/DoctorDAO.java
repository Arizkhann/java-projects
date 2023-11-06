package com.java.ejb;

import java.sql.SQLException;
import java.util.List;

public interface DoctorDAO {
	
	List<DoctorMaster> showDoctorDao() throws ClassNotFoundException, SQLException;

}
