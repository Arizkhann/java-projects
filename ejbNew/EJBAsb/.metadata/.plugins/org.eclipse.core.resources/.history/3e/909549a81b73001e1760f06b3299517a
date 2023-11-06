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
                <h2><h:outputText value="- User Verification -"/></h2><br>
                
                
               	User Name : 
         		<h:inputText id="userName" value="#{customerAuth.userName}" /><br><br>
               	Create Password: 
         		<h:inputText id="passWord" value="#{customerAuth.passWord}" /><br><br>
         		OTP : 
         		<h:inputText id="otp" value="#{customerAuth.otp}" /><br><br>
         		
         		 <h:commandButton action="#{cDaoImpl.verifyOtp(customerAuth)}" value="Verify" />
         
               </center>
               </h:form>
               </body>
               </html>
               </f:view>
               
                
                
                
                
                
                
                
                