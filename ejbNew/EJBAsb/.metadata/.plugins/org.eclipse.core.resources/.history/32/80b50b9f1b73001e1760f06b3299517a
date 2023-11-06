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
                <h2><h:outputText value="- User Registration -"/></h2><br>
                
                First Name: 
         		<h:inputText id="firstName" value="#{customer.firstName}" /> &nbsp;&nbsp;
          
         		 Last Name: 
                <h:inputText id="lastName" value="#{customer.lastName}" /><br><br>
                
                Gender : <h:selectOneMenu id="gender" value="#{customer.gender}">
   			 	<f:selectItem itemValue="MALE" itemLabel="Male" />
    			<f:selectItem itemValue="FEMALE" itemLabel="Female" />
    			<f:selectItem itemValue="OTHERS" itemLabel="Others" />
				</h:selectOneMenu><br><br>
                      	
                 <h:outputLabel for="dob">DOB : </h:outputLabel>  
					<h:inputText id="dob" value="#{customer.dob}">  
						<f:convertDateTime pattern="dd/MM/yyyy"/>
				</h:inputText><br><br>
               Username : 
                <h:inputText id="userName" value="#{customer.userName}" /><br><br>
            
            	
            	Email :
            	<h:inputText id="email" value="#{customer.email}"/> <br><br>
            	
            	
         <h:commandButton action="CustomerShow" value="All Customer" /> &nbsp;
         <h:commandButton action="#{cDaoImpl.addCustomer(customer)}" value="Register" />
		
                   
            </center>
        </h:form>
       
    </body>
</html>
</f:view>
