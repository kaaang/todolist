package com.joopda.todolist.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    //회원가입 폼
    @GetMapping("/auth/joinForm")
    public String joinForm(){
        return "/user/joinForm";
    }

    //로그인 폼
    @GetMapping("/auth/loginForm")
    public String loginForm(){
        return "/user/loginForm";
    }

    //로그인 실패
    @GetMapping("/auth/login")
    public String login(@RequestParam(value = "error", required = false) String error,
                        @RequestParam(value = "exception", required = false) String exception, Model model) {
        model.addAttribute("error", error);
        model.addAttribute("exception", exception);
        return "user/loginForm";
    }


}
