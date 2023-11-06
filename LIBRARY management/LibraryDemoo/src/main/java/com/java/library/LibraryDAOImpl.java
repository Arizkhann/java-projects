package com.java.library;

 

 

//import java.awt.print.Book;
import java.sql.Connection;

 

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

 

 

 

public  class LibraryDAOImpl implements LibraryDAO{

 

	

 

	Connection connection;

 

	PreparedStatement pst;

 

	

 

	public boolean checkPassword(String pwd, String retype) {

 

		if(pwd.equals(retype)) {

 

			return true;

 

		}

 

		return false;

 

	}

 

 

	@Override

 

	public String createUser(LibUsers libUsers) throws ClassNotFoundException, SQLException {

 

		connection = ConnectionHelper.getConnection();

 

		String encPwd = EncryptPassword.getCode(libUsers.getPassword());

 

		String cmd = "Insert into LibUsers(UserName, Password) values (?,?)";

 

		pst = connection.prepareStatement(cmd);

 

		pst.setString(1, libUsers.getUserName());

 

		pst.setString(2, encPwd);

 

	    pst.executeUpdate();

 

	    return "User account Created";

 

	}





	@Override
	public int authenticate(LibUsers libUsers) throws SQLException, ClassNotFoundException {
		
		connection = ConnectionHelper.getConnection();
		String encr = EncryptPassword.getCode(libUsers.getPassword());
		String cmd="select count(*) cnt from LibUsers "
				+ "where userName=? and password=?";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, libUsers.getUserName());
		pst.setString(2,encr.trim());
		ResultSet rs=pst.executeQuery();
		rs.next();
		int count=rs.getInt("cnt");
		return count;
			
	}





	@Override
	public List<Books> searchBooks(String searchType, String searchValue) throws ClassNotFoundException, SQLException {
		
		String sql;
		boolean isValid=true;
		if(searchType.equals("id")) {
			
			sql="select * from Books where id=?";
		}else if(searchType.equals("bookname")) {
			sql="select * from Books where Name=?";
		}else if(searchType.equals("authorname")) {
			sql="select * from Books where Author=?";
		}else if(searchType.equals("dept")) {
			sql="select * from Books where Dept=?";
		}else {
			isValid=false;
			sql="select * from books";
		}
		connection = ConnectionHelper.getConnection();
		pst = connection.prepareStatement(sql);
		if(isValid==true) {
			pst.setString(1, searchValue);
			
		}
		ResultSet rs=pst.executeQuery();
		Books book=null;
		List<Books>bookList=new ArrayList<Books>();
		while(rs.next()) {
			book=new Books();
			book.setId(rs.getInt("id"));
			book.setName(rs.getString("name"));
			book.setAuthor(rs.getString("author"));
			book.setEdition(rs.getString("edition"));
			book.setDept(rs.getString("dept"));
			book.setNoOfBooks(rs.getInt("totalBooks"));
			bookList.add(book);
			
		}
		
		return bookList;
	}

 



 

}