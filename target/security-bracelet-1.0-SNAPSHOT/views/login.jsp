<%--
  Created by IntelliJ IDEA.
  User: hey_gleb
  Date: 26/04/2019
  Time: 02:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Log in</title>
    <link rel="stylesheet" href="../assets/css/login.css">
    <link rel="stylesheet" href="../assets/css/button-back.css">
    <script src="../assets/js/login_script.js"></script>
    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js"></script>
</head>
<body>
<a href="/"><img class="back-button" src="../assets/images/left-arrow.svg"/></a>
<div class="main">
    <div class="main__header">
        <div class="main__header_title">
            <h1 class="main__title">LOG IN</h1>
        </div>
    </div>
    <form class="main__form" method="post">
        <label class="main__form-title"> Input your login(e-mail)
            <input tabindex="1" class="main__form_box-input" id="email" type="email" onkeyup='checkParams()'
                   name="email">
        </label>
        <label class="main__form-title">Password
            <input tabindex="2" class="main__form_box-input" id="password" type="password" onkeyup='checkParams()'
                   name="password">
        </label>

        <button tabindex="3" class="main__button" type="submit" name="submit" id="submit" disabled><a
                style="text-decoration: none" href="/create">Log
            in</a>
        </button>
        <div class="signup_block">
            <p class="signup_invintation">Don't have an account?</p>
            <a class="signup_link" href="/signup">Sign up</a>
        </div>
    </form>
</div>
</body>
</html>
