package com.joopda.todolist.controller.board;

import com.joopda.todolist.config.auth.PrincipalDetail;
import com.joopda.todolist.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    //글쓰기 폼
    @GetMapping("/board/boardForm")
    public String boardForm(){
        return "board/boardForm";
    }

    //게시글 완료 or 미완료 불러오기
    @GetMapping("/board/boardList/{status}")
    public String boardList(Model model,
                            @PageableDefault(size = 5,sort = "id",direction = Sort.Direction.DESC)Pageable pageable,
                            @AuthenticationPrincipal PrincipalDetail principal,
                            @PathVariable int status){
        model.addAttribute("boards",boardService.list(pageable, principal.getUser().getId(), status));
        if(status==0){
            return "board/boardList";
        }
        else{
            return "board/boardFinish";
        }
    }

    //게시글 상세보기
    @GetMapping("/board/{id}")
    public String boardDetail(@PathVariable int id, Model model){
        model.addAttribute("board",boardService.detail(id));
        return "board/boardDetail";
    }

    //게시글 수정 폼
    @GetMapping("/board/{id}/boardUpdate")
    public String boardUpdate(@PathVariable int id, Model model){
        model.addAttribute("board",boardService.detail(id));
        return "board/boardUpdate";
    }


}
