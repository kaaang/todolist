package com.joopda.todolist.controller.board;

import com.joopda.todolist.config.auth.PrincipalDetail;
import com.joopda.todolist.dto.ResponseDto;
import com.joopda.todolist.model.Board;
import com.joopda.todolist.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
public class BoardApiController {

    @Autowired
    private BoardService boardService;

    //게시글 저장
    @PostMapping("/api/board")
    public ResponseDto<Integer> save(@RequestBody Board board, @AuthenticationPrincipal PrincipalDetail principal){
        boardService.write(board, principal.getUser());
        return new ResponseDto<>(HttpStatus.OK.value(), 1);
    }

    //게시글 삭제
    @DeleteMapping("/api/board/{id}")
    public ResponseDto<Integer> delete(@PathVariable int id){
        boardService.delete(id);
        return  new ResponseDto<>(HttpStatus.OK.value(), 1);
    }

    //게시글 수정
    @PutMapping("/api/board/{id}")
    public ResponseDto<Integer> update(@PathVariable int id, @RequestBody Board board){
        boardService.update(id,board);
        return new ResponseDto<>(HttpStatus.OK.value(), 1);
    }

    //게시글 완료 처리
    @PutMapping("/api/board/finish/{id}&{status}")
    public ResponseDto<Integer> status(@PathVariable int id, @PathVariable int status){
        boardService.status(id,status);
        return new ResponseDto<>(HttpStatus.OK.value(), 1);
    }

}
