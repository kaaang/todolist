
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<%@include file="../layout/header.jsp"%>


<div class="container">
    <form>
        <div class="form-group">
            <label for="username">Username</label>
            <input type="text" class="form-control" placeholder="Enter Username" id="username">
        </div>

        <div class="form-group">
            <label for="password">Password:</label>
            <input type="password" class="form-control" placeholder="Enter Password" id="password">
        </div>


    </form>
    <button id="btn-save" class="btn btn-primary">회원가입</button>

</div>

<script src="/js/user.js"></script>
<%@include file="../layout/footer.jsp"%>





