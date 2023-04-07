<!-- The form tag will allow you to grab the information
from the form and send it to the controller -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- Allows you to use c tags, tags that do things like if statements and loops -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- Allows for java stuff on the page -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>TWD: Sign Up</title>
    <link rel="stylesheet" href="/css/signUp.css">
    <link rel="stylesheet" href="/css/flex.css">
    <link rel="stylesheet" href="/css/main.css">
</head>
<body class="flex-col">
    <div class="header flex-row">
        <a href="/sign-up" class="header-link">Sign Up</a>
        <a href="/" class="header-link">Home</a>
        <a href="/sign-in" class="header-link">Sign In</a>
    </div>

    <div class="main-content flex-row">
        <div class="signup-box flex-col">
            <h1 class="text-color">Sign Up</h1>
        
            <form:form modelAttribute="user" action="sign-up" method="post">
                <div class="flex-col">
                    <div class="flex-row justify-content text-input-margin">
                        
                    <div class="text-color email">Email: </div> <form:input path="email" type="text" class="text-input email-text-input"/>
                    </div>
                    <div class="flex-row justify-content text-input-margin">
                        
                        <div class="text-color password">Password: </div> <form:input path="password" type="password" class="text-input"/>
                    </div>
                    <div class="flex-row justify-content text-input-margin">
                        
                        <div class="text-color">First Name: </div> <form:input path="firstName" type="text" class="text-input"/>
                    </div>
                    <div class="flex-row justify-content text-input-margin">
                        
                        <div class="text-color">Last Name: </div> <form:input path="lastName" type="text" class="text-input"/>
                    </div>
                    <div class="button-center flex-col">
                        <form:button type="submit" class="button">Submit</form:button>
                    </div>
                </div>
            </form:form>

        </div>
    </div>


</body>
</html>