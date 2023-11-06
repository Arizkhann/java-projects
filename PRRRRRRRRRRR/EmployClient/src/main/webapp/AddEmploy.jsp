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
                <h2><h:outputText value="- Add employ -"/></h2><br>
                
                Employ no: 
         		<h:inputText id="employ" value="#{employ.empno}" /><br><br> &nbsp;&nbsp;
          
         		  Name: 
                <h:inputText id="name" value="#{employ.name}" /><br><br>&nbsp;&nbsp;
                
                Gender : <h:selectOneMenu id="gender" value="#{employ.gender}">
   			 	<f:selectItem itemValue="male" itemLabel="male" />
    			<f:selectItem itemValue="female" itemLabel="female" />
				</h:selectOneMenu><br><br>&nbsp;&nbsp;
                      	
                 
              Department : 
                <h:inputText id="Department" value="#{employ.dept}" /><br><br>
            
            Designaton : 
                <h:inputText id="designation" value="#{employ.desig}" /><br><br>
            	
            	Basic :
            	<h:inputText id="basic" value="#{employ.basic}"/> <br><br>
            	
            	
         
         <h:commandButton action="#{eImpl.addEmploy(employ)}" value="ADD" />
		
                   
            </center>
        </h:form>
       
    </body>
</html>
</f:view>
