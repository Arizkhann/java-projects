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
	`  <form method="get" action="SearchAgent.jsp">

        Agent ID:

        <input type="number" name="agentId" id="agentId" />

        <input type="submit" value="Search" />

    </form>
    
       <c:if test="${param.agentId != null}">

        <sql:setDataSource var="connection"

            driver="com.mysql.cj.jdbc.Driver"

            url="jdbc:mysql://localhost:3306/exam"

            user="root"

            password="root" />

        <sql:query var="agentQuery" dataSource="${connection}">

            SELECT * FROM Agent WHERE agentID = ?

            <sql:param value="${param.agentId}"/>

        </sql:query>

 

      
            <c:forEach var="agent" items="${agentQuery.rows}">

                

                    <c:out value="${agent.agentID}" />

                    <c:out value="${agent.name}" />

                    <c:out value="${agent.city}" />

                    <c:out value="${agent.gender}" />

                    <c:out value="${agent.maritalStatus}" />

                    <c:out value="${agent.premium}" />

                

            </c:forEach>

       

    </c:if>



</body>
</html>