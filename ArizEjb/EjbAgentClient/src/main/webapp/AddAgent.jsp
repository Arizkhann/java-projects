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
                <h2 style="text-align: center" class="col-sm-4">Add Agent</h2>
            <hr/>

Agent Name
                    <h:inputText id="name" value="#{agent.name}" /> <br/>
                    
City 
                    <h:inputText id="city" value="#{agent.city}" /> <br/>
                    
Gender 
                    <h:inputText id="gender" value="#{agent.gender}" /> <br/>                    

MaritalStatus
                    <h:inputText id="maritalstatus" value="#{agent.maritalStatus}" /> <br/>
Premium
                    <h:inputText id="premium" value="#{agent.premium}"/> <br/>
                    <h:commandButton value="Add Agent" 
                    	action="#{ejbImpl.addAgentEjb(agent)}" />
        
        </h:form>
    </body>
</html>
</f:view>