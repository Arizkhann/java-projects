<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Calculator</title>
</head>
<body>

    <form method="get" action="Calculation.jsp">
        <center>
            First number:
            <input type="number" name="firstNo" /> <br/><br/>
            Second number:
            <input type="number" name="secondNo" /> <br/><br/>
            <input type="submit" value="Calculate"/>
        </center>
    </form>

    <%
        if (request.getParameter("firstNo") != null && request.getParameter("secondNo") != null) {
            int firstNo, secondNo, result;
            firstNo = Integer.parseInt(request.getParameter("firstNo"));
            secondNo = Integer.parseInt(request.getParameter("secondNo"));
            result = firstNo + secondNo;
            out.println("Sum is " + result + "<br/>");
            result = firstNo - secondNo;
            out.println("Subtraction is " + result + "<br/>");
            result = firstNo * secondNo;
            out.println("Multiplication is " + result + "<br/>");
        }
    %>

</body>
</html>
