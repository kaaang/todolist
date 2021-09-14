package com.joopda.todolist.controller;

import com.joopda.todolist.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {


    //최조접속 or HOME 페이지
    @GetMapping({"","/"})
    public String index(){
        return "index";
    }
}
