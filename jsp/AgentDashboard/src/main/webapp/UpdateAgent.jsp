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

	<%
	int agentID = Integer.parseInt(request.getParameter("agentID"));
	AgentDAO dao = new AgentDAOImpl();
	Agent agent = dao.searchAgentDao(agentID);
%>

	<form method="get" action="UpdateAgent.jsp">
	<center>
	Agent ID : 
		<input type="number" name="agentID" readonly="readonly" 
			value=<%=agent.getAgentID() %> /> <br/><br/>
	Name : 
		<input type="text" name="name" 
			value=<%=agent.getName() %> /> <br/><br/>
	City : 
		<input type="text" name="City" 
			value=<%=agent.getCity() %> /> <br/><br/> 
	Gender : 
	<input type="text" name="gender" 
		value=<%=agent.getGender() %> /> <br/><br/>
	
	Marital status : 
	<input type="text" name="MaritalStatus" 
			value=<%=agent.getMaritalStatus() %> /> <br/><br/>
	Premium : 
	<input type="number" name="premium" 
			value=<%=agent.getPremium() %> /> <br/><br/>
	<input type="submit" value="Update Agent" />
	</center>
</form>
<%
	if(request.getParameter("agentID")!=null &&
	request.getParameter("Premium")!=null){
		Agent agentUpdated=new Agent();
		
		agentUpdated.setAgentID(Integer.parseInt(request.getParameter("agentID")));
		agentUpdated.setName(request.getParameter("Name"));
		agentUpdated.setCity(request.getParameter("City"));
		agentUpdated.setGender(Gender.valueOf(request.getParameter("gender").toLowerCase()));
		
		agentUpdated.setMaritalStatus(Integer.parseInt(request.getParameter("maritalStatus")));
		agentUpdated.setPremium(Double.parseDouble(request.getParameter("Premium")));
		dao.updateAgentDao(agentUpdated);
		%>
		<jsp:forward page="ShowAgent.jsp"/>
		<%
		
		
	}

%>


</body>
</html>