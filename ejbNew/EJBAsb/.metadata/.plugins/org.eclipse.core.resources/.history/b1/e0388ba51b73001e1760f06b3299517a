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
                <h2><h:outputText value="Insurance Details"/></h2>
           
        <h:dataTable value="#{iDaoImpl.showInsurance()}" var="i" border="3">
              	    <h:column>
                    <f:facet name="header">
                    	<h:outputLabel value="Inurance Id" />
                    </f:facet>
                    <h:outputText value="#{i.insuranceId}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="Insurance Name" />
                    </f:facet>
                    <h:outputText value="#{i.insuranceName}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="Insurance Type" />
                    </f:facet>
                    <h:outputText value="#{i.insuranceType}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="Premium Start" />
                    </f:facet>
                    <h:outputText value="#{i.premiumStart}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="Premium End" />
                    </f:facet>
                    <h:outputText value="#{i.premiumEnd}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="Min Period" />
                    </f:facet>
                    <h:outputText value="#{i.minPeriod}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="Min Period" />
                    </f:facet>
                    <h:outputText value="#{i.maxPeriod}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value=" Launch Date" />
                    </f:facet>
                    <h:outputText value="#{i.launchDate}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value=" Status" />
                    </f:facet>
                    <h:outputText value="#{i.status}"/>
                </h:column>
                  
        </h:dataTable><br><br>
        <h:commandButton action="CustomerShow" value="Customer Details" />  &nbsp;&nbsp;
        <h:commandButton action="CustomerAdd" value="Add Customer " />
         </center>
        </h:form>
    </body>
</html>
</f:view>
