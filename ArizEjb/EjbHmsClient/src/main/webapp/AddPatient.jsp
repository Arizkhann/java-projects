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
                <h2 style="text-align: center" class="col-sm-4">Add Patient</h2>
            <hr/>

Patient Id
                    <h:inputText id="Id" value="#{patient.pid }" /> <br/>
                    
Patient Name      
 				    <h:inputText id="name" value="#{patient.name }" /> <br/>	             
Patient Age      
 				    <h:inputText id="Age" value="#{patient.age }" /> <br/>
Patient Weight      
 				    <h:inputText id="Weight" value="#{patient.weight }" /> <br/>				    
 				    
Patient gender      
 				    <h:inputText id="gender" value="#{patient.gender }" /> <br/>			    

Patient Address      
 				    <h:inputText id="Address" value="#{patient.address }" /> <br/>

 Patient PhoneNo      
 				    <h:inputText id="PhoneNo" value="#{patient.phoneno }" /> <br/>
 
 Patient Disease      
 				    <h:inputText id="disease" value="#{patient.disease }" /> <br/>
 				    
 Doctor Id     
 				    <h:inputText id="DoctorId" value="#{patient.drId }" /> <br/>				    
 				    
 				    
 				    
                    <h:commandButton value="Add Patient" 
                    	action="#{patientImpl.addPatientEjb(patient)}" />
        
        </h:form>
    </body>
</html>
</f:view>