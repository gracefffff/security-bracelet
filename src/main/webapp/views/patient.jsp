<%@ page import="school.project.securitybracelet.core.model.Patient" %><%--
  Created by IntelliJ IDEA.
  User: hey_gleb
  Date: 07/03/2019
  Time: 17:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="../assets/css/patient.css">
    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js"></script>
</head>
<body>
<div class="main">
    <div class="main__header">
        <div class="main__header_title">
            <h1 class="main__title"> INFORMATION ABOUT THE PATIENT</h1>
        </div>
    </div>

    <%
        Patient patient = (Patient) request.getAttribute("patient");

        if (patient != null) {
            out.println("<ul class=\"main__list\">\n" +
                    "\n" +
                    "        <li class=\"list__item\">\n" +
                    "            <h1 class=\"item__tittle\">First Name </h1>\n" +
                    "            <div class=\"item\">" + patient.getFirstName() + "</div>\n" +
                    "\n" +
                    "        </li>\n" +
                    "        <li class=\"list__item\">\n" +
                    "            <h1 class=\"item__tittle\"> Middle Name </h1>\n" +
                    "            <div class=\"item\">" + patient.getMiddleName() + "</div>\n" +
                    "        </li>\n" +
                    "        <li class=\"list__item\">\n" +
                    "            <h1 class=\"item__tittle\">Last Name </h1>\n" +
                    "            <div class=\"item\">" + patient.getLastName() + "</div>\n" +
                    "        </li>\n" +
                    "        <li class=\"list__item\">\n" +
                    "            <h1 class=\"item__tittle\">Age</h1>\n" +
                    "            <div class=\"item\">" + patient.getAge() + "</div>\n" +
                    "        </li>\n" +
                    "        <li class=\"list__item\">\n" +
                    "            <h1 class=\"item__tittle\">Address</h1>\n" +
                    "            <div class=\"item\">" + patient.getAddress() + "</div>\n" +
                    "        </li>\n" +
                    "        <li class=\"list__item\">\n" +
                    "            <h1 class=\"item__tittle\">Contact Number of relatives</h1>\n" +
                    "            <div class=\"item\">" + patient.getContactNumber() + "</div>\n" +
                    "        </li>\n" +
                    "        <li class=\"list__item\">\n" +
                    "            <h1 class=\"item__tittle\">Disease Description</h1>\n" +
                    "            <div class=\"item\">" + patient.getDiseaseDescription() + "</div>\n" +
                    "        </li>\n" +
                    "        <li class=\"list__item\">\n" +
                    "            <h1 class=\"item__tittle\">First Aid Description</h1>\n" +
                    "            <div class=\"item\">" + patient.getFirstAidDescription() + "</div>\n" +
                    "        </li>\n" +
                    "        <li class=\"list__item\">\n" +
                    "            <h1 class=\"item__tittle\">Additional Information </h1>\n" +
                    "            <div class=\"item\">" + patient.getAdditionalInformation() + "</div>\n" +
                    "        </li>\n" +
                    "\n" +
                    "\n" +
                    "    </ul>");
        }
    %>

    <%--<ul class="main__list">--%>

    <%--<li class="list__item">--%>
    <%--<h1 class="item__tittle">First Name </h1>--%>
    <%--<div class="item">--%>

    <%--</div>--%>

    <%--</li>--%>
    <%--<li class="list__item">--%>
    <%--<h1 class="item__tittle"> Middle Name </h1>--%>
    <%--<div class="item">--%>

    <%--</div>--%>
    <%--</li>--%>
    <%--<li class="list__item">--%>
    <%--<h1 class="item__tittle">Last Name </h1>--%>
    <%--<div class="item">--%>

    <%--</div>--%>
    <%--</li>--%>
    <%--<li class="list__item">--%>
    <%--<h1 class="item__tittle">Age</h1>--%>
    <%--<div class="item">--%>
    <%--</div>--%>
    <%--</li>--%>
    <%--<li class="list__item">--%>
    <%--<h1 class="item__tittle">Address</h1>--%>
    <%--<div class="item">--%>
    <%--</div>--%>
    <%--</li>--%>
    <%--<li class="list__item">--%>
    <%--<h1 class="item__tittle">Contact Number of relatives</h1>--%>
    <%--<div class="item">--%>
    <%--</div>--%>
    <%--</li>--%>
    <%--<li class="list__item">--%>
    <%--<h1 class="item__tittle">Disease Description</h1>--%>
    <%--<div class="item">--%>
    <%--</div>--%>
    <%--</li>--%>
    <%--<li class="list__item">--%>
    <%--<h1 class="item__tittle">First Aid Description</h1>--%>
    <%--<div class="item">--%>
    <%--</div>--%>
    <%--</li>--%>
    <%--<li class="list__item">--%>
    <%--<h1 class="item__tittle">Additional Information </h1>--%>
    <%--<div class="item">--%>
    <%--</div>--%>
    <%--</li>--%>


    <%--</ul>--%>
</div>
</body>
</html>

