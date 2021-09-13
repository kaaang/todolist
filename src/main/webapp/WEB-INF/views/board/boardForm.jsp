
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<%@include file="../layout/header.jsp"%>


<div class="container">

    <form>
        <div class="form-group">
            <input type="text" class="form-control" placeholder="Enter title" id="title">
        </div>

        <div class="form-group">
            <textarea class="form-control summernote" rows="5" id="content"></textarea>
        </div>


    </form>
    <button class="btn btn-secondary" onclick="history.back()">돌아가기</button>
    <button id="btn-save" class="btn btn-primary">저장</button>

</div>

<script>
    $('.summernote').summernote({
        tabsize: 2,
        height: 300
    });
</script>
<script src="/js/board.js"></script>
<%@include file="../layout/footer.jsp"%>





