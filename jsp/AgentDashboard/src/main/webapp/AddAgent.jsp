<%@page import="com.java.agent.Gender"%>
<%@page import="com.java.agent.Agent"%>
<%@page import="com.java.agent.AgentDAOImpl"%>
<%@page import="com.java.agent.AgentDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
<form method="get" action="AddAgent.jsp">
<center>
	
	Agent ID : 
		<input type="number" name="agentID" /> <br/><br/>
			
	Name : 
		<input type="text" name="name" /> <br/><br/>
			
	City : 
		<input type="text" name="City" /> <br/><br/>
			
	Gender : 
	<input type="text" name="gender"  /> <br/><br/>
		
	
	Marital status : 
	<input type="text" name="Marital status" /> <br/><br/>
			
	Premium : 
	<input type="number" name="premium"  /> <br/><br/>
			
	<input type="submit" value="Add Agent" />
</center>
</form>

<%
	if(request.getParameter("agentID")!=null && request.getParameter("Premium")!=null)
	{
		AgentDAO dao=new AgentDAOImpl();
		Agent agent=new Agent();
		agent.setAgentID(Integer.parseInt(request.getParameter("AgentID")));
		agent.setName(request.getParameter("name"));
		agent.setCity(request.getParameter("City"));
		agent.setGender(Gender.valueOf(request.getParameter("gender")));
		agent.setMaritalStatus(Integer.parseInt(request.getParameter("maritalStatus")));
		agent.setPremium(Double.parseDouble(request.getParameter("Premium")));
		dao.addAgentDao(agent);
		
		
		%>
		<jsp:forward page="ShowAgent.jsp"/>
		
		<% 
		
		
	}


%>





</body>
</html>