<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>  
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form method="get" action="AddAgent.jsp">
		<center>
			AgentID : 
			<input type="number" name="agentID" /> <br/><br/>
			Name : 
			<input type="text" name="name" /> <br/><br/> 
			City : 
			<input type="text" name="city" /> <br/><br/>
			Gender :
			<select name="gender">
				<option value="male">Male</option>
				<option value="female">Female</option>
			</select> <br/><br/> 
			
			Marital Status : 
			<input type="text" name="maritalStatus" /> <br/><br/> 
			Premium : 
			<input type="number" name="premium" /> <br/><br/> 
			<input type="submit" value="Add Employ" />
		</center>
	</form>

<c:if test="${param.agentID != null && param.premium != null}">

    <sql:setDataSource var="connection"

        driver="com.mysql.cj.jdbc.Driver"

        url="jdbc:mysql://localhost:3306/exam"

        user="root"

        password="root" />

    <sql:update var="agentUpdate" dataSource="${connection}">

        INSERT INTO Agent(agentID, name, city, gender, maritalStatus, premium) VALUES (?, ?, ?, ?, ?, ?)

        <sql:param value="${param.agentID}" />

        <sql:param value="${param.name}" />

        <sql:param value="${param.city}" />

        <sql:param value="${param.gender}" />

        <sql:param value="${param.maritalStatus}" />

        <sql:param value="${param.premium}" />

    </sql:update>

    <c:out value="Agent Record Inserted..." />

</c:if>



</body>
</html>