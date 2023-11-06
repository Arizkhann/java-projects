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


 	

    <h2>

				<h:outputText value="- Login -" />

			</h2>

        <h:form>

	<h:outputLabel value="UserName" />

<h:inputText id="userName" value="#{login.userName}"/><br/><br/>	


<h:outputLabel value="PassWord " />

<h:inputSecret  id="passWord" value="#{login.passWord}"/><br/><br/>

 

	<h:commandButton action="#{loginDao.validateMe(login)}" value="Login" />

        </h:form>



    </body>

</html>

</f:view>