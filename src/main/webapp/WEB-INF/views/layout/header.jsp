
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<sec:authorize access="isAuthenticated()">
    <sec:authentication property="principal" var="principal"/>
</sec:authorize>


<!DOCTYPE html>
<html lang="en">
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-bs4.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-bs4.min.js"></script>
</head>
<body>

<nav class="navbar navbar-expand-md bg-dark navbar-dark">
    <a class="navbar-brand" href="/">Home</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="collapsibleNavbar">

                <c:choose>
                    <c:when test="${empty principal}">
                        <ul class="navbar-nav">
                            <li class="nav-item">
                                <a class="nav-link" href="/auth/loginForm">로그인</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="/auth/joinForm">회원가입</a>
                            </li>
                        </ul>
                    </c:when>
                    <c:otherwise>
                        <ul class="navbar-nav">
                            <li class="nav-item">
                                <a class="nav-link" href="/board/boardList/0">To Do List</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="/board/boardForm">new To Do List</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="/board/boardList/1">Finish List</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="/logout">Logout</a>
                            </li>
                        </ul>
                    </c:otherwise>
                </c:choose>









    </div>
</nav>
<br/>
