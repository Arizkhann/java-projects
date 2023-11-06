<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%> 
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%> 
<html>
<f:view>
<body>
    <h:form>
    Please Enter Numbers: <br/>
    First Number
    <h:inputText id="num1" value="#{calculation.firstNo}" /><br>
    
    Second Number
    <h:inputText id="num2" value="#{calculation.secondNo}" /><br>
  
    Result is :
     <h:outputText  value="#{calculation.result}" /><br>
    
    <h:commandButton actionListener="#{calculation.addition}" value="sum" />
    
    <h:commandButton actionListener="#{calculation.sub}" value="sub" /><br>
    
     <h:commandButton actionListener="#{calculation.mul}" value="mul" /><br>
     
     <h:commandButton actionListener="#{calculation.divee}" value="div" /><br>
    
    </h:form>
        

    </body>

</f:view>
</html>