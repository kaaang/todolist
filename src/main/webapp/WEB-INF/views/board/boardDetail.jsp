
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<%@include file="../layout/header.jsp"%>



<div class="container">
    <button class="btn btn-secondary" onclick="history.back()">돌아가기</button>


    <c:if test="${board.user.id == principal.user.id}">
        <input type="hidden" value="0" id="status">
        <a href="/board/${board.id}/boardUpdate" class="btn btn-warning">수정</a>
        <button id="btn-delete" class="btn btn-danger">삭제</button>
    <br/><br/>


    <div>
        <input type="hidden" id="id" value="${board.id}"/>
        작성 시간 : <span><i>${board.createTime} </i></span>
    </div>
    <br/>


    <div class="form-group">
        <h3>${board.title}</h3>
    </div>
    <hr>

    <div class="form-group">
        <div>
            ${board.content}
        </div>
    </div>
    <hr>
    </c:if>


</div>


<script src="/js/board.js"></script>
<%@include file="../layout/footer.jsp"%>





