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
                <h2><h:outputText value="Patient reports"/></h2>
           
        <h:dataTable value="#{eImpl.showpatientReport()}" var="i" border="3">
              	    <h:column>
                    <f:facet name="header">
                    	<h:outputLabel value="Report Id" />
                    </f:facet>
                    <h:outputText value="#{i.reportId}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="Patient Id" />
                    </f:facet>
                    <h:outputText value="#{i.patientId}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="TestCode" />
                    </f:facet>
                    <h:outputText value="#{i.testCode}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="Test Name" />
                    </f:facet>
                    <h:outputText value="#{i.testName}"/>
                </h:column>
                    
                    <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="Test Description" />
                    </f:facet>
                    <h:outputText value="#{i.testDescription}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="Cost" />
                    </f:facet>
                    <h:outputText value="#{i.cost}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value=" comments" />
                    </f:facet>
                    <h:outputText value="#{i.comments}"/>
                </h:column>
                   </h:dataTable>
         </center>
        </h:form>
    </body>
</html>
</f:view>
