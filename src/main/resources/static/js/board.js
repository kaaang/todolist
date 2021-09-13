let index={
    init:function (){
        $("#btn-save").on("click",()=>{
            this.save();
        });
        $("#btn-delete").on("click",()=>{
            this.deleteById();
        });
        $("#btn-update").on("click",()=>{
            this.update();
        });
        $("#btn-status").on("click",()=>{
            this.status();
        });
    },
    
    save:function (){
        let data = {
            title:$("#title").val(),
            content:$("#content").val()
        };
        $.ajax({
            type:"POST",
            url:"/api/board",
            data:JSON.stringify(data),
            contentType:"application/json;charset=utf-8",
            dataType:"json"
        }).done(function(resp){
            alert("글쓰기가 완료되었습니다.");
            location.href="/board/boardList/0";
        }).fail(function(err){
            alert(JSON.stringify(err));
        });
    },

    deleteById:function (){
        let id=$("#id").val();
        let statusInt=$("#status").val();
        console.log(id);
        $.ajax({
            type:"DELETE",
            url:"/api/board/"+id,
            dataType:"json"
        }).done(function(resp){
            alert("글 삭제가 완료되었습니다.");
            location.href="/board/boardList/"+statusInt;
        }).fail(function(err){
            alert("글 삭제 실패");
            location.href="/board/boardList/"+statusInt;
        });
    },

    update:function (){
        let id=$("#id").val();
        let data = {
            title:$("#title").val(),
            content:$("#content").val()
        };
        $.ajax({
            type:"PUT",
            url:"/api/board/"+id,
            data:JSON.stringify(data),
            contentType:"application/json;charset=utf-8",
            dataType:"json"
        }).done(function(resp){
            alert("글 수정이 완료되었습니다.");
            location.href="/board/boardList/0";
        }).fail(function(err){
            alert("글 수정 실패");
            location.href="/board/boardList/0";
        });
    },

    status:function (){
        let id=$("#id").val();
        let statusInt=($("#status").val()==0) ? 1 : 0 ;

        $.ajax({
            type:"PUT",
            url:"/api/board/finish/"+id+"&"+statusInt,
            contentType:"application/json;charset=utf-8",
            dataType:"json"
        }).done(function(resp){
            if(statusInt==1){
                alert("완료처리 되었습니다.");
                location.href="/board/boardList/0";
            }else{
                alert("완료 취소 처리 되었습니다.");
                location.href="/board/boardList/1";
            }
        }).fail(function(err){
            if(statusInt==0){
                alert("완료처리 실패");
                location.href="/board/boardList/0";
            }else{
                alert("완료 취소 처리 실패");
                location.href="/board/boardList/1";
            }
        });
    }

}

index.init();