<%@ page import="com.company.securityBracelet.core.model.Patient" %><%--
  Created by IntelliJ IDEA.
  User: hey_gleb
  Date: 07/03/2019
  Time: 17:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Patient info</title>
</head>
<body>
<h1>Patient information</h1>
<%
    Patient patient = (Patient) request.getAttribute("patient");
    if (patient == null) {
        out.println("<p>Sorry, something went wrong on server side</p>");
    } else {
        out.println("<p>" + patient.toString() + "</p>");
    }
%>
</body>
</html>
