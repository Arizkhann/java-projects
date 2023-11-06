<%@page contentType="text/html"%>

<%@page pageEncoding="UTF-8"%>

 

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>

<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

 

<f:view>

<html>

    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>JSP Page</title>

    </head>

<body>

     <h:form>

	 <center>

            <h2><h:outputText value="Employ Records"/></h2>

            </center>

        	<center>

		Customer Id :

        	<h:outputText value="#{sessionCustomer.cusID}" />

        	<br/>

        	Customer Name :

        	<h:outputText value="#{sessionCustomer.cusName}" />

        	<br/>

        	Phone No :

        	<h:outputText value="#{sessionCustomer.cusPhoneNo}" />

        	<br/>

        	Username :

        	<h:outputText value="#{sessionCustomer.cusUserName}" />

        	<br/>

        	Email :

        	<h:outputText value="#{sessionCustomer.cusEmail}" />

        	</center>

	</h:form>
</body>
</html>

</f:view>