
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<%@include file="../layout/header.jsp"%>


<div class="container">
        <c:forEach var="board" items="${boards.content}">
            <div class="card m-2">
                <div class="card-body">
                    <input type="hidden" value="${board.id}" id="id">
                    <input type="hidden" value="0" id="status">
                    <h4 class="card-title">${board.title}</h4>
                    <a href="/board/${board.id}" class="btn btn-primary">상세보기</a>
                    <button class="btn btn-secondary" id="btn-status">완료하기</button>
                </div>
            </div>
        </c:forEach>



        <ul class="pagination justify-content-center">
            <c:choose>
                <c:when test="${boards.first}">
                    <li class="page-item disabled"><a class="page-link" href="?page=${boards.number-1}">Previous</a></li>
                </c:when>
                <c:otherwise>
                    <li class="page-item"><a class="page-link" href="?page=${boards.number-1}">Previous</a></li>
                </c:otherwise>
            </c:choose>
            <c:choose>
                <c:when test="${boards.last}">
                    <li class="page-item disabled"><a class="page-link" href="?page=${boards.number+1}">Next</a></li>
                </c:when>
                <c:otherwise>
                    <li class="page-item"><a class="page-link" href="?page=${boards.number+1}">Next</a></li>
                </c:otherwise>
            </c:choose>
        </ul>
</div>

<script src="/js/board.js"></script>
<%@include file="../layout/footer.jsp"%>





