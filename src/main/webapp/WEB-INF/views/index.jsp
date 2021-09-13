
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<%@include file="layout/header.jsp"%>


<div class="container">



    <c:choose>
        <c:when test="${empty principal}">

            <h3>로그인 후 이용해주세요.</h3>


        </c:when>
        <c:otherwise>

            <h3>환영합니다.</h3>


        </c:otherwise>
    </c:choose>


</div>


<%@include file="layout/footer.jsp"%>





