
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<%@include file="../layout/header.jsp"%>


<div class="container">
    <form action="/auth/loginProc" method="post">
        <div class="form-group">
            <label for="username">Username</label>
            <input type="text" name="username" class="form-control" placeholder="Enter Username" id="username">
        </div>

        <div class="form-group">
            <label for="password">Password</label>
            <input type="password" name="password" class="form-control" placeholder="Enter Password" id="password">
        </div>


        <c:if test="${param.error}">
            <p style="color:red">${exception }</p>
        </c:if>
        <button type="btn-login" class="btn btn-primary">로그인</button>
    </form>



</div>


<%@include file="../layout/footer.jsp"%>





