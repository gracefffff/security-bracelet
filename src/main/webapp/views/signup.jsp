<%--
  Created by IntelliJ IDEA.
  User: hey_gleb
  Date: 26/04/2019
  Time: 02:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sign up</title>
    <link rel="stylesheet" href="assets/css/signup.css">
    <link rel="stylesheet" href="../assets/css/button-back.css">
    <script src="assets/js/signup_script.js"></script>
    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js"></script>
</head>
<body>
<a href="/"><img class="back-button" src="../assets/images/left-arrow.svg"/></a>
<div class="main">
    <div class="main__header">
        <div class="main__header_title">
            <h1 class="main__title">SIGN UP</h1>
        </div>
    </div>
    <form class="main__form" method="post">
        <label class="main__form-title"> First name
            <input tabindex="1" class="main__form_box-input" type="text" id="username" name="firstName"  onkeyup='checkParams()'  placeholder="First name">
        </label>
        <label class="main__form-title"> Second name
            <input tabindex="2" class="main__form_box-input" type="text" id="surname" name="lastName"  onkeyup='checkParams()' placeholder="Last name">
        </label>
        <label class="main__form-title"> Pasport ID
            <input tabindex="2" class="main__form_box-input" type="text" id="pasport" name="passportId"  onkeyup='checkParams()' placeholder="xxxx xxxxxxx">
        </label>
        <label class="main__form-title"> Gender
            <label class="main__form-gender">
                <label>
                    <input tabindex="3" type="radio" id ="gender" onclick='checkParams()' name="gender"> Female
                </label>
                <label class="main__form_gender-box">
                    <input tabindex="4" type="radio" id = "gender1"  onclick='checkParams()' name="gender"> Male
                </label>
            </label>
        </label>
        <label class="main__form-title"> Input your e-mail
            <input tabindex="5" class="main__form_box-input" id="email" type="email" name="email"  onkeyup='checkParams()' name="user-email"
                   placeholder="email@example.com">
        </label>
        <label class="main__form-title">Password
            <input tabindex="6" class="main__form_box-input" id ="password" type="password" name="password" onkeyup='checkParams()' name="user-password" placeholder="Password">
        </label>
        <label class="main__form_text-accept">
            <input tabindex="7" class="main__form_box-accept" type="checkbox" id ="check" name="terms"  onclick='checkParams()' >
            <div class="main__form_text-accept-style">
                I agree to the assessment, use and processing of my personal data.
            </div>
        </label>
        <button tabindex="10" class ="main__button" type="submit" name="submit" id="submit" disabled>Sign Up</button>

    </form>
</div>
</body>
</html>
