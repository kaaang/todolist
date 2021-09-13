let index={
    init:function (){
        $("#btn-save").on("click",()=>{
            this.save();
        });
    },


    //회원가입 요청
    save:function (){
        let data = {
            username:$("#username").val(),
            password:$("#password").val(),
        };
        $.ajax({
            type:"POST",
            url:"/auth/joinProc",
            data:JSON.stringify(data),
            contentType:"application/json;charset=utf-8",
            dataType:"json"
        }).done(function(resp){
            alert("회원가입이 완료되었습니다.");
            location.href="/";
        }).fail(function(err){
            alert("회원가입에 실패했습니다.");
            location.href="/";
        });
    }

}

index.init();