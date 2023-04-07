<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>OPT: Create a Reservation</title>
    <link rel="stylesheet" href="/css/signUp.css">
    <link rel="stylesheet" href="/css/flex.css">
    <link rel="stylesheet" href="/css/main.css">
</head>
<body class="flex-col">
    <c:choose>
        <c:when test="${user != null}">
            <div class="header flex-row">
                <div class="header-link">Hello ${user.getName()}</div>
                <a href="/" class="header-link">Home</a>
                <a href="/logout" class="header-link">Log Out</a>
            </div>
        </c:when>
        <c:otherwise>
            <div class="header flex-row">
                <a href="/sign-up" class="header-link">Sign Up</a>
                <a href="/" class="header-link">Home</a>
                <a href="/sign-in" class="header-link">Sign In</a>
            </div>
        </c:otherwise>
    </c:choose>
    <div class="main-content flex-row">
        <div class="signup-box flex-col">
            <h1>Update Place</h1>

            <form:form modelAttribute="reservation" action="" method="post">
                <div class="flex-col">
                    <div class="flex-row justify-content text-input-margin">

                    <div>Number of People: </div> <form:input path="numberOfPeople" type="number" class="text-input"/>
                    </div>

                    <div class="flex-row justify-content text-input-margin">

                        <div>Round Trip? </div> <form:checkbox path="roundtrip" class="text-input"/>
                    </div>
                    
                    <div class="flex-row justify-content text-input-margin">

                        <div>Start of Trip: </div> <form:input path="startOfTrip" type="date" class="text-input"/>
                    </div>

                    <div class="flex-row justify-content text-input-margin">

                        <div>End of Trip: </div> <form:input path="endOfTrip" type="date" class="text-input"/>
                    </div>

                    <div class="button-center">

                        <form:button type="submit" class="button">Submit</form:button>
                    </div>
                </div>
             </form:form>

        </div>
    </div>
    
</body>
</html>