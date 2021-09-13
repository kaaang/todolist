
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<%@include file="../layout/header.jsp"%>

<div class="container">
<c:if test="${board.user.id == principal.user.id}">
    <form>
        <input type="hidden" id="id" value="${board.id}">
        <div class="form-group">
            <input value="${board.title}" type="text" class="form-control" placeholder="Enter title" id="title">
        </div>

        <div class="form-group">
            <textarea class="form-control summernote" rows="5" id="content">${board.content}</textarea>
        </div>


    </form>
    <button class="btn btn-secondary" onclick="history.back()">돌아가기</button>
    <button id="btn-update" class="btn btn-primary">수정 완료</button>
</c:if>
</div>

<script>
    $('.summernote').summernote({
        tabsize: 2,
        height: 300
    });
</script>
<script src="/js/board.js"></script>
<%@include file="../layout/footer.jsp"%>





