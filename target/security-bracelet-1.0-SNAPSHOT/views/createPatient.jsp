<%--
  Created by IntelliJ IDEA.
  User: hey_gleb
  Date: 26/04/2019
  Time: 21:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="../assets/css/createPatient.css">
    <link rel="stylesheet" href="../assets/css/button-back.css">
    <script src="../assets/js/createPatient_script.js"></script>
    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js"></script>
</head>
<body>
<a href="/"><img class="back-button" src="../assets/images/left-arrow.svg"/></a>
<div class="main">
    <div class="main__header">
        <div class="main__header_title">
            <h1 class="main__title"> INPUT INFORMATION ABOUT PATIENT</h1>
        </div>
    </div>
    <form class="main__form" method="post">
        <label class="main__form-title"> First name *
            <input tabindex="5" class="main__form_box-input" id="firstname" type="text" required onkeyup='checkParams()'
                   name="firstName">
        </label>
        <label class="main__form-title"> Middle name
            <input tabindex="6" class="main__form_box-input" id="middlename" type="text" onkeyup='checkParams()'
                   name="middleName">
        </label>
        <label class="main__form-title"> Last name *
            <input tabindex="7" class="main__form_box-input" id="lastname" required type="text" onkeyup='checkParams()'
                   name="lastName">
        </label>
        <label class="main__form-title"> Age
            <input tabindex="8" class="main__form_box-input" id="age" type="text" onkeyup='checkParams()'
                   name="age">
        </label>
        <label class="main__form-title"> Address
            <input tabindex="9" class="main__form_box-input" id="address" type="text" onkeyup='checkParams()'
                   name="address">
        </label>
        <label class="main__form-title"> Contact Number of relatives *
            <input tabindex="10" class="main__form_box-input" id="number" type="text" required onkeyup='checkParams()'
                   name="contactNumber">
        </label>
        <label class="main__form-title"> Disease Description
            <input tabindex="11" class="main__form_box-input" id="disease" type="text" onkeyup='checkParams()'
                   name="diseaseDescription">
        </label>
        <label class="main__form-title"> First Aid Description
            <input tabindex="12" class="main__form_box-input" id="firstaid" type="text" onkeyup='checkParams()'
                   name="firstAidDescription">
        </label>
        <label class="main__form-title"> Additional Information
            <input tabindex="13" class="main__form_box-input" id="info" type="text" onkeyup='checkParams()'
                   name="additionalInformation">
        </label>
        <a class="required_title"> * - Required field</a>


        <button tabindex="10" class="main__button" type="submit" name="submit" id="submit"
               disabled>Add to patient table</button>

    </form>
</div>
</body>
</html>
