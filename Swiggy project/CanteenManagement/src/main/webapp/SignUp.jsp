<%@page contentType="text/html"%>

<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>

<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>

 

<!DOCTYPE html>

<html lang="en">

<head>

    <meta charset="UTF-8">

    <title>Customer SignUp</title>

</head>

<body>

    <h1>Customer SignUp</h1>

    <f:view>

        <h:form>


            <h:outputLabel for="cusName" value="Name:"/>

            <h:inputText id="cusName" value="#{customer.cusName}"/><br/><br/>

 

            <h:outputLabel for="cusPhnNo" value="Phone Number:" />

            <h:inputText id="cusPhnNo" value="#{customer.cusPhoneNo}"/><br/><br/>

 

            <h:outputLabel for="cusUserName" value="Username:" />

            <h:inputText id="cusUserName" value="#{customer.cusUserName}"/><br/><br/>

 

            <h:outputLabel for="cusPassword" value="Password:" />

            <h:inputSecret id="cusPassword" value="#{customer.cusPassword}"/><br/><br/>

 

            <h:outputLabel for="cusEmail" value="Email:" />

            <h:inputText id="cusEmail" value="#{customer.cusEmail}"/><br/><br/>

 

            <h:commandButton value="Sign Up" action="#{customerDao.signUpDao(customer)}" /><br/><br/>
        </h:form>

    </f:view>

</body>

</html>