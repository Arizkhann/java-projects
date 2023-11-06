<%@ page contentType="text/html" %>
<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core" %>
<f:view>
    <html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h:form>
            <center>
                <h2><h:outputText value="Patient Records" /></h2>
            </center>
            <h:dataTable value="#{patientDao.showPatientDao()}" var="e" border="3">
                <h:column>
                    <f:facet name="header">
                        <h:outputLabel value="Patient id" />
                    </f:facet>
                    <h:outputText value="#{e.pid}" />
                </h:column>
                
                <h:column>
                    <f:facet name="header">
                        <h:outputLabel value="Patient Name" />
                    </f:facet>
                    <h:outputText value="#{e.name}" />
                </h:column>
                
                <h:column>
                    <f:facet name="header">
                        <h:outputLabel value="Age" />
                    </f:facet>
                    <h:outputText value="#{e.age}" />
                </h:column>
                
                 <h:column>
                    <f:facet name="header">
                        <h:outputLabel value="Weight" />
                    </f:facet>
                    <h:outputText value="#{e.weight}" />
                </h:column>
                 <h:column>
                    <f:facet name="header">
                        <h:outputLabel value="Gender" />
                    </f:facet>
                    <h:outputText value="#{e.gender}" />
                </h:column>
                 <h:column>
                    <f:facet name="header">
                        <h:outputLabel value="Address" />
                    </f:facet>
                    <h:outputText value="#{e.address}" />
                </h:column>
                 <h:column>
                    <f:facet name="header">
                        <h:outputLabel value="Phone No" />
                    </f:facet>
                    <h:outputText value="#{e.phoneno}" />
                </h:column>
                
                 <h:column>
                    <f:facet name="header">
                        <h:outputLabel value="Disease" />
                    </f:facet>
                    <h:outputText value="#{e.disease}" />
                </h:column>
                
                 <h:column>
                    <f:facet name="header">
                        <h:outputLabel value="Doctor Id" />
                    </f:facet>
                    <h:outputText value="#{e.doctorid}" />
                </h:column>
                
                
            </h:dataTable>
            <center>
            <h:commandButton action="PatientAdd" value="PatientAdd" />
            </center>
        </h:form>
    </body>
    </html>
</f:view>
