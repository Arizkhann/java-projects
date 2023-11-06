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

                <h2><h:outputText value=" Menu Lists"/></h2>

            </center>

         <h:dataTable value="#{menuList}" var="e" border="3"> 

        	    <h:column>

                    <f:facet name="header">

                    	<h:outputLabel value="Men ID" />

                    </f:facet>

                    <h:outputText value="#{e.menId}"/>

                </h:column>

                    <h:column>

                     <f:facet name="header">

                    	<h:outputLabel value="Men Item" />

                    </f:facet>

                    <h:outputText value="#{e.menItem}"/>

                </h:column>

                 <h:column>

                     <f:facet name="header">

                    	<h:outputLabel value="Men Price" />

                    </f:facet>

                    <h:outputText value="#{e.menPrice}"/>

                </h:column>

                    <h:column>

                     <f:facet name="header">

                    	<h:outputLabel value="Restaurant ID" />

                    </f:facet>

                    <h:outputText value="#{e.restaurantID}"/>

                </h:column>

                    <h:column>

                     <f:facet name="header">

                    	<h:outputLabel value="Men calories" />

                    </f:facet>

                    <h:outputText value="#{e.menCalories}"/>

                </h:column>

                    <h:column>

                     <f:facet name="header">

                    	<h:outputLabel value="Men Speciality" />

                    </f:facet>

                    <h:outputText value="#{e.menSpeciality}"/>

                </h:column>
                           
                

               
                                

                

        </h:dataTable>

        

        </h:form>

    </body>

</html>

</f:view>