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

                <h2><h:outputText value="Restaurant Records"/></h2>

            </center>

        <h:dataTable value="#{restaurantDao.showRestaurantDao()}" var="e" border="3">

        	    <h:column>

                    <f:facet name="header">

                    	<h:outputLabel value="Restaurant ID" />

                    </f:facet>

                    <h:outputText value="#{e.restaurantID}"/>

                </h:column>

                    <h:column>

                     <f:facet name="header">

                    	<h:outputLabel value="Restaurant Name" />

                    </f:facet>

                    <h:outputText value="#{e.restaurantName}"/>

                </h:column>

                 <h:column>

                     <f:facet name="header">

                    	<h:outputLabel value="Branch" />

                    </f:facet>

                    <h:outputText value="#{e.branch}"/>

                </h:column>

                    <h:column>

                     <f:facet name="header">

                    	<h:outputLabel value="City" />

                    </f:facet>

                    <h:outputText value="#{e.city}"/>

                </h:column>

                    <h:column>

                     <f:facet name="header">

                    	<h:outputLabel value="MobileNo" />

                    </f:facet>

                    <h:outputText value="#{e.mobileNo}"/>

                </h:column>

                    <h:column>

                     <f:facet name="header">

                    	<h:outputLabel value="Email" />

                    </f:facet>

                    <h:outputText value="#{e.email}"/>

                </h:column>

                          <h:column>

                     <f:facet name="header">

                    	<h:outputLabel value="Rating" />

                    </f:facet>

                    <h:outputText value="#{e.rating}"/>

                </h:column>

                           
                

                   <h:column>

                     <f:facet name="header">

                    	<h:outputLabel value="MENU" />

                    </f:facet>
				<h:commandButton action="#{menuDao.showMenu(e.restaurantID)}" value="Show" />
                  

                </h:column>
                                

                

        </h:dataTable>

        

        </h:form>

    </body>

</html>

</f:view>